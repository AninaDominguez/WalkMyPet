<?php 
include 'conexion.php';
//$nombre=$_POST['Nombre'];
//$Password=$_POST['password'];
//$cuidador=$_POST['Cuidador'];
//$fecha=$_POST['Fecha'];
//$duracion=$_POST['Duracion'];
$id = $_GET['id'];

$consulta = "SELECT * FROM cuidadores WHERE id= '$id'";
$resultado =$conexion ->query($consulta);

while($fila = $resultado->fetch_array()){
	$cuidadores[] = array_map('utf8_encode',$fila);
}

echo json_encode($cuidadores);
$resultado->close();
?>