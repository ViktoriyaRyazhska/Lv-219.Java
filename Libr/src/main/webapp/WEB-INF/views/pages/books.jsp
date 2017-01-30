<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div  style="max-width: 800px; margin-top: 100px; margin-bottom: 100px" >
		<c:if test="${not empty books}">
		
			<table >
				<thead>
				<tr ><th>Name</th></tr>
				</thead>					
				<c:forEach items="${books}" var="current">
					<tr>
						<td><c:out value="${current.name}"/>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br/>
		
	</div>