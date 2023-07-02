import javax.swing.*;
public class Repet1{
	public static void main (String args [])
	{
		int numero;
		do{
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número decimal:"));
		 System.out.println(numero);}
		 while(numero != 0);
		 System.out.println("Acabouuuuu... ");
	
	}

}