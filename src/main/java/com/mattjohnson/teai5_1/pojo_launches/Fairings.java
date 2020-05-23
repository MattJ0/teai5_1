
package com.mattjohnson.teai5_1.pojo_launches;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reused",
    "recovery_attempt",
    "recovered",
    "ship"
})
public class Fairings {

    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("recovery_attempt")
    private Boolean recoveryAttempt;
    @JsonProperty("recovered")
    private Boolean recovered;
    @JsonProperty("ship")
    private Object ship;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("recovery_attempt")
    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    @JsonProperty("recovery_attempt")
    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    @JsonProperty("recovered")
    public Boolean getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("ship")
    public Object getShip() {
        return ship;
    }

    @JsonProperty("ship")
    public void setShip(Object ship) {
        this.ship = ship;
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
