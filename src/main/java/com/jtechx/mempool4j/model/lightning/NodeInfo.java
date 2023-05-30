package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents information about a Lightning Network node.
 */
public class NodeInfo {
    private final String alias;
    private final String publicKey;
    private final Integer channels;
    private final Long capacity;
    private final Long baseFeeMtokens;
    private final Integer cltvDelta;
    private final Integer feeRate;
    private final Integer isDisabled;
    private final Long maxHtlcMtokens;
    private final Long minHtlcMtokens;
    private final String updatedAt;
    private final Double longitude;
    private final Double latitude;

    /**
     * Constructs a new NodeInfo object.
     *
     * @param alias           The alias of the node.
     * @param publicKey       The public key of the node.
     * @param channels        The number of channels the node has.
     * @param capacity        The total capacity of the node.
     * @param baseFeeMtokens  The base fee in millitokens.
     * @param cltvDelta       The CLTV delta value.
     * @param feeRate         The fee rate.
     * @param isDisabled      Flag indicating if the node is disabled.
     * @param maxHtlcMtokens  The maximum HTLC value in millitokens.
     * @param minHtlcMtokens  The minimum HTLC value in millitokens.
     * @param updatedAt       The last updated timestamp.
     * @param longitude       The longitude coordinate of the node.
     * @param latitude        The latitude coordinate of the node.
     */
    @JsonCreator
    public NodeInfo(@JsonProperty("alias") String alias,
            @JsonProperty("public_key") String publicKey,
            @JsonProperty("channels") Integer channels,
            @JsonProperty("capacity") Long capacity,
            @JsonProperty("base_fee_mtokens") Long baseFeeMtokens,
            @JsonProperty("cltv_delta") Integer cltvDelta,
            @JsonProperty("fee_rate") Integer feeRate,
            @JsonProperty("is_disabled") Integer isDisabled,
            @JsonProperty("max_htlc_mtokens") Long maxHtlcMtokens,
            @JsonProperty("min_htlc_mtokens") Long minHtlcMtokens,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("longitude") Double longitude,
            @JsonProperty("latitude") Double latitude) {
        this.alias = alias;
        this.publicKey = publicKey;
        this.channels = channels;
        this.capacity = capacity;
        this.baseFeeMtokens = baseFeeMtokens;
        this.cltvDelta = cltvDelta;
        this.feeRate = feeRate;
        this.isDisabled = isDisabled;
        this.maxHtlcMtokens = maxHtlcMtokens;
        this.minHtlcMtokens = minHtlcMtokens;
        this.updatedAt = updatedAt;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Returns the alias of the node.
     *
     * @return The alias of the node.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Returns the public key of the node.
     *
     * @return The public key of the node.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Returns the number of channels the node has.
     *
     * @return The number of channels the node has.
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * Returns the total capacity of the node.
     *
     * @return The total capacity of the node.
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Returns the base fee in millitokens.
     *
     * @return The base fee in millitokens.
     */
    public Long getBaseFeeMtokens() {
        return baseFeeMtokens;
    }

    /**
     * Returns the CLTV delta value.
     *
     * @return The CLTV delta value.
     */
    public Integer getCltvDelta() {
        return cltvDelta;
    }

    /**
     * Returns the fee rate.
     *
     * @return The fee rate.
     */
    public Integer getFeeRate() {
        return feeRate;
    }

    /**
     * Returns a flag indicating if the node is disabled.
     *
     * @return A flag indicating if the node is disabled.
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * Returns the maximum HTLC value in millitokens.
     *
     * @return The maximum HTLC value in millitokens.
     */
    public Long getMaxHtlcMtokens() {
        return maxHtlcMtokens;
    }

    /**
     * Returns the minimum HTLC value in millitokens.
     *
     * @return The minimum HTLC value in millitokens.
     */
    public Long getMinHtlcMtokens() {
        return minHtlcMtokens;
    }

    /**
     * Returns the last updated timestamp.
     *
     * @return The last updated timestamp.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Returns the longitude coordinate of the node.
     *
     * @return The longitude coordinate of the node.
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Returns the latitude coordinate of the node.
     *
     * @return The latitude coordinate of the node.
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Checks if this NodeInfo object is equal to another object.
     *
     * @param o The other object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeInfo nodeInfo = (NodeInfo) o;
        return Objects.equals(alias, nodeInfo.alias) &&
                Objects.equals(publicKey, nodeInfo.publicKey) &&
                Objects.equals(channels, nodeInfo.channels) &&
                Objects.equals(capacity, nodeInfo.capacity) &&
                Objects.equals(baseFeeMtokens, nodeInfo.baseFeeMtokens) &&
                Objects.equals(cltvDelta, nodeInfo.cltvDelta) &&
                Objects.equals(feeRate, nodeInfo.feeRate) &&
                Objects.equals(isDisabled, nodeInfo.isDisabled) &&
                Objects.equals(maxHtlcMtokens, nodeInfo.maxHtlcMtokens) &&
                Objects.equals(minHtlcMtokens, nodeInfo.minHtlcMtokens) &&
                Objects.equals(updatedAt, nodeInfo.updatedAt) &&
                Objects.equals(longitude, nodeInfo.longitude) &&
                Objects.equals(latitude, nodeInfo.latitude);
    }

    /**
     * Computes the hash code for this NodeInfo object.
     *
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(alias, publicKey, channels, capacity, baseFeeMtokens, cltvDelta, feeRate, isDisabled, maxHtlcMtokens,
                minHtlcMtokens, updatedAt, longitude, latitude);
    }

    /**
     * Returns a string representation of this NodeInfo object.
     *
     * @return The string representation of this object.
     */
    @Override
    public String toString() {
        return "NodeInfo{" +
                "alias='" + alias + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", channels=" + channels +
                ", capacity=" + capacity +
                ", baseFeeMtokens=" + baseFeeMtokens +
                ", cltvDelta=" + cltvDelta +
                ", feeRate=" + feeRate +
                ", isDisabled=" + isDisabled +
                ", maxHtlcMtokens=" + maxHtlcMtokens +
                ", minHtlcMtokens=" + minHtlcMtokens +
                ", updatedAt='" + updatedAt + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
