import javax.swing.JOptionPane;

public class Funciones extends Tanteador{
  
  public void Inicializar(){
    setPuntuación(0);
    JOptionPane.showMessageDialog(null,
     "El marcador se ha iniciado en cero",
     "Inicializando maracador",3);
  }
  public void aumentar(){
    if(getPuntuación()>=0){
      setPuntuación(getPuntuación()+1);
      JOptionPane.showMessageDialog(null,
       "El marcador ha aumentado un punto.",
       "Aumentando marcador.",3);
    }else{
      JOptionPane.showMessageDialog(null,
       "No se ha inicializado el marcador",
       "Marcador no creado", 3);
    }
  }
  public void disminuir(){
    if(getPuntuación()>=1){
      setPuntuación(getPuntuación()-1); 
      JOptionPane.showMessageDialog(null,
       "El marcador ha disminuido un punto.",
       "Disminuyendo marcador.",3); 
    }else{
      JOptionPane.showMessageDialog(null,
       "No hay puntos en el marcador",
       "No se puede disminuir", 3);
    }    
  }
  public void mostrar(){
    if(getPuntuación()>=0){
      JOptionPane.showMessageDialog(null,
      "El marcador actual tiene un total de " +getPuntuación()+ " puntos.",
      "Puntos de la partida", 3);
    }else{
      JOptionPane.showMessageDialog(null,
       "No hay ningún marcador activo",
       "Marcador no inicializado", 3);
    }
  }

}
