package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TransactionOutspend represents the information about a spent transaction output.
 */
public class TransactionOutspend {
    private final boolean spent;
    private final String txid;
    private final int vin;
    private final TransactionStatus status;

    /**
     * Constructs a TransactionOutspend object.
     *
     * @param spent  Indicates if the transaction output is spent.
     * @param txid   The transaction ID.
     * @param vin    The input index of the spent output.
     * @param status The status of the transaction output.
     */
    @JsonCreator
    public TransactionOutspend(@JsonProperty("spent") boolean spent,
            @JsonProperty("txid") String txid,
            @JsonProperty("vin") int vin,
            @JsonProperty("status") TransactionStatus status) {
        this.spent = spent;
        this.txid = txid;
        this.vin = vin;
        this.status = status;
    }

    /**
     * Checks if the transaction output is spent.
     *
     * @return true if the transaction output is spent, false otherwise.
     */
    public boolean isSpent() {
        return spent;
    }

    /**
     * Retrieves the transaction ID of the spent output.
     *
     * @return The transaction ID.
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Retrieves the input index of the spent output.
     *
     * @return The input index.
     */
    public int getVin() {
        return vin;
    }

    /**
     * Retrieves the status of the transaction output.
     *
     * @return The status of the transaction output.
     */
    public TransactionStatus getStatus() {
        return status;
    }

    /**
     * Returns a string representation of the TransactionOutspend object.
     *
     * @return The string representation of the TransactionOutspend object.
     */
    @Override
    public String toString() {
        return "TransactionOutspend{" +
                "spent=" + spent +
                ", txid='" + txid + '\'' +
                ", vin=" + vin +
                ", status=" + status +
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
        TransactionOutspend that = (TransactionOutspend) o;
        return spent == that.spent &&
                vin == that.vin &&
                Objects.equals(txid, that.txid) &&
                Objects.equals(status, that.status);
    }

    /**
     * Returns a hash code value for the TransactionOutspend object.
     *
     * @return The hash code value for the TransactionOutspend object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(spent, txid, vin, status);
    }
}
