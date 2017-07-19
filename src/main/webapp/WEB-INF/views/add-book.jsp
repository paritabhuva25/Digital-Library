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
						<strong class="">Add Book</strong>

					</div>
					<div class="panel-body">
						<form:form method="POST" modelAttribute="book" modelAttribute="publisher" modelAttribute="category"
						modelAttribute="edition">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">FirstName</label>
								<div class="col-sm-9">
									<form:input type="text" class="form-control"
										placeholder="Username" required="" path="userFirstName"
										id="FirstName" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">LastName</label>
								<div class="col-sm-9">
									<form:input type="text" class="form-control"
										placeholder="Username" required="" path="userLastName"
										id="LastName" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">UserName</label>
								<div class="col-sm-9">
									<form:input path="username" type="text" class="form-control"
										id="username" placeholder="Username" required="" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">Email</label>
								<div class="col-sm-9">
									<form:input type="email" class="form-control"
										placeholder="Email" required="" path="userEmail" id="Email" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">Contact</label>
								<div class="col-sm-9">
									<form:input type="tel" class="form-control"
										placeholder="Contact" required="" path="userContact"
										id="Contact" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label">Password</label>
								<div class="col-sm-9">
									<form:input type="password" class="form-control"
										placeholder="Password" required="" path="userPwd"
										id="Password" />
								</div>
							</div>
							<br></br>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label">UserType</label>
								<div class="col-sm-9">
									<form:input type="tel" class="form-control"
										placeholder="UserType" required="" path="userType" id="type" />
								</div>
							</div>
							<br></br>
							<div class="form-group last">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-success btn-sm"
										value="Register">Register</button>
								</div>
							</div>
						</form:form>
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