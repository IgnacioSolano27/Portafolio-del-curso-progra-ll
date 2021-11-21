package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Interfaces.Agregable;
import Interfaces.Elegible;
import Interfaces.Mostrable;

public class VContado extends Venta implements Mostrable, Elegible, Agregable{
  
  //variables de uso local

  public String fechaV = null, horaV = null, metodoP = null, metPag = null;
  public int idV = 0;
  public double montoV = 0;

  //Constructor de una nueva venta
  public VContado(int idV, String fechaV, String horaV, double montoV, String metPag) {

    this.setIDventa(idV);
    this.setFechaVenta(fechaV);
    this.setHoraVenta(horaV);
    this.setMontoVenta(montoV);
    this.setMetodoPago(metPag);
    
  }

  public VContado() {}

  //Obtener fecha y hora actual
  
  LocalTime hora = LocalTime.now();
  LocalDate fecha = LocalDate.now();

  //lista de clientes creada en tipo Arraylist
  List<Venta> ventasContado = new ArrayList<Venta>();

  //metodo para mostrar el menu de las ventas de contado
  @Override
  public void menu() {

    int opcion = 0;

    do{
      try{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1. Ver las ventas hechas de contado\n"
           +"2. Registrar una nueva venta\n"
           +"3. Volver al menú principal\n"
           +"Seleccione la opcion a realizar\n", "Menú de opciones", 3));

        switch(opcion){
          case 1 :
            mostrar();
            break;
          case 2 :
            agregar();
            break;
          case 3 :
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
    }while(opcion != 3);

  }

  //Metodo para agregar una nueva venta de contado
  @Override
  public void agregar() {

    idV = idV+1;
    fechaV = fecha.toString();
    horaV = hora.toString();

    montoV = Double.parseDouble(JOptionPane.showInputDialog(null,
     "Ingrese el total de la compra.",
     "Registrando una nueva compra de contado", 3));

    int eleccionMetodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                         "1. Efectivo\n"
                        +"2. Tarjeta\n"
                        +"Elija su método de pago: "));

    if(eleccionMetodo == 1){
      metPag = "Efectivo";
    }else if(eleccionMetodo == 2){
      metPag = "Tarjeta";
    }
    
    Venta nuevo = new VContado(idV, fechaV, horaV, montoV, metPag);

    ventasContado.add(nuevo); //se agrega la nueva venta de contado

    JOptionPane.showMessageDialog(null, "Se ha creado la venta #"+nuevo.getIDventa()+" por un monto de "+nuevo.getMontoVenta());
    
  }
   
  //Metodo para mostrar las ventas de contado realizadas
  @Override
  public void mostrar() {
    if(idV > 0){

      String cadena = "";
      for (int i = 0; i<ventasContado.size(); i++){
        cadena = cadena   +"ID de venta de contado ="+ventasContado.get(i).getIDventa()+"\n"
                          +"Fecha de la venta : "+ventasContado.get(i).getFechaVenta()+"\n"
                          +"Hora de la venta: "+ventasContado.get(i).getHoraVenta()+"\n"
                          +"Total de esta venta: "+ventasContado.get(i).getMontoVenta()+".\n"
                          +"Pagado mediante : "+ventasContado.get(i).getMetodoPago()+"\n"
                          + "-------------------------------------------------------------------------------------\n";
      }
      JOptionPane.showMessageDialog(null, cadena);
    }else{
      JOptionPane.showMessageDialog(null, 
       "Lista de ventas vacía",
       "No hay datos de ventas de contado", 3 );
    } 
  }
 
}
