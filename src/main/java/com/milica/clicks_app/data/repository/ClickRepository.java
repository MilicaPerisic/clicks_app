package com.milica.clicks_app.data.repository;

import com.milica.clicks_app.data.models.Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickRepository extends JpaRepository<Click, Integer> {

    @Query(value="SELECT count(click_id) FROM click_log where campaign = ?1", nativeQuery = true)
    Integer getNumOfClicksByCampaignId(Long campaign);

    @Query(value="SELECT count(click_id) FROM click_log where campaign = ?1 and `timestamp` >= ?2 and `timestamp` < ?3", nativeQuery = true)
    Integer getNumOfClicksByCampaignIdAndTimestampRange(Long campaign, Long startTimestamp, Long endTimestamp);

}
