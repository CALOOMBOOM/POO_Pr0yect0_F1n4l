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
    class disco extends Productos {
    private String artista;
    private int numsongs;
    private String nombresong;
    
    disco(){
        
    }
    public disco(String artista, int numsongs, String nombresong, String nombre, String codigo, float precio) {
        super(nombre, codigo, precio);
        this.artista = artista;
        this.numsongs = numsongs;
        this.nombresong = nombresong;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setNumsongs(int numsongs) {
        this.numsongs = numsongs;
    }

    public void setNombresong(String nombresong) {
        this.nombresong = nombresong;
    }

  
    public String getArtista() {
        return artista;
    }

    public int getNumsongs() {
        return numsongs;
    }

    @Override
    public String toString() {
        return super.toString()+ "disco{" + "artista=" + artista + ", numsongs=" + numsongs + '}';
    }
    
}
