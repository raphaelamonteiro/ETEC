/*
Este exemplo mostra como verificar se
um número é par ou ímpar. 
*/

import java.util.*;

public class Estudos{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Informe um valor inteiro: ");
int num = input.nextInt();

if(num % 2 == 0)
System.out.print("Você informou um numero par");
else
System.out.print("Você informou um numero impar");

System.exit(0);
}
}
