package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the historical statistics of a lightning network node.
 */
public class NodeHistoryStats {
    private final Long added;
    private final Long capacity;
    private final Integer channels;

    /**
     * Constructs a NodeHistoryStats object.
     *
     * @param added    The timestamp when the node was added.
     * @param capacity The capacity of the node.
     * @param channels The number of channels of the node.
     */
    @JsonCreator
    public NodeHistoryStats(
            @JsonProperty("added") Long added,
            @JsonProperty("capacity") Long capacity,
            @JsonProperty("channels") Integer channels) {
        this.added = added;
        this.capacity = capacity;
        this.channels = channels;
    }

    /**
     * Returns the timestamp when the node was added.
     *
     * @return The timestamp when the node was added.
     */
    public Long getAdded() {
        return added;
    }

    /**
     * Returns the capacity of the node.
     *
     * @return The capacity of the node.
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Returns the number of channels of the node.
     *
     * @return The number of channels of the node.
     */
    public Integer getChannels() {
        return channels;
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
        NodeHistoryStats that = (NodeHistoryStats) o;
        return Objects.equals(added, that.added) &&
                Objects.equals(capacity, that.capacity) &&
                Objects.equals(channels, that.channels);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(added, capacity, channels);
    }

    /**
     * Returns a string representation of the NodeHistoryStats object.
     *
     * @return The string representation of the NodeHistoryStats object.
     */
    @Override
    public String toString() {
        return "NodeHistoryStats{" +
                "added=" + added +
                ", capacity=" + capacity +
                ", channels=" + channels +
                '}';
    }
}
