
//Analise o exercício abaixo encontre o erro e
// compare com a outra forma de entrada de dados, expresse sua opnião.


public class Exerc03{
	public static void main (String args [])
	{
		double numero=0;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número decimal:"));
		JOptionPane.showMessageDialog(null,"Vc digitou o numero:" + numero);
	}

}