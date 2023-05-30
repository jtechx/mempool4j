package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents a Lightning Channel.
 */
public class LightningChannel {
    private final String id;
    private final String shortId;
    private final Long capacity;
    private final String transactionId;
    private final Integer transactionVout;
    private final String closingTransactionId;
    private final String closingReason;
    private final String updatedAt;
    private final String created;
    private final Integer status;
    private final NodeInfo nodeLeft;
    private final NodeInfo nodeRight;

    /**
     * Creates an instance of LightningChannel.
     *
     * @param id                  The ID of the lightning channel.
     * @param shortId             The short ID of the lightning channel.
     * @param capacity            The capacity of the lightning channel.
     * @param transactionId       The transaction ID associated with the lightning channel.
     * @param transactionVout     The transaction output index associated with the lightning channel.
     * @param closingTransactionId The closing transaction ID of the lightning channel, if closed.
     * @param closingReason       The reason for closing the lightning channel, if closed.
     * @param updatedAt           The timestamp when the lightning channel was last updated.
     * @param created             The timestamp when the lightning channel was created.
     * @param status              The status of the lightning channel.
     * @param nodeLeft            The information about the left node of the channel.
     * @param nodeRight           The information about the right node of the channel.
     */
    @JsonCreator
    public LightningChannel(@JsonProperty("id") String id,
            @JsonProperty("short_id") String shortId,
            @JsonProperty("capacity") Long capacity,
            @JsonProperty("transaction_id") String transactionId,
            @JsonProperty("transaction_vout") Integer transactionVout,
            @JsonProperty("closing_transaction_id") String closingTransactionId,
            @JsonProperty("closing_reason") String closingReason,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("created") String created,
            @JsonProperty("status") Integer status,
            @JsonProperty("node_left") NodeInfo nodeLeft,
            @JsonProperty("node_right") NodeInfo nodeRight) {
        this.id = id;
        this.shortId = shortId;
        this.capacity = capacity;
        this.transactionId = transactionId;
        this.transactionVout = transactionVout;
        this.closingTransactionId = closingTransactionId;
        this.closingReason = closingReason;
        this.updatedAt = updatedAt;
        this.created = created;
        this.status = status;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
    }

    /**
     * Returns the ID of the lightning channel.
     *
     * @return The ID of the lightning channel.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the short ID of the lightning channel.
     *
     * @return The short ID of the lightning channel.
     */
    public String getShortId() {
        return shortId;
    }

    /**
     * Returns the capacity of the lightning channel.
     *
     * @return The capacity of the lightning channel.
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Returns the transaction ID associated with the lightning channel.
     *
     * @return The transaction ID associated with the lightning channel.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Returns the transaction output index associated with the lightning channel.
     *
     * @return The transaction output index associated with the lightning channel.
     */
    public Integer getTransactionVout() {
        return transactionVout;
    }

    /**
     * Returns the closing transaction ID of the lightning channel, if closed.
     *
     * @return The closing transaction ID of the lightning channel, if closed.
     */
    public String getClosingTransactionId() {
        return closingTransactionId;
    }

    /**
     * Returns the reason for closing the lightning channel, if closed.
     *
     * @return The reason for closing the lightning channel, if closed.
     */
    public String getClosingReason() {
        return closingReason;
    }

    /**
     * Returns the timestamp when the lightning channel was last updated.
     *
     * @return The timestamp when the lightning channel was last updated.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Returns the timestamp when the lightning channel was created.
     *
     * @return The timestamp when the lightning channel was created.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Returns the status of the lightning channel.
     *
     * @return The status of the lightning channel.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Returns the information about the left node of the channel.
     *
     * @return The information about the left node of the channel.
     */
    public NodeInfo getNodeLeft() {
        return nodeLeft;
    }

    /**
     * Returns the information about the right node of the channel.
     *
     * @return The information about the right node of the channel.
     */
    public NodeInfo getNodeRight() {
        return nodeRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LightningChannel that = (LightningChannel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(shortId, that.shortId) &&
                Objects.equals(capacity, that.capacity) &&
                Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(transactionVout, that.transactionVout) &&
                Objects.equals(closingTransactionId, that.closingTransactionId) &&
                Objects.equals(closingReason, that.closingReason) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(created, that.created) &&
                Objects.equals(status, that.status) &&
                Objects.equals(nodeLeft, that.nodeLeft) &&
                Objects.equals(nodeRight, that.nodeRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortId, capacity, transactionId, transactionVout, closingTransactionId, closingReason, updatedAt, created,
                status, nodeLeft, nodeRight);
    }

    @Override
    public String toString() {
        return "LightningChannel{" +
                "id='" + id + '\'' +
                ", shortId='" + shortId + '\'' +
                ", capacity=" + capacity +
                ", transactionId='" + transactionId + '\'' +
                ", transactionVout=" + transactionVout +
                ", closingTransactionId='" + closingTransactionId + '\'' +
                ", closingReason='" + closingReason + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", created='" + created + '\'' +
                ", status=" + status +
                ", nodeLeft=" + nodeLeft +
                ", nodeRight=" + nodeRight +
                '}';
    }
}
