package Entities.Procesos;

public class Registro extends Procesos {

    @Override
    public void agregar() {

      setNombre("Ignacio");
      setCodigo(1228);
      System.out.println("Se ha agregado un registro");
        
    }

    @Override
    public void cancelar() {
      
      System.out.println ("Se ha cancelado el registro");
        
    }

    @Override
    public void mostrar() {
        System.out.println("Se ha registrado al cliente "+getNombre()+ " y su código es "+getCodigo());
        
    }
    
}
