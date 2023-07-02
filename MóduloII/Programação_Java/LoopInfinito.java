class LoopInfinito
 {
 public static void main (String args[]) 
  {
   String palavra="Linguagem Java"; 
      if (palavra.length()!=0)
        {
        System.out.println("Mostra a palavra letra a letra");
        System.out.println("Para encerrar pressione CTRL+B");
      
        while (true)  //looping infinito
          { 
           for(int i=0;i<palavra.length();i++)
            {    
             System.out.print(palavra.charAt(i));
             for(int x=0;x<50000000;x++); //temporizador 1
            }
           System.out.println();
           for(int y=0;y<100000000;y++); //temporizador 2
          } 
        }
	else
          System.out.println("Entre com uma palavra qualquer.");        
  }
}
-----------------------------------------------------------------
class ConvNumString
 {
 public static void main (String args[])
  {
  int a = 11;
  long b = 222;
  float c = 3333;
  double d = 4.444;
  String S = String.valueOf(a) + " " + 
             String.valueOf(b) + " " + 
             String.valueOf(c) + " " + 
             String.valueOf(d);             
  System.out.println("Conteudo de s: " + S);
  }
 }


