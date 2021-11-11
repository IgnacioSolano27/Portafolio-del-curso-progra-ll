package Entities;
public class Acompañamientos extends Productos {

  private String opcion;
  private int numeroOrdenes;
  private String tamano;

  public String getOpcion() {return opcion;}
  public String getTamano() {return tamano;}
  public void setTamano(String tamano) {this.tamano = tamano;}
  public int getNumeroOrdenes() {return numeroOrdenes;}
  public void setNumeroOrdenes(int numeroOrdenes) {this.numeroOrdenes = numeroOrdenes;}
  public void setOpcion(String opcion) {this.opcion = opcion;}

  @Override
  public void ordenar(){

    setOpcion("Frito");
    setNumeroOrdenes(1);
    setTamano("Mediano");

     System.out.println("Se ordenó " +getNumeroOrdenes()+ " " +getNombre()
                                    + " de tipo "+getOpcion()
                                    + " en tamaño "+getTamano()) ;
  }

  @Override
  public void preparar(){

    System.out.println("El acompañamiento se esta preparando");

  }

  @Override
  public void cobrar(){

    System.out.println("Se cobra un monto de: "+getPrecio());
    
  }

  @Override
  public void entregar(){
    System.out.println("Se entrega el acompañamiento a la mesa de la orden");
  }
}
