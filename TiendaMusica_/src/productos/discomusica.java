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
public class discomusica extends disco{
    private String tipo;
    
    public discomusica(){
        
    }
    public discomusica(String tipo, String artista, int numsongs, String nombresong, String nombre, String codigo, float precio) {
        super(artista, numsongs, nombresong, nombre, codigo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "discomusica{"+ super.toString() + "tipo=" + tipo + '}';
    }
    

    
}
