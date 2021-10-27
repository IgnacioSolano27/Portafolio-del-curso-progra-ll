public class Acciones {

  private int semilla;
  private int aleatorio;

  public int getAleatorio() {return aleatorio;}
  public void setAleatorio(int aleatorio) {this.aleatorio = aleatorio;}
  public int getSemilla() {return semilla;}
  public void setSemilla(int semilla) {this.semilla = semilla;}

  public void calcular(){

    aleatorio = ((semilla * 25173) + 13849) % 65536; 

    semilla = aleatorio;
  }
}