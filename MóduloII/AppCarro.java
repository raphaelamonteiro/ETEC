package appcarro;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AppCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro("Prata", "Lamborghini", "Veneno", 0);
        boolean ligado = false;
        int op = 0;
        while (op != 6){
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "<MENU>"
                                                                + "\n 1- Ligar" 
                                                                + "\n 2- Acelerar"
                                                                + "\n 3- Freiar"
                                                                + "\n 4- Desligar"
                                                                + "\n 5- car_info"
                                                                + "\n 6- Sair <<Escolha>>", "Veiculos",JOptionPane.QUESTION_MESSAGE));
            switch(op){
            case 1:
            
            ligado = true;
            
            System.out.println("seu carro foi ligado");
            break;
            case 2:
            
                    if(ligado){
                    car.acelerar();
                    System.out.println("você acelerou o carro sua velocidade atual é"+car.getVelocidade());
                    }else{
                            System.out.println("seu carro está desligado");
                            }
                
            
            break;
            
            case 3:
            
            
            break;
        }
        }
        
    }
}
