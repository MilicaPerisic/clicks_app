package com.milica.clicks_app.data.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Click {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer click_id;
    private String id;
    private Timestamp timestamp;
    @Enumerated(EnumType.STRING)
    private Type type;
    private Long campaign;
    private Integer banner;
    private Integer content_unit;
    private Integer network;
    private Integer browser;
    private Integer operating_system;
    private Integer country;
    private Integer state;
    private Integer city;

    public Click(){}

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

    @Override
    public String toString() {
        return "Click{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", type=" + type +
                ", campaign=" + campaign +
                ", banner=" + banner +
                ", content_unit=" + content_unit +
                ", network=" + network +
                ", browser=" + browser +
                ", operating_system=" + operating_system +
                ", country=" + country +
                ", state=" + state +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Click click = (Click) o;
        return id.equals(click.id) && timestamp.equals(click.timestamp) && type == click.type && Objects.equals(campaign, click.campaign) && Objects.equals(banner, click.banner) && Objects.equals(content_unit, click.content_unit) && Objects.equals(network, click.network) && Objects.equals(browser, click.browser) && Objects.equals(operating_system, click.operating_system) && Objects.equals(country, click.country) && Objects.equals(state, click.state) && Objects.equals(city, click.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(click_id, id, timestamp, type, campaign, banner, content_unit, network, browser, operating_system, country, state, city);
    }

}
