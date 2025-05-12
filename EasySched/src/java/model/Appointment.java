package model;
import java.sql.*;
public class Appointment {
  private int id;
  private Date date;
  private Time time;
  public Appointment(int id, Date date, Time time) {
    this.id = id; this.date = date; this.time = time;
  }
  // getters and setters

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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
  
}