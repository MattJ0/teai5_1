
package com.mattjohnson.teai5_1.pojo_launches;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payload_id",
    "norad_id",
    "reused",
    "customers",
    "nationality",
    "manufacturer",
    "payload_type",
    "payload_mass_kg",
    "payload_mass_lbs",
    "orbit",
    "orbit_params"
})
public class Payload {

    @JsonProperty("payload_id")
    private String payloadId;
    @JsonProperty("norad_id")
    private List<Object> noradId = null;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("customers")
    private List<String> customers = null;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("payload_type")
    private String payloadType;
    @JsonProperty("payload_mass_kg")
    private Integer payloadMassKg;
    @JsonProperty("payload_mass_lbs")
    private Double payloadMassLbs;
    @JsonProperty("orbit")
    private String orbit;
    @JsonProperty("orbit_params")
    private OrbitParams orbitParams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("payload_id")
    public String getPayloadId() {
        return payloadId;
    }

    @JsonProperty("payload_id")
    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    @JsonProperty("norad_id")
    public List<Object> getNoradId() {
        return noradId;
    }

    @JsonProperty("norad_id")
    public void setNoradId(List<Object> noradId) {
        this.noradId = noradId;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("customers")
    public List<String> getCustomers() {
        return customers;
    }

    @JsonProperty("customers")
    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("payload_type")
    public String getPayloadType() {
        return payloadType;
    }

    @JsonProperty("payload_type")
    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    @JsonProperty("payload_mass_kg")
    public Integer getPayloadMassKg() {
        return payloadMassKg;
    }

    @JsonProperty("payload_mass_kg")
    public void setPayloadMassKg(Integer payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    @JsonProperty("payload_mass_lbs")
    public Double getPayloadMassLbs() {
        return payloadMassLbs;
    }

    @JsonProperty("payload_mass_lbs")
    public void setPayloadMassLbs(Double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    @JsonProperty("orbit")
    public String getOrbit() {
        return orbit;
    }

    @JsonProperty("orbit")
    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    @JsonProperty("orbit_params")
    public OrbitParams getOrbitParams() {
        return orbitParams;
    }

    @JsonProperty("orbit_params")
    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
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
        return "Payload{" +
                "payloadId='" + payloadId + '\'' +
                ", noradId=" + noradId +
                ", reused=" + reused +
                ", customers=" + customers +
                ", nationality='" + nationality + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", payloadType='" + payloadType + '\'' +
                ", payloadMassKg=" + payloadMassKg +
                ", payloadMassLbs=" + payloadMassLbs +
                ", orbit='" + orbit + '\'' +
                ", orbitParams=" + orbitParams +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
