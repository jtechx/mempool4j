package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the latest statistics of a Lightning network.
 */
public class LNStats {
    private final int id;
    private final String added;
    private final int channelCount;
    private final int nodeCount;
    private final long totalCapacity;
    private final int torNodes;
    private final int clearnetNodes;
    private final int unannouncedNodes;
    private final long avgCapacity;
    private final int avgFeeRate;
    private final int avgBaseFeeMtokens;
    private final long medCapacity;
    private final int medFeeRate;
    private final int medBaseFeeMtokens;
    private final int clearnetTorNodes;

    /**
     * Constructs an LNStats object.
     *
     * @param id                The identifier of the statistics.
     * @param added             The timestamp when the statistics were added.
     * @param channelCount      The number of channels.
     * @param nodeCount         The number of nodes.
     * @param totalCapacity     The total capacity of the Lightning network.
     * @param torNodes          The number of nodes accessible via Tor.
     * @param clearnetNodes     The number of nodes accessible via clearnet.
     * @param unannouncedNodes  The number of unannounced nodes.
     * @param avgCapacity       The average capacity of channels.
     * @param avgFeeRate        The average fee rate.
     * @param avgBaseFeeMtokens The average base fee in millitokens.
     * @param medCapacity       The median capacity of channels.
     * @param medFeeRate        The median fee rate.
     * @param medBaseFeeMtokens The median base fee in millitokens.
     * @param clearnetTorNodes  The number of nodes accessible via both clearnet and Tor.
     */
    @JsonCreator
    public LNStats(@JsonProperty("id") int id,
            @JsonProperty("added") String added,
            @JsonProperty("channel_count") int channelCount,
            @JsonProperty("node_count") int nodeCount,
            @JsonProperty("total_capacity") long totalCapacity,
            @JsonProperty("tor_nodes") int torNodes,
            @JsonProperty("clearnet_nodes") int clearnetNodes,
            @JsonProperty("unannounced_nodes") int unannouncedNodes,
            @JsonProperty("avg_capacity") long avgCapacity,
            @JsonProperty("avg_fee_rate") int avgFeeRate,
            @JsonProperty("avg_base_fee_mtokens") int avgBaseFeeMtokens,
            @JsonProperty("med_capacity") long medCapacity,
            @JsonProperty("med_fee_rate") int medFeeRate,
            @JsonProperty("med_base_fee_mtokens") int medBaseFeeMtokens,
            @JsonProperty("clearnet_tor_nodes") int clearnetTorNodes) {
        this.id = id;
        this.added = added;
        this.channelCount = channelCount;
        this.nodeCount = nodeCount;
        this.totalCapacity = totalCapacity;
        this.torNodes = torNodes;
        this.clearnetNodes = clearnetNodes;
        this.unannouncedNodes = unannouncedNodes;
        this.avgCapacity = avgCapacity;
        this.avgFeeRate = avgFeeRate;
        this.avgBaseFeeMtokens = avgBaseFeeMtokens;
        this.medCapacity = medCapacity;
        this.medFeeRate = medFeeRate;
        this.medBaseFeeMtokens = medBaseFeeMtokens;
        this.clearnetTorNodes = clearnetTorNodes;
    }

    /**
     * Retrieves the identifier of the statistics.
     *
     * @return The identifier.
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the timestamp when the statistics were added.
     *
     * @return The timestamp.
     */
    public String getAdded() {
        return added;
    }

    /**
     * Retrieves the number of channels.
     *
     * @return The number of channels.
     */
    public int getChannelCount() {
        return channelCount;
    }

    /**
     * Retrieves the number of nodes.
     *
     * @return The number of nodes.
     */
    public int getNodeCount() {
        return nodeCount;
    }

    /**
     * Retrieves the total capacity of the Lightning network.
     *
     * @return The total capacity.
     */
    public long getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Retrieves the number of nodes accessible via Tor.
     *
     * @return The number of Tor nodes.
     */
    public int getTorNodes() {
        return torNodes;
    }

