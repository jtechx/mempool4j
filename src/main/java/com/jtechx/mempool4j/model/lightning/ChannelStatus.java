package com.jtechx.mempool4j.model.lightning;

public enum ChannelStatus {
    OPEN("open"), ACTIVE("active"), CLOSED("closed");
    private final String status;

    ChannelStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
