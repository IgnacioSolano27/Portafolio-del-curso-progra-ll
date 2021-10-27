import javax.swing.JOptionPane;

public class Dado2 extends Dado {
  private int valorDado2;
  
  public int getValorDado2() {return valorDado2;}
  public void setValorDado2(int valorDado) {this.valorDado2 = valorDado;}

  public void tirarDado() {

    //3. En esta funcion se pueden lanzar dos dados [dado 2]

    JOptionPane.showMessageDialog(null, "El dado esta girando");
    aleatorio = Math.random()*6+1;
    setValorDado((int)aleatorio); 

    JOptionPane.showMessageDialog(null, "El valor del dado 2 es: "+getValorDado());
    setValorAnterior(getValorDado());
  } 

  public void inicializarAnterior(){    
  }
}
