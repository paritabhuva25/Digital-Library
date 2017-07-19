<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/resources/static/css/bootstrap.min.css" />
" />

<style>
.error {
	color: #ff0000;
}
</style>

</head>
<body>
	<jsp:include page="include/header.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong class="">Homepage</strong>

					</div>
					<div id="content">
		
			<!-- put new button: Add Student -->
					<form action="add-book" method="GET">
			
				  	<input type="submit" value="Add book" />
			
					</form>
					</div>
					<div class="panel-footer">
						<br></br>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>