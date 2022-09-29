package com.milica.clicks_app.service;

import com.milica.clicks_app.data.repository.ClickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@Service
public class ClickServiceImpl implements ClickService {
    @Autowired
    ClickRepository clickRepository;

    @Override
    public Integer getClicksByCampaign(Long campaign) {
        return clickRepository.getNumOfClicksByCampaignId(campaign);
    }

    @Override
    public Integer getClicksByCampaignAndTimestampRange(Long campaign, String startTimestamp, String endTimestamp) throws  ParseException{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        //Parses timestamp in given format in UTC timezone
        Date dateStart = df.parse(startTimestamp);
        Date dateEnd = df.parse(endTimestamp);

        //Converts timestamp to unix timestamp
        Long startTs = dateStart.getTime() / 1000;
        Long endTs = dateEnd.getTime() / 1000;

        return clickRepository.getNumOfClicksByCampaignIdAndTimestampRange(campaign, startTs, endTs);
    }
}
