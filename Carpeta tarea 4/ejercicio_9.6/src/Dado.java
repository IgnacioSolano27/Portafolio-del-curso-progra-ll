import javax.swing.JOptionPane;

public class Dado implements Funciones{
  private int valorDado;
  private int valorAnterior;
  double aleatorio;

  public int getValorDado() {return valorDado;}
  public int getValorAnterior() {return valorAnterior;}
  public void setValorAnterior(int valorAnterior) {this.valorAnterior = valorAnterior;}
  public void setValorDado(int valorDado) {this.valorDado = valorDado;}
  
  public void tirarDado() {
    //1. En esta funcion el resultado siempre será 6

    /**do{
      JOptionPane.showMessageDialog(null, "El dado esta girando");
      double aleatorio = Math.random()*6+1;
      setValorDado((int)aleatorio);

    }while(getValorDado()!=6);*/

    //2. En esta funcion el resultado será mayor al ultimo resultado.

    /**double aleatorio = 0;

    if(getValorAnterior() == 6 ){
      JOptionPane.showMessageDialog(null,
       "Tu dado dió como resultado 6, no hay un número mas alto");

    }else{
      do{

        JOptionPane.showMessageDialog(null,
         "El dado esta girando");
        aleatorio = Math.random()*6+1;
        setValorDado((int)aleatorio);

      }while (aleatorio<(int)getValorAnterior() && getValorAnterior()!=6);

        JOptionPane.showMessageDialog(null, "El valor de tu dado es: "+getValorDado());
        setValorAnterior(getValorDado());
    }*/

    //3. En esta funcion se pueden lanzar dos dados [dado 1]

      JOptionPane.showMessageDialog(null, "El dado esta girando");
      aleatorio = Math.random()*6+1;
      setValorDado((int)aleatorio);

      JOptionPane.showMessageDialog(null, "El valor del dado 1 es: "+getValorDado());
      setValorAnterior(getValorDado());
  }

  public void inicializarAnterior() {

    setValorAnterior(0);

  }
}