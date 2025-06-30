/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.TrabajadorSocial;

import Personas.Persona;

/**
 *
 * @author Dylan
 */
public class TrabajadorSocial extends Persona{
   

    protected String canton;


    public void setCanton(String canton) {
        this.canton = canton;
    }

    public TrabajadorSocial(String canton, String cedula, String nombre, String correo, String telefono) {
        super(cedula, nombre, correo, telefono);
        this.canton = canton;
    }

   

    @Override
    public String toString() {
        return "TrabajadorSocial{" + "cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", canton=" + canton + '}';
    }
    
}//Llave final//