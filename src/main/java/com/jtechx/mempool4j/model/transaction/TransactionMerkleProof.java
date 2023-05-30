package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * TransactionMerkleProof represents the merkle proof for a transaction.
 */
public class TransactionMerkleProof {
    private final int blockHeight;
    private final List<String> merkle;
    private final int position;

    /**
     * Constructs a TransactionMerkleProof object.
     *
     * @param blockHeight The block height of the transaction.
     * @param merkle      The merkle proof.
     * @param position    The position of the transaction in the merkle tree.
     */
    @JsonCreator
    public TransactionMerkleProof(@JsonProperty("block_height") int blockHeight,
            @JsonProperty("merkle") List<String> merkle,
            @JsonProperty("pos") int position) {
        this.blockHeight = blockHeight;
        this.merkle = merkle;
        this.position = position;
    }

    /**
     * Retrieves the block height of the transaction.
     *
     * @return The block height of the transaction.
     */
    public int getBlockHeight() {
        return blockHeight;
    }

    /**
     * Retrieves the merkle proof.
     *
     * @return The merkle proof.
     */
    public List<String> getMerkle() {
        return merkle;
    }

    /**
     * Retrieves the position of the transaction in the merkle tree.
     *
     * @return The position of the transaction.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Returns a string representation of the TransactionMerkleProof object.
     *
     * @return The string representation of the TransactionMerkleProof object.
     */
    @Override
    public String toString() {
        return "TransactionMerkleProof{" +
                "blockHeight=" + blockHeight +
                ", merkle=" + merkle +
                ", position=" + position +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionMerkleProof that = (TransactionMerkleProof) o;
        return blockHeight == that.blockHeight &&
                position == that.position &&
                Objects.equals(merkle, that.merkle);
    }

    /**
     * Returns a hash code value for the TransactionMerkleProof object.
     *
     * @return The hash code value for the TransactionMerkleProof object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(blockHeight, merkle, position);
    }
}
