package com.jtechx.mempool4j.model.transaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CPFPTransaction {
    private final String txId;
    private final int weight;
    private final int fee;

    /**
     * Constructs a Transaction object.
     *
     * @param txId   The transaction ID.
     * @param weight The transaction weight.
     * @param fee    The transaction fee in satoshis.
     */
    @JsonCreator
    public CPFPTransaction(@JsonProperty("txid") String txId,
            @JsonProperty("weight") int weight,
            @JsonProperty("fee") int fee) {
        this.txId = txId;
        this.weight = weight;
        this.fee = fee;
    }

    /**
     * Returns the transaction ID.
     *
     * @return The transaction ID.
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Returns the transaction weight.
     *
     * @return The transaction weight.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the transaction fee in satoshis.
     *
     * @return The transaction fee in satoshis.
     */
    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txid='" + txId + '\'' +
                ", weight=" + weight +
                ", fee=" + fee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPFPTransaction that = (CPFPTransaction) o;
        return weight == that.weight &&
                fee == that.fee &&
                Objects.equals(txId, that.txId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txId, weight, fee);
    }
}
