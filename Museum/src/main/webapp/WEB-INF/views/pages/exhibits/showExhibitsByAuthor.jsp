<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>	
	<table>
	    <th>ExhibitName</th>
		<th>Hall</th>
		<c:forEach items="${set}" var="array">
	 		<tr>
      			<c:forEach items="${array}" var="object"> 
        			<td> <c:out value="${object}" /> </td>    
      			</c:forEach>
       		</tr>
  		</c:forEach>
	</table>
</div>