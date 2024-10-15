<?php
    error_reporting(0);
    session_start();
    session_destroy();

    if($_SESSION['message'])
    {
        $message=$_SESSION['message'];
        echo "<script type='text/javascript'>
        alert('$message');
        </script>";
    }

    $host="localhost";
    $user="root";
    $password="";
    $db="php";

    $data=mysqli_connect($host,$user,$password,$db);

    $sql="SELECT * FROM teacher";

    $result=mysqli_query($data,$sql); 

     



?>




<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management System</title>
    <link rel="stylesheet" href="style.css">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>

<body>
    <nav>
        <label class="logo">DBUU</label>

        <ul>
            <li>
                <a href="">Home</a>
            </li>
            <li>
                <a href="">Contact</a>
            </li>
            <li>
                <a href="">Admission</a>
            </li>
            <li>
                <a href="login.php" class="btn btn-success">Login</a>
            </li>
        </ul>
    </nav>

    <div class="section1">
        <label class="img_text">We Teach Students With Care </label>
        <img class="main_img" src="school m.jpg" alt="">
    </div>

    <div class="container">

        <div class="row">

            <div class="col-md-4">

                <img class="welcome-img" src="college.jpg" alt="">

            </div>

            <div class="col-md-8">

                <h1><center>Welcome to Dev Bhoomi Uttarakhand University</center></h1>

                <p>MEMS has been committed to global learning long before if became an indispensable feature of contemporary <br>
                education. Established in 1997, We proudly stand as the 1st English medium school in Bangladesh to adopt both<br>
                Pearson Edexcel and Cambridge curriculum (in O and A levels),drawing together students in a vibrant, academically<br>
                challenging, and encouraging environment where manifold viewpoints are prized and celebrated.MEMS has been<br>
                committed to global learning long before it became an indispensable feature of contemporary education. Established <br>
                in 1997, we proudly stand as the 1st English medium school in Bangladesh to adopt both Pearson Edexcel<br>
                and Cambridge curriculum (in O and A levels), drawing together students in a vibrant, academically challenging,<br> 
                and encouraging environment where manifold viewpoints are prized and celebrated. </p>

            </div>

        </div>

    </div>

    <center>
        <h1>Our Teachers</h1>
    </center>

    <div class="container">
        <div class="row">

        <?php

            while($info=$result->fetch_assoc())

            {

        ?>

            <div class="col-md-4">

                <img class="teacher" src="<?php echo "{$info['image']}" ?>" alt="">

                 <h3><?php echo "{$info['name']}" ?></h3>

                <h5><?php echo "{$info['description']}" ?></h5>

            </div>

            <?php

        }

            ?>
            
        </div>
    </div>

    <center>
        <h1>Our Courses</h1>
    </center>

    <div class="container">
        <div class="row">

            <div class="col-md-4">

                <img class="teacher" src="pro lab.jpg" alt="">

                <h3> Chemist Lab</h3>

            </div>

            <div class="col-md-4">

                <img class="teacher" src="class img.jpg" alt="">

                <h3>Web Development</h3>

            </div>

            <div class="col-md-4">

                <img class="teacher" src="dig.jpg" alt="">

                <h3>Marketing</h3>

            </div>

        </div>
    </div>

    <center >
        <h1 class="adm">Admission Form</h1>
    </center>

    <div align="center" class="admission_form">

        <form action="data_check.php" method="POST">

            <div class="adm_int">
                <label class="label_text">Name</label>
                <input class="input_deg" type="text" name="name" id="">
            </div>

            <div class="adm_int">
                <label class="label_text">Email</label>
                <input class="input_deg" type="text" name="email" id="">
            </div>

            <div class="adm_int">
                <label class="label_text">Phone</label>
                <input class="input_deg" type="text" name="phone" id="">
            </div>


            <div class="adm_int">
                <label class="label_text">Message</label>
                <textarea class="input_txt" name="message"></textarea>
            </div>

            <div class="adm_int">

                <input class="btn btn-primary" id="submit" type="submit" value="apply" name="apply">
            </div>

        </form>

    </div>

    <footer>
        <h3 class="footer_text">All @copyright reserved by web tech knowledge</h3>
    </footer>
</body>

</html>