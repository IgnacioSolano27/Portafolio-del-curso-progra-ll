import javax.swing.JOptionPane;

public class Principal extends Dado {
    public static void main(String[] args) throws Exception {

      Dado objeto1 = new Dado();
      Dado objeto2 = new Dado2();

      objeto1.setValorDado(-1);
      objeto1.setValorAnterior(1);

      int opcion = 0;
   
        do{
          try{
      
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "JUEGO DEL DADO\n"
                    +"1. Tirar dado\n"
                    +"2. Salir\n"
                    +"Elije una acción a realizar:", "Menu de opciones",3));
      
            switch (opcion){
               case 1:

                  JOptionPane.showMessageDialog(null,
                   "Al presionar aceptar el dado empezará a girar.");
                  objeto1.tirarDado();     
                  objeto2.tirarDado(); 

                  break;
                case 2:

                  JOptionPane.showMessageDialog(null,
                   "Sistema finalizado");
                  System.exit(0);

                  break;
                default:

                  JOptionPane.showMessageDialog(null,
                   "No has ingresado una opción válida");

                  break;
              }
      
            }catch(Exception e){
              JOptionPane.showMessageDialog(null,
               "Ha habido un error, reintente");
            }
          }while(opcion!=2);
    }
}
