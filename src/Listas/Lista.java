/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author UTN
 */
public interface Lista <T> {
    
     public T encontrar(Object id);
     
     public boolean agregar (T t);

     public boolean eliminar(T t);
    
     public void mostrarTodos();
}
