package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NodeResult {
    private final String publicKey;
    private final String alias;
    private final long capacity;
    private final int channels;
    private final int status;

    /**
     * Constructs a NodeResult object.
     *
     * @param publicKey The public key of the node.
     * @param alias     The alias of the node.
     * @param capacity  The capacity of the node.
     * @param channels  The number of channels the node has.
     * @param status    The status of the node.
     */
    @JsonCreator
    public NodeResult(@JsonProperty("public_key") String publicKey,
            @JsonProperty("alias") String alias,
            @JsonProperty("capacity") long capacity,
            @JsonProperty("channels") int channels,
            @JsonProperty("status") int status) {
        this.publicKey = publicKey;
        this.alias = alias;
        this.capacity = capacity;
        this.channels = channels;
        this.status = status;
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
     * Returns the alias of the node.
     *
     * @return The alias of the node.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Returns the capacity of the node.
     *
     * @return The capacity of the node.
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * Returns the number of channels the node has.
     *
     * @return The number of channels the node has.
     */
    public int getChannels() {
        return channels;
    }

    /**
     * Returns the status of the node.
     *
     * @return The status of the node.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Returns a string representation of the NodeResult object.
     *
     * @return The string representation of the NodeResult object.
     */
    @Override
    public String toString() {
        return "NodeResult{" +
                "publicKey='" + publicKey + '\'' +
                ", alias='" + alias + '\'' +
                ", capacity=" + capacity +
                ", channels=" + channels +
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeResult that = (NodeResult) o;
        return capacity == that.capacity &&
                channels == that.channels &&
                status == that.status &&
                Objects.equals(publicKey, that.publicKey) &&
                Objects.equals(alias, that.alias);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(publicKey, alias, capacity, channels, status);
    }
}
