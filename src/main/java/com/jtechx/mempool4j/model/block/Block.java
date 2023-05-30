package com.jtechx.mempool4j.model.block;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents a block in the blockchain.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {
    private final Extras extras;
    private final String id;
    private final int height;
    private final int version;
    private final long timestamp;
    private final long bits;
    private final long nonce;
    private final long difficulty;
    private final long medianTime;
    private final String merkleRoot;
    private final int txCount;
    private final int size;
    private final int weight;
    private final String previousBlockHash;

    /**
     * Constructs a new Block object with the provided values.
     *
     * @param extras            The extras information of the block.
     * @param id                The block ID.
     * @param height            The block height.
     * @param version           The block version.
     * @param timestamp         The block timestamp.
     * @param bits              The block bits.
     * @param nonce             The block nonce.
     * @param difficulty        The block difficulty.
     * @param medianTime        The median time of the block.
     * @param merkleRoot        The block merkle root.
     * @param txCount           The transaction count in the block.
     * @param size              The block size.
     * @param weight            The block weight.
     * @param previousBlockHash The hash of the previous block.
     */
    @JsonCreator
    public Block(@JsonProperty("extras") Extras extras,
            @JsonProperty("id") String id,
            @JsonProperty("height") int height,
            @JsonProperty("version") int version,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("bits") long bits,
            @JsonProperty("nonce") long nonce,
            @JsonProperty("difficulty") long difficulty,
            @JsonProperty("mediantime") long medianTime,
            @JsonProperty("merkle_root") String merkleRoot,
            @JsonProperty("tx_count") int txCount,
            @JsonProperty("size") int size,
            @JsonProperty("weight") int weight,
            @JsonProperty("previousblockhash") String previousBlockHash) {
        this.extras = extras;
        this.id = id;
        this.height = height;
        this.version = version;
        this.timestamp = timestamp;
        this.bits = bits;
        this.nonce = nonce;
        this.difficulty = difficulty;
        this.medianTime = medianTime;
        this.merkleRoot = merkleRoot;
        this.txCount = txCount;
        this.size = size;
        this.weight = weight;
        this.previousBlockHash = previousBlockHash;
    }

    /**
     * Retrieves the extras information of the block.
     *
     * @return The extras information of the block.
     */
    public Extras getExtras() {
        return extras;
    }

    /**
     * Retrieves the block ID.
     *
     * @return The block ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the block height.
     *
     * @return The block height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Retrieves the block version.
     *
     * @return The block version.
     */
    public int getVersion() {
        return version;
    }

    /**
     * Retrieves the block timestamp.
     *
     * @return The block timestamp.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Retrieves the block bits.
     *
     * @return The block bits.
     */
    public long getBits() {
        return bits;
    }

    /**
     * Retrieves the block nonce.
     *
     * @return The block nonce.
     */
    public long getNonce() {
        return nonce;
    }

    /**
     * Retrieves the block difficulty.
     *
     * @return The block difficulty.
     */
    public long getDifficulty() {
        return difficulty;
    }

    /**
     * Retrieves the median time of the block.
     *
     * @return The median time of the block.
     */
    public long getMedianTime() {
        return medianTime;
    }

    /**
     * Retrieves the block merkle root.
     *
     * @return The block merkle root.
     */
    public String getMerkleRoot() {
        return merkleRoot;
    }

    /**
     * Retrieves the transaction count in the block.
     *
     * @return The transaction count in the block.
     */
    public int getTxCount() {
        return txCount;
    }

    /**
     * Retrieves the block size.
     *
     * @return The block size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Retrieves the block weight.
     *
     * @return The block weight.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Retrieves the hash of the previous block.
     *
     * @return The hash of the previous block.
     */
    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    /**
     * Returns a string representation of the Block object.
     *
     * @return A string representation of the Block object.
     */
    @Override
    public String toString() {
        return "Block{" +
                "extras=" + extras +
                ", id='" + id + '\'' +
                ", height=" + height +
                ", version=" + version +
                ", timestamp=" + timestamp +
                ", bits=" + bits +
                ", nonce=" + nonce +
                ", difficulty=" + difficulty +
                ", medianTime=" + medianTime +
                ", merkleRoot='" + merkleRoot + '\'' +
                ", txCount=" + txCount +
                ", size=" + size +
                ", weight=" + weight +
                ", previousBlockHash='" + previousBlockHash + '\'' +
                '}';
    }

    /**
     * Checks if the Block object is equal to another object.
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
        Block block = (Block) o;
        return height == block.height &&
                version == block.version &&
                timestamp == block.timestamp &&
                bits == block.bits &&
                nonce == block.nonce &&
                difficulty == block.difficulty &&
                medianTime == block.medianTime &&
                txCount == block.txCount &&
                size == block.size &&
                weight == block.weight &&
                Objects.equals(extras, block.extras) &&
                Objects.equals(id, block.id) &&
                Objects.equals(merkleRoot, block.merkleRoot) &&
                Objects.equals(previousBlockHash, block.previousBlockHash);
    }

    /**
     * Generates a hash code for the Block object.
     *
     * @return The hash code value for the Block object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(extras, id, height, version, timestamp, bits, nonce, difficulty, medianTime,
                merkleRoot, txCount, size, weight, previousBlockHash);
    }
}
