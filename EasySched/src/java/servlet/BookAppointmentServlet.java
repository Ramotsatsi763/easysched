package servlet;
import dao.TimeSlotDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class BookAppointmentServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int slotId = Integer.parseInt(request.getParameter("slotId"));
    HttpSession session = request.getSession();
    int userId = Integer.parseInt((String) session.getAttribute("userId"));
    try {
      TimeSlotDAO.bookSlot(userId, slotId);
      response.sendRedirect("view_appointments.jsp");
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
}
