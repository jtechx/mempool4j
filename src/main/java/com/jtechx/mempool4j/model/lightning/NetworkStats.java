package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the network statistics.
 */
public class NetworkStats {
    private final LNStats latest;
    private final LNStats previous;

    /**
     * Constructs a NetworkStats object.
     *
     * @param latest   The latest network statistics.
     * @param previous The previous network statistics.
     */
    @JsonCreator
    public NetworkStats(@JsonProperty("latest") LNStats latest,
            @JsonProperty("previous") LNStats previous) {
        this.latest = latest;
        this.previous = previous;
    }

    /**
     * Returns the latest network statistics.
     *
     * @return The latest network statistics.
     */
    public LNStats getLatest() {
        return latest;
    }

    /**
     * Returns the previous network statistics.
     *
     * @return The previous network statistics.
     */
    public LNStats getPrevious() {
        return previous;
    }

    /**
     * Returns a string representation of the NetworkStats object.
     *
     * @return A string representation of the NetworkStats object.
     */
    @Override
    public String toString() {
        return "NetworkStats{" +
                "latest=" + latest +
                ", previous=" + previous +
                '}';
    }

    /**
     * Checks if this NetworkStats object is equal to another object.
     *
     * @param o The object to compare.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkStats that = (NetworkStats) o;
        return Objects.equals(latest, that.latest) &&
                Objects.equals(previous, that.previous);
    }

    /**
     * Generates a hash code for the NetworkStats object.
     *
     * @return The hash code value for the NetworkStats object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(latest, previous);
    }
}
