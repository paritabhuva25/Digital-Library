<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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

						<%-- 						<form:form method="POST" modelAttribute="book"> --%>
						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Book Title</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="bookname" required="" path="book.bookname" --%>
						<%-- 										 /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Category</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="categoryName" required="" path="category.categoryName" --%>
						<%-- 										id="categoryName" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Publisher</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="publisherName" required="" path="publisher.publisherName" --%>
						<%-- 										id="publisherName" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">ISBN</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="ISBN" required="" path="edition.ISBN" --%>
						<%-- 										id="ISBN" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Book Price</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="bookPrice" required="" path="edition.bookPrice" --%>
						<%-- 										id="bookPrice" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Book Pages</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="bookPage" required="" path="edition.bookPage" --%>
						<%-- 										id="bookPage" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Purchase Date</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="purchaseDate" required="" path="edition.purchaseDate" --%>
						<%-- 										id="purchaseDate" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Edition</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="edition" required="" path="edition.edition" --%>
						<%-- 										id="edition" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->
						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Rent</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="rent" required="" path="edition.rent" --%>
						<%-- 										id="rent" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->

						<!-- 							<div class="form-group"> -->
						<!-- 								<label for="inputEmail3" class="col-sm-3 control-label">Quantity</label> -->
						<!-- 								<div class="col-sm-9"> -->
						<%-- 									<form:input type="text" class="form-control" --%>
						<%-- 										placeholder="totalQuantity" required="" path="edition.totalQuantity" --%>
						<%-- 										id="totalQuantity" /> --%>
						<!-- 								</div> -->
						<!-- 							</div> -->





						<%-- 					</form:form> --%>
<!-- 
						<form action="add-book" method="post">
						
						 <spring:bind path="book.*">
        <c:forEach items="${status.errorMessages}" var="error">
        Error code: <c:out value="${error}"/><br>
        </c:forEach>
    </spring:bind>
    
     <spring:bind path="category.*">
        <c:forEach items="${status.errorMessages}" var="error">
        Error code: <c:out value="${error}"/><br>
        </c:forEach>
    </spring:bind>

							<div>

								<spring:bind path="book.bookname">
									<label for="bookTitle">Book Title:</label>
									<input type="text" value="<c:out value="${status.value}"/>"
										name="<c:out value="${status.expression}"/>" id="bookTitle">
									<%-- <input type="text" id="BookTitle" name="${status.expression}" /> --%>
									<%-- <span class="fieldError">${status.errorMessage}</span> --%>
								</spring:bind>
							</div>


							<div>
								<spring:bind path="category.categoryName">
									<label for="categoryName">Category Name:</label>
									<input type="text" value="<c:out value="${status.value}"/>"	name="<c:out value="${status.expression}"/>" id="categoryName">
									<%-- <input type="text" id="CategoryName" name="${status.expression}" /> --%>
									<%-- <span class="fieldError">${status.errorMessage}</span> --%>
								</spring:bind>
							</div>

							<input type="submit" value="Create" />
						</form>

 -->
 
			 <form:form method="POST" modelAttribute="book">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">Book Title</label>
								<div class="col-sm-9">
									<form:input type="text" class="form-control"
										placeholder="Book name" required="" path="bookname"
										id="Bookname" />
								</div>
							</div>
							
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">Category Name</label>
								<div class="col-sm-9">
									<form:input type="text" class="form-control"
										placeholder="Book name" required="" path="book.category.categoryName"
										id="Bookname" />
								</div>
							</div>
							<input type="submit" value="Create" />
							</form:form>
						<div class="panel-footer">
							<br></br>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>