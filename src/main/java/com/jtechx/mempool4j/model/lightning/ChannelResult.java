package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ChannelResult {
    private final String id;
    private final String shortId;
    private final long capacity;
    private final int status;

    /**
     * Constructs a ChannelResult object.
     *
     * @param id       The ID of the channel.
     * @param shortId  The short ID of the channel.
     * @param capacity The capacity of the channel.
     * @param status   The status of the channel.
     */
    @JsonCreator
    public ChannelResult(@JsonProperty("id") String id,
            @JsonProperty("short_id") String shortId,
            @JsonProperty("capacity") long capacity,
            @JsonProperty("status") int status) {
        this.id = id;
        this.shortId = shortId;
        this.capacity = capacity;
        this.status = status;
    }

    /**
     * Returns the ID of the channel.
     *
     * @return The ID of the channel.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the short ID of the channel.
     *
     * @return The short ID of the channel.
     */
    public String getShortId() {
        return shortId;
    }

    /**
     * Returns the capacity of the channel.
     *
     * @return The capacity of the channel.
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * Returns the status of the channel.
     *
     * @return The status of the channel.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Returns a string representation of the ChannelResult object.
     *
     * @return The string representation of the ChannelResult object.
     */
    @Override
    public String toString() {
        return "ChannelResult{" +
                "id='" + id + '\'' +
                ", shortId='" + shortId + '\'' +
                ", capacity=" + capacity +
                ", status=" + status +
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelResult that = (ChannelResult) o;
        return capacity == that.capacity &&
                status == that.status &&
                Objects.equals(id, that.id) &&
                Objects.equals(shortId, that.shortId);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, shortId, capacity, status);
    }
}
