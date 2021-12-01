package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Interfaces.Agregable;
import Interfaces.Elegible;
import Interfaces.Mostrable;
import Interfaces.Visible;

public class VCredito extends Venta implements Elegible, Mostrable, Agregable, Visible {
  
  //variables de uso local

  public String fechaV = null, horaV = null, metodoP = null;
  public int idV = 0, dato = -1, IDClien = 0;
  public double montoV = 0;
  
  //Constructor de una nueva venta
  public VCredito(int idV, String fechaV, String horaV, double montoV, int IDClien) {

    this.setIDventa(idV);
    this.setFechaVenta(fechaV);
    this.setHoraVenta(horaV);
    this.setMontoVenta(montoV);
    this.setIDCliente(IDClien);
    
  }

  public VCredito(ClienteCredito nuevoCliente) {
    cliente = nuevoCliente;
  }

  //Obtener fecha y hora actual
  
  LocalTime hora = LocalTime.now();
  LocalDate fecha = LocalDate.now();

  ClienteCredito cliente = new ClienteCredito();
  List<VCredito> ventasCredito = new ArrayList<VCredito>();

  //Metodo para mostrar el menú de ventas de crédito
  @Override
  public void menu() {


    int opcion = 0;

    do{
      try{

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1. Mostrar lista de clientes de crédito\n"
           +"2. Ver las ventas de crédito de un cliente\n"
           +"3. Ver todas las ventas de crédito\n"
           +"4. Registrar venta de crédito\n"
           +"5. Volver al menú principal\n"
           +"Seleccione la opcion a realizar\n", "Menú de opciones", 3));

        switch(opcion){
          case 1 :
            cliente.mostrar(); //Muestra los clientes de crédito registrados
            break;
          case 2 :
            //ver();  //ver las ventas de credito de un cliente
            break;
          case 3 :
            mostrar(); //mostrar todas las ventas de credito 
            break;
          case 4 :
            agregar();
            //System.out.println(""+cliente.clientes.get(1).getNombre());
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
  //Metodo para agregar una nueva venta de Crédito
  @Override
  public void agregar() {

    int tamaño = cliente.clientes.size();

    JOptionPane.showMessageDialog(null, "El tamaño de la lista clientes es: "+tamaño);

    dato = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Ingrese el ID del cliente al que desea agregar esta venta.",
    "Agregando una nueva venta a crédito",3));

    for (int i = 0; i < cliente.clientes.size(); i++) {
    
      JOptionPane.showMessageDialog(null, "Esta entrando al for"); 

      if(dato == cliente.clientes.get(i).getIDcliente()){

        IDClien = dato;
        JOptionPane.showMessageDialog(null, "Esta entrando al if");

        montoV = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Ingrese el total de esta venta :",
        "Agregando una nueva venta a crédito.", 3));
    
        idV = idV+1;
        fechaV = fecha.toString();
        horaV = hora.toString();  
  
        VCredito nuevo = new VCredito(idV, fechaV, horaV, montoV, IDClien);
  
        ventasCredito.add(nuevo);
  
        JOptionPane.showMessageDialog(null, "Hasta aqui funciona"); //
  
        JOptionPane.showMessageDialog(null, 
        "Se ha añadido una venta nombre de "
        +cliente.clientes.get(i).getNombre()+" "
        +cliente.clientes.get(i).getApellidos()+ " \nsu ID es "
        +nuevo.getIDCliente()+" "
        +cliente.clientes.get(i).getIDcliente()+" \nla fecha de la venta fue "
        +nuevo.getFechaVenta()+" a las "+nuevo.getHoraVenta()+" \nel ID de esta venta es "
        +nuevo.getIDventa());

      }else{

        JOptionPane.showMessageDialog(null,
          "El ID ingresado no existe",
          "No se encuentra el cliente",3);

      }
    }    
  }
  //Metodo para mostrar las ventas a credito realizadas
  @Override
  public void mostrar() {
    
  }
  //Metodo para mostrar las ventas de credito de un cliente especifico
  @Override
  public void ver() {

  }
}
