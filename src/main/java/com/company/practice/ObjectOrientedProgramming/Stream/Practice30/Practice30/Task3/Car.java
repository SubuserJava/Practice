package com.company.practice.ObjectOrientedProgramming.Stream.Practice30.Practice30.Task3;

import java.time.Year;
import java.util.Objects;

public class Car {

    private String name;
    private Year year;
    private Long price;
    private String color;
    private Double egineVolume;

    public Car(String name, Year year, Long price, String color, Double egineVolume) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.egineVolume = egineVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEgineVolume() {
        return egineVolume;
    }

    public void setEgineVolume(Double egineVolume) {
        this.egineVolume = egineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(year, car.year) && Objects.equals(price, car.price) && Objects.equals(color, car.color) && Objects.equals(egineVolume, car.egineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, price, color, egineVolume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append(", egineVolume=").append(egineVolume);
        sb.append('}');
        return sb.toString();
    }
}
