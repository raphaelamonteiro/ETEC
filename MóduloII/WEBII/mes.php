<?php
$mes =[ "janeiro", "fevereiro", "março", "abril",
"maio", "junho", "julho", "setembro", "outubro", 
"novembro", "dezembro"];
$numMes = $_POST['mes']
if ($numMes >= 1&& $numMes <=12){
echo "$mes[$numMes-1]";
}else{
echo "Mês Invalido";
}
?>