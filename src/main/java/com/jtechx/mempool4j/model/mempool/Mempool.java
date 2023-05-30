package com.jtechx.mempool4j.model.mempool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Mempool represents the mempool statistics.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mempool {
    private final int count;
    private final int vsize;
    private final int totalFee;
    private final List<List<Double>> feeHistogram;

    /**
     * Constructs a Mempool object.
     *
     * @param count        The count of transactions in the mempool.
     * @param vsize        The virtual size of the mempool.
     * @param totalFee     The total fee in the mempool.
     * @param feeHistogram The fee histogram of the mempool.
     */
    @JsonCreator
    public Mempool(@JsonProperty("count") int count,
            @JsonProperty("vsize") int vsize,
            @JsonProperty("total_fee") int totalFee,
            @JsonProperty("fee_histogram") List<List<Double>> feeHistogram) {
        this.count = count;
        this.vsize = vsize;
        this.totalFee = totalFee;
        this.feeHistogram = feeHistogram;
    }

    /**
     * Retrieves the count of transactions in the mempool.
     *
     * @return The count of transactions in the mempool.
     */
    public int getCount() {
        return count;
    }

    /**
     * Retrieves the virtual size of the mempool.
     *
     * @return The virtual size of the mempool.
     */
    public int getVsize() {
        return vsize;
    }

    /**
     * Retrieves the total fee in the mempool.
     *
     * @return The total fee in the mempool.
     */
    public int getTotalFee() {
        return totalFee;
    }

    /**
     * Retrieves the fee histogram of the mempool.
     *
     * @return The fee histogram of the mempool.
     */
    public List<List<Double>> getFeeHistogram() {
        return feeHistogram;
    }

    /**
     * Returns a string representation of the Mempool object.
     *
     * @return The string representation of the Mempool object.
     */
    @Override
    public String toString() {
        return "Mempool{" +
                "count=" + count +
                ", vsize=" + vsize +
                ", totalFee=" + totalFee +
                ", feeHistogram=" + feeHistogram +
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
        Mempool that = (Mempool) o;
        return count == that.count &&
                vsize == that.vsize &&
                totalFee == that.totalFee &&
                Objects.equals(feeHistogram, that.feeHistogram);
    }

    /**
     * Returns a hash code value for the Mempool object.
     *
     * @return The hash code value for the Mempool object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(count, vsize, totalFee, feeHistogram);
    }
}
