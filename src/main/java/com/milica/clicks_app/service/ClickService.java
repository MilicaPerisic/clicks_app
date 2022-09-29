package com.milica.clicks_app.service;

import org.springframework.stereotype.Component;
import java.text.ParseException;

@Component
public interface ClickService {
    Integer getClicksByCampaign(Long campaign);
    Integer getClicksByCampaignAndTimestampRange(Long campaign, String startTimestamp, String endTimestamp) throws ParseException;
}
