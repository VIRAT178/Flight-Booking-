<!DOCTYPE html>
<html lang="en">
<head>
<title>AirLines</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
 <link rel="stylesheet" href="css/login.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Cabin_400.font.js"></script>
<script type="text/javascript" src="js/tabs.js"></script>
<script type="text/javascript" src="js/jquery.jqtransform.js" ></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/atooltip.jquery.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<style type="text/css">.main, .tabs ul.nav a, .content, .button1, .box1, .top { behavior:url("../js/PIE.htc")}</style>
<![endif]-->
</head>
<body id="page5">
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
  <br><br>
    <div class="login-container">
        <h1>Welcome
        <%
        String ai = (String)session.getAttribute("ai");
        if(ai!=null){
        	out.print(ai);
        }
        %>
        </h1>
        <%
        String msg = (String)request.getAttribute("msg");
        if(msg!=null){
        	out.print(msg);
        }
        %>
        <form action="loginservlet" method="post">
            

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
           
            <button type="submit">Login</button>
        </form>
         <a href="Signup.jsp" style=" text-decoration: none;
                                      color: white;
                                      margin-top: 20px;
                                      padding: 10px 80px;
                                      background-color: #1d77e9;
                                      border-radius: 8px;
                              ">New Registration</a>
    </div>
 
  <!--content end-->
  <!--footer -->
   <%@include file="footer.jsp" %>
   </div>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>