package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Represents a collection of top Lightning Network nodes based on capacity and number of channels.
 */
public class TopNodes {
    private final List<NodeResult> topByCapacity;
    private final List<LightningChannel> topByChannels;

    @JsonCreator
    public TopNodes(@JsonProperty("topByCapacity") List<NodeResult> topByCapacity,
            @JsonProperty("topByChannels") List<LightningChannel> topByChannels) {
        this.topByCapacity = topByCapacity;
        this.topByChannels = topByChannels;
    }

    /**
     * Retrieves the list of top Lightning Network nodes based on capacity.
     *
     * @return The list of top nodes by capacity.
     */
    public List<NodeResult> getTopByCapacity() {
        return topByCapacity;
    }

    /**
     * Retrieves the list of top Lightning Network nodes based on number of channels.
     *
     * @return The list of top nodes by number of channels.
     */
    public List<LightningChannel> getTopByChannels() {
        return topByChannels;
    }

    /**
     * Returns a string representation of the TopNodes object.
     *
     * @return The string representation of the TopNodes object.
     */
    @Override
    public String toString() {
        return "TopNodes{" +
                "topByCapacity=" + topByCapacity +
                ", topByChannels=" + topByChannels +
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
        TopNodes topNodes = (TopNodes) o;
        return Objects.equals(topByCapacity, topNodes.topByCapacity) &&
                Objects.equals(topByChannels, topNodes.topByChannels);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topByCapacity, topByChannels);
    }
}
