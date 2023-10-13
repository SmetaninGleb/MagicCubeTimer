package ru.edu.innopolis.ssn.MagicCubeTimer.models;


import javax.persistence.*;

@Entity
@Table(name = "solving_time")
public class SolvingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time")
    private Float time;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public SolvingTime() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
