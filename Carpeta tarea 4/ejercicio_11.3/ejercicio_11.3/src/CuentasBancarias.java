public class CuentasBancarias {

  private static int numeroCuenta = 0;
  private static String nombreCliente = null;
  private int balanceCuenta;
  private double intereses;

  public int getBalanceCuenta() {return balanceCuenta;}
  public static String getNombreCliente() {return nombreCliente;}
  public static int getNumeroCuenta() {return numeroCuenta;}
  public double getIntereses() {return intereses;}
  public void setBalanceCuenta(int balanceCuenta) {this.balanceCuenta = balanceCuenta;}
  public void setIntereses(double intereses) {this.intereses = intereses;}
  public static void setNumeroCuenta(int numeroCuenta) {CuentasBancarias.numeroCuenta = numeroCuenta;}
  public static void setNombreCliente(String nombreCliente) {CuentasBancarias.nombreCliente = nombreCliente;}


}
