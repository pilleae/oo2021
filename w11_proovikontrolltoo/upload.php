<?php
//set the connection variables

$hostname = "localhost";
$username = "if20";
$password = "if20";
$database = "if20_pille_klassipaevik";
$filename = "input.csv";

//connect to mysql database
$connection = mysqli_connect($hostname, $username, $password, $database) or die("Error " . mysqli_error($connection));

// open the csv file
$fp = fopen($filename,"r");

//parse the csv file row by row
while(($row = fgetcsv($fp,"500",",")) != FALSE)
{
    //insert csv data into mysql table
    $sql = "INSERT INTO tbl_tudeng (perenimi, eesnimi, sunniaeg, isikukood, telefon, email, oppekava) VALUES('" . implode("','",$row) . "')";
    if(!mysqli_query($connection, $sql))
    {
        die('Error : ' . mysqli_error($connection));
    }
}

fclose($fp);

//close the db connection
mysqli_close($connection);
?>



