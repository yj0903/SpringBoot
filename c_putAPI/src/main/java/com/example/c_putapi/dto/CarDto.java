package com.example.c_putapi.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value= PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CarDto {
    private String carName;
    private String carNumber;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}