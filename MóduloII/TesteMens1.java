/**
 * @(#)TesteMens1.java
 *
 * TesteMens1 application
 *
 * @author   Prof Julio
*/

public class TesteMens1 {

    public static void main(String[] args) {

    	   //declara��o das vari�veis
    String numeroA, numeroB;
    int numero1, numero2, soma;

    //pede dois n�meros inteiros
    numeroA = JOptionPane.showInputDialog("Entre com o primeiro n�mero inteiro");
    numeroB = JOptionPane.showInputDialog("Entre com o segundo n�mero inteiro");

    //converte os n�meros de string para inteiro
    numero1 = Integer.parseInt(numeroA);
    numero2 = Integer.parseInt(numeroB);

    //outra forma de convers�o seria utilizar o m�todo valueOf
    numero1 = Integer.valueOf(numeroA);
    numero2 = Integer.valueOf(numeroB);

    //efetua a soma dos n�meros
    soma = numero1 + numero2;

    //mostra o resultado da soma para o usu�rio
    JOptionPane.showMessageDialog(null,"A soma dos n�meros �: " +
    soma,"Resultado",JOptionPane.PLAIN_MESSAGE);

    }
}
