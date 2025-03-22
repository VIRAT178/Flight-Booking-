<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/signup.css" type="text/css" media="all">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Cabin_400.font.js"></script>
<script type="text/javascript" src="js/tabs.js"></script>
<script type="text/javascript" src="js/jquery.jqtransform.js" ></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/atooltip.jquery.js"></script>
<script type="text/javascript" src="js/script.js"></script>

</head>
<body id="page1">
<div class="main">
<header>
    <div class="wrapper">
      <h1><a href="index.jsp" id="logo">AirLines</a></h1>
      <span id="slogan">Fast, Frequent &amp; Safe Flights</span>
      <nav id="top_nav">
        <ul>
          <li><a href="index.jsp" class="nav1">Home</a></li>
          <li><a href="login.jsp" class="nav2">User</a></li>
          <li><a href="contacts.jsp" class="nav3">Contact</a></li>
        </ul>
      </nav>
    </div>
    <nav>
      <ul id="menu">
        <li id="menu_active"><a href="index.jsp"><span><span>About</span></span></a></li>
        <li><a href="login.jsp"><span><span>Sign In</span></span></a></li>
      </ul>
    </nav>
  </header>
    <div class="container">
        <h2>
        <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null){
        	out.print(msg);
        }
        %></h2>
        <form>
            <label for="userType">I am a:</label>
        </form>

        <div id="customerForm" class="form-box" style="display: block;">
            <h3>Customer Form</h3>
            <form method="post" action="processCustomerservlet">
                <label for="typeuser">User Type</label>
                <input type="text" id="adminName" name="typeuser" value="Customer"><br><br>
                <label for="customerName">Customer Name:</label>
                <input type="text" id="customerName" name="customerName" required><br><br>
                <label for="customerPassword">Customer Password:</label>
                <input type="password" id="customerPassword" name="customerPassword" required><br><br>
                <label for="customerPhone">Customer Phone No.:</label>
                <input type="tel" id="customerPhone" name="customerPhone" required><br><br>
                <label for="customerAddress">Customer Address:</label>
                <input type="text" id="customerAddress" name="customerAddress" required><br><br>
                <button type="submit" class="submit-button">Submit</button>
            </form>
        </div>
    </div>
    <br><br><br>
  <%@include file="footer.jsp" %>
</body>
</html>

