import javax.swing.JOptionPane;

public class CuentaAhorro extends CuentasBancarias
                          implements Acciones{

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
       "Realizando un depósito de cuenta ahorros", 3);
    }
  }

  @Override
  public void retirar(int monto) {
    if(monto>getBalanceCuenta()){
      JOptionPane.showMessageDialog(null, "La cantidad rebasa tus fondos,"
       +" ingresa una cantidad mas pequeña\n"
       +"EL monto disponible de tu cuenta en este momento es: "+getBalanceCuenta(),
       "Fondos insuficientes", 3);
    }else{
      setBalanceCuenta(getBalanceCuenta()-monto);
      JOptionPane.showMessageDialog(null,
       "El retiro se realizó con éxito\n"
       +"El balance de tu cuenta es de: "+getBalanceCuenta(),
       "Realizando un retiro de cuenta ahorros", 3);
    }
  }

  @Override
  public void mostrarBalance() {

    if(getBalanceCuenta()>0){
      calcularInteres();
      JOptionPane.showMessageDialog(null,
      "Nombre de cliente: "+getNombreCliente()+" \n"
      +"Numero de cuenta: "+getNumeroCuenta()+"\n"
      +"\nEl balance de tu cuenta es: "+getBalanceCuenta()+"\n"
      +"Los intereses que este monto ganó mensualmente son: "+getIntereses()+"\n"
      +"El balance de la cuenta mas el interés mensual es de: "+(getIntereses()+getBalanceCuenta()));
    
    }else{
    JOptionPane.showMessageDialog(null, "La cuenta actualmente está vacía");
    }
  }

  public void calcularInteres(){

    setIntereses(getBalanceCuenta()*0.03);
    
  }   
  
}
