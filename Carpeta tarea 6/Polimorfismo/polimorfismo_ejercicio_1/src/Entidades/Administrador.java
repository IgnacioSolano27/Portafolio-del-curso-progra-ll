package Entidades;
import javax.swing.JOptionPane;

public class Administrador extends Menu{

  @Override
  public void menu() {
    try{
      do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
         "1. Desplegar resumen de ventas\n" 
        +"2. Eliminar un cajero\n" 
        +"3. Agregar un cajero\n"
        +"4. Volver al menú principal\n"
        +"Elija la opcion a realizar\n"));

        switch(opcion){
          case 1:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de desplegar resumen de ventas");

            break;
          case 2:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de eliminar un cajero");

            break;
          case 3:
            JOptionPane.showMessageDialog(null, "Ha elegido la opcion de agregar un cajero");

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
