
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "core_serial",
    "flight",
    "block",
    "gridfins",
    "legs",
    "reused",
    "land_success",
    "landing_intent",
    "landing_type",
    "landing_vehicle"
})
public class Core {

    @JsonProperty("core_serial")
    private String coreSerial;
    @JsonProperty("flight")
    private Integer flight;
    @JsonProperty("block")
    private Integer block;
    @JsonProperty("gridfins")
    private Boolean gridfins;
    @JsonProperty("legs")
    private Boolean legs;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("land_success")
    private Object landSuccess;
    @JsonProperty("landing_intent")
    private Boolean landingIntent;
    @JsonProperty("landing_type")
    private String landingType;
    @JsonProperty("landing_vehicle")
    private String landingVehicle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("core_serial")
    public String getCoreSerial() {
        return coreSerial;
    }

    @JsonProperty("core_serial")
    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    @JsonProperty("flight")
    public Integer getFlight() {
        return flight;
    }

    @JsonProperty("flight")
    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    @JsonProperty("block")
    public Integer getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(Integer block) {
        this.block = block;
    }

    @JsonProperty("gridfins")
    public Boolean getGridfins() {
        return gridfins;
    }

    @JsonProperty("gridfins")
    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }

    @JsonProperty("legs")
    public Boolean getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("land_success")
    public Object getLandSuccess() {
        return landSuccess;
    }

    @JsonProperty("land_success")
    public void setLandSuccess(Object landSuccess) {
        this.landSuccess = landSuccess;
    }

    @JsonProperty("landing_intent")
    public Boolean getLandingIntent() {
        return landingIntent;
    }

    @JsonProperty("landing_intent")
    public void setLandingIntent(Boolean landingIntent) {
        this.landingIntent = landingIntent;
    }

    @JsonProperty("landing_type")
    public String getLandingType() {
        return landingType;
    }

    @JsonProperty("landing_type")
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    @JsonProperty("landing_vehicle")
    public String getLandingVehicle() {
        return landingVehicle;
    }

    @JsonProperty("landing_vehicle")
    public void setLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Core{" +
                "coreSerial='" + coreSerial + '\'' +
                ", flight=" + flight +
                ", block=" + block +
                ", gridfins=" + gridfins +
                ", legs=" + legs +
                ", reused=" + reused +
                ", landSuccess=" + landSuccess +
                ", landingIntent=" + landingIntent +
                ", landingType='" + landingType + '\'' +
                ", landingVehicle='" + landingVehicle + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
