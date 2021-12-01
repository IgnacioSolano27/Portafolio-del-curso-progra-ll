package Entidades;
import javax.swing.JOptionPane;

public class Cliente extends Menu {

  @Override
  public void menu() {
    try{
      do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
         "1. Elegir productos\n" 
        +"2. Ver carrito de compras\n" 
        +"3. Eliminar productos del carrito\n"
        +"4. Salir\n"
        +"Elija el menu del rol a desplazar\n"));

        switch(opcion){
          case 1:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de elegir productos");
            break;

          case 2:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de ver carrito de compras");
            break;

          case 3:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de eliminar productos del carrito");
            break;

          case 4:
            JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
            break;
            
          default:
            JOptionPane.showMessageDialog(null, "Has elegido una opcion invalida, por favor elige otra opción");
        }
      }while(opcion != 4);
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalles: "+ex);
    }
  }
    
}
