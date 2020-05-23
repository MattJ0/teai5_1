
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cores"
})
public class FirstStage {

    @JsonProperty("cores")
    private List<Core> cores = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cores")
    public List<Core> getCores() {
        return cores;
    }

    @JsonProperty("cores")
    public void setCores(List<Core> cores) {
        this.cores = cores;
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
        return "FirstStage{" +
                "cores=" + cores +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
