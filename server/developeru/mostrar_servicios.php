<?php 
include 'conexion.php';
$nombre=$_POST['Nombre'];
$Password=$_POST['password'];
$cuidador=$_POST['Cuidador'];
$fecha=$_POST['Fecha'];
$duracion=$_POST['Duracion'];

$query = "INSERT INTO propietarios (Nombre,password,cuidador,fecha,duracion) values ('$nombre','$Password','$Cuidador','$fecha','$duracion')";
$resultado =mysqli_query($conexion,$query);

if($resultado){
	echo "muestra correctamente";
}else{
	echo "error";
}
?>