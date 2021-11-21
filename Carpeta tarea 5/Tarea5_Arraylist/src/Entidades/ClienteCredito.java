package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Interfaces.Agregable;
import Interfaces.Elegible;
import Interfaces.Eliminable;
import Interfaces.Modificable;
import Interfaces.Mostrable;

public class ClienteCredito extends Persona implements Agregable, Mostrable, Elegible, Modificable, Eliminable{

  //variables de uso local
  private String nomb = null, ape = null, corr = null;
  private int tel = 0;
  private int ID = 0;
  
  //constructor de clientes heredado
  public ClienteCredito(String nomb, String ape, int tel, String corr, int ID) {super(nomb, ape, tel, corr, ID);}
  public ClienteCredito(){}

  //lista de clientes creada en tipo Arraylist
  List<Persona> clientes = new ArrayList<Persona>();

  //Metodo para mostrar el menú
  public void menu(){

    int opcion = 0;

    do{
      try{

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1. Registrar nuevo cliente de crédito\n"
           +"2. Ver clientes registrados\n"
           +"3. Modificar un cliente de crédito\n"
           +"4. Eliminar un cliente de crédito\n"
           +"5. Volver al menú principal\n"
           +"Seleccione la opcion a realizar\n", "Menú de opciones", 3));

        switch(opcion){
          case 1 :
            agregar();
            break;
          case 2 :
            mostrar();
            break;
          case 3 :
            modificar();
            break;
          case 4 :
            eliminar();
            break;
          case 5 :
            JOptionPane.showMessageDialog(null,
             "Volviendo al menú principal",
             "Opcion volver", 3);
            break;
          default :
            JOptionPane.showMessageDialog(null,
             "No ha ingresado una opción válida",
             "Acción no encontrada", 3); 
        }
      }catch(Exception e){

        JOptionPane.showMessageDialog(null,
         "Ha ocurrido un error, por favor reintente. "+ e);

      }
    }while(opcion != 5);
        
  }
  //Metodo para agregar un nuevo cliente
  public void agregar(){

    //se ingresan los datos para crear el nuevo cliente
    nomb = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:",
     "Registrando un cliente de crédito", 3);
    ape = JOptionPane.showInputDialog(null, "Ingrese los apellidos del cliente:",
    "Registrando un cliente de crédito", 3);
    tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de teléfono del cliente:",
    "Registrando un cliente de crédito", 3));
    corr = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico del cliente:",
    "Registrando un cliente de crédito", 3);
    ID = ID+1;

    //se crea el nuevo cliente
    Persona nuevo = new ClienteCredito(nomb, ape, tel, corr, ID);

    //se agrega a la lista
    clientes.add(nuevo);

    JOptionPane.showMessageDialog(null,
     "Se ha agregado al nuevo cliente "
     +nuevo.getNombre()+" "
     +nuevo.getApellidos()+".\nID de cliente = "
     +nuevo.getIDcliente());

  }
  //Metodo para mostrar los clientes registrados
  public void mostrar(){
    if(ID > 0){

      String cadena = "";
      for (int i = 0; i < clientes.size(); i++){
        cadena = cadena + "ID cliente = "+clientes.get(i).getIDcliente()+" | Nombre del cliente : "
                                         +clientes.get(i).getNombre()+" "
                                         +clientes.get(i).getApellidos()+"\n"
                                         + "-------------------------------------------------------------------------------------\n";
      }
      JOptionPane.showMessageDialog(null, cadena);
    }else{
      JOptionPane.showMessageDialog(null, 
       "Lista de clientes de crédito vacía",
       "No hay datos de clientes", 3 );
    }
  }
  //Metodo para modificar cliente
  public void modificar(){

    if(ID > 0){
      
      mostrar();

      int IDbuscado = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Ingrese el ID del cliente que desea modificar: ",
        "Eliminando un cliente", 3));

      for(int i = 0; i<clientes.size(); i++){

        if (IDbuscado == clientes.get(i).getIDcliente()){

          nomb = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente",
           "Modificando un cliente de crédito", 3);
          ape = JOptionPane.showInputDialog(null, "Ingrese los apellidos del cliente",
           "Modificando un cliente de crédito", 3);
          tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de telefono del cliente",
           "Modificando un cliente de crédito", 3));
          corr = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico del cliente:",
           "Modificando un cliente de crédito", 3);

          clientes.get(i).setNombre(nomb);
          clientes.get(i).setApellidos(ape);
          clientes.get(i).setTelefono(tel);
          clientes.get(i).setCorreo(corr);

          JOptionPane.showMessageDialog(null,
           "La información del cliente se ha modificado correctamente.",
           "Modificando un cliente de crédito", 3);
          
        } 
      }
      mostrar(); //Se muestra lista actualizada de clientes
    }else{
      JOptionPane.showMessageDialog(null,
       "No hay clientes en la lista.",
       "Nada que modificar", 3);
    }
  }
  //Metodo para eliminar cliente
  public void eliminar(){
    if(ID > 0){
      mostrar(); //Se muestra lista inicial de clientes
      int opcion = 0;
      do{

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
          "1. Eliminar un cliente\n"
         +"2. Volver\n"
         +"Seleccione la acción a realizar"));
        switch (opcion){
          case 1: 
          
            int IDbuscado = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Ingrese el ID del cliente que desea eliminar: ",
             "Eliminando un cliente", 3));
   
            for(int i = 0; i<clientes.size(); i++){

              if (IDbuscado == clientes.get(i).getIDcliente()){
                JOptionPane.showMessageDialog(null, "Eliminando a "
                +clientes.get(i).getNombre()+" "
                +clientes.get(i).getApellidos()
                +" de la lista de clientes de crédito.");

                clientes.remove(i);

              } 
            }
            mostrar(); //Se muestra lista actualizada de clientes

            break;
          case 2:

            JOptionPane.showMessageDialog(null,
             "Regresando al menú anterior");

            break;
          default:
            JOptionPane.showMessageDialog(null,
              "Ha ingresado una opcion inválida",
              "Acción no enconrada", 3);
        }
      }while(opcion != 2);
    }else{
      JOptionPane.showMessageDialog(null,
       "La lista de clientes está actualmente vacía",
       "No hay clientes registrados", 3);
    }
  }

}
