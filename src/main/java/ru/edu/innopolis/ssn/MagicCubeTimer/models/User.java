package ru.edu.innopolis.ssn.MagicCubeTimer.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nickname")
    private String nickname;
    @OneToMany(mappedBy = "user")
    private List<SolvingTime> solvingTimes;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<SolvingTime> getSolvingTimes() {
        return solvingTimes;
    }

    public void setSolvingTimes(List<SolvingTime> solvingTimes) {
        this.solvingTimes = solvingTimes;
    }
}
