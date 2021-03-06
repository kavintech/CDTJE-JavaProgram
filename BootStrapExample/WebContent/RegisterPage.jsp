<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
<div class="row">
<div class="page-header">
<h1>Registration Form</h1>
</div>
<form class="form-horizontal" role="form" method="post" action="#">
 
<div class="form-group">
<label for="firstName" class="col-sm-2 control-label">First Name:</label>
<div class="col-sm-6">
<input type="text" name="firstName" class="form-control" id="firstName" placeholder="First Name">
</div>
</div>
 
<div class="form-group">
<label for="lastName" class="col-sm-2 control-label">Last Name:</label>
<div class="col-sm-6">
<input type="text" name="lastName" class="form-control" id="lastName" placeholder="Last Name">
</div>
</div>
 
<div class="form-group">
<label for="" class="col-sm-2 control-label">Gender:</label>
<div class="col-sm-6">
<label class="radio-inline">
<input type="radio" name="gender" id="gender1" value="male">Male
</label>
<label class="radio-inline">
<input type="radio" name="gender" id="gender2" value="female">Female
</label>
 
</div>
</div>
 
<div class="form-group">
<label for="dob" class="col-sm-2 control-label">DOB:</label>
<div class="col-sm-6">
<input type="text" name="dob" class="form-control datepicker" id="dob" placeholder=" Date of Birth">
</div>
</div>
 
<div class="form-group">
<label for="userName" class="col-sm-2 control-label">User Name:</label>
<div class="col-sm-6">
<input type="email" name="userName" class="form-control" id="userName" placeholder="User Name">
</div>
</div>
 
<div class="form-group">
<label for="passwd" class="col-sm-2 control-label">Password:</label>
<div class="col-sm-6">
<input type="password" name="passwd" class="form-control" id="passwd" placeholder="Password">
</div>
</div>
 
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<button type="submit" class="btn btn-primary" id="register">Register</button>
</div>
</div>
 
</form>
 
</div><!-- end for class "row" -->
</div><!-- end for class "container" -->

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap-datepicker.js"></sc>
  

</body>
</html>