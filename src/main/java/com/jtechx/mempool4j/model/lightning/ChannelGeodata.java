package com.jtechx.mempool4j.model.lightning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/**
 * Represents geodata for a channel in the Lightning network.
 */
public class ChannelGeodata {

    private final String firstNodeId;
    private final String firstNodeName;
    private final double firstNodeLongitude;
    private final double firstNodeLatitude;
    private final String secondNodeId;
    private final String secondNodeName;
    private final double secondNodeLongitude;
    private final double secondNodeLatitude;

    @JsonCreator
    public ChannelGeodata(@JsonProperty List<String> list) {
        this.firstNodeId = list.get(0);
        this.firstNodeName = list.get(1);
        this.firstNodeLongitude = Double.parseDouble(list.get(2));
        this.firstNodeLatitude = Double.parseDouble(list.get(3));
        this.secondNodeId = list.get(4);
        this.secondNodeName = list.get(5);
        this.secondNodeLongitude = Double.parseDouble(list.get(6));
        this.secondNodeLatitude = Double.parseDouble(list.get(7));
    }

    /**
     * Returns the ID of the first node in the channel.
     *
     * @return The ID of the first node.
     */
    public String getFirstNodeId() {
        return firstNodeId;
    }

    /**
     * Returns the name of the first node in the channel.
     *
     * @return The name of the first node.
     */
    public String getFirstNodeName() {
        return firstNodeName;
    }

    /**
     * Returns the longitude of the first node's location.
     *
     * @return The longitude of the first node's location.
     */
    public double getFirstNodeLongitude() {
        return firstNodeLongitude;
    }

    /**
     * Returns the latitude of the first node's location.
     *
     * @return The latitude of the first node's location.
     */
    public double getFirstNodeLatitude() {
        return firstNodeLatitude;
    }

    /**
     * Returns the ID of the second node in the channel.
     *
     * @return The ID of the second node.
     */
    public String getSecondNodeId() {
        return secondNodeId;
    }

    /**
     * Returns the name of the second node in the channel.
     *
     * @return The name of the second node.
     */
    public String getSecondNodeName() {
        return secondNodeName;
    }

    /**
     * Returns the longitude of the second node's location.
     *
     * @return The longitude of the second node's location.
     */
    public double getSecondNodeLongitude() {
        return secondNodeLongitude;
    }

    /**
     * Returns the latitude of the second node's location.
     *
     * @return The latitude of the second node's location.
     */
    public double getSecondNodeLatitude() {
        return secondNodeLatitude;
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
        ChannelGeodata that = (ChannelGeodata) o;
        return Double.compare(that.firstNodeLongitude, firstNodeLongitude) == 0 &&
                Double.compare(that.firstNodeLatitude, firstNodeLatitude) == 0 &&
                Double.compare(that.secondNodeLongitude, secondNodeLongitude) == 0 &&
                Double.compare(that.secondNodeLatitude, secondNodeLatitude) == 0 &&
                Objects.equals(firstNodeId, that.firstNodeId) &&
                Objects.equals(firstNodeName, that.firstNodeName) &&
                Objects.equals(secondNodeId, that.secondNodeId) &&
                Objects.equals(secondNodeName, that.secondNodeName);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return The hash code value for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstNodeId, firstNodeName, firstNodeLongitude, firstNodeLatitude,
                secondNodeId, secondNodeName, secondNodeLongitude, secondNodeLatitude);
    }

    /**
     * Returns a string representation of the ChannelGeodata object.
     *
     * @return The string representation of the ChannelGeodata object.
     */
    @Override
    public String toString() {
        return "ChannelGeodata{" +
                "firstNodeId='" + firstNodeId + '\'' +
                ", firstNodeName='" + firstNodeName + '\'' +
                ", firstNodeLongitude=" + firstNodeLongitude +
                ", firstNodeLatitude=" + firstNodeLatitude +
                ", secondNodeId='" + secondNodeId + '\'' +
                ", secondNodeName='" + secondNodeName + '\'' +
                ", secondNodeLongitude=" + secondNodeLongitude +
                ", secondNodeLatitude=" + secondNodeLatitude +
                '}';
    }
}
