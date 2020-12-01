/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author alex_
 */
public class Persona {

    /**
     *
     */
    public String nombre;
    public  String contraseña;
    private String cargo;
    
    public Persona(){
        
    }

    public Persona(String nombre, String contraseña, String cargo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", cargo=" + cargo + '}';
    }
    
}
