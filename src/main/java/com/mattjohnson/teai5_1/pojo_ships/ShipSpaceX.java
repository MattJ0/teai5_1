
package com.mattjohnson.teai5_1.pojo_ships;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ship_id",
    "ship_name",
    "ship_model",
    "ship_type",
    "roles",
    "active",
    "imo",
    "mmsi",
    "abs",
    "class",
    "weight_lbs",
    "weight_kg",
    "year_built",
    "home_port",
    "status",
    "speed_kn",
    "course_deg",
    "position",
    "successful_landings",
    "attempted_landings",
    "missions",
    "url",
    "image"
})
public class ShipSpaceX {

    @JsonProperty("ship_id")
    private String shipId;
    @JsonProperty("ship_name")
    private String shipName;
    @JsonProperty("ship_model")
    private Object shipModel;
    @JsonProperty("ship_type")
    private String shipType;
    @JsonProperty("roles")
    private List<String> roles = null;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("imo")
    private Integer imo;
    @JsonProperty("mmsi")
    private Integer mmsi;
    @JsonProperty("abs")
    private Integer abs;
    @JsonProperty("class")
    private Integer _class;
    @JsonProperty("weight_lbs")
    private Integer weightLbs;
    @JsonProperty("weight_kg")
    private Integer weightKg;
    @JsonProperty("year_built")
    private Integer yearBuilt;
    @JsonProperty("home_port")
    private String homePort;
    @JsonProperty("status")
    private String status;
    @JsonProperty("speed_kn")
    private Integer speedKn;
    @JsonProperty("course_deg")
    private Object courseDeg;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("successful_landings")
    private Object successfulLandings;
    @JsonProperty("attempted_landings")
    private Object attemptedLandings;
    @JsonProperty("missions")
    private List<Mission> missions = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image")
    private String image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ship_id")
    public String getShipId() {
        return shipId;
    }

    @JsonProperty("ship_id")
    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    @JsonProperty("ship_name")
    public String getShipName() {
        return shipName;
    }

    @JsonProperty("ship_name")
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @JsonProperty("ship_model")
    public Object getShipModel() {
        return shipModel;
    }

    @JsonProperty("ship_model")
    public void setShipModel(Object shipModel) {
        this.shipModel = shipModel;
    }

    @JsonProperty("ship_type")
    public String getShipType() {
        return shipType;
    }

    @JsonProperty("ship_type")
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("imo")
    public Integer getImo() {
        return imo;
    }

    @JsonProperty("imo")
    public void setImo(Integer imo) {
        this.imo = imo;
    }

    @JsonProperty("mmsi")
    public Integer getMmsi() {
        return mmsi;
    }

    @JsonProperty("mmsi")
    public void setMmsi(Integer mmsi) {
        this.mmsi = mmsi;
    }

    @JsonProperty("abs")
    public Integer getAbs() {
        return abs;
    }

    @JsonProperty("abs")
    public void setAbs(Integer abs) {
        this.abs = abs;
    }

    @JsonProperty("class")
    public Integer getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(Integer _class) {
        this._class = _class;
    }

    @JsonProperty("weight_lbs")
    public Integer getWeightLbs() {
        return weightLbs;
    }

    @JsonProperty("weight_lbs")
    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    @JsonProperty("weight_kg")
    public Integer getWeightKg() {
        return weightKg;
    }

    @JsonProperty("weight_kg")
    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    @JsonProperty("year_built")
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    @JsonProperty("year_built")
    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @JsonProperty("home_port")
    public String getHomePort() {
        return homePort;
    }

    @JsonProperty("home_port")
    public void setHomePort(String homePort) {
        this.homePort = homePort;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("speed_kn")
    public Integer getSpeedKn() {
        return speedKn;
    }

    @JsonProperty("speed_kn")
    public void setSpeedKn(Integer speedKn) {
        this.speedKn = speedKn;
    }

    @JsonProperty("course_deg")
    public Object getCourseDeg() {
        return courseDeg;
    }

    @JsonProperty("course_deg")
    public void setCourseDeg(Object courseDeg) {
        this.courseDeg = courseDeg;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("successful_landings")
    public Object getSuccessfulLandings() {
        return successfulLandings;
    }

    @JsonProperty("successful_landings")
    public void setSuccessfulLandings(Object successfulLandings) {
        this.successfulLandings = successfulLandings;
    }

    @JsonProperty("attempted_landings")
    public Object getAttemptedLandings() {
        return attemptedLandings;
    }

    @JsonProperty("attempted_landings")
    public void setAttemptedLandings(Object attemptedLandings) {
        this.attemptedLandings = attemptedLandings;
    }

    @JsonProperty("missions")
    public List<Mission> getMissions() {
        return missions;
    }

    @JsonProperty("missions")
    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
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
