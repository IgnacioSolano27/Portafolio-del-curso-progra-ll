package Entities.Procesos;

public class Compra extends Procesos {

    @Override
    public void agregar() {

      setNombre("Lampara");
      setCodigo(57281542);
      System.out.println("El producto se ha añadido al carrito");
        
    }

    @Override
    public void cancelar() {
        
      System.out.println("La compra se ha cancelado");
        
    }

    @Override
    public void mostrar() {
       System.out.println("Se ha comprado una "+getNombre()+ " con código "+getCodigo());
        
    }
    
}
