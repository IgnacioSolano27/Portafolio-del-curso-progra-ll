package pruebaProgra2;

import javax.swing.JOptionPane;

public class listas_SimpleEnlazada {
    public static void main(String[] args) {
      lista listaLista = new lista(); 
      int opcion = 0, val;
      do{
        try{
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "1. Agregar un elemento al inicio de la lista\n"
                 +"2. Agregar un elemento al final de la lista\n"
                 +"3. Eliminar al inicio de la lista\n"
                 +"4. Eliminar al Final de la lista\n"
                 +"5. Mostrar los datos de la lista\n"
                 +"6. Salir", "Menú de opciones" ,3)); 
          
            switch (opcion){
              case 1: 
               try{
                   
                val = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresa el elemento","Insertando al inicio" ,3));
                //agragando al inicio 
                listaLista.agregarAlInicio(val);
                
               }catch (Exception e){
                JOptionPane.showMessageDialog(null, "¡Hubo un error!");
               }
                break;
                
              case 2: 
               try{
                   
                val = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresa el elemento","Insertando al final" ,3));
                //agragando al final
                listaLista.agregarAlFinal(val);
                
               }catch (Exception e){
                JOptionPane.showMessageDialog(null, "¡Hubo un error!");
               }
                break;
                
              case 3:
               try{
                   
                val= listaLista.borrarDelInicio();
                JOptionPane.showMessageDialog(null, 
                        "El elemento eliminado es: "+val, "Eliminando nodo del inicio",JOptionPane.INFORMATION_MESSAGE); 
                
               }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al completar la tarea");
               }
                break;
                
              case 4:
               try{
                   
                val= listaLista.borrarDelFinal();
                JOptionPane.showMessageDialog(null, 
                        "El elemento eliminado es: "+val, "Eliminando nodo del final",JOptionPane.INFORMATION_MESSAGE); 
                
               }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al completar la tarea");
               }
                break;
                
              case 5:
                listaLista.mostrarLista();
                break;
                
              case 6:
                  System.exit(0);
                break;
                
              default: 
                  JOptionPane.showMessageDialog(null, "Opción incorrecta");
          }
          }catch(Exception e){
            System.out.println("La operación ha fallado, reintente.");
       }   
      }while(opcion!=6);
     }
      
  }