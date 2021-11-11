package Entities;
public class Carnes extends Productos{

  private double peso = 0;
  private String termino = " ";
   
  public double getPeso() {return peso;}
  public String getTermino() {return termino;}
  public void setTermino(String termino) {this.termino = termino;}
  public void setPeso(double peso) {this.peso = peso;}

  @Override
  public void ordenar(){

    setPeso(0.84d);
    setTermino("Medio");

     System.out.println("Se ordenó una nueva carne "+getNombre()
                                    + " con peso "+getPeso()
                                    + " en termino "+getTermino()) ;
  }

  @Override
  public void preparar(){

    System.out.println("La carne se esta preparando");

  }

  @Override
  public void cobrar(){

    System.out.println("Se cobra un monto de: "+getPrecio());

  }

  @Override
  public void entregar(){
    System.out.println("Se entrega la carne a la mesa de la orden");
  }


}
