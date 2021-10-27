import javax.swing.JOptionPane;

public class BolaBillar extends Bolas{

  @Override
  public void rodar() {
    JOptionPane.showMessageDialog(null,
      "La bola de billar rueda sobre la mesa de billar");
  }
  @Override  
  public void golpear() {
    JOptionPane.showMessageDialog(null,
      "La bola de billar se golpea con el taco");  
  }
  @Override
  public void jugar() {
    JOptionPane.showMessageDialog(null,
      "Esta bola sirve para jugar sobre una mesa de billar");   
  }
  @Override
    public void describir() {
      Bolas.setColor("Blanca");
      Bolas.setMaterial("Resina");
      Bolas.setTamanoCm(6);  
    } 
}