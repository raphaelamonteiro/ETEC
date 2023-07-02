<?php
$salario = $_POST['salario'];
$calculo;
if ($salario <300){
$calculo = ($salario * 0.50) + $salario;
echo "O seu salario atual é de $calculo reais";
}else{
$calculo = ($salario * 0.50) + $salario;
echo "O seu salario atual é de $calculo reais";
}
?>