import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) throws Exception {

    Cuenta objeto1 = new Cuenta();
    int opcion = 0;

    do{
      try{

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "BANCO COSTARRICENSE\n\n"
                +"1. Realizar un depósito a la cuenta\n"
                +"2. Realizar un retiro de la cuenta\n"
                +"3. Mostrar estado de la cuenta\n"
                +"4. Salir\n"
                +"Elije una acción a realizar:", "Menu de opciones",3));

        switch (opcion){
          case 1: 
            objeto1.depositar();
            break;
          case 2:
            objeto1.retirar();
            break;
          case 3:
            objeto1.mostrarEstadoCuenta();
            break;
          case 4:
            JOptionPane.showMessageDialog(null,
             "Sistema finalizado");
            System.exit(0);
          default:
            JOptionPane.showMessageDialog(null,
             "No has ingresado una opción válida");
        }

      }catch(Exception e){
        JOptionPane.showMessageDialog(null,
         "Ha habido un error, reintente");
      }
    }while(opcion!=4);
  }
}