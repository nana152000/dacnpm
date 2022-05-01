package com.doctor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private int time;

    public Calendar() {
    }

    public Calendar(Date date, int time) {
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
