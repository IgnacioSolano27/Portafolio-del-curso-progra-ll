package Entities;
public class Postres extends Productos {

  private String tipo;
  private String tamano;

  public String getTipo() {return tipo;}
  public String getTamano() {return tamano;}
  public void setTamano(String tamano) {this.tamano = tamano;}
  public void setTipo(String tipo) {this.tipo = tipo;}
    
  @Override
  public void ordenar(){

    setTipo("Dulce");
    setTamano("Mediano");

     System.out.println("Se ordenó un " +getNombre()
                                    + " de tipo "+getTipo()
                                    + " en tamaño "+getTamano()) ;
  }

  @Override
  public void preparar(){

    System.out.println("El postre se esta preparando");

  }

  @Override
  public void cobrar(){

    System.out.println("Se cobra un monto de: "+getPrecio());
    
  }

  @Override
  public void entregar(){
    System.out.println("Se entrega el postre a la mesa de la orden");
  }
}
