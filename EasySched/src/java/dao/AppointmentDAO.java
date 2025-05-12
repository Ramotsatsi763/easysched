package dao;
import model.Appointment;
import util.DBUtil;
import java.sql.*;
import java.util.*;
public class AppointmentDAO {
  public static List<Appointment> getUserAppointments(int userId) throws Exception {
    List<Appointment> list = new ArrayList<>();
    Connection conn = DBUtil.getConnection();
    PreparedStatement ps = conn.prepareStatement("SELECT a.id, t.date, t.time FROM appointments a JOIN timeslots t ON a.timeslot_id = t.id WHERE a.user_id = ?");
    ps.setInt(1, userId);
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
      list.add(new Appointment(rs.getInt("id"), rs.getDate("date"), rs.getTime("time")));
    }
    return list;
  }
  public static void cancelAppointment(int id) throws Exception {
    Connection conn = DBUtil.getConnection();
    PreparedStatement ps = conn.prepareStatement("DELETE FROM appointments WHERE id = ?");
    ps.setInt(1, id);
    ps.executeUpdate();
  }
}
