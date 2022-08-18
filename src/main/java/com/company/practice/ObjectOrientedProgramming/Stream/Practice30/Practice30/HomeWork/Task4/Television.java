package com.company.practice.ObjectOrientedProgramming.Stream.Practice30.Practice30.HomeWork.Task4;

import java.time.Year;
import java.util.Objects;

public class Television {

    private String televisionModelName;
    private Year yearIssue;
    private Long priceTelevision;
    private String diagonalTelevision;
    private String manufacturerTelevision;

    public Television(String televisionModelName, Year yearIssue, Long priceTelevision, String diagonalTelevision, String manufacturerTelevision) {
        this.televisionModelName = televisionModelName;
        this.yearIssue = yearIssue;
        this.priceTelevision = priceTelevision;
        this.diagonalTelevision = diagonalTelevision;
        this.manufacturerTelevision = manufacturerTelevision;
    }

    public String getTelevisionModelName() {
        return televisionModelName;
    }

    public void setTelevisionModelName(String televisionModelName) {
        this.televisionModelName = televisionModelName;
    }

    public Year getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(Year yearIssue) {
        this.yearIssue = yearIssue;
    }

    public Long getPriceTelevision() {
        return priceTelevision;
    }

    public void setPriceTelevision(Long priceTelevision) {
        this.priceTelevision = priceTelevision;
    }

    public String getDiagonalTelevision() {
        return diagonalTelevision;
    }

    public void setDiagonalTelevision(String diagonalTelevision) {
        this.diagonalTelevision = diagonalTelevision;
    }

    public String getManufacturerTelevision() {
        return manufacturerTelevision;
    }

    public void setManufacturerTelevision(String manufacturerTelevision) {
        this.manufacturerTelevision = manufacturerTelevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return Objects.equals(televisionModelName, that.televisionModelName) && Objects.equals(yearIssue, that.yearIssue)
                && Objects.equals(priceTelevision, that.priceTelevision) && Objects.equals(diagonalTelevision, that.diagonalTelevision)
                && Objects.equals(manufacturerTelevision, that.manufacturerTelevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(televisionModelName, yearIssue, priceTelevision, diagonalTelevision, manufacturerTelevision);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Television{");
        sb.append("nameTelevision='").append(televisionModelName).append('\'');
        sb.append(", yearIssue=").append(yearIssue);
        sb.append(", priceTelevision=").append(priceTelevision);
        sb.append(", diagonalTelevision=").append(diagonalTelevision);
        sb.append(", manufacturerTelevision='").append(manufacturerTelevision).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
