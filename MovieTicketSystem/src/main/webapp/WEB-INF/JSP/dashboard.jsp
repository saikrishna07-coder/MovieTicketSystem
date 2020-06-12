<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
 <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="../css/styledash.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<script>
   document.getElementById('vid').play();
function myFunction(imgs) {
  var expandImg = document.getElementById("expandedImg");
  var imgText = document.getElementById("imgtext");
  expandImg.src = imgs.src;
  imgText.innerHTML = imgs.alt;
  expandImg.parentElement.style.display = "block";
}
</script>
<body style="background-image:url('../../images/dash.jpg');">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a  style="font-size:30px;" class="navbar-brand" href="#">TKMOVIES SKPRO</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      
      <li><a href="#">About</a></li>

    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li ><a href="#">Customer Support</a></li>
      
      <li><a href="home"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
<h5 style="color:white;">  ${umsg}</h5>
<p class="h2 text-light text-center" ><u>JUST BOOK NOW</u></p>
<div style="text-align: center;" >
<video  width="900" height="500" controls autoplay muted>
  <source src="images\ne1.mp4" type="video/mp4">
Your browser does not support the video tag.
</video>
</div>

<div class="row">
  <div class="column">
    <div class="responsive">
  <div class="gallery">
    <a target="_blank" href="swissimg">
      <img src="images\m1.jpg" alt="Cinque Terre" width="600" height="400" onclick="myFunction(this);"> 
    </a>
    <div class="desc text-danger"> Swiss Army Man   <input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
   
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="images\m2.jpg">
      <img src="images\m2.jpg" alt="Forest" width="600" height="400">
    </a>
    <div class="desc text-danger">Me Before You  <input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="images\m3.jpg">
      <img src="images\m3.jpg" alt="Northern Lights" width="600" height="400">
    </a>
    <div class="desc text-danger" > Deadpool <br><input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive" >
  <div class="gallery">
    <a target="_blank" href="images\m4.jpg">
      <img src="images\c1.jpg" alt="Mountains" width="600" height="400">
    </a>
    <div class="desc text-danger">Kevin Hart <br><input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>
</div>


<div class="row">
  <div class="column">
    <div class="responsive">
  <div class="gallery">
    <a target="_blank" href="images\b1.jpg">
      <img src="images\c2.jpg" alt="Cinque Terre" width="600" height="400" onclick="myFunction(this);"> 
    </a>
    <div class="desc text-danger"> ZooTopia <br><input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="images\m2.jpg">
      <img src="images\c3.jpg" alt="Forest" width="600" height="400">
    </a>
    <div class="desc text-danger">Dirty Grandpa &nbsp <input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="images\m3.jpg">
      <img src="images\c4.jpg" alt="Northern Lights" width="600" height="400">
    </a>
    <div class="desc text-danger">Neighbours 2 <br><input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>

  <div class="column">
<div class="responsive" >
  <div class="gallery">
    <a target="_blank" href="images\m4.jpg">
      <img src="images\m4.jpg" alt="Mountains" width="600" height="400">
    </a>
    <div class="desc text-danger">Rouge One <br><input class="btn btn-primary" type="button" value="Book" onclick="window.location.href='seatsel'"></div>
  </div>
</div>
  </div>
</div>


<div class="container">
  <span onclick="this.parentElement.style.display='none'" class="closebtn">&times;</span>
  <img id="expandedImg" style="width:100%">
  <div id="imgtext"></div>
</div>

<div class="clearfix"></div>
</body>
</html>