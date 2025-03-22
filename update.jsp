<%@page import="com.web.dto.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Section</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<link rel="stylesheet" href="css/amdstyle.css" type="text/css" media="all">
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
<body id="page6">
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
        <li><a href="amdflght.jsp"><span><span>Add Flight</span></span></a></li>
        <li><a href="updateservlet"><span><span>Update Flight</span></span></a></li>
        <li><a href="deleteservlet"><span><span>Delete Flight</span></span></a></li>
        <li><a href="listofflight.jsp"><span><span>Fight List</span></span></a></li>
        <li><a href="search.jsp"><span><span>Search </span></span></a></li>
      </ul>
    </nav>
  </header><br><br>
      <div class="form-container">
        <form action="amdflightservlet" method="post">
            <h2> Update Flight<br>
            <%
            String msg = (String)request.getAttribute("msg");
            if(msg!=null){
            	out.print(msg);
            }
            %>
            </h2>
            <select name="fid">
            <%
            ArrayList<Flight> lst = (ArrayList)request.getAttribute("allflights");
            if(lst!=null){
            	for(int i=0;i<lst.size();i++){
            		Flight f = lst.get(i);
            		%>
            		<option><%=f.getFid() %></option>
            		<%
            	}
            }
            %>
            </select>
            <label for="departure">Departure Place:</label>
            <input type="text" id="departure" name="departure" placeholder="Enter departure place" required>
            
            <label for="destination">Destination:</label>
            <input type="text" id="destination" name="destination" placeholder="Enter destination" required>
            
            <label for="date">Departure Date:</label>
            <input type="date" id="date" name="date" required>
            
            <label for="time">Departure Time:</label>
            <input type="time" id="time" name="time" required>
            
            <label for="seat">Number of Seats:</label>
             <input type="text" id="seat" name="seat" required="required">
            
            <button type="submit" class="submit-btn" name="a1" value="Update Flight">Update Flight </button>
        </form>
    </div>
  <br><br>
  <%@include file="footer.jsp" %>
</body>
</html>