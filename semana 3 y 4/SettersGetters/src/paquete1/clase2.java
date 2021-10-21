package paquete1;

public class clase2 {  
  public static void main (String[] args){
    clase1 objeto1 = new clase1();

    //al ser privado no puedo acceder a el de esta forma
    //objeto1.edad = 1000;
    //debe ser de esta forma y asi puedo darle un valor 
    objeto1.SetEdad(10);
    //de igual manera para poder mostrar este valor necesito llamarlo desde get
    System.out.print("El valor de edad es: " +objeto1.GetEdad()+"\n");
    
    objeto1.setNombre("Ignacio");
    System.out.print("El nombre es: " +objeto1.getNombre());
  }
}
