<?php 
include 'conexion.php';
//$nombre=$_POST['Nombre'];
//$Password=$_POST['password'];
//$cuidador=$_POST['Cuidador'];
//$fecha=$_POST['Fecha'];
//$duracion=$_POST['Duracion'];
//$id = $_GET['id'];

$result=array();
$result['cuidadores']=array();
$select = "SELECT * FROM cuidadores";
$mostrar =mysqli_query ($conexion,$select);

while($row = mysqli_fetch_array($mostrar)){
	$index['id'] = $row['0'];
		$index['Nombre'] = $row['1'];
			//$index['password'] = $row['2'];
			
			array_push($result['cuidadores'],$index);
	
}

$result["succes"]="1";
echo json_encode($result);
//mysql_close($conexion);
//prueba
?>