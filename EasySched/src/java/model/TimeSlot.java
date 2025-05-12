package model;
import java.sql.*;
public class TimeSlot {
  private int id;
  private Date date;
  private Time time;
  private String status;
  public TimeSlot(int id, Date date, Time time, String status) {
    this.id = id; this.date = date; this.time = time; this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
}