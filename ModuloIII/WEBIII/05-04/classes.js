<script>
    //classes em JS
class Pessoa {
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
     apresentar() { 
        document.write (`Olá, meu nome é ${this.nome} e eu tenho ${this.idade} anos.`);
     }
}
let pessoa1 = new Pessoa("João", 25)
pessoa1.apresentar(); //Output: Olá meu nome é João e eu tenho 25 anos.
    </script>
