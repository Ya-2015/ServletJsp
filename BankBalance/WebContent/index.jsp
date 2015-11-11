<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<title>Home</title>
</head>
<body>

<div class="container">
<div class="jumbotron">
  <h3>Welcome to Balance Lookup System</h3>
  <br>
  <br>
  <form action="ProcessServlet" method="post">
  <div class="form-group row">
    <label for="customerid" class="col-sm-2 form-control-label">Customer Id</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="customerid" placeholder="Customer Id" name="customerid" required="required">
    </div>
  </div>
  <br>
  <div class="form-group row">
    <div class="col-sm-offset-2 col-sm-1">
      <button type="submit" class="btn btn-primary">Lookup</button>
    </div>
  </div>
</form>
 
</div>

</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>

</body>
</html>