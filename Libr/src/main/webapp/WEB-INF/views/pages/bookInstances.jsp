<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="max-width: 800px; margin-top: 100px; margin-bottom: 100px">


	<c:if test="${not empty instances}">
		
			<table >
				<thead>
				<tr ><th>id</th><th>book name</th><th>Instance info link</th></tr>
				</thead>					
				<c:forEach items="${instances}" var="current">
					<tr>
						<td><c:out value="${current.id}"/>
						</td>
						<td><c:out value="${current.book.name}"/>
						</td>
						<td><a href="${pageContext.request.contextPath}/inst/info/${current.id}">info</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	<br />

</div>