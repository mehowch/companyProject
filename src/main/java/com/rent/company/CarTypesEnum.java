package com.rent.company;

public enum CarTypesEnum {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COMBI("Combi"),
    PICKUP("Pickup");

    private final String name;

    private CarTypesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
