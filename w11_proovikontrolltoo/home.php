<?php
if(isset($_POST["submit"]))
{
   $hostname = "localhost";
   $username = "if20";
   $password = "if20";
   $database = "if20_pille_klassipaevik";
$conn=mysql_connect($host,$db_user,$db_password) or die (mysql_error());
//mysql_select_db($db) or die (mysql_error());
$con=mysqli_connect($host,$db_user,$db_password,$db);
// Check connection
if (mysqli_connect_errno())
{
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
}
 
 
echo $filename=$_FILES["file"]["name"];
$ext=substr($filename,strrpos($filename,"."),(strlen($filename)-strrpos($filename,".")));
 
//we check,file must be have csv extention
if($ext=="csv")
{
  $file = fopen($filename, "r");
         while (($emapData = fgetcsv($file, 10000, ",")) !== FALSE)
         {
            $sql = "INSERT into tbl_tudeng(perenimi, eesnimi, sunniaeg, isikukood, telefon, email, oppekava) VALUES('$emapData[0]','$emapData[1]','$emapData[2]',
            '$emapData[3]', '$emapData[4]', '$emapData[5]', '$emapData[6]')";
            mysqli_query($con, $sql);

           
         }
         fclose($file);
         echo "CSV File has been successfully Imported.";
}
else {
    echo "Error: Please Upload only CSV File";
}
 
 
}
?>

<form enctype="multipart/form-data" method="post" action="home.php">
<table border="1">
<tr >
<td colspan="2" align="center"><strong>Import CSV file</strong></td>
</tr>
<tr>
<td align="center">CSV File:</td><td><input type="file" name="file" id="file"></td></tr>
<tr >
<td colspan="2" align="center"><input type="submit" value="submit"></td>
</tr>
</table>
</form>

</body>
</html>