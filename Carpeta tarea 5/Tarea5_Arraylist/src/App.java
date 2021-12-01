import javax.swing.JOptionPane;

import Entidades.ClienteCredito;
import Entidades.VContado;
import Entidades.VCredito;

public class App{
  public static void main(String[] args) throws Exception {

    int opcion = 0;
    ClienteCredito cliCre = new ClienteCredito();
    VCredito venCre;
    VContado venCon = new VContado();
  
    do{
      try{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1. Registro de clientes de crédito\n"
           +"2. Registro de ventas de contado\n"
           +"3. Registro de ventas a crédito\n"
           +"4. Salir del sistema\n"
           +"Seleccione la opcion a realizar\n", "Menú de opciones", 3));
        switch(opcion){
          case 1 : 
            cliCre.menu();
            break;
          case 2 :
            venCon.menu();
            break;
          case 3 :
            venCre = new VCredito(cliCre);
            venCre.menu();
            break;
          case 4 :
            JOptionPane.showMessageDialog(null, "Sistema finalizado");
            System.exit(0);
            break;
        }
      }catch(Exception e){

        JOptionPane.showMessageDialog(null,
         "Ha ocurrido un error, por favor reintente. "+ e);

      }
    }while(opcion != 4);
        
  }    
}
