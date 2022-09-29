package com.milica.clicks_app.data.communication.request;

import com.milica.clicks_app.data.models.Type;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

public class ClickRequest {
    @NotBlank
    @NotNull
    private Integer click_id;
    @NotBlank
    @NotNull
    private String id;
    @NotBlank
    @NotNull
    private Timestamp timestamp;
    @NotBlank
    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;
    @NotBlank
    @NotNull
    private Long campaign;
    private Integer banner;
    private Integer content_unit;
    private Integer network;
    private Integer browser;
    private Integer operating_system;
    private Integer country;
    private Integer state;
    private Integer city;

    public Integer getClick_id() {
        return click_id;
    }

    public void setClick_id(Integer click_id) {
        this.click_id = click_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getCampaign() {
        return campaign;
    }

    public void setCampaign(Long campaign) {
        this.campaign = campaign;
    }

    public Integer getBanner() {
        return banner;
    }

    public void setBanner(Integer banner) {
        this.banner = banner;
    }

    public Integer getContent_unit() {
        return content_unit;
    }

    public void setContent_unit(Integer content_unit) {
        this.content_unit = content_unit;
    }

    public Integer getNetwork() {
        return network;
    }

    public void setNetwork(Integer network) {
        this.network = network;
    }

    public Integer getBrowser() {
        return browser;
    }

    public void setBrowser(Integer browser) {
        this.browser = browser;
    }

    public Integer getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(Integer operating_system) {
        this.operating_system = operating_system;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }
}
