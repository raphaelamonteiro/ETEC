// Analise o exerc�cio abaixo e construa um exemplo usando entrada de dados e uma estrutura case.

import javax.swing.*;
public class Exerc06
{
	public static void main(String args[])
	{
		String n;
		Double s,r;
		int g;
		
		   
			n=JOptionPane.showInputDialog("Entre com o nome");
			s=Double.parseDouble(JOptionPane.showInputDialog("entre com o salario"));
			g=Integer.parseInt(JOptionPane.showInputDialog("entre com o codigo de forma��o"));
			switch(g)
				
			{
			
			case 1:
				r=s+(s*0.1);
				JOptionPane.showMessageDialog(null,"nome"+n+"Gradua��o P�s-Graduado \n Salario Novo: "+r+"\n Salario Antigo: "+s);
				break;
			case 2:
				r=s+(s*0.2);
			JOptionPane.showMessageDialog(null,"nome"+n+"Gradua��o P�s-Graduado \n Salario Novo: "+r+"\n Salario Antigo: "+s);break;
			case 3:
				r=s+(s*0.3);
				JOptionPane.showMessageDialog(null,"nome "+n+"Gradua��o P�s-Graduado \n Salario Novo: "+r+"\n Salario Antigo: "+s);break;
			default:JOptionPane.showMessageDialog(null," insira novamente \n 1-T�cnico 2-bacharel 3-P�s-Graduado");
			}					
	}
}