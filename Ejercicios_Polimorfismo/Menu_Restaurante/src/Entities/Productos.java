package Entities;

import Interfaces.Cobrable;
import Interfaces.Entregable;
import Interfaces.Ordenable;
import Interfaces.Preparable;

public abstract class Productos implements Ordenable,
                                           Preparable,
                                           Cobrable,
                                           Entregable{

  //atributos generales
  private String nombre;
  private int precio;

  //getters & setters
  public int getPrecio() {return precio;}
  public void setPrecio(int precio) {this.precio = precio;}
  public String getNombre() {return nombre;}
  public void setNombre(String nombre) {this.nombre = nombre;}
  
  //comportamientos
  public void preparar(){}
  public void ordenar(){}
  public void entregar(){}
  public void cobrar(){}

}