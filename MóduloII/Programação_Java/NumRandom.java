class NumRandom
 {
 public static void main (String args[])
  {
  for(int qtd=1;qtd<=5;qtd++)
    {
    for(int x=1;x<=6;x++)
      {
      int num = (int) (Math.random() * 99);
   	  System.out.print(num+"  ");
      }
    System.out.println();       
    }
  }
 }
