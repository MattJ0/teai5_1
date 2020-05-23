
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rocket_id",
    "rocket_name",
    "rocket_type",
    "first_stage",
    "second_stage",
    "fairings"
})
public class Rocket {

    @JsonProperty("rocket_id")
    private String rocketId;
    @JsonProperty("rocket_name")
    private String rocketName;
    @JsonProperty("rocket_type")
    private String rocketType;
    @JsonProperty("first_stage")
    private FirstStage firstStage;
    @JsonProperty("second_stage")
    private SecondStage secondStage;
    @JsonProperty("fairings")
    private Fairings fairings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rocket_id")
    public String getRocketId() {
        return rocketId;
    }

    @JsonProperty("rocket_id")
    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    @JsonProperty("rocket_name")
    public String getRocketName() {
        return rocketName;
    }

    @JsonProperty("rocket_name")
    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    @JsonProperty("rocket_type")
    public String getRocketType() {
        return rocketType;
    }

    @JsonProperty("rocket_type")
    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    @JsonProperty("first_stage")
    public FirstStage getFirstStage() {
        return firstStage;
    }

    @JsonProperty("first_stage")
    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    @JsonProperty("second_stage")
    public SecondStage getSecondStage() {
        return secondStage;
    }

    @JsonProperty("second_stage")
    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    @JsonProperty("fairings")
    public Fairings getFairings() {
        return fairings;
    }

    @JsonProperty("fairings")
    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
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
        return "Rocket{" +
                "rocketId='" + rocketId + '\'' +
                ", rocketName='" + rocketName + '\'' +
                ", rocketType='" + rocketType + '\'' +
                ", firstStage=" + firstStage +
                ", secondStage=" + secondStage;
    }
}
