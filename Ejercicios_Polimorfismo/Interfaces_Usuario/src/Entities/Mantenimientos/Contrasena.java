package Entities.Mantenimientos;

public class Contrasena extends Mantenimientos{

  @Override
  public void modificar() {
    
    setNombre("Ignacio");
    setNumeroDatos(1);
    System.out.println("Se ha modificado la contraseña");    

  }

  @Override
  public void borrar() {

    System.out.println("Se ha eliminado la contraseña");

    setNumeroDatos(getNumeroDatos()-1);
    
  }

  @Override
  public void mostrar() {
    
    System.out.println(
      "Se ha modificado la contraseña de "+getNombre()
      + " numero de contraseñas a su nombre " +getNumeroDatos());
    
  }
    
}
