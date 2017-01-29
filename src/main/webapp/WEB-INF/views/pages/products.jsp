<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div></div>

<p> ${list} </p>

     
      <c:forEach items="${list}" var="booking">
        
          <p>${booking.endDate}</p>
       
      </c:forEach>
  </div>
