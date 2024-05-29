<?php

#mysqli
$servidor = "localhost";
$usuario = "root";
$senha = "";
$database = "aula_php";

$conexao = mysqli_connect($servidor, $usuario, $senha, $database);

#Criando tabelas cm PHP
#Tabela cursos (nome do curso, carga horária)
$query = "CREATE TABLE CURSOS(
    id int not null auto_increment,
    nome_curso varchar(255) not null,
    carga_horaria int not null,
    primary key(id)
    )";
$executar = mysqli_query($conexao, $query);

#Tabela alunos (nome do aluno, data de nascimento)
$query = "CREATE TABLE ALUNOS(
    id_aluno int not null auto_increment,
    nome_aluno varchar(255) not null,
    data_nascimento varchar(255),
    primary key(id)
    )";
    $executar = mysqli_query($conexao, $query);

#Tabela alunos (nome do aluno, data de nascimento)
$query = "CREATE TABLE ALUNOS_CURSOS(
    id_aluno_curso int not null auto_increment,
    id_aluno int not null,
    id_curso int not null,
    primary key(id_aluno_curso)
    )";

    $executar = mysqli_query($conexao, $query);
    if ($executar){
        echo "Executado com sucesso!";
    }else{
        echo "Falha ao executar!";
    }

    $query = "INSERT INTO ALUNOS(nome_alunos, data_nascimento) VALUES('Maria','01-04-1991')";

    $executar = mysqli_query($conexao, $query);
    
    $query = "INSERT INTO ALUNOS(nome_aluno, data_nascimento) VALUES ('01-04-1991')"

    $executar = mysqli_query($conexao, $query);

    $query = "INSERT INTO CURSOS(nome_curso, carga_horaria) VALUES('PHP E MYSQL', 10)"
    
    $executar = mysqli_query($conexao, $query);

    $query = "INSERT INTO ALUNOS_CURSOS(id_aluno, id_cursos) VALUES(8, 1)";
    msqli_query($conexao,$query);

    if(msqli_query($conexao, "DELETE FROM ALUNOS WHERE ID_ALUNO = 4")){
        echo 'apagado com sucesso';
    }
    else{
        echo 'Falha ao apagar dados';
    }
    
    if(mysqli_query($conexao, "UPDATE ALUNOS SET NOME_ALUNO = 'Jose Miguel' WHERE 
    ID_ALUNO = 7")){
        echo 'Sucesso';
    }

    if(mysqli_query($conexao, "UPDATE ALUNOS SET NOME_ALUNO = 'Maria Capitolina' 
    WHERE ID_ALUNO = 8")){
        echo 'Sucesso';
    }
    
    echo '<table>
            <tr>
                <th>id</th>
                <th>nome</th>
                <th>Data de Nascimento</th>
            </tr>';
        
    $consulta =  mysqli_query($conexao, "SELECT * FROM ALUNOS");

    while($linha = mysqli_fetch_array($consulta)){
        echo '<tr>';
        echo '<td>';
        echo $linha['id'] ;
        echo '</td>';
        echo '<td>';
        echo $linha['nome_aluno'];
        echo '</td>';
        echo '<td>'; 
        echo $linha['data_nascimento'];
        echo '</td>';
        echo '</tr>';    
    }
                
    echo '</table>';
                
                
                
        
    ?>

