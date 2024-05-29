<?php

#mysqli
$servidor = "localhost";
$usuario = "root";
$senha = "";
$database = "aula_php";

$conexao = mysqli_connect($servidor, $usuario, $senha, $database);

if ($conexao) {
    echo "Conectado com sucesso!";
}

?>