package Entidades;

public abstract class Venta {

  //atributos de la clase venta
  private int IDventa = 0;
  private String fechaVenta = null;
  private String horaVenta = null;
  private double montoVenta = 0;
  private String metodoPago = null;
  private int IDCliente = 0;

  public Venta(){}

  //Getters & setters
  public int getIDCliente() {return IDCliente;}
  public void setIDCliente(int iDCliente) {this.IDCliente = iDCliente;}
  public String getMetodoPago() {return metodoPago;}
  public void setMetodoPago(String metodoPago) {this.metodoPago = metodoPago;}
  public int getIDventa() {return IDventa;}
  public String getHoraVenta() {return horaVenta;}
  public void setHoraVenta(String horaVenta) {this.horaVenta = horaVenta;}
  public String getFechaVenta() {return fechaVenta;}
  public void setFechaVenta(String fechaVenta) {this.fechaVenta = fechaVenta;}
  public double getMontoVenta() {return montoVenta;}
  public void setMontoVenta(double montoVenta) {this.montoVenta = montoVenta;}
  public void setIDventa(int iDventa) {this.IDventa = iDventa;}
  
}
