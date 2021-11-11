import Entities.Acompañamientos;
import Entities.Carnes;
import Entities.Postres;
import Entities.Productos;

public class App {
  public static void main(String[] args) throws Exception {

  Productos carne1 = new Carnes();

  carne1.setNombre("Beefsteak");
  carne1.setPrecio(2500);
  carne1.ordenar();
  carne1.preparar();
  carne1.cobrar();
  carne1.entregar();
  System.out.println ("");

  Productos acomp1 = new Acompañamientos();
  
  acomp1.setNombre("Papas fritas");
  acomp1.setPrecio(1200);
  acomp1.ordenar();
  acomp1.preparar();
  acomp1.cobrar();
  acomp1.entregar();
  System.out.println ("");

  Productos postre1 = new Postres();

  postre1.setNombre("Pastel");
  postre1.setPrecio(1200);
  postre1.ordenar();
  postre1.preparar();
  postre1.cobrar();
  postre1.entregar();
  System.out.println ("");

  }
}
