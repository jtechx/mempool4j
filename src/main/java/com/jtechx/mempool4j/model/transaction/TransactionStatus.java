package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the status of a transaction.
 */
public class TransactionStatus {
    private final boolean confirmed;
    private final int blockHeight;
    private final String blockHash;
    private final long blockTime;

    /**
     * Constructs a new TransactionStatus object with the provided values.
     *
     * @param confirmed   Whether the transaction is confirmed or not.
     * @param blockHeight The block height.
     * @param blockHash   The block hash.
     * @param blockTime   The block time.
     */
    public TransactionStatus(@JsonProperty("confirmed") boolean confirmed,
            @JsonProperty("block_height") int blockHeight,
            @JsonProperty("block_hash") String blockHash,
            @JsonProperty("block_time") long blockTime) {
        this.confirmed = confirmed;
        this.blockHeight = blockHeight;
        this.blockHash = blockHash;
        this.blockTime = blockTime;
    }

    /**
     * Checks if the transaction is confirmed.
     *
     * @return True if the transaction is confirmed, false otherwise.
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Retrieves the block height.
     *
     * @return The block height.
     */
    public int getBlockHeight() {
        return blockHeight;
    }

    /**
     * Retrieves the block hash.
     *
     * @return The block hash.
     */
    public String getBlockHash() {
        return blockHash;
    }

    /**
     * Retrieves the block time.
     *
     * @return The block time.
     */
    public long getBlockTime() {
        return blockTime;
    }

    /**
     * Returns a string representation of the TransactionStatus object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "TransactionStatus{" +
                "confirmed=" + confirmed +
                ", blockHeight=" + blockHeight +
                ", blockHash='" + blockHash + '\'' +
                ", blockTime=" + blockTime +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionStatus that = (TransactionStatus) o;
        return confirmed == that.confirmed &&
                blockHeight == that.blockHeight &&
                blockTime == that.blockTime &&
                Objects.equals(blockHash, that.blockHash);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(confirmed, blockHeight, blockHash, blockTime);
    }
}
