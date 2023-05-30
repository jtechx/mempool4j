package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents an Internet Service Provider (ISP) with additional information.
 */
public class ISP extends ArrayList<String> {
    private final String asn;
    private final String ispName;
    private final Long aggregateCapacity;
    private final Integer totalChannels;
    private final Integer totalNodes;

    @JsonCreator
    public ISP(List<String> list) {
        this.asn = list.get(0);
        this.ispName = list.get(1);
        this.aggregateCapacity = Long.parseLong(list.get(2));
        this.totalChannels = Integer.parseInt(list.get(3));
        this.totalNodes = Integer.parseInt(list.get(4));
    }

    /**
     * Retrieves the Autonomous System Number (ASN) of the ISP.
     *
     * @return The ASN of the ISP.
     */
    public String getAsn() {
        return asn;
    }

    /**
     * Retrieves the name of the ISP.
     *
     * @return The name of the ISP.
     */
    public String getIspName() {
        return ispName;
    }

    /**
     * Retrieves the aggregate capacity of the ISP.
     *
     * @return The aggregate capacity of the ISP.
     */
    public Long getAggregateCapacity() {
        return aggregateCapacity;
    }

    /**
     * Retrieves the total number of channels associated with the ISP.
     *
     * @return The total number of channels associated with the ISP.
     */
    public Integer getTotalChannels() {
        return totalChannels;
    }

    /**
     * Retrieves the total number of nodes associated with the ISP.
     *
     * @return The total number of nodes associated with the ISP.
     */
    public Integer getTotalNodes() {
        return totalNodes;
    }

    /**
     * Returns a string representation of the ISP object.
     *
     * @return The string representation of the ISP object.
     */
    @Override
    public String toString() {
        return "ISP{" +
                "asn='" + asn + '\'' +
                ", ispName='" + ispName + '\'' +
                ", aggregateCapacity=" + aggregateCapacity +
                ", totalChannels=" + totalChannels +
                ", totalNodes=" + totalNodes +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return True if this object is the same as the o argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ISP isp = (ISP) o;
        return Objects.equals(asn, isp.asn) &&
                Objects.equals(ispName, isp.ispName) &&
                Objects.equals(aggregateCapacity, isp.aggregateCapacity) &&
                Objects.equals(totalChannels, isp.totalChannels) &&
                Objects.equals(totalNodes, isp.totalNodes);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(asn, ispName, aggregateCapacity, totalChannels, totalNodes);
    }
}
