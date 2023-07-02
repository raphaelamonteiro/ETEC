<script>
    //classes em JS
class Animal {
    constructor(nome) {
        this.nome = nome;

    }
     falar() { 
        document.write (`${this.nome} emite um som. `);
     }
}
class Cachorro extends Animal {
    falar() {
        document.write (`${this.nome} late. `);  
    }
}
let cachorro1 = new Cachorro("Rex");
cachorro1.falar(); //Output: Rex late.
    </script>
