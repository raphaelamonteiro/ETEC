<script>
    //classes em JS
class Pessoa {
    constructor(nome) {
        this.nome = nome;
    }
     saudacao() { 
        document.write (`Olá, meu nome é ${this.nome}. `);
    }
}
class Estudante extends Pessoa {
    constructor(nome, curso) {
        super(nome);
        this.curso = curso;
  
    }
    saudacao() { 
        document.write (`Olá, meu nome é ${this.nome} e eu estou estudando ${this.curso}. `);
    }
}
let estudante1 = new Estudante("Maria", "Ciencia da Computação");
estudante1.saudacao(); //Output: Olá, meu nome é Maria e estou estudando Ciência da Computação
    </script>
