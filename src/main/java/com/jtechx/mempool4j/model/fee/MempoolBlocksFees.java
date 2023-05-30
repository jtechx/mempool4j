package com.jtechx.mempool4j.model.fee;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * MempoolBlocksFeesResponse represents a response containing current mempool as projected blocks.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MempoolBlocksFees {
    private final int blockSize;
    private final double blockVSize;
    private final int nTx;
    private final int totalFees;
    private final double medianFee;
    private final List<Double> feeRange;

    /**
     * Constructs a MempoolBlocksFeesResponse object.
     *
     * @param blockSize   The size of the block.
     * @param blockVSize  The virtual size of the block.
     * @param nTx         The number of transactions in the block.
     * @param totalFees   The total fees in the block.
     * @param medianFee   The median fee in the block.
     * @param feeRange    The fee range in the block.
     */
    @JsonCreator
    public MempoolBlocksFees(@JsonProperty("blockSize") int blockSize,
            @JsonProperty("blockVSize") double blockVSize,
            @JsonProperty("nTx") int nTx,
            @JsonProperty("totalFees") int totalFees,
            @JsonProperty("medianFee") double medianFee,
            @JsonProperty("feeRange") List<Double> feeRange) {
        this.blockSize = blockSize;
        this.blockVSize = blockVSize;
        this.nTx = nTx;
        this.totalFees = totalFees;
        this.medianFee = medianFee;
        this.feeRange = feeRange;
    }

    /**
     * Retrieves the size of the block.
     *
     * @return The size of the block.
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Retrieves the virtual size of the block.
     *
     * @return The virtual size of the block.
     */
    public double getBlockVSize() {
        return blockVSize;
    }

    /**
     * Retrieves the number of transactions in the block.
     *
     * @return The number of transactions in the block.
     */
    public int getnTx() {
        return nTx;
    }

    /**
     * Retrieves the total fees in the block.
     *
     * @return The total fees in the block.
     */
    public int getTotalFees() {
        return totalFees;
    }

    /**
     * Retrieves the median fee in the block.
     *
     * @return The median fee in the block.
     */
    public double getMedianFee() {
        return medianFee;
    }

    /**
     * Retrieves the fee range in the block.
     *
     * @return The fee range in the block.
     */
    public List<Double> getFeeRange() {
        return feeRange;
    }

    /**
     * Returns a string representation of the MempoolBlocksFeesResponse object.
     *
     * @return The string representation of the MempoolBlocksFeesResponse object.
     */
    @Override
    public String toString() {
        return "MempoolBlocksFees{" +
                "blockSize=" + blockSize +
                ", blockVSize=" + blockVSize +
                ", nTx=" + nTx +
                ", totalFees=" + totalFees +
                ", medianFee=" + medianFee +
                ", feeRange=" + feeRange +
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
        MempoolBlocksFees that = (MempoolBlocksFees) o;
        return blockSize == that.blockSize &&
                Double.compare(that.blockVSize, blockVSize) == 0 &&
                nTx == that.nTx &&
                totalFees == that.totalFees &&
                Double.compare(that.medianFee, medianFee) == 0 &&
                Objects.equals(feeRange, that.feeRange);
    }

    /**
     * Returns a hash code value for the MempoolBlocksFeesResponse object.
     *
     * @return The hash code value for the MempoolBlocksFeesResponse object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(blockSize, blockVSize, nTx, totalFees, medianFee, feeRange);
    }
}

