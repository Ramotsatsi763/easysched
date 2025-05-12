package servlet;
import dao.UserDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    try {
      if (UserDAO.validate(username, password)) {
        HttpSession session = request.getSession();
        session.setAttribute("userId", username);
        response.sendRedirect("view_slots.jsp");
      } else {
        response.sendRedirect("login.jsp");
      }
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
}