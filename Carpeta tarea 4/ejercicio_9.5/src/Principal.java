import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
      Funciones objeto1 = new Funciones();
      objeto1.setPuntuación(-1);
      int opcion = 0;

        do{
          try{
    
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "TANTEADOR DE VIDEOJUEGO\n\n"
                    +"1. Iniciar puntuación desde cero\n"
                    +"2. Aumentar marcador\n"
                    +"3. Disminuir marcador\n"
                    +"4. Mostrar puntuación\n"
                    +"5. Salir\n"
                    +"Elije una acción a realizar:", "Menu de opciones",3));
    
            switch (opcion){
              case 1: 
                objeto1.Inicializar();               
                break;
              case 2:
                objeto1.aumentar();
                break;
              case 3:
                objeto1.disminuir();
                break;
              case 4: 
                objeto1.mostrar();
                break;
              case 5:
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
        }while(opcion!=5);
      
    }
}
