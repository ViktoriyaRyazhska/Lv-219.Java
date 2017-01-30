<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div  style="max-width: 800px; margin-top: 100px; margin-bottom: 100px" >
		<c:if test="${not empty books}">
		
			<table >
				<thead>
				<tr ><th>Name</th><th>Author name</th><th>Publish date</th><th>statistic link</th></tr>
				</thead>					
				<c:forEach items="${books}" var="current">
					<tr>
						<td><c:out value="${current.name}"/>
						</td>
						<td><c:out value="${current.author.name}"/>
						</td>
						<td><c:out value="${current.publishDate}"/>
						</td>
						<td><a href="${pageContext.request.contextPath}/books/info/${current.id}">info</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br/>
		
	</div>