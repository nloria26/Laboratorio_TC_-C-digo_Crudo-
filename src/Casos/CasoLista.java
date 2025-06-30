/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;
import Listas.Lista;
/**
 *
 * @author UTN
 */
public class CasoLista implements Lista<Caso> {

 private Caso caso[];
 private int contador=0;

    public CasoLista(Caso[] caso) {
        this.caso = new Caso[100];
    }

   
   

    @Override
    public Caso encontrar(Object id) {
        int max= caso.length;
        for (int i = 0; i < max; i++) {
            if(caso[i] == id){
                return caso[i];
                                }
                                      } 
        return null;
    }

    @Override
    public boolean agregar(Caso Caso) {
              int max=caso.length;
        for (int i=0;i<max;i++){
            if(caso[i]==null){
                caso[i]=Caso;
                return true;
                                }
                               }
        return false;
        
    }
    @Override
    public boolean eliminar(Caso Caso) {
                  int max=caso.length;
        for (int i=0;i<max;i++){
            if(caso[i]==Caso){
                caso[i]=null;
                return true;
                                   }
                               }
        return false;   
    }

    @Override
    public void mostrarTodos() {
             for (int i = 0; i < caso.length; i++) {
        if (caso[i] != null) {
            System.out.println("- " + caso[i]);
    }
             } 
    }
    
    public static int cantidadPorPrioridad(String prioridad) {
        int cantidad = 0;
        for (int i = 0; i < contador; i++) {
            if (caso[i].getPrioridad().equalsIgnoreCase(prioridad)) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
    

