package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * TransactionResponse represents a response containing details about a transaction.
 */
public class Transaction {
    private final String txId;
    private final int version;
    private final int lockTime;
    private final List<Vin> vin;
    private final List<Vout> vout;
    private final int size;
    private final int weight;
    private final int fee;
    private final TransactionStatus transactionStatus;

    /**
     * Constructs a Transaction object.
     *
     * @param txId    The transaction ID.
     * @param version The transaction version.
     * @param lockTime The transaction lock time.
     * @param vin     The list of transaction inputs.
     * @param vout    The list of transaction outputs.
     * @param size    The transaction size.
     * @param weight  The transaction weight.
     * @param fee     The transaction fee.
     * @param transactionStatus  The transaction status.
     */
    @JsonCreator
    public Transaction(@JsonProperty("txid") String txId,
            @JsonProperty("version") int version,
            @JsonProperty("locktime") int lockTime,
            @JsonProperty("vin") List<Vin> vin,
            @JsonProperty("vout") List<Vout> vout,
            @JsonProperty("size") int size,
            @JsonProperty("weight") int weight,
            @JsonProperty("fee") int fee,
            @JsonProperty("status") TransactionStatus transactionStatus) {
        this.txId = txId;
        this.version = version;
        this.lockTime = lockTime;
        this.vin = vin;
        this.vout = vout;
        this.size = size;
        this.weight = weight;
        this.fee = fee;
        this.transactionStatus = transactionStatus;
    }

    /**
     * Retrieves the transaction ID.
     *
     * @return The transaction ID.
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Retrieves the transaction version.
     *
     * @return The transaction version.
     */
    public int getVersion() {
        return version;
    }

    /**
     * Retrieves the transaction lock time.
     *
     * @return The transaction lock time.
     */
    public int getLockTime() {
        return lockTime;
    }

    /**
     * Retrieves the list of transaction inputs.
     *
     * @return The list of transaction inputs.
     */
    public List<Vin> getVin() {
        return vin;
    }

    /**
     * Retrieves the list of transaction outputs.
     *
     * @return The list of transaction outputs.
     */
    public List<Vout> getVout() {
        return vout;
    }

    /**
     * Retrieves the transaction size.
     *
     * @return The transaction size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Retrieves the transaction weight.
     *
     * @return The transaction weight.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Retrieves the transaction fee.
     *
     * @return The transaction fee.
     */
    public int getFee() {
        return fee;
    }

    /**
     * Retrieves the transaction status.
     *
     * @return The transaction status.
     */
    public TransactionStatus getStatus() {
        return transactionStatus;
    }

    /**
     * Returns a string representation of the TransactionResponse object.
     *
     * @return The string representation of the TransactionResponse object.
     */
    @Override
    public String toString() {
        return "TransactionResponse{" +
                "txid='" + txId + '\'' +
                ", version=" + version +
                ", locktime=" + lockTime +
                ", vin=" + vin +
                ", vout=" + vout +
                ", size=" + size +
                ", weight=" + weight +
                ", fee=" + fee +
                ", status=" + transactionStatus +
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
        Transaction that = (Transaction) o;
        return version == that.version &&
                lockTime == that.lockTime &&
                size == that.size &&
                weight == that.weight &&
                fee == that.fee &&
                Objects.equals(txId, that.txId) &&
                Objects.equals(vin, that.vin) &&
                Objects.equals(vout, that.vout) &&
                Objects.equals(transactionStatus, that.transactionStatus);
    }

    /**
     * Returns a hash code value for the TransactionResponse object.
     *
     * @return The hash code value for the TransactionResponse object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(txId, version, lockTime, vin, vout, size, weight, fee, transactionStatus);
    }
}
