import javax.swing.JOptionPane;

public class Cuenta implements Acciones{

   private int monto;
   private int total = 0;
 
  //Método depositar traido de la interfaz
  public void depositar() {

    monto = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Ingrese el monto en colones que desea depositar\n\n"
      +"El total de dinero en la cuenta es de ₡ "+total,
       "Realizar un deposito", 3));

    if(monto<1){
      JOptionPane.showMessageDialog(null,
       "No se puede introducir una cantidad negativa",
       "Datos no válidos", 3);
    }else{
      total = total + monto;
      JOptionPane.showMessageDialog(null,
       "El depósito se realizó con éxito.\n\n"
      +"El total de dinero en la cuenta es de ₡ "+total);
    }
  }

  public void retirar() {
    if(total>0){
      monto = Integer.parseInt(JOptionPane.showInputDialog(null,
         "Ingrese el monto >negativo< en colones para retirar de la cuenta\n\n"
        +"El total de dinero en la cuenta es de ₡ "+total,
         "Realizar un retiro de dinero", 3));

      if(monto>0){
        JOptionPane.showMessageDialog(null,
         "No se puede introducir una cantidad positiva para un retiro,"
        +" por favor ingresa una cantidad negativa",
         "Datos no válidos", 3);
      }else{
        total = total + monto;
        JOptionPane.showMessageDialog(null,
         "El retiro se realizó con éxito.\n\n"
        +"El total de dinero restante en la cuenta es de ₡ "+total);
      }
      if(total<=0){
        JOptionPane.showMessageDialog(null,
         "Aviso. Esta cuenta presenta un balance negativo actualmente."
        +" No se permitirá realizar mas retiros hasta que haya un balance positivo.",
         "Aviso!", 3);
      }
    }else{
      JOptionPane.showMessageDialog(null,
      "No se pueden realizar retiros, la cuenta no tiene fondos");
    }
  }

  public void mostrarEstadoCuenta() {
    JOptionPane.showMessageDialog(null,
     "El total de dinero que posee la cuenta actualmente es de: ₡ "+total,
     "Balance de cuenta", 3);
  }

  
}