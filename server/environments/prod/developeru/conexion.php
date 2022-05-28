<?php
$hostname='	sql207.epizy.com';
$databse='epiz_31132729_WalkMyPet';
$username='	epiz_31132729';
$password='GLyhicOVP1';

$conexion=new mysqli($hostname,$username,$password,$databse);
if($conexion ->connect_errno){
    echo "El sitio web está teniendo problemas";
}

?>