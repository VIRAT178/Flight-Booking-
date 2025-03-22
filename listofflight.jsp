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
  </header>
  <br><br>
  <table border="3" color="brown">
  <tr>
  <th>Flight ID</th>
   <th>From</th>
    <th>To</th>
     <th>Date</th>
      <th>Time</th>
       <th>Seats Avalible</th>
  </tr>
  <%
  ArrayList<Flight> lst =(ArrayList)request.getAttribute("allflights");
  int i=0;
  while(i<lst.size())
  {
	  Flight f = lst.get(i);
	  %>
	  <tr>
	  <td><%=f.getFid()%></td>
	  <td><%=f.getDepart()%></td>
	  <td><%=f.getDest()%></td>
	  <td><%=f.getDdate()%></td>
	  <td><%=f.getDtime()%></td>
	  <td><%=f.getSeattype()%></td>
	  </tr>
	  <%
	  i++;
  }
  %>
  </table>
  <br><br>
  <%@include file="footer.jsp" %>
</body>
</html>