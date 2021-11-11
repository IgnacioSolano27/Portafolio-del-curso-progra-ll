package Entities.Mantenimientos;

import Interfaces.Modificable;
import Interfaces.Mostrable;
import Interfaces.Borrable;

public abstract class Mantenimientos implements Modificable, Borrable, Mostrable{

  private int numeroDatos = 0;
  private String nombre = "";

  public int getNumeroDatos() {return numeroDatos;}
  public String getNombre() {return nombre;}
  public void setNombre(String nombre) {this.nombre = nombre;}
  public void setNumeroDatos(int numeroDatos) {this.numeroDatos = numeroDatos;}

}