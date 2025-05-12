<%-- 
    Document   : view_slots
    Created on : 12 May 2025, 6:25:52 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*, model.TimeSlot" %>
<%@ page session="true" %>
<jsp:useBean id="slots" class="java.util.ArrayList" scope="request" />
<html>
<head><title>Available Slots</title></head>
<body>
  <h2>Available Time Slots</h2>
  <table border="1">
    <tr><th>Date</th><th>Time</th><th>Status</th><th>Action</th></tr>
    <c:forEach var="slot" items="${slots}">
      <tr>
        <td>${slot.date}</td><td>${slot.time}</td><td>${slot.status}</td>
        <td>
          <form action="BookAppointmentServlet" method="post">
            <input type="hidden" name="slotId" value="${slot.id}" />
            <input type="submit" value="Book" />
          </form>
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
