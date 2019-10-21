package com.sbt.collections_api;

/**
 * Сегмент обслуживания клиента
 */
public enum Segment {
    VIP("Важный"),
    MASS("Массовый")
    ;

    private String description;

    Segment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
