<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>List of Project</h2>
	<c:if test="${not empty listProject}">
		<ul>
			<c:forEach var="listValue" items="${listProject}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>
