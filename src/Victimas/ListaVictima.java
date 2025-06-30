
package Victimas;
import Listas.Lista;

/**
 *
 * @author Giu
 */
public class ListaVictima implements Lista<Victima> {
    
     private  Victima victima[];

    public ListaVictima(Victima[] Victima) {
        this.victima = new Victima[100];
    }
     

    @Override
    public Victima encontrar(Object id) {
        int max= victima.length;
        for (int i = 0; i < max; i++) {
            if(victima[i] == id){
                return victima[i];
                                }
                                      } 
        return null;
    }

    @Override
    public boolean agregar(Victima Victima) {
        int max=victima.length;
        for (int i=0;i<max;i++){
            if(victima[i]==null){
                victima[i]=Victima;
                return true;
                                }
                               }
        return false;
    }
    

    @Override
    public boolean eliminar(Victima Victima) {
            int max=victima.length;
        for (int i=0;i<max;i++){
            if(victima[i]==Victima){
                victima[i]=null;
                return true;
                                   }
                               }
        return false; 
    }

    @Override
    public void mostrarTodos() {
       for (int i = 0; i < victima.length; i++) {
        if (victima[i] != null) {
            System.out.println("- " + victima[i]);
                                }                        
                                                 }
}
  
}