    /**
     * Retrieves the number of nodes accessible via clearnet.
     *
     * @return The number of clearnet nodes.
     */
    public int getClearnetNodes() {
        return clearnetNodes;
    }

    /**
     * Retrieves the number of unannounced nodes.
     *
     * @return The number of unannounced nodes.
     */
    public int getUnannouncedNodes() {
        return unannouncedNodes;
    }

    /**
     * Retrieves the average capacity of channels.
     *
     * @return The average capacity.
     */
    public long getAvgCapacity() {
        return avgCapacity;
    }

    /**
     * Retrieves the average fee rate.
     *
     * @return The average fee rate.
     */
    public int getAvgFeeRate() {
        return avgFeeRate;
    }

    /**
     * Retrieves the average base fee in millitokens.
     *
     * @return The average base fee in millitokens.
     */
    public int getAvgBaseFeeMtokens() {
        return avgBaseFeeMtokens;
    }

    /**
     * Retrieves the median capacity of channels.
     *
     * @return The median capacity.
     */
    public long getMedCapacity() {
        return medCapacity;
    }

    /**
     * Retrieves the median fee rate.
     *
     * @return The median fee rate.
     */
    public int getMedFeeRate() {
        return medFeeRate;
    }

    /**
     * Retrieves the median base fee in millitokens.
     *
     * @return The median base fee in millitokens.
     */
    public int getMedBaseFeeMtokens() {
        return medBaseFeeMtokens;
    }

    /**
     * Retrieves the number of nodes accessible via both clearnet and Tor.
     *
     * @return The number of nodes accessible via both clearnet and Tor.
     */
    public int getClearnetTorNodes() {
        return clearnetTorNodes;
    }

    /**
     * Returns a string representation of the LNStats object.
     *
     * @return The string representation of the LNStats object.
     */
    @Override
    public String toString() {
        return "LNStats{" +
                "id=" + id +
                ", added='" + added + '\'' +
                ", channelCount=" + channelCount +
                ", nodeCount=" + nodeCount +
                ", totalCapacity=" + totalCapacity +
                ", torNodes=" + torNodes +
                ", clearnetNodes=" + clearnetNodes +
                ", unannouncedNodes=" + unannouncedNodes +
                ", avgCapacity=" + avgCapacity +
                ", avgFeeRate=" + avgFeeRate +
                ", avgBaseFeeMtokens=" + avgBaseFeeMtokens +
                ", medCapacity=" + medCapacity +
                ", medFeeRate=" + medFeeRate +
                ", medBaseFeeMtokens=" + medBaseFeeMtokens +
                ", clearnetTorNodes=" + clearnetTorNodes +
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
        LNStats lnStats = (LNStats) o;
        return id == lnStats.id &&
                channelCount == lnStats.channelCount &&
                nodeCount == lnStats.nodeCount &&
                totalCapacity == lnStats.totalCapacity &&
                torNodes == lnStats.torNodes &&
                clearnetNodes == lnStats.clearnetNodes &&
                unannouncedNodes == lnStats.unannouncedNodes &&
                avgCapacity == lnStats.avgCapacity &&
                avgFeeRate == lnStats.avgFeeRate &&
                avgBaseFeeMtokens == lnStats.avgBaseFeeMtokens &&
                medCapacity == lnStats.medCapacity &&
                medFeeRate == lnStats.medFeeRate &&
                medBaseFeeMtokens == lnStats.medBaseFeeMtokens &&
                clearnetTorNodes == lnStats.clearnetTorNodes &&
                Objects.equals(added, lnStats.added);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, added, channelCount, nodeCount, totalCapacity, torNodes, clearnetNodes,
                unannouncedNodes, avgCapacity, avgFeeRate, avgBaseFeeMtokens, medCapacity, medFeeRate,
                medBaseFeeMtokens, clearnetTorNodes);
    }
}
