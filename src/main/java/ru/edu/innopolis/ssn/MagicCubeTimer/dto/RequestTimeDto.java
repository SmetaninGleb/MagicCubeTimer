package ru.edu.innopolis.ssn.MagicCubeTimer.dto;

public class RequestTimeDto {
    private Float time;

    public RequestTimeDto() {
    }

    public RequestTimeDto(Float time) {
        this.time = time;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }
}
