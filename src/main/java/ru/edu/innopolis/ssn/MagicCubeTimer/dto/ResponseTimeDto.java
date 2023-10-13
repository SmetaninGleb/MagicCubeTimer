package ru.edu.innopolis.ssn.MagicCubeTimer.dto;

public class ResponseTimeDto {
    private Integer id;
    private Float time;
    private String userId;

    public ResponseTimeDto() {
    }

    public ResponseTimeDto(Integer id, Float time, String userId) {
        this.id = id;
        this.time = time;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
