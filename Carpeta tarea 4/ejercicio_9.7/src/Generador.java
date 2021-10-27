import javax.swing.JOptionPane;

public class Generador extends Acciones {
    public static void main(String[] args) throws Exception {
      Acciones objeto1 = new Acciones(); 
      objeto1.setSemilla(0);

      int opcion = 0;
      int valor = 0;
   
        do{
          try{
      
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "GENERADOR DE NÚMEROS ALEATORIOS\n"
                    +"1. Insertar valor semilla\n"
                    +"2. Calcular número aleatorio\n"
                    +"3. Salir\n"
                    +"Elije una acción a realizar:", "Menu de opciones",3));
      
            switch (opcion){
                case 1:

                  valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese el nuevo valor semilla", "Definiendo semilla", 3));
                  objeto1.setSemilla(valor);
                  JOptionPane.showMessageDialog(null,
                   "El nuevo valor semilla es: "+objeto1.getSemilla());

                  break;
                case 2: 

                  objeto1.calcular();
                  JOptionPane.showMessageDialog(null, "El número generado fue: "+objeto1.getAleatorio());

                  break;
                case 3:

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
          }while(opcion!=3);
    }
    
}
