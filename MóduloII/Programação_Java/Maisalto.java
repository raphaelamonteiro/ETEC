/**
 * @(#)Maisalto.java
 * Maisalto application
 qa* @author Prof Julio
 
 */
 import java.io.*;
import java.util.Scanner; 
public class Maisalto {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String nome, nome_mais_alto;
    	double altura, mais_alto;
    	int  idade, idade_do_mais_alto;
    	mais_alto=0.0;
        nome_mais_alto="";
        idade_do_mais_alto=0;
   for (int i=1; i<=3; i++){
   	   try{
   	    
		System.out.println("Digite o nome:");
		nome=input.next();
		System.out.println("Digite a idade:");
		idade=input.nextInt();
		System.out.println("Digite a altura:");
		altura=input.nextDouble();
		if (mais_alto<altura){
				mais_alto=altura;
				nome_mais_alto=nome;
				idade_do_mais_alto=idade;
			}	
		
      }
      
        
     catch( Exception e){
   	System.out.println("digite um valor valido..");
   }
   }
   
   System.out.println(); // linha em branco 
   System.out.println("Nome do aluno mais alto: " + nome_mais_alto);
   System.out.println("Idade do aluno mais alto: " + idade_do_mais_alto);
   System.out.println("Altura do aluno mais alto: " + mais_alto);
   }
}
