<?php
$valor1 = $_POST['valor1'];
$valor2 = $_POST['valor2'];
if ($valor1 > $valor2){
echo "$valor1 é maior que $valor2";
}else{
echo "$valor2 é maior que $valor1";
}
?>