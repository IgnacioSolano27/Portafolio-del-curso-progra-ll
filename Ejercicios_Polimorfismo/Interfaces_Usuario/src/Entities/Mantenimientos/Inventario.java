package Entities.Mantenimientos;

public class Inventario extends Mantenimientos{

  @Override
  public void modificar() {
    setNombre("Lampara");
    setNumeroDatos(8);
    
    System.out.println("Se ha modificado el inventario");   
        
  }

  @Override
  public void borrar() {

    System.out.println("Se ha eliminado un producto del inventario"); 

    setNumeroDatos(getNumeroDatos()-1);

  }

  @Override
  public void mostrar() {
    
    System.out.println(
      "Se ha modificado el producto "+getNombre()
      + " ahora hay "+getNumeroDatos()+ " en inventario");
    
  }
  
  
}
