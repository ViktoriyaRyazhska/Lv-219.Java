<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
<table>
	<th>Hotel</th>
		<th>Count of free rooms</th>	
	<c:forEach items="${list}" var="array">
	 <tr>
      <c:forEach items="${array}" var="object"> 
        <td> <c:out value="${object}" /> </td>    
      </c:forEach>
       </tr>
  </c:forEach>
</table>	
</div>