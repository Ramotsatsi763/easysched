package dao;
import model.TimeSlot;
import util.DBUtil;
import java.sql.*;
import java.util.*;
public class TimeSlotDAO {
  public static List<TimeSlot> getAvailableSlots() throws Exception {
    List<TimeSlot> list = new ArrayList<>();
    Connection conn = DBUtil.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM timeslots WHERE status = 'available'");
    while (rs.next()) {
      list.add(new TimeSlot(rs.getInt("id"), rs.getDate("date"), rs.getTime("time"), rs.getString("status")));
    }
    return list;
  }
  public static void bookSlot(int userId, int slotId) throws Exception {
    Connection conn = DBUtil.getConnection();
    PreparedStatement ps1 = conn.prepareStatement("INSERT INTO appointments(user_id, timeslot_id) VALUES (?, ?)");
    ps1.setInt(1, userId);
    ps1.setInt(2, slotId);
    ps1.executeUpdate();

    PreparedStatement ps2 = conn.prepareStatement("UPDATE timeslots SET status='booked' WHERE id=?");
    ps2.setInt(1, slotId);
    ps2.executeUpdate();
  }
}