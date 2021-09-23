public class App {
    public static void main(String[] args) throws Exception {
      int var = 1;
      Persona estudiante = new Persona();
      estudiante.setId (1);
      estudiante.nombre = "John";
      estudiante.apellido = "Doe";
      estudiante.edad = 25;
      estudiante.setId (2);
      estudiante.saludar();

    }
}