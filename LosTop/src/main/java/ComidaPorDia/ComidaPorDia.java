
package ComidaPorDia;
import javax.swing.JOptionPane;

public class ComidaPorDia {
    //Cuantos platos de comida vendieron 
    public static int Hamburguesas=0;
    public static int Papas=0;
    public static int Pollo=0;
    public static int HotDog=0;
    public static int total=0;
    
    
    public void CantidadComidas() {
        Hamburguesas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos platos de hamburguesa se vendieron"));
        Papas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos platos de papas se vendieron"));
        Pollo=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas porciones de pollo se vendieron"));
        HotDog=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos hot dogs se vendieron"));
        
        total= Hamburguesas+Papas+Pollo+HotDog;
        System.out.println("El total de comidas es "+total);
    }
    }
    
  
