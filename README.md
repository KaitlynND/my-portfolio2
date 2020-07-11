This directory is where you'll write all of your code!

By default it contains a barebones web app. To run a local server, execute this
command:

mvn package appengine:run
//public class Main {
   // public static void main(String[] args) {

<!DOCTYPE html>
<html>
   <body style="background-color:#D2691E;"> 
  <head>
     <meta charset="UTF-8">
    <title>KD's Portfolio</title> 
    <link rel="stylesheet" href="style.css">
    <script src="script.js"></script>
      </head>
  <head>
      <title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1,h2,h3,h4,h5,h6 {font-family: "Montserrat", sans-serif}
.w3-row-padding img {margin-bottom: 12px}
/* Set the width of the sidebar to 120px */
.w3-sidebar {width: 120px;background: #222;}
/* Add a left margin to the "page content" that matches the width of the sidebar (120px) */
#main {margin-left: 120px}
/* Remove margins from "page content" on small screens */
@media only screen and (max-width: 600px) {#main {margin-left: 0}}
</style>
<body class="w3-black">

<!-- Icon Bar (Sidebar - hidden on small screens) -->
<nav class="w3-sidebar w3-bar-block w3-small w3-hide-small w3-center">
  <!-- Avatar image in top left corner -->
  <img src="/images/hunger2.jpg" style="width:100%">
  <a href="#" class="w3-bar-item w3-button w3-padding-large w3-red">
    <i class="fa fa-home w3-xxlarge"></i>
    <p>HOME</p>
  </a>
  
  <a href="#about" class="w3-bar-item w3-button w3-padding-large w3-hover-red">
    <i class="fa fa-user w3-xxlarge"></i>
    <p>ABOUT</p>
  </a>
  <a href="#photos" class="w3-bar-item w3-button w3-padding-large w3-hover-red">
    <i class="fa fa-eye w3-xxlarge"></i>
    <p>PHOTOS</p>
  </a>
  <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hover-red">
    <i class="fa fa-envelope w3-xxlarge"></i>
    <p>CONTACT</p>
  </a>
</nav>

<!-- Navbar on small screens (Hidden on medium and large screens) -->
<div class="w3-top w3-hide-large w3-hide-medium" id="myNavbar">
  <div class="w3-bar w3-black w3-opacity w3-hover-opacity-off w3-center w3-small">
    <a href="#" class="w3-bar-item w3-button" style="width:25% !important">HOME</a>
    <a href="#about" class="w3-bar-item w3-button" style="width:25% !important">ABOUT</a>
    <a href="#photos" class="w3-bar-item w3-button" style="width:25% !important">PHOTOS</a>
    <a href="#contact" class="w3-bar-item w3-button" style="width:25% !important">CONTACT</a>
  </div>
</div>
<!-- <h2 style="text-align:right;font-family:Helvetica;color:Z;"> <b> Kaitlyn's Hometown Map </b> </h2>
  <div id="map"></div>
 
     <script>
    function createMap() {
        var map = new google.maps.Map(
        document.getElementById('map'),  {center: {lat:31.3271, lng: -89.2903 }, zoom: 16});

}
    </script>
<script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCV_K6oDQIu-pMmI9nHbp4iRzYZr1t4h9w&callback=createMap">
    </script>-->


<!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
    <h1 class="w3-jumbo"><span class="w3-hide-small">I'm</span> Kaitlyn.</h1>
    <img src="/images/IMG_0567.jpg" width="550" height="650">
    <p> Lover of Christ. Psalms 27:1. Computer Science Student.</p>
  </header>

  <!-- About Section -->
  <div class="w3-content w3-justify w3-text-grey w3-padding-64" id="about">
    <h2 class="w3-text-light-grey">About Me</h2>
    <hr style="width:200px" class="w3-opacity">
    <p>Hello! I'm Kaitlyn Dent. A rising senior at Jackson State University majoring in Computer Science. I'm from Hattiesburg, Mississippi. I enjoy music, sports, traveling, and spending time with family. I'm an aspiring software engineer, practicing coding often so I will be ready for a software development role once I graduate! I play golf and tennis. My top 2 golfers are Mariah Stackhouse and Tiger Woods. I also love basketball. My favorite WNBA team is the Minnesota Lynx and NBA, the Milwaukee Bucks and the New Orleans Pelicans. 
    </p>
    <p style="color:yellow;">Click here for a fun fact about me! </p>
      <button onclick="addRandomGreeting()">Fun Fact Generator</button>
      <div id="greeting-container"></div> 
        <h2 style="text-align:right;" class="w3-padding-16 w3-text-light-grey"> <b> Kaitlyn's Hometown Map </b> </h2>
  <div id="map"></div>
 
     <script>
    function createMap() {
        var map = new google.maps.Map(
        document.getElementById('map'),  {center: {lat:31.3271, lng: -89.2903 }, zoom: 16});

}
    </script>
<script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCV_K6oDQIu-pMmI9nHbp4iRzYZr1t4h9w&callback=createMap">
    </script>

    <h3 class="w3-padding-16 w3-text-light-grey">My Skills</h3>
    <p> <ul> <li> Java </li> <li> C++ </li>
<li> Python </li>
<li> HTML5 </li>
<li>JavaScript</li>
<li> CSS </li>
<li> Linux/Unix </li> <li> C# </li>
<li> Perl/Scripting </li>
<li> R </li>
<li> SQL </li>
</ul>
    </p>
    <!--<h2 class="w3-padding-16 w3-text-light-grey"> LinkedIn & GitHub </h2> <img src= "/images/IMG_1431.jpg" width="150" height"150">                                                                                                                                                                                                                                                 
    <p><a href="https://www.linkedin.com/authwall?trk=bf&trkInfo=AQFUFapbz8XWigAAAXKM85hQdzViSK4etUXX3uFzPP_BIqvMAzgmkVE0V-h1HNviJzc0XLoUcEYl_YQFMqEgLL7lR4rkhLMWX_H059i6LrxU20n4WR-AFtZvXOXgRwKIvj0YW1A=&originalReferer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fin%2Fkaitlyn-dent-13bb06171">Visit my LinkedIn profile </a></p>                   
    <p> GitHub username: KaitlynND </p> <p><a href="https://github.com/KaitlynND/">Visit my GitHub profile</a></p>-->
   

    <h3 style="text-align:center;" class="w3-padding-16 w3-text-light-grey">Work Experience</h3>
    <p style="text-align:center;"> June 2020 (Due to COVID-19 this internship was abbreviated) </p>
    <p style="text-align:center;"> <b> Application Developer Intern/Innosource at Nationwide Insurance </b> </p>
    <ul>
        <li> Used Perl to create a code in PuTTY that will archive files that are greater than a day old and move them from the backup directory to the data processing directory. This action leaves the data processing directory clear and ready to use for new jobs. This archiving process will help better manage the server resources within the directories. </li>
        <li> Participated in tech training that covered topics such as DevOps, Angular, Agile, Cloud Computing, AWS, and GitHub. </li>
    </ul>

     <p style="text-align:center;"> June 2019 - August 2019 </p>
      <p style="text-align:center;"> <b> Summer Intern/Naval Information Warfare Center Philadelphia, PA </b> </p>
      <ul>
        <li> Worked on a team to develop a productivity webapp named Scryber; Scryber allows users to print repetitive information one time across multiple documents; Project is open source and available to download on Github. </li>
        <li>Used HTML5, CSS, and JavaScript to create the design of the webapp and adjust alignment issues</li>
        <li>Used C# to implement workflows in Scryber</li>
        <li> Built this webapp using .NET Core framework </li>
        </ul>

        <h3 style="text-align:center;" class="w3-padding-16 w3-text-light-grey">Activities</h3>
             <ul>
            <li> Hackathon – Participated in the 2019 HBCU Battle of the Brains Competition; worked with a team to create a NFL Trading Card App using Python </li>
            <li> NSBE (National Society of Black Engineers) </li>
            <li> Served as Vice President of Jackson State University’s ACM-W </li>
            <li> Honda Campus All-Star Challenge Quiz Bowl Team (HCASC) </li>
            <li> Jackson State's Orchestra </li>
        </ul>
        <h3 style="text-align:center;" class="w3-padding-16 w3-text-light-grey">Volunteer</h3>
         <ul>
            <li> Temple University Compute-STEM camp that focuses on creating pathways for under-represented and under- resourced 7th and 8th graders in the local community of Philadelphia by introducing them to coding, virtual reality (VR) and real world applications </li>
            <li> Played holiday music on my viola for Bedford Care Nursing Home Residents in Hattiesburg, MS </li>
            <li> Mississippi Civil Rights Musuem </li>
            <li> Mt. Carmel Baptist Church Feed the Hungry events </li>
            <li> Grace Christian Elementary Field Day Helper </li>
        </ul>
        <h3 style="text-align:center;" class="w3-padding-16 w3-text-light-grey">Awards</h3>
             <ul>
            <li> Dean's List Scholar </li>
            <li> Grace Hopper Celebration Scholar - 2018, 2020 </li>
            <li> The National Society of Leadership and Success </li>
            <li> Women's Geo-Scientist Award Recipient - 2013 </li>
        </ul>

      <!--  <p style="text-align:center;"> Current Application Developer summer intern with Innosource at Nationwide Insurance </p>-->


  
  <!-- Portfolio Section -->
  <div class="w3-padding-64 w3-content" id="photos">
    <h2 class="w3-text-light-grey">My Photos</h2>
    <hr style="width:200px" class="w3-opacity">

    <!-- Grid for photos -->
    <div class="w3-row-padding" style="margin:0 -16px">
      <div class="w3-half">
      <!--  <img src="/images/IMG_7645.jpg" style="width:100%">-->
        <img src="/images/IMG_0331.jpg" style="width:100%">
        <img src="/images/IMG_7537.jpg" style="width:100%">
        <img src="/images/IMG_9295.jpg" style="width:100%">
        <img src="/images/IMG_5164 2.jpg" style="width:100%">
        <img src="/images/band_photo.jpg" style="width:100%">
      </div>

      <div class="w3-half">
        <img src="/images/IMG_7645.jpg" style="width:100%">
        <img src="/images/IMG_9245.jpg" style="width:100%">
        <img src="/images/IMG_9530.jpg" style="width:100%">
        <img src="/images/IMG_0069.jpg" style="width:100%">
      <!--  <img src="/w3images/wedding.jpg" style="width:100%">
        <img src="/w3images/p6.jpg" style="width:100%">-->
      </div>
    <!-- End photo grid -->
    </div>
  <!-- End Portfolio Section -->
  </div>

  <!-- Contact Section -->
  <div class="w3-padding-64 w3-content w3-text-grey" id="contact">
    <h2 class="w3-text-light-grey">Contact Me</h2>
    <hr style="width:200px" class="w3-opacity">

    <div class="w3-section">
      <h4><i class="fa fa-map-marker fa-fw w3-text-white w3-xxlarge w3-margin-right"></i> Mississippi, USA</h4>
      <h4><i class="fa fa-envelope fa-fw w3-text-white w3-xxlarge w3-margin-right"> </i> kaitlyndent@yahoo.com</h4>
    </div><br>
  <!--  <h2 class="w3-padding-16 w3-text-light-grey"> LinkedIn & GitHub </h2> <img src= "/images/IMG_1431.jpg" width="150" height"150">                                                                                                                                                                                                                                                 
    <p><a href="https://www.linkedin.com/in/kaitlyn-dent-13bb06171">Visit my LinkedIn profile </a></p>                   
    <p> GitHub username: KaitlynND </p> <p><a href="https://github.com/KaitlynND/">Visit my GitHub profile</a></p>-->
   <!-- <p>Let's get in touch. Send me a message:</p>

  <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Email" required name="Email"></p>
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Subject" required name="Subject"></p>
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Message" required name="Message"></p>
      <p>
        <button class="w3-button w3-light-grey w3-padding-large" type="submit">
          <i class="fa fa-paper-plane"></i> SEND MESSAGE
        </button>
      </p>
    </form>-->
  <!-- End Contact Section -->
  </div>
  
    <!-- Footer -->
    <footer class="w3-content w3-padding-64 w3-text-grey w3-xlarge">
    <h3 class="w3-padding-16 w3-text-light-grey"> Let's Connect!</h3>
    <h4 class="w3-padding-16 w3-text-light-grey"> Social Media (click icon below) </h4>
    <a href="https://www.facebook.com/kaitlyn.dent.5891"><i class="fa fa-facebook-official w3-hover-opacity"></i></a>
    <a href="https://www.instagram.com/kaitlyn_noel__/"><i class="fa fa-instagram w3-hover-opacity" ></i></a>
    <a href="https://mobile.twitter.com/kaitlynnoel___"><i class="fa fa-twitter w3-hover-opacity" ></i></a>
    <a href="https://www.linkedin.com/in/kaitlyn-dent-13bb06171"><i class="fa fa-linkedin w3-hover-opacity" ></i></a>
    <br>
    <br>
    <img src= "/images/github.jpg" width="80" height"80">  <h4> GitHub username: KaitlynND </h4> <h4><a href="https://github.com/KaitlynND/">Visit my GitHub profile here! </a></h4>
  <!-- End footer -->
  </footer>

<!-- END PAGE CONTENT -->
</div>

</body>

 <!-- <h2 style="text-align:right;font-family:Helvetica;color:Z;"> <b> Kaitlyn's Hometown Map </b> </h2>
  <div id="map"></div>
 
     <script>
    function createMap() {
        var map = new google.maps.Map(
        document.getElementById('map'),  {center: {lat:31.3271, lng: -89.2903 }, zoom: 16});

}
    </script>
<script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCV_K6oDQIu-pMmI9nHbp4iRzYZr1t4h9w&callback=createMap">
    </script>-->


 <script src="script.js"></script>
  <link rel="stylesheet" href="style.css">
</head>

        <button onclick="getDataServlet()"> Click here</button>
        <div id="dataserve"></div>

        
       <button onclick="getJstring()">Fetch json!</button>
        <ul id="json"></ul>

       
        <h3> Form </h3>
        <form action="/data" method="POST">
        <textarea name="text-input"></textarea>
            <input type="submit" />
            

        </form>

        <h3> Tasks </h3>
        <body onload="loadTasks()">

        <form method="POST" action="/data">
            <input type="text" name="title" />
            <br/>
            <button>Submit</button>
        </form>

    <hr/> 
    


    <ul id="task-list"></ul>
  <body>
 <div id="content">
   
    <!--  <h1 style="font-family:courier;color:white;font-size:400%;"> Kaitlyn Dent</h1> 

    <div class="row">
        <div class="column">
            <img src= "/images/IMG_0067.jpg" width="350" height="450">
        </div>

    <div class="column">
        <img src= "/images/IMG_9245.jpg" width="300" height="450">
    </div>


    <h2 style="text-align:left;font-family:Arial;"> About Me </h2>
      <p style="text-align:left;" width "260"> Hello! I'm Kaitlyn Dent. A rising senior at Jackson State University majoring in Computer Science. I'm from Hattiesburg, Mississippi. I enjoy music, sports, travelling, and spending time with family. I'm an apsiring software engineer, practicing coding often so I will be ready for a software development role once I graduate! </p>
    <h2> LinkedIn & GitHub </h2> <img src= "/images/IMG_1431.jpg" width="150" height"150">
    <p><a href="https://www.linkedin.com/authwall?trk=bf&trkInfo=AQFUFapbz8XWigAAAXKM85hQdzViSK4etUXX3uFzPP_BIqvMAzgmkVE0V-h1HNviJzc0XLoUcEYl_YQFMqEgLL7lR4rkhLMWX_H059i6LrxU20n4WR-AFtZvXOXgRwKIvj0YW1A=&originalReferer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fin%2Fkaitlyn-dent-13bb06171">Visit my LinkedIn profile </a></p>
    <p> GitHub username: KaitlynND </p> <p><a href="https://github.com/KaitlynND/">Visit my GitHub profile</a></p>
    <h3> Email: kaitlyndent@yahoo.com </h3>

    <p>Welcome to my portfolio!</p>   
      <p style="color:yellow;">Click here for a fun fact about me! </p>
      <button onclick="addRandomGreeting()">Fun Fact Generator</button>
      <div id="greeting-container"></div> 
      <h2 style="text-align:center;font-family:Arial;"> Work Experience </h2>
      <p style="text-align:center;"> June 2019 - August 2019 </p>
      <p style="text-align:center;"> <b> Summer Intern/Naval Information Warfare Center Philadelphia, PA </b> </p>
      <ul>
        <li> Worked on a team to develop a productivity webapp named Scryber; Scryber allows users to print repetitive information one time across multiple documents; Project is open source and available to download on Github. </li>
        <li>Used HTML5, CSS, and JavaScript to create the design of the webapp and adjust alignment issues</li>
        <li>Used C# to implement workflows in Scryber</li>
        <li> Built this webapp using .NET Core framework </li>
        </ul>

        <p style="text-align:center;"> Current Application Developer summer intern with Innosource at Nationwide Insurance </p>


        <h2 style="text-align:center;font-family:Arial;"> Activities </h2>
        <ul>
            <li> Hackathon – Participated in the 2019 HBCU Battle of the Brains Competition; worked with a team to create a NFL Trading Card App using Python </li>
            <li> NSBE (National Society of Black Engineers) </li>
            <li> Served as Vice President of Jackson State University’s ACM-W </li>
            <li> Honda Campus All-Star Challenge Quiz Bowl Team (HCASC) </li>
            <li> Jackson State's Orchestra </li>
        </ul>

        <h2 style="text-align:center;font-family:Arial;"> Volunteer </h2>
        <ul>
            <li> Temple University Compute-STEM camp that focuses on creating pathways for under-represented and under- resourced 7th and 8th graders in the local community of Philadelphia by introducing them to coding, virtual reality (VR) and real world applications </li>
            <li> Played holiday music on my viola for Bedford Care Nursing Home Residents in Hattiesburg, MS </li>
            <li> Mississippi Civil Rights Musuem </li>
            <li> Mt. Carmel Baptist Church Feed the Hungry events </li>
            <li> Grace Christian Elementary Field Day Helper </li>
        </ul>
        
    
        <h2 style="text-align:center;font-family:Arial;"> Awards </h2>
        <ul>
            <li> Dean's List Scholar </li>
            <li> Grace Hopper Celebration Scholar - 2018, 2020 </li>
            <li> The National Society of Leadership and Success </li>
            <li> Women's Geo-Scientist Award Recipient - 2013 </li>
        </ul>
     <div class="row">
        <div class="column">
            <img src= "/images/IMG_7537.jpg" width="450" height="450">
        </div>

    <div class="column">
        <img src= "/images/IMG_7645.jpg" width="295" height="450">
    </div>-->

        

    


        
      

        


    




     


    </div>
  </body>
</html>
