/**
 * @(#)ExemploVetor.java
 *
 * ExemploVetor application
 *
 * @author 
 * @version 1.00 2011/9/8
 */
 
public class ExemploVetor {
    
    public static void main(String[] args) {
    	
    int[] vet= new int [5];
    int x=0;
    for(x=0;x<5;x++){
    	vet[x]=x*3;
    }
    for(x=0;x<5;x++){
    	System.out.println(vet[x]);
    }
    }
}
