<script>
    //classes em JS
class Animal {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
     speak() { 
        document.write (`${this.name} são amigos leais. `);
    }
}
//Exemplo de uso:
const animal = new Animal('Doguinhos', 3);
animal.speak(); //Output:"são amigos leais."
    </script>
