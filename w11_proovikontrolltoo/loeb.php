<?php
// Open the file for reading
$myfile = fopen("input.csv", "r");
// each line into the local $data variable
  while (($data = fgetcsv($myfile, 9999, ",")) !== FALSE) 
  {    
    // Read the data from a single line
  echo 'Nimi: ' . $data[0] . '<br>'; 
  echo 'Perenimi: ' . $data[1] . '<br>';
  echo 'Sunniaeg: ' . $data[2] . '<br>';
  echo 'Isikukood: ' . $data[3] . '<br>';
  echo 'Telefon: ' . $data[4] . '<br>';
  echo 'Email: ' . $data[5] . '<br>';
  echo 'Oppekava: ' . $data[6] . '<br>';

    echo '<br>';
  }
// Close the file
 fclose($myfile);


