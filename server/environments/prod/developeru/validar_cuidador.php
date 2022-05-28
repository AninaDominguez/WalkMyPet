<?php 
include 'conexion.php';
$Nombre=$_POST['nombre'];
$password=$_POST['Password'];

//$Nombre="Saul";
//$password="123abc";

$sentencia=$conexion->prepare("SELECT * FROM cuidadores WHERE Nombre =? AND password=?");
$sentencia->bind_param('ss',$Nombre,$password);
$sentencia->execute();

$resultado = $sentencia->get_result();
if ($fila = $resultado->fetch_assoc()) {
            echo json_encode($fila,JSON_UNESCAPED_UNICODE);
}
$sentencia->close();
$conexion->close();
?>