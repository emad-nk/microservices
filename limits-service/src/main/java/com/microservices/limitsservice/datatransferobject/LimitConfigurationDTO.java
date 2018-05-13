package com.microservices.limitsservice.datatransferobject;

public class LimitConfigurationDTO {

    private int maximum;
    private int minimum;

    protected LimitConfigurationDTO() {
    }

    public LimitConfigurationDTO(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

}
