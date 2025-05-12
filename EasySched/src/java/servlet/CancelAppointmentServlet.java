package servlet;
import dao.AppointmentDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CancelAppointmentServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int apptId = Integer.parseInt(request.getParameter("apptId"));
    try {
      AppointmentDAO.cancelAppointment(apptId);
      response.sendRedirect("view_appointments.jsp");
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
}