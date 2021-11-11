package Entities.Procesos;

import Interfaces.Agregable;
import Interfaces.Cancelable;
import Interfaces.Mostrable;

public abstract class Procesos implements Agregable, Cancelable, Mostrable {
  
  private String nombre = "";
  private int codigo = 0;

  public String getNombre() {return nombre;}
  public int getCodigo() {return codigo;}
  public void setCodigo(int codigo) {this.codigo = codigo;}
  public void setNombre(String nombre) { this.nombre = nombre;}

}
