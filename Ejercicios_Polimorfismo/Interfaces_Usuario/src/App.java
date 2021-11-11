import Entities.Mantenimientos.Contrasena;
import Entities.Mantenimientos.Inventario;
import Entities.Mantenimientos.Mantenimientos;
import Entities.Procesos.Compra;
import Entities.Procesos.Procesos;
import Entities.Procesos.Registro;

public class App {
  public static void main(String[] args) throws Exception {

    Mantenimientos contrasena = new Contrasena();    

    contrasena.modificar();
    contrasena.borrar();
    contrasena.mostrar();
    System.out.println(" ");

    Mantenimientos inventario = new Inventario();

    inventario.modificar();
    inventario.borrar();
    inventario.mostrar();
    System.out.println(" ");

    Procesos registro1 = new Registro();

    registro1.agregar();
    registro1.cancelar();
    registro1.mostrar();
    System.out.println(" ");

    Procesos compra1 = new Compra();

    compra1.agregar();
    compra1.cancelar();
    compra1.mostrar();
    System.out.println(" ");
  }
}
