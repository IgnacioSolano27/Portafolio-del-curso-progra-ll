import javax.swing.JOptionPane;

public class naveEspacial extends Objetos{

  @Override
  public void subir() {
    JOptionPane.showMessageDialog(null,
      "La nave espacial puede subir al espacio");
  }
  @Override  
  public void bajar() {
    JOptionPane.showMessageDialog(null,
      "La nave espacial puede bajar para volver");  
  }
  @Override
  public void lanzar() {
    JOptionPane.showMessageDialog(null,
      "El cohete se puede lanzar al espacio");   
  }
  @Override
  public void describir() {
    Objetos.setColor("Blanco");
    Objetos.setMaterial("Hierro");
    Objetos.setTamanoCm(15000); 
    Objetos.setForma("Ovalado"); 
  }   
}
