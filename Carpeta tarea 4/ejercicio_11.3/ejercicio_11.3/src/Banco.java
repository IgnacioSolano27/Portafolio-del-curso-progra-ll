import javax.swing.JOptionPane;

public class Banco extends CuentasBancarias { 
  public static void main (String [] args){ 

    CuentaAhorro objetoA = new CuentaAhorro();
    CuentaCheques objetoC = new CuentaCheques();
    int opcion = 0, monto = 0, nCuenta = 0;
    String nombCliente;

    do{ 
      try{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Seleccione la opcion a realizar\n"
               +"1. Ingresar datos del cliente\n"
               +"2. Depositar en una cuenta de ahorros\n"
               +"3. Depositar en una cuenta de cheques\n"
               +"4. Retirar de una cuenta de ahorros\n"
               +"5. Retirar de una cuenta de cheques\n"
               +"6. Mostrar balance de una cuenta de ahorros\n"
               +"7. Mostrar balance de una cuenta de cheques\n"
               +"8. Salir del sistema\n", "Menú de opciones", 3));
         
        switch (opcion){
            case 1:
              nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Ingrese el numero de cuenta para este cliente",
                 "Datos de cliente", 3));
              nombCliente = JOptionPane.showInputDialog(null,
                 "Ingrese el nombre del cliente",
                 "Datos de cliente", 3);
              setNombreCliente(nombCliente);
              setNumeroCuenta(nCuenta);
              break;

            case 2: 
              if(getNombreCliente() == null){
              JOptionPane.showMessageDialog(null,
               "Debes ingresar los datos de usuario primero",
               "No hay datos de usuario",3);
              }else{
                monto=  Integer.parseInt(JOptionPane.showInputDialog(null,
                          "Hola "+getNombreCliente()+ ", ingrese la cantidad que desea depositar a su cuenta"));
                objetoA.depositar(monto);
              }
              break;
              
            case 3:
              if(getNombreCliente() == null){
              JOptionPane.showMessageDialog(null,
               "Debes ingresar los datos de usuario primero",
               "No hay datos de usuario",3);
              }else{
                monto=  Integer.parseInt(JOptionPane.showInputDialog(null,
                       "Hola "+getNombreCliente()+ ", ingrese la cantidad que desea depositar a su cuenta"));
                objetoC.depositar(monto);
              }
              break;

            case 4:
              if(getNombreCliente() == null){
                JOptionPane.showMessageDialog(null,
                 "Debes ingresar los datos de usuario primero",
                 "No hay datos de usuario",3);
              }else{
                monto=  Integer.parseInt(JOptionPane.showInputDialog(null,
                         "Hola "+getNombreCliente()+ ", cuanto desea retirar?"));
                objetoA.retirar(monto);
              }
              break;  

            case 5:
              if(getNombreCliente() == null){
                JOptionPane.showMessageDialog(null,
                 "Debes ingresar los datos de usuario primero",
                 "No hay datos de usuario",3);
              }else{
                monto=  Integer.parseInt(JOptionPane.showInputDialog(null,
                          "Hola "+getNombreCliente()+ ", cuanto desea retirar?"));

                objetoC.retirar(monto);
              }
              break;

            case 6:
              if(getNombreCliente() == null){
              JOptionPane.showMessageDialog(null,
               "Debes ingresar los datos de usuario primero",
               "No hay datos de usuario",3);
              }else{
                objetoA.mostrarBalance();
              }
              break;
            
            case 7:
            if(getNombreCliente() == null){

              JOptionPane.showMessageDialog(null,
               "Debes ingresar los datos de usuario primero",
               "No hay datos de usuario",3);

            }else{
              objetoC.mostrarBalance();
            }
              break;

            case 8:
              JOptionPane.showMessageDialog(null,
               "Programa finalizado");
              System.exit(0);
              break;

            default:

              JOptionPane.showMessageDialog(null,
                      "La opcion no se encuentra en el menú",
                      "Error!", 3);

              break;
        }
      }catch (NumberFormatException n){
        JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
      }
    }while(opcion!=8);
  } 
}
