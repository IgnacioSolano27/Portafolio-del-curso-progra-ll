public class Persona {
  private int id = 8;  
  String nombre;
  String apellido;
  short edad;

  void setId (int valor){
      if (id <= 0) {
        id = valor;
      }
  }
  public int getId () {return id;}
  
  public void saludar (){
    System
      .out
      .println(
      mensaje());
  }
  protected String imprimir () {
      return "Soy " + nombre;
  }
  private String mensaje (){
      return "Hola me llamo " + nombre
      + "Y mi ID es " + id;
  }
}