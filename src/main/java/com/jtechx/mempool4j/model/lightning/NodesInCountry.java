package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents lightning network nodes in a specific country.
 */
public class NodesInCountry {
    private final Map<String, String> country;
    private final List<LightningNode> lightningNodes;

    @JsonCreator
    public NodesInCountry(@JsonProperty("country") Map<String, String> country,
            @JsonProperty("nodes") List<LightningNode> lightningNodes) {
        this.country = country;
        this.lightningNodes = lightningNodes;
    }

    /**
     * Retrieves the country information.
     *
     * @return The country information.
     */
    public Map<String, String> getCountry() {
        return country;
    }

    /**
     * Retrieves the list of lightning network nodes in the country.
     *
     * @return The list of lightning network nodes in the country.
     */
    public List<LightningNode> getNodes() {
        return lightningNodes;
    }

    /**
     * Returns a string representation of the NodesInCountry object.
     *
     * @return The string representation of the NodesInCountry object.
     */
    @Override
    public String toString() {
        return "NodesInCountry{" +
                "country=" + country +
                ", nodes=" + lightningNodes +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return True if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodesInCountry that = (NodesInCountry) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(lightningNodes, that.lightningNodes);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(country, lightningNodes);
    }
}
