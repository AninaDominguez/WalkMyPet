<?php 
include 'conexion.php';
$Nombre=$_POST['nombre'];
$password=$_POST['Password'];

$query = "INSERT INTO propietarios (nombre,Password) values ('$Nombre','$password')";
$resultado =mysqli_query($conexion,$query);

if($resultado){
	echo "registro correctamente";
}else{
	echo "error";
}
?>