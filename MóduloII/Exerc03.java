
//Analise o exerc�cio abaixo encontre o erro e
// compare com a outra forma de entrada de dados, expresse sua opni�o.


public class Exerc03{
	public static void main (String args [])
	{
		double numero=0;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um N�mero decimal:"));
		JOptionPane.showMessageDialog(null,"Vc digitou o numero:" + numero);
	}

}