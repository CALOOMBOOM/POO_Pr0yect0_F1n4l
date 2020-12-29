
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
public class Acomodador extends Persona {

    public Acomodador() {
    }

    public Acomodador(String nombre, String contraseña, String cargo) {
        super(nombre, contraseña, cargo);
        this.nombre="Gustavo";
        this.contraseña="perlita16";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    /**
     *
     * @param contraseña
     */
    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
