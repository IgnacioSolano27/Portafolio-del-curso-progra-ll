import javax.swing.JOptionPane;

public class Hija extends Padre{

  public void saludar(){
    JOptionPane.showMessageDialog(null, "Hola, yo soy la hija");
    super.saludar();
  }
}