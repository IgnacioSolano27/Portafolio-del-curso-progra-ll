import javax.swing.JOptionPane;

import Entidades.Administrador;
import Entidades.Cajero;
import Entidades.Cliente;
import Entidades.Roles;

public class App {
  public static void main(String[] args) throws Exception {
    int opcion = 0;
    Cliente cliente = new Cliente();
    Cajero cajero = new Cajero();
    Administrador admi = new Administrador();
    

    try{
      do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
         "1. Cliente\n" 
        +"2. Cajero\n" 
        +"3. Administrador\n"
        +"4. Salir\n"
        +"Elija el menu del rol a desplazar\n"));

        switch(opcion){
          case 1:
            JOptionPane.showMessageDialog(null, "Ha elegido el desplegar el menú de "+Roles.CLIENTE.toString().toLowerCase());
            cliente.menu();
            break;

          case 2:
            JOptionPane.showMessageDialog(null, "Ha elegido el desplegar el menú de "+Roles.CAJERO.toString().toLowerCase());
            cajero.menu();
            break;

          case 3:
            JOptionPane.showMessageDialog(null, "Ha elegido el desplegar el menú de "+Roles.ADMINISTRADOR.toString().toLowerCase());
            admi.menu();
            break;

          case 4:
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            System.exit(0);
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
