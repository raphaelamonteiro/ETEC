/**
 * @(#)TabNomes.java
 *
 * TabNomes application
 *
 * @author 
 * @version 1.00 2011/9/14
 */
import javax.swing.*;
public class TabNomes {
    
    public static void main(String[] args) {
    	String aux="";
    	// TODO, add your application code
    	String[] nomes=new String[5];
    	int i,x;
    	for(i=0;i<=5;i++){
    		nomes[i]=JOptionPane.showInputDialog("Qual o nome ?");
    	}
    	for(i=0;i<=5;i++){
    		System.out.println(i+1+" "+nomes[i]);
    	}
    	for (i=0;i<5;i++){
    		for(x=i;x<=5;x++){
    			if(nomes[i] >= nomes[x]){
    				aux=nomes[i];
    				nomes[i]=nomes[x];
    				nomes[x]=aux;
    			}
    		}
    	}
    	for(i=0;i<=5;i++){
    		System.out.println(i+1+" "+nomes[i]);
    	}
    	
    	
    }
}
