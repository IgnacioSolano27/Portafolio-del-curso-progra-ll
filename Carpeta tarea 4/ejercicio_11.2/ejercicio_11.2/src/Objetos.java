public abstract class Objetos {

    private static int tamanoCm;
    private static String material;
    private static String color;
    private static String forma;
  
    public static String getColor() {return color;}
    public static String getForma() {return forma;}
    public static int getTamanoCm() {return tamanoCm;}
    public static String getMaterial() {return material;}
    public static void setForma(String forma) {Objetos.forma = forma;}
    public static void setColor(String color) {Objetos.color = color;}
    public static void setMaterial(String material) {Objetos.material = material;}
    public static void setTamanoCm(int tamanoCm) {Objetos.tamanoCm = tamanoCm;}
  
    public abstract void subir();
    public abstract void bajar();
    public abstract void lanzar();
    public abstract void describir();
  
  }