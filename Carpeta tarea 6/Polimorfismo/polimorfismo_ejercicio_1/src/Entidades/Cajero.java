package Entidades;
import javax.swing.JOptionPane;

public class Cajero extends Menu {

  @Override
  public void menu() {
    try{
      do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
         "1. Ver lista de productos y detalles\n" 
        +"2. Buscar un producto por su código\n" 
        +"3. Facturar compra del cliente\n"
        +"4. Salir\n"
        +"Elija el menu del rol a desplazar\n"));

        switch(opcion){
          case 1:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de ver lista de productos");
            break;

          case 2:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de buscar un producto por su código");
            break;

          case 3:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de facturar una compra");
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
