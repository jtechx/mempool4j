package com.jtechx.mempool4j.model.mining;

public enum TimePeriod {
    DAY("24h"), DAYS_3("3d"), WEEK("1w"), MONTH("1m"), MONTHS_3("3m"), MONTHS_6("6m"), YEAR("1y"), YEARS_2("2y"), YEARS_3("3y"),
    LATEST("latest");

    private final String period;

    TimePeriod(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }
}
