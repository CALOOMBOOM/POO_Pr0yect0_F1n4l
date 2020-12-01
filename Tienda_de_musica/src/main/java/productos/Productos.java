/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author alex_
 */
public class Productos {
    private String nombreprod;
    private String codigo;
    private float precio;
    
    /**
     * Constructor
     * @param nombre
     * @param codigo
     * @param precio
     */
    public Productos(String nombre,String codigo,float precio){
        this.nombreprod=nombre;
        this.codigo=codigo;
        this.precio=precio;
    }
    public Productos(){
    
}

    public String getNombreprod() {
        return nombreprod;
    }

    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }

    /**
     *
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreprod=" + nombreprod + ", codigo=" + codigo + ", precio=" + precio + '}';
    }
    
    
}
