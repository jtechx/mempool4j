package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Represents the node statistics per Internet Service Provider (ISP).
 */
public class NodeStatsPerISP {
    private final Long clearnetCapacity;
    private final Long torCapacity;
    private final Long unknownCapacity;
    private final List<ISP> ispRanking;

    @JsonCreator
    public NodeStatsPerISP(@JsonProperty("clearnetCapacity") Long clearnetCapacity,
            @JsonProperty("torCapacity") Long torCapacity,
            @JsonProperty("unknownCapacity") Long unknownCapacity,
            @JsonProperty("ispRanking") List<ISP> ispRanking) {
        this.clearnetCapacity = clearnetCapacity;
        this.torCapacity = torCapacity;
        this.unknownCapacity = unknownCapacity;
        this.ispRanking = ispRanking;
    }

    /**
     * Retrieves the total capacity of clearnet nodes.
     *
     * @return The total capacity of clearnet nodes.
     */
    public Long getClearnetCapacity() {
        return clearnetCapacity;
    }

    /**
     * Retrieves the total capacity of Tor nodes.
     *
     * @return The total capacity of Tor nodes.
     */
    public Long getTorCapacity() {
        return torCapacity;
    }

    /**
     * Retrieves the total capacity of unknown nodes.
     *
     * @return The total capacity of unknown nodes.
     */
    public Long getUnknownCapacity() {
        return unknownCapacity;
    }

    /**
     * Retrieves the ranking of ISPs based on their capacity.
     *
     * @return The ranking of ISPs based on their capacity.
     */
    public List<ISP> getIspRanking() {
        return ispRanking;
    }

    /**
     * Returns a string representation of the NodeStatsPerISP object.
     *
     * @return The string representation of the NodeStatsPerISP object.
     */
    @Override
    public String toString() {
        return "NodeStatsPerISP{" +
                "clearnetCapacity=" + clearnetCapacity +
                ", torCapacity=" + torCapacity +
                ", unknownCapacity=" + unknownCapacity +
                ", ispRanking=" + ispRanking +
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
        NodeStatsPerISP that = (NodeStatsPerISP) o;
        return Objects.equals(clearnetCapacity, that.clearnetCapacity) &&
                Objects.equals(torCapacity, that.torCapacity) &&
                Objects.equals(unknownCapacity, that.unknownCapacity) &&
                Objects.equals(ispRanking, that.ispRanking);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(clearnetCapacity, torCapacity, unknownCapacity, ispRanking);
    }
}
