import javax.swing.JOptionPane;

public class BalonFAmericano extends Bolas{
  public static int tamañoCm = 27;

  @Override
  public void rodar() {
    JOptionPane.showMessageDialog(null,
     "El balón de futbol americano rueda sobre el campo");
  }
  @Override
  public void golpear() {
    JOptionPane.showMessageDialog(null,
      "La balón de futbol americano se golpea con el pie");  
  }
  @Override
    public void jugar() {
      JOptionPane.showMessageDialog(null,
       "Este balón sirve para jugar futbol americano en el campo");   
    }
  @Override
    public void describir() {
      Bolas.setColor("Cafe");
      Bolas.setMaterial("Cuero");
      Bolas.setTamanoCm(27);  
    }
}
