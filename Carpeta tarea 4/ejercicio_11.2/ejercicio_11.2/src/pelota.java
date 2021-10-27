import javax.swing.JOptionPane;

public class pelota extends Objetos{
  @Override
  public void subir() {
    JOptionPane.showMessageDialog(null,
      "La pelota puede subir al lanzarla hacia arriba");
  }
  @Override  
  public void bajar() {
    JOptionPane.showMessageDialog(null,
      "La pelota baja despues de ser lanzada hacia arriba");  
  }
  @Override
  public void lanzar() {
    JOptionPane.showMessageDialog(null,
      "Esta pelota puede ser lanzada como parte de un juego");   
  }
  @Override
  public void describir() {
    Objetos.setColor("Verde");
    Objetos.setMaterial("Plástico");
    Objetos.setTamanoCm(15);
    Objetos.setForma("Redonda");
  } 
}
