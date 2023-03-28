<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Book Edit</title>
</head>
<body>
<div class="container my-3">
<a href="/BookCRUDmvc/list" class="btn btn-success"style="width: 159px;margin-top: 3%;margin-bottom:-3%;margin-left: 7%;">Back List page</a>
    <div class="card" style="width: 500px;height:530px;margin-top: 7%;margin-bottom:4%;margin-left: 4%;border: 1px solid;">
        <h1 style="margin-top: 7%;" class="text-center text-primary">Book Edit page</h1>
        <div class="card-body" style="margin-left: 5%;border-radius: 2%;margin-top: 5%;margin-right: 5%;margin-bottom: 23%;border: 1px solid;">
    <form:form method="Post" action="/BookCRUDmvc/update">
        <form:hidden path="id" />
        <div class="form-group">
          <label for="title">Title</label>
          <form:input class="form-control" path="title" />
        </div>
       
        <div class="form-group">
          <label for="author">Author</label>
          <form:input class="form-control" path="author" />
        </div>

        <div class="form-group">
          <label for="price">Price</label>
          <form:input class="form-control" path="price" />
        </div>
        <button type="submit" name= "submit" class="btn btn-primary">Submit</button>
      </form:form>

    </div>
    </div>
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>