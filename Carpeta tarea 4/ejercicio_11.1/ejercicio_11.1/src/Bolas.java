public abstract class Bolas {

  private static int tamanoCm;
  private static String material;
  private static String color;

  public static String getColor() {return color;}
  public static void setColor(String color) {Bolas.color = color;}
  public static String getMaterial() {return material;}
  public static void setMaterial(String material) {Bolas.material = material;}
  public static int getTamanoCm() {return tamanoCm;}
  public static void setTamanoCm(int tamanoCm) {Bolas.tamanoCm = tamanoCm;}

  public abstract void rodar();
  public abstract void golpear();
  public abstract void jugar();
  public abstract void describir();

}
