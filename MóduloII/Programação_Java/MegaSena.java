/**
 * @(#)MegaSena.java
 *
 * MegaSena application
 *
 * @author 
 * @version 1.00 2010/11/3
 */
import javax.swing.*; 
public class MegaSena {
    
    public static void main(String[] args) {
    	
    	int meusNumeros[]=new int[6] ;
    int numerosSorteados[]=new int [6];
        int x=0, y=0,n=0;
        while (x<6){
            numerosSorteados[x]=(int) (Math.random() *60);
          	meusNumeros[x]=Integer.parseInt(JOptionPane.showInputDialog("Digite seu "+ ++n +" º número"));
        	x++;
        	
        }
        System.out.println("Meus números");
    for(y=0;y<=5;y++){
    	
    	System.out.print(meusNumeros[y]+"  ");
    }
    System.out.println("");
    System.out.println("Números sorteados");
     for(y=0;y<=5;y++){
    	
    	System.out.print(numerosSorteados[y]+"  ");
    }
    }	
    	
    	
    }
