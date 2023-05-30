package com.jtechx.mempool4j.model.address;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents an address with chain and mempool statistics.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    private final String address;
    private final ChainStats chainStats;
    private final MempoolStats mempoolStats;

    /**
     * Constructs a new Address object with the provided values.
     *
     * @param address      The address.
     * @param chainStats   The chain statistics.
     * @param mempoolStats The mempool statistics.
     */
    @JsonCreator
    public Address(@JsonProperty("address") String address,
            @JsonProperty("chain_stats") ChainStats chainStats,
            @JsonProperty("mempool_stats") MempoolStats mempoolStats) {
        this.address = address;
        this.chainStats = chainStats;
        this.mempoolStats = mempoolStats;
    }

    /**
     * Retrieves the address.
     *
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retrieves the chain statistics.
     *
     * @return The chain statistics.
     */
    public ChainStats getChainStats() {
        return chainStats;
    }

    /**
     * Retrieves the mempool statistics.
     *
     * @return The mempool statistics.
     */
    public MempoolStats getMempoolStats() {
        return mempoolStats;
    }

    /**
     * Returns a string representation of the Address object.
     *
     * @return A string representation of the Address object.
     */
    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", chainStats=" + chainStats +
                ", mempoolStats=" + mempoolStats +
                '}';
    }

    /**
     * Checks if the Address object is equal to another object.
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
        Address address1 = (Address) o;
        return Objects.equals(address, address1.address) &&
                Objects.equals(chainStats, address1.chainStats) &&
                Objects.equals(mempoolStats, address1.mempoolStats);
    }

    /**
     * Generates a hash code for the Address object.
     *
     * @return The hash code value for the Address object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(address, chainStats, mempoolStats);
    }

    /**
     * Represents the chain statistics for an address.
     */
    public static class ChainStats {

        private final int fundedTxoCount;
        private final long fundedTxoSum;
        private final int spentTxoCount;
        private final long spentTxoSum;
        private final int txCount;

        /**
         * Constructs a new ChainStats object with the provided values.
         *
         * @param fundedTxoCount  The count of funded transaction outputs.
         * @param fundedTxoSum    The sum of funded transaction outputs.
         * @param spentTxoCount   The count of spent transaction outputs.
         * @param spentTxoSum     The sum of spent transaction outputs.
         * @param txCount         The count of transactions.
         */
        @JsonCreator
        public ChainStats(@JsonProperty("funded_txo_count") int fundedTxoCount,
                @JsonProperty("funded_txo_sum") long fundedTxoSum,
                @JsonProperty("spent_txo_count") int spentTxoCount,
                @JsonProperty("spent_txo_sum") long spentTxoSum,
                @JsonProperty("tx_count") int txCount) {
            this.fundedTxoCount = fundedTxoCount;
            this.fundedTxoSum = fundedTxoSum;
            this.spentTxoCount = spentTxoCount;
            this.spentTxoSum = spentTxoSum;
            this.txCount = txCount;
        }

        /**
         * Retrieves the count of funded transaction outputs.
         *
         * @return The count of funded transaction outputs.
         */
        public int getFundedTxoCount() {
            return fundedTxoCount;
        }

        /**
         * Retrieves the sum of funded transaction outputs.
         *
         * @return The sum of funded transaction outputs.
         */
        public long getFundedTxoSum() {
            return fundedTxoSum;
        }

        /**
         * Retrieves the count of spent transaction outputs.
         *
         * @return The count of spent transaction outputs.
         */
        public int getSpentTxoCount() {
            return spentTxoCount;
        }

        /**
         * Retrieves the sum of spent transaction outputs.
         *
         * @return The sum of spent transaction outputs.
         */
        public long getSpentTxoSum() {
            return spentTxoSum;
        }

        /**
         * Retrieves the count of transactions.
         *
         * @return The count of transactions.
         */
        public int getTxCount() {
            return txCount;
        }

        /**
         * Returns a string representation of the ChainStats object.
         *
         * @return A string representation of the ChainStats object.
         */
        @Override
        public String toString() {
            return "ChainStats{" +
                    "fundedTxoCount=" + fundedTxoCount +
                    ", fundedTxoSum=" + fundedTxoSum +
                    ", spentTxoCount=" + spentTxoCount +
                    ", spentTxoSum=" + spentTxoSum +
                    ", txCount=" + txCount +
                    '}';
        }

        /**
         * Checks if the ChainStats object is equal to another object.
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
            ChainStats that = (ChainStats) o;
            return fundedTxoCount == that.fundedTxoCount &&
                    fundedTxoSum == that.fundedTxoSum &&
                    spentTxoCount == that.spentTxoCount &&
                    spentTxoSum == that.spentTxoSum &&
                    txCount == that.txCount;
        }

        /**
         * Generates a hash code for the ChainStats object.
         *
         * @return The hash code value for the ChainStats object.
         */
        @Override
        public int hashCode() {
            return Objects.hash(fundedTxoCount, fundedTxoSum, spentTxoCount, spentTxoSum, txCount);
        }
    }

    /**
     * Represents the mempool statistics for an address.
     */
    public static class MempoolStats {
        private final int fundedTxoCount;
        private final long fundedTxoSum;
        private final int spentTxoCount;
        private final long spentTxoSum;
        private final int txCount;

        /**
         * Constructs a new MempoolStats object with the provided values.
         *
         * @param fundedTxoCount  The count of funded transaction outputs in the mempool.
         * @param fundedTxoSum    The sum of funded transaction outputs in the mempool.
         * @param spentTxoCount   The count of spent transaction outputs in the mempool.
         * @param spentTxoSum     The sum of spent transaction outputs in the mempool.
         * @param txCount         The count of transactions in the mempool.
         */
        @JsonCreator
        public MempoolStats(@JsonProperty("funded_txo_count") int fundedTxoCount,
                @JsonProperty("funded_txo_sum") long fundedTxoSum,
                @JsonProperty("spent_txo_count") int spentTxoCount,
                @JsonProperty("spent_txo_sum") long spentTxoSum,
                @JsonProperty("tx_count") int txCount) {
            this.fundedTxoCount = fundedTxoCount;
            this.fundedTxoSum = fundedTxoSum;
            this.spentTxoCount = spentTxoCount;
            this.spentTxoSum = spentTxoSum;
            this.txCount = txCount;
        }

        /**
         * Retrieves the count of funded transaction outputs in the mempool.
         *
         * @return The count of funded transaction outputs in the mempool.
         */
        public int getFundedTxoCount() {
            return fundedTxoCount;
        }

        /**
         * Retrieves the sum of funded transaction outputs in the mempool.
         *
         * @return The sum of funded transaction outputs in the mempool.
         */
        public long getFundedTxoSum() {
            return fundedTxoSum;
        }

        /**
         * Retrieves the count of spent transaction outputs in the mempool.
         *
         * @return The count of spent transaction outputs in the mempool.
         */
        public int getSpentTxoCount() {
            return spentTxoCount;
        }

        /**
         * Retrieves the sum of spent transaction outputs in the mempool.
         *
         * @return The sum of spent transaction outputs in the mempool.
         */
        public long getSpentTxoSum() {
            return spentTxoSum;
        }

        /**
         * Retrieves the count of transactions in the mempool.
         *
         * @return The count of transactions in the mempool.
         */
        public int getTxCount() {
            return txCount;
        }

        /**
         * Returns a string representation of the MempoolStats object.
         *
         * @return A string representation of the MempoolStats object.
         */
        @Override
        public String toString() {
            return "MempoolStats{" +
                    "fundedTxoCount=" + fundedTxoCount +
                    ", fundedTxoSum=" + fundedTxoSum +
                    ", spentTxoCount=" + spentTxoCount +
                    ", spentTxoSum=" + spentTxoSum +
                    ", txCount=" + txCount +
                    '}';
        }

        /**
         * Checks if the MempoolStats object is equal to another object.
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
            MempoolStats that = (MempoolStats) o;
            return fundedTxoCount == that.fundedTxoCount &&
                    fundedTxoSum == that.fundedTxoSum &&
                    spentTxoCount == that.spentTxoCount &&
                    spentTxoSum == that.spentTxoSum &&
                    txCount == that.txCount;
        }

        /**
         * Generates a hash code for the MempoolStats object.
         *
         * @return The hash code value for the MempoolStats object.
         */
        @Override
        public int hashCode() {
            return Objects.hash(fundedTxoCount, fundedTxoSum, spentTxoCount, spentTxoSum, txCount);
        }
    }
}
