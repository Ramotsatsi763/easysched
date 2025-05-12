package dao;
import model.User;
import util.DBUtil;
import java.sql.*;
public class UserDAO {
  public static boolean validate(String username, String password) throws Exception {
    Connection conn = DBUtil.getConnection();
    PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
    ps.setString(1, username);
    ps.setString(2, password);
    ResultSet rs = ps.executeQuery();
    return rs.next();
  }

  public static void register(String username, String password) throws Exception {
    Connection conn = DBUtil.getConnection();
    PreparedStatement ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
    ps.setString(1, username);
    ps.setString(2, password);
    ps.executeUpdate();
  }
}
