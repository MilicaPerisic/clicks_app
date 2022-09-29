package com.milica.clicks_app.web;

import com.milica.clicks_app.service.ClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/click")
public class ClickController {
    @Autowired
    ClickService clickService;

    @GetMapping("/find/{campaign}")
    public ResponseEntity getNumOfClicksByCampaignId (@PathVariable("campaign") Long campaign){
        Integer numOfClicks = clickService.getClicksByCampaign(campaign);
        return new ResponseEntity<>(numOfClicks, HttpStatus.OK);
    }

    @GetMapping("/find/{campaign}/{startTimestamp}/{endTimestamp}")
    public ResponseEntity getNumOfClicksByCampaignIdAndTimestampRange(@PathVariable("campaign") Long campaign, @PathVariable("startTimestamp") String startTimestamp, @PathVariable("endTimestamp") String endTimestamp) throws ParseException{
       try {
           Integer response = clickService.getClicksByCampaignAndTimestampRange(campaign, startTimestamp, endTimestamp);
           return new ResponseEntity<>(response, HttpStatus.OK);
       }catch (ParseException e){
           return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }
}
}
