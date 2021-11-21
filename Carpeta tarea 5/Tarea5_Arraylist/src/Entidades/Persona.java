package Entidades;

public abstract class Persona{

  // Atributos de cada cliente 

  private String nombre = "";
  private String apellidos = "";
  private int telefono = 0;
  private String correo = "";
  private int IDcliente = 0;

  //Cosntructor de un nuevo cliente

  public Persona(String nomb, String ape, int tel, String corr, int ID) {
    this.nombre = nomb;
    this.apellidos = ape;
    this.telefono = tel;
    this.correo = corr;
    this.IDcliente = ID;
  }
  public Persona(){}

  //Getters & Setters

  public int getIDcliente() {return IDcliente;}
  public void setIDcliente(int iDcliente) {this.IDcliente = iDcliente;}
  public String getNombre() {return nombre;}
  public String getCorreo() {return correo;}
  public void setCorreo(String correo) {this.correo = correo;}
  public int getTelefono() {return telefono;}
  public void setTelefono(int telefono) {this.telefono = telefono;}
  public String getApellidos() {return apellidos;}
  public void setApellidos(String apellidos) {this.apellidos = apellidos;}
  public void setNombre(String nombre) {this.nombre = nombre;}   
}