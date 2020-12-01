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
public class Gerente extends Persona {

    public Gerente() {
    }

    public Gerente(String nombre, String contraseña, String cargo) {
        super(nombre, contraseña, cargo);

        this.nombre=nombre;
        this.contraseña=contraseña;
    }

}
