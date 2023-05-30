package com.jtechx.mempool4j.model.block;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jtechx.mempool4j.model.mining.MiningPool;
import java.util.List;
import java.util.Objects;

/**
 * Represents the extra information about a blockchain block.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Extras {
    private final int totalFees;
    private final int medianFee;
    private final List<Integer> feeRange;
    private final int reward;
    private final MiningPool miningPool;
    private final int avgFee;
    private final int avgFeeRate;
    private final String coinbaseRaw;
    private final String coinbaseAddress;
    private final String coinbaseSignature;
    private final String coinbaseSignatureAscii;
    private final double avgTxSize;
    private final int totalInputs;
    private final int totalOutputs;
    private final long totalOutputAmt;
    private final int medianFeeAmt;
    private final List<Integer> feePercentiles;
    private final int segwitTotalTxs;
    private final int segwitTotalSize;
    private final int segwitTotalWeight;
    private final String header;
    private final int utxoSetChange;
    private final int utxoSetSize;
    private final long totalInputAmt;
    private final int virtualSize;
    private final List<Object> orphans;
    private final double matchRate;
    private final double similarity;

    /**
     * Constructs an Extras object.
     *
     * @param totalFees              The total fees of the block.
     * @param medianFee              The median fee of the block.
     * @param feeRange               The fee range of the block.
     * @param reward                 The reward of the block.
     * @param miningPool                   The mining pool of the block.
     * @param avgFee                 The average fee of the block.
     * @param avgFeeRate             The average fee rate of the block.
     * @param coinbaseRaw            The raw coinbase transaction of the block.
     * @param coinbaseAddress        The coinbase address of the block.
     * @param coinbaseSignature      The coinbase signature of the block.
     * @param coinbaseSignatureAscii The ASCII representation of the coinbase signature of the block.
     * @param avgTxSize              The average transaction size of the block.
     * @param totalInputs            The total number of inputs in the block.
     * @param totalOutputs           The total number of outputs in the block.
     * @param totalOutputAmt         The total output amount of the block.
     * @param medianFeeAmt           The median fee amount of the block.
     * @param feePercentiles         The fee percentiles of the block.
     * @param segwitTotalTxs         The total number of segwit transactions in the block.
     * @param segwitTotalSize        The total size of segwit transactions in the block.
     * @param segwitTotalWeight      The total weight of segwit transactions in the block.
     * @param header                 The header of the block.
     * @param utxoSetChange          The change in the UTXO set size after applying the block.
     * @param utxoSetSize            The UTXO set size after applying the block.
     * @param totalInputAmt          The total input amount of the block.
     * @param virtualSize            The virtual size of the block.
     * @param orphans                The orphans of the block.
     * @param matchRate              The match rate of the block.
     * @param similarity             The similarity of the block.
     */
    @JsonCreator
    public Extras(
            @JsonProperty("totalFees") int totalFees,
            @JsonProperty("medianFee") int medianFee,
            @JsonProperty("feeRange") List<Integer> feeRange,
            @JsonProperty("reward") int reward,
            @JsonProperty("pool") MiningPool miningPool,
            @JsonProperty("avgFee") int avgFee,
            @JsonProperty("avgFeeRate") int avgFeeRate,
            @JsonProperty("coinbaseRaw") String coinbaseRaw,
            @JsonProperty("coinbaseAddress") String coinbaseAddress,
            @JsonProperty("coinbaseSignature") String coinbaseSignature,
            @JsonProperty("coinbaseSignatureAscii") String coinbaseSignatureAscii,
            @JsonProperty("avgTxSize") double avgTxSize,
            @JsonProperty("totalInputs") int totalInputs,
            @JsonProperty("totalOutputs") int totalOutputs,
            @JsonProperty("totalOutputAmt") long totalOutputAmt,
            @JsonProperty("medianFeeAmt") int medianFeeAmt,
            @JsonProperty("feePercentiles") List<Integer> feePercentiles,
            @JsonProperty("segwitTotalTxs") int segwitTotalTxs,
            @JsonProperty("segwitTotalSize") int segwitTotalSize,
            @JsonProperty("segwitTotalWeight") int segwitTotalWeight,
            @JsonProperty("header") String header,
            @JsonProperty("utxoSetChange") int utxoSetChange,
            @JsonProperty("utxoSetSize") int utxoSetSize,
            @JsonProperty("totalInputAmt") long totalInputAmt,
            @JsonProperty("virtualSize") int virtualSize,
            @JsonProperty("orphans") List<Object> orphans,
            @JsonProperty("matchRate") double matchRate,
            @JsonProperty("similarity") double similarity) {
        this.totalFees = totalFees;
        this.medianFee = medianFee;
        this.feeRange = feeRange;
        this.reward = reward;
        this.miningPool = miningPool;
        this.avgFee = avgFee;
        this.avgFeeRate = avgFeeRate;
        this.coinbaseRaw = coinbaseRaw;
        this.coinbaseAddress = coinbaseAddress;
        this.coinbaseSignature = coinbaseSignature;
        this.coinbaseSignatureAscii = coinbaseSignatureAscii;
        this.avgTxSize = avgTxSize;
        this.totalInputs = totalInputs;
        this.totalOutputs = totalOutputs;
        this.totalOutputAmt = totalOutputAmt;
        this.medianFeeAmt = medianFeeAmt;
        this.feePercentiles = feePercentiles;
        this.segwitTotalTxs = segwitTotalTxs;
        this.segwitTotalSize = segwitTotalSize;
        this.segwitTotalWeight = segwitTotalWeight;
        this.header = header;
        this.utxoSetChange = utxoSetChange;
        this.utxoSetSize = utxoSetSize;
        this.totalInputAmt = totalInputAmt;
        this.virtualSize = virtualSize;
        this.orphans = orphans;
        this.matchRate = matchRate;
        this.similarity = similarity;
    }

    /**
     * Returns the total fees of the block.
     *
     * @return The total fees.
     */
    public int getTotalFees() {
        return totalFees;
    }

    /**
     * Returns the median fee of the block.
     *
     * @return The median fee.
     */
    public int getMedianFee() {
        return medianFee;
    }

    /**
     * Returns the fee range of the block.
     *
     * @return The fee range.
     */
    public List<Integer> getFeeRange() {
        return feeRange;
    }

    /**
     * Returns the reward of the block.
     *
     * @return The reward.
     */
    public int getReward() {
        return reward;
    }

    /**
     * Returns the mining pool of the block.
     *
     * @return The mining pool.
     */
    public MiningPool getPool() {
        return miningPool;
    }

    /**
     * Returns the average fee of the block.
     *
     * @return The average fee.
     */
    public int getAvgFee() {
        return avgFee;
    }

    /**
     * Returns the average fee rate of the block.
     *
     * @return The average fee rate.
     */
    public int getAvgFeeRate() {
        return avgFeeRate;
    }

    /**
     * Returns the raw coinbase transaction of the block.
     *
     * @return The raw coinbase transaction.
     */
    public String getCoinbaseRaw() {
        return coinbaseRaw;
    }

    /**
     * Returns the coinbase address of the block.
     *
     * @return The coinbase address.
     */
    public String getCoinbaseAddress() {
        return coinbaseAddress;
    }

    /**
     * Returns the coinbase signature of the block.
     *
     * @return The coinbase signature.
     */
    public String getCoinbaseSignature() {
        return coinbaseSignature;
    }

    /**
     * Returns the ASCII representation of the coinbase signature of the block.
     *
     * @return The ASCII representation of the coinbase signature.
     */
    public String getCoinbaseSignatureAscii() {
        return coinbaseSignatureAscii;
    }

    /**
     * Returns the average transaction size of the block.
     *
     * @return The average transaction size.
     */
    public double getAvgTxSize() {
        return avgTxSize;
    }

    /**
     * Returns the total number of inputs in the block.
     *
     * @return The total number of inputs.
     */
    public int getTotalInputs() {
        return totalInputs;
    }

    /**
     * Returns the total number of outputs in the block.
     *
     * @return The total number of outputs.
     */
    public int getTotalOutputs() {
        return totalOutputs;
    }

    /**
     * Returns the total output amount of the block.
     *
     * @return The total output amount.
     */
    public long getTotalOutputAmt() {
        return totalOutputAmt;
    }

    /**
     * Returns the median fee amount of the block.
     *
     * @return The median fee amount.
     */
    public int getMedianFeeAmt() {
        return medianFeeAmt;
    }

    /**
     * Returns the fee percentiles of the block.
     *
     * @return The fee percentiles.
     */
    public List<Integer> getFeePercentiles() {
        return feePercentiles;
    }

    /**
     * Returns the total number of segwit transactions in the block.
     *
     * @return The total number of segwit transactions.
     */
    public int getSegwitTotalTxs() {
        return segwitTotalTxs;
    }

    /**
     * Returns the total size of segwit transactions in the block.
     *
     * @return The total size of segwit transactions.
     */
    public int getSegwitTotalSize() {
        return segwitTotalSize;
    }

    /**
     * Returns the total weight of segwit transactions in the block.
     *
     * @return The total weight of segwit transactions.
     */
    public int getSegwitTotalWeight() {
        return segwitTotalWeight;
    }

    /**
     * Returns the header of the block.
     *
     * @return The block header.
     */
    public String getHeader() {
        return header;
    }

    /**
     * Returns the change in the UTXO set size after applying the block.
     *
     * @return The UTXO set change.
     */
    public int getUtxoSetChange() {
        return utxoSetChange;
    }

    /**
     * Returns the UTXO set size after applying the block.
     *
     * @return The UTXO set size.
     */
    public int getUtxoSetSize() {
        return utxoSetSize;
    }

    /**
     * Returns the total input amount of the block.
     *
     * @return The total input amount.
     */
    public long getTotalInputAmt() {
        return totalInputAmt;
    }

    /**
     * Returns the virtual size of the block.
     *
     * @return The virtual size.
     */
    public int getVirtualSize() {
        return virtualSize;
    }

    /**
     * Returns the orphans of the block.
     *
     * @return The orphans.
     */
    public List<Object> getOrphans() {
        return orphans;
    }

    /**
     * Returns the match rate of the block.
     *
     * @return The match rate.
     */
    public double getMatchRate() {
        return matchRate;
    }

    /**
     * Returns the similarity of the block.
     *
     * @return The similarity.
     */
    public double getSimilarity() {
        return similarity;
    }

    @Override
    public String toString() {
        return "Extras{" +
                "totalFees=" + totalFees +
                ", medianFee=" + medianFee +
                ", feeRange=" + feeRange +
                ", reward=" + reward +
                ", pool=" + miningPool +
                ", avgFee=" + avgFee +
                ", avgFeeRate=" + avgFeeRate +
                ", coinbaseRaw='" + coinbaseRaw + '\'' +
                ", coinbaseAddress='" + coinbaseAddress + '\'' +
                ", coinbaseSignature='" + coinbaseSignature + '\'' +
                ", coinbaseSignatureAscii='" + coinbaseSignatureAscii + '\'' +
                ", avgTxSize=" + avgTxSize +
                ", totalInputs=" + totalInputs +
                ", totalOutputs=" + totalOutputs +
                ", totalOutputAmt=" + totalOutputAmt +
                ", medianFeeAmt=" + medianFeeAmt +
                ", feePercentiles=" + feePercentiles +
                ", segwitTotalTxs=" + segwitTotalTxs +
                ", segwitTotalSize=" + segwitTotalSize +
                ", segwitTotalWeight=" + segwitTotalWeight +
                ", header='" + header + '\'' +
                ", utxoSetChange=" + utxoSetChange +
                ", utxoSetSize=" + utxoSetSize +
                ", totalInputAmt=" + totalInputAmt +
                ", virtualSize=" + virtualSize +
                ", orphans=" + orphans +
                ", matchRate=" + matchRate +
                ", similarity=" + similarity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Extras extras = (Extras) o;
        return totalFees == extras.totalFees &&
                medianFee == extras.medianFee &&
                avgFee == extras.avgFee &&
                avgFeeRate == extras.avgFeeRate &&
                Double.compare(extras.avgTxSize, avgTxSize) == 0 &&
                totalInputs == extras.totalInputs &&
                totalOutputs == extras.totalOutputs &&
                totalOutputAmt == extras.totalOutputAmt &&
                medianFeeAmt == extras.medianFeeAmt &&
                segwitTotalTxs == extras.segwitTotalTxs &&
                segwitTotalSize == extras.segwitTotalSize &&
                segwitTotalWeight == extras.segwitTotalWeight &&
                utxoSetChange == extras.utxoSetChange &&
                utxoSetSize == extras.utxoSetSize &&
                totalInputAmt == extras.totalInputAmt &&
                virtualSize == extras.virtualSize &&
                Double.compare(extras.matchRate, matchRate) == 0 &&
                Double.compare(extras.similarity, similarity) == 0 &&
                Objects.equals(feeRange, extras.feeRange) &&
                Objects.equals(miningPool, extras.miningPool) &&
                Objects.equals(coinbaseRaw, extras.coinbaseRaw) &&
                Objects.equals(coinbaseAddress, extras.coinbaseAddress) &&
                Objects.equals(coinbaseSignature, extras.coinbaseSignature) &&
                Objects.equals(coinbaseSignatureAscii, extras.coinbaseSignatureAscii) &&
                Objects.equals(feePercentiles, extras.feePercentiles) &&
                Objects.equals(header, extras.header) &&
                Objects.equals(orphans, extras.orphans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalFees, medianFee, feeRange, reward, miningPool, avgFee, avgFeeRate,
                coinbaseRaw, coinbaseAddress, coinbaseSignature, coinbaseSignatureAscii,
                avgTxSize, totalInputs, totalOutputs, totalOutputAmt, medianFeeAmt, feePercentiles,
                segwitTotalTxs, segwitTotalSize, segwitTotalWeight, header, utxoSetChange,
                utxoSetSize, totalInputAmt, virtualSize, orphans, matchRate, similarity);
    }
}
