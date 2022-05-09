<?php
$hostname='localhost';
$databse='walkmypet';
$username='root';
$password='';

$conexion=new mysqli($hostname,$username,$password,$databse);
if($conexion ->connect_errno){
    echo "El sitio web está teniendo problemas";
}

?>