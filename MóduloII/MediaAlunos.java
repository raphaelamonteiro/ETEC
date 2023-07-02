/**
 * @(#)MediaAlunos.java
 * MediaAlunos application
 * @author Prof Julio
 * @version 1.00 2010/9/8
 */
import java.util.Scanner; 
public class MediaAlunos {
    
    public static void main(String[] args) {
    	
    	// declara, incializa variáveis
    	Scanner input = new Scanner(System.in);
    	String nome;
    	double altura, soma_altura, media_altura, media_idade;
    	int  idade, soma_idade, quant;
    	soma_idade=0;
    	media_altura=0.0;
    	media_idade=0.0;
    	soma_altura=0;
    	quant=0;
    	
        nome="";
        idade=0;
        altura=0.0;
        
        
  while(! nome.equals("fim")){
		System.out.println("Digite o nome:");
		nome=input.next();
		if (! nome.equals("fim")){
			System.out.println("Digite a idade:");
			idade=input.nextInt();
			System.out.println("Digite a altura:");
			altura=input.nextDouble();
			quant ++;
			soma_altura+=altura;
			soma_idade+=idade;
			
			}	
		}
		if (quant != 0){
		
   			media_altura=soma_altura/quant;
  			media_idade=soma_idade/quant;
   			System.out.println(); // linha em branco 
   			System.out.println("Quantidade de Alunos: " + quant);
   			System.out.println("Média de Altura do Grupo: " + media_altura);
   			System.out.println("Média de Idade do Grupo: " + media_idade);
		}
		else{
			System.out.println("Não tem alunos nesta escola.... vazia"); 
		}
   }
}
