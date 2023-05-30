package com.jtechx.mempool4j.model.mempool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * MempoolRecent represents a recent transaction in the mempool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MempoolRecent {
    private final String txid;
    private final int fee;
    private final int vsize;
    private final int value;

    /**
     * Constructs a MempoolRecent object.
     *
     * @param txid  The transaction ID.
     * @param fee   The transaction fee in satoshis.
     * @param vsize The virtual size of the transaction in vbytes.
     * @param value The transaction value in satoshis.
     */
    @JsonCreator
    public MempoolRecent(@JsonProperty("txid") String txid,
            @JsonProperty("fee") int fee,
            @JsonProperty("vsize") int vsize,
            @JsonProperty("value") int value) {
        this.txid = txid;
        this.fee = fee;
        this.vsize = vsize;
        this.value = value;
    }

    /**
     * Returns the transaction ID.
     *
     * @return The transaction ID.
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Returns the transaction fee in satoshis.
     *
     * @return The transaction fee in satoshis.
     */
    public int getFee() {
        return fee;
    }

    /**
     * Returns the virtual size of the transaction in vbytes.
     *
     * @return The virtual size of the transaction in vbytes.
     */
    public int getVsize() {
        return vsize;
    }

    /**
     * Returns the transaction value in satoshis.
     *
     * @return The transaction value in satoshis.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a string representation of the MempoolRecent object.
     *
     * @return The string representation of the MempoolRecent object.
     */
    @Override
    public String toString() {
        return "MempoolRecent{" +
                "txid='" + txid + '\'' +
                ", fee=" + fee +
                ", vsize=" + vsize +
                ", value=" + value +
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
        MempoolRecent that = (MempoolRecent) o;
        return fee == that.fee &&
                vsize == that.vsize &&
                value == that.value &&
                Objects.equals(txid, that.txid);
    }

    /**
     * Returns a hash code value for the MempoolRecent object.
     *
     * @return The hash code value for the MempoolRecent object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(txid, fee, vsize, value);
    }
}
