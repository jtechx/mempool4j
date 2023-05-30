package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

/**
 * Represents statistics for a Lightning Network node.
 */
public class NodeStats {
    private final Map<String, String> name;
    private final String iso;
    private final Integer count;
    private final Double share;
    private final String capacity;

    @JsonCreator
    public NodeStats(@JsonProperty("name") Map<String, String> name,
            @JsonProperty("iso") String iso,
            @JsonProperty("count") Integer count,
            @JsonProperty("share") Double share,
            @JsonProperty("capacity") String capacity) {
        this.name = name;
        this.iso = iso;
        this.count = count;
        this.share = share;
        this.capacity = capacity;
    }

    /**
     * Retrieves the name of the node.
     *
     * @return The name of the node.
     */
    public Map<String, String> getName() {
        return name;
    }

    /**
     * Retrieves the ISO code of the node.
     *
     * @return The ISO code of the node.
     */
    public String getIso() {
        return iso;
    }

    /**
     * Retrieves the count of nodes.
     *
     * @return The count of nodes.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Retrieves the share of the node.
     *
     * @return The share of the node.
     */
    public Double getShare() {
        return share;
    }

    /**
     * Retrieves the capacity of the node.
     *
     * @return The capacity of the node.
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Returns a string representation of the NodeStats object.
     *
     * @return The string representation of the NodeStats object.
     */
    @Override
    public String toString() {
        return "NodeStats{" +
                "name=" + name +
                ", iso='" + iso + '\'' +
                ", count=" + count +
                ", share=" + share +
                ", capacity='" + capacity + '\'' +
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
        NodeStats nodeStats = (NodeStats) o;
        return Objects.equals(name, nodeStats.name) &&
                Objects.equals(iso, nodeStats.iso) &&
                Objects.equals(count, nodeStats.count) &&
                Objects.equals(share, nodeStats.share) &&
                Objects.equals(capacity, nodeStats.capacity);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, iso, count, share, capacity);
    }
}
