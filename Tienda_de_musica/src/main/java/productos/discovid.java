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
   class discovid extends disco{
    private float duraciont;
    public discovid(){
        
    }
    public discovid(float duraciont, String artista, int numsongs, String nombresong, String nombre, String codigo, float precio) {
        super(artista, numsongs, nombresong, nombre, codigo, precio);
        this.duraciont = duraciont;
    }

    public float getDuraciont() {
        return duraciont;
    }

    public void setDuraciont(float duraciont) {
        this.duraciont = duraciont;
    }

    @Override
    public String toString() {
        return super.toString()+ "discovid{" + "duraciont=" + duraciont + '}';
    }
    
    
}
