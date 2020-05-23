
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flight_number",
    "mission_name",
    "mission_id",
    "launch_year",
    "launch_date_unix",
    "launch_date_utc",
    "launch_date_local",
    "is_tentative",
    "tentative_max_precision",
    "tbd",
    "launch_window",
    "rocket",
    "ships",
    "telemetry",
    "launch_site",
    "launch_success",
    "links",
    "details",
    "upcoming",
    "static_fire_date_utc",
    "static_fire_date_unix",
    "timeline"
})
public class LauchesUpcoming {

    @JsonProperty("flight_number")
    private Integer flightNumber;
    @JsonProperty("mission_name")
    private String missionName;
    @JsonProperty("mission_id")
    private List<Object> missionId = null;
    @JsonProperty("launch_year")
    private String launchYear;
    @JsonProperty("launch_date_unix")
    private Integer launchDateUnix;
    @JsonProperty("launch_date_utc")
    private String launchDateUtc;
    @JsonProperty("launch_date_local")
    private String launchDateLocal;
    @JsonProperty("is_tentative")
    private Boolean isTentative;
    @JsonProperty("tentative_max_precision")
    private String tentativeMaxPrecision;
    @JsonProperty("tbd")
    private Boolean tbd;
    @JsonProperty("launch_window")
    private Object launchWindow;
    @JsonProperty("rocket")
    private Rocket rocket;
    @JsonProperty("ships")
    private List<Object> ships = null;
    @JsonProperty("telemetry")
    private Telemetry telemetry;
    @JsonProperty("launch_site")
    private LaunchSite launchSite;
    @JsonProperty("launch_success")
    private Object launchSuccess;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("details")
    private Object details;
    @JsonProperty("upcoming")
    private Boolean upcoming;
    @JsonProperty("static_fire_date_utc")
    private Object staticFireDateUtc;
    @JsonProperty("static_fire_date_unix")
    private Object staticFireDateUnix;
    @JsonProperty("timeline")
    private Object timeline;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flight_number")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("mission_name")
    public String getMissionName() {
        return missionName;
    }

    @JsonProperty("mission_name")
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    @JsonProperty("mission_id")
    public List<Object> getMissionId() {
        return missionId;
    }

    @JsonProperty("mission_id")
    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    @JsonProperty("launch_year")
    public String getLaunchYear() {
        return launchYear;
    }

    @JsonProperty("launch_year")
    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    @JsonProperty("launch_date_unix")
    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }

    @JsonProperty("launch_date_unix")
    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    @JsonProperty("launch_date_utc")
    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    @JsonProperty("launch_date_utc")
    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    @JsonProperty("launch_date_local")
    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    @JsonProperty("launch_date_local")
    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    @JsonProperty("is_tentative")
    public Boolean getIsTentative() {
        return isTentative;
    }

    @JsonProperty("is_tentative")
    public void setIsTentative(Boolean isTentative) {
        this.isTentative = isTentative;
    }

    @JsonProperty("tentative_max_precision")
    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    @JsonProperty("tentative_max_precision")
    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    @JsonProperty("tbd")
    public Boolean getTbd() {
        return tbd;
    }

    @JsonProperty("tbd")
    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    @JsonProperty("launch_window")
    public Object getLaunchWindow() {
        return launchWindow;
    }

    @JsonProperty("launch_window")
    public void setLaunchWindow(Object launchWindow) {
        this.launchWindow = launchWindow;
    }

    @JsonProperty("rocket")
    public Rocket getRocket() {
        return rocket;
    }

    @JsonProperty("rocket")
    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    @JsonProperty("ships")
    public List<Object> getShips() {
        return ships;
    }

    @JsonProperty("ships")
    public void setShips(List<Object> ships) {
        this.ships = ships;
    }

    @JsonProperty("telemetry")
    public Telemetry getTelemetry() {
        return telemetry;
    }

    @JsonProperty("telemetry")
    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    @JsonProperty("launch_site")
    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    @JsonProperty("launch_site")
    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    @JsonProperty("launch_success")
    public Object getLaunchSuccess() {
        return launchSuccess;
    }

    @JsonProperty("launch_success")
    public void setLaunchSuccess(Object launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("details")
    public Object getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Object details) {
        this.details = details;
    }

    @JsonProperty("upcoming")
    public Boolean getUpcoming() {
        return upcoming;
    }

    @JsonProperty("upcoming")
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    @JsonProperty("static_fire_date_utc")
    public Object getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    @JsonProperty("static_fire_date_utc")
    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    @JsonProperty("static_fire_date_unix")
    public Object getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    @JsonProperty("static_fire_date_unix")
    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    @JsonProperty("timeline")
    public Object getTimeline() {
        return timeline;
    }

    @JsonProperty("timeline")
    public void setTimeline(Object timeline) {
        this.timeline = timeline;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
