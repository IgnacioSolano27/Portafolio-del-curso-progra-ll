package paquete1;

public class clase1 {
//encapsulamiento
// al ser privado solo son visibles para su propia clase 
  private int edad;    
  private String nombre;

//setters y getters 
//
//set significa establecer entonces vamos a establecer un valor al atributo
 
//este metodo me permite acceder a edad desde otro metodo y establecerle un valor 
  public void SetEdad(int edad){
    this.edad = edad;
  }
//get significa obtener/mostrar
//Este metodo me permite mostrar el valor de edad en otra clase
  public int GetEdad(){
    return edad;
  }
  //getter
  public String getNombre() {
    return nombre;
  }
  //setter
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
