package com.rent.company.Domain;

public enum CarStatusEnum {
    RENTED("Rented"),
    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable");

    private final String status;

    private CarStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
