package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * Represents a collection of Lightning Network nodes belonging to a specific Internet Service Provider (ISP).
 */
public class ISPNodes {
    private final String isp;
    private final List<LightningNode> nodes;

    @JsonCreator
    public ISPNodes(@JsonProperty("isp") String isp,
            @JsonProperty("nodes") List<LightningNode> nodes) {
        this.isp = isp;
        this.nodes = nodes;
    }

    /**
     * Retrieves the name of the ISP.
     *
     * @return The name of the ISP.
     */
    public String getIsp() {
        return isp;
    }

    /**
     * Retrieves the list of Lightning Network nodes belonging to the ISP.
     *
     * @return The list of Lightning Network nodes.
     */
    public List<LightningNode> getNodes() {
        return nodes;
    }

    /**
     * Returns a string representation of the ISPNodes object.
     *
     * @return The string representation of the ISPNodes object.
     */
    @Override
    public String toString() {
        return "ISPNodes{" +
                "isp='" + isp + '\'' +
                ", nodes=" + nodes +
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
        ISPNodes ispNodes = (ISPNodes) o;
        return Objects.equals(isp, ispNodes.isp) &&
                Objects.equals(nodes, ispNodes.nodes);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(isp, nodes);
    }
}
