public class Rol extends Entidad implements Imprimible{

  public int getId(){return this.id;}  
  public String getNombre(){return this.nombre;}
  public void setId(int valor){this.id = valor;}
  public void setNombre (String valor){this.nombre = valor;}
  @Override
  public String imprimir() {
    return "ID: "+Integer.toString(this.id)+ " ROL: "+ this.nombre;
  }
  
}

