<%-- 
    Document   : view_appointments
    Created on : 12 May 2025, 6:26:04 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*, model.Appointment" %>
<jsp:useBean id="appointments" class="java.util.ArrayList" scope="request" />
<html>
<head><title>My Appointments</title></head>
<body>
  <h2>My Appointments</h2>
  <table border="1">
    <tr>
        <th>Date</th>
        <th>Time</th>
        <th>Action</th>
    </tr>
    <c:forEach var="appt" items="${appointments}">
      <tr>
        <td>${appt.date}</td>
        <td>${appt.time}</td>
        </tr>
          <form action="CancelAppointmentServlet" method="post">
            <input type="hidden" name="apptId" value="${appt.id}" />
            <input type="submit" value="Cancel" />
          </form>
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
