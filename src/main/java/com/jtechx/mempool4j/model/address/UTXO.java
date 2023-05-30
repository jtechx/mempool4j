package com.jtechx.mempool4j.model.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jtechx.mempool4j.model.transaction.TransactionStatus;

import java.util.Objects;

/**
 * Represents an Unspent Transaction Output (UTXO).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UTXO {

    private final String txId;
    private final int vout;
    private final TransactionStatus transactionStatus;
    private final long value;

    /**
     * Constructs a new UTXO object with the provided values.
     *
     * @param txId   The transaction ID.
     * @param vout   The output index.
     * @param transactionStatus The status of the funding transaction.
     * @param value  The value of the UTXO.
     */
    public UTXO(@JsonProperty("txid") String txId,
            @JsonProperty("vout") int vout,
            @JsonProperty("status") TransactionStatus transactionStatus,
            @JsonProperty("value") long value) {
        this.txId = txId;
        this.vout = vout;
        this.transactionStatus = transactionStatus;
        this.value = value;
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
     * Retrieves the output index.
     *
     * @return The output index.
     */
    public int getVout() {
        return vout;
    }

    /**
     * Retrieves the status of the funding transaction.
     *
     * @return The status of the funding transaction.
     */
    public TransactionStatus getStatus() {
        return transactionStatus;
    }

    /**
     * Retrieves the value of the UTXO.
     *
     * @return The value of the UTXO.
     */
    public long getValue() {
        return value;
    }

    /**
     * Returns a string representation of the UTXO object.
     *
     * @return A string representation of the UTXO object.
     */
    @Override
    public String toString() {
        return "UTXO{" +
                "txId='" + txId + '\'' +
                ", vout=" + vout +
                ", status=" + transactionStatus +
                ", value=" + value +
                '}';
    }

    /**
     * Checks if the UTXO object is equal to another object.
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
        UTXO utxo = (UTXO) o;
        return vout == utxo.vout &&
                value == utxo.value &&
                Objects.equals(txId, utxo.txId) &&
                Objects.equals(transactionStatus, utxo.transactionStatus);
    }

    /**
     * Generates a hash code for the UTXO object.
     *
     * @return The hash code value for the UTXO object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(txId, vout, transactionStatus, value);
    }
}
