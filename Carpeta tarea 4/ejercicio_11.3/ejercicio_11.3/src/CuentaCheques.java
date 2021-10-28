import javax.swing.JOptionPane;

public class CuentaCheques extends CuentasBancarias
                           implements Acciones {

  @Override
  public void depositar(int monto) {
    if(monto<0){
        JOptionPane.showMessageDialog(null,
         "No puedes depositar un valor negativo,",
         "Cantidad no válida", 3);
      }else{
        setBalanceCuenta(getBalanceCuenta()+monto);
        JOptionPane.showMessageDialog(null,
         "El depósito se realizó con éxito\n"
         +"El balance de tu cuenta es de: "+getBalanceCuenta(),
         "Realizando un depósito de cuenta cheques", 3);
      } 
  }
  @Override
  public void retirar(int monto) {
    setBalanceCuenta(getBalanceCuenta()-monto);
    JOptionPane.showMessageDialog(null,
     "El retiro se realizó con éxito\n"
     +"El balance de tu cuenta es de: "+getBalanceCuenta(),
      "Realizando un retiro de cuenta cheques", 3);   
  } 
  @Override
  public void mostrarBalance() {   
    JOptionPane.showMessageDialog(null,
     "Nombre de cliente: "+getNombreCliente()+" \n"
    +"Numero de cuenta: "+getNumeroCuenta()+"\n"
    +"El balance de tu cuenta es: "+getBalanceCuenta());
  }
  
}
