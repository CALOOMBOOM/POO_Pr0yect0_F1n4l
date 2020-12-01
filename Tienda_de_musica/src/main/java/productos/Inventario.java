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
public class Inventario {
    private Productos[] estanteria;
    
    public Inventario(){
        this.estanteria=new Productos[18];  //Numero de productos posibles
    }
    public Inventario(int tamanio){
        this.estanteria=new Productos[tamanio];
    }
    
    public void anadirproduc(Productos a){
        if(productoexistente(a)){
            System.out.println("Ya se encuentra añadido un producto con ese nombre...");
        }else if(estanteriallena()){
            System.out.println("Lo lamento, no contamos con más espacio para añadir productos");
        }
        else{
            boolean encontrado= false;
            for (int i=0;i<estanteria.length && !encontrado;i++){
                if (estanteria[i]==null){
                    estanteria[i]=a;
                    encontrado=true;
                }  
            }
            
            if (encontrado){
                System.out.println("Hemos podido añadir el producto con exito");
            }
            else{
                System.out.println("Ha ocurrido un error al añadir el producto...");
            }
        }
        
    }
    public boolean productoexistente(Productos a){
        for (int i=0;i<estanteria.length; i++){
            //Checo los nulos y verifico que el contacto no sea el mismo
            if (estanteria[i] !=null && a.equals(i)){ //equals nos permite comparar una cadena de texto con un objetos
                   return true;
            }
        }
        return false;
    }
    public boolean estanteriallena(){
        for (int i=0; i<estanteria.length;i++){
        if (estanteria[i]==null){
            return false; //significa que la estanteria no está llena
        }
        }
        return true; //significa que la estantería está llena
    }
    public int espaciosvacios(){
        int contadoresp=0;
        for (int i=0; i<estanteria.length;i++){
            if (estanteria[i]==null){
                contadoresp++;
            }
        }
        return contadoresp;
    }
    
    public void lista_cont_pant(){
        if (espaciosvacios() == estanteria.length){
            System.out.println("No hay productos registrados");
        }
        else{
           for (int i=0; i<estanteria.length;i++) {
               if (estanteria[i] != null){
                   System.out.println(estanteria[i]);
               }
           }
        } 
    }
    public void busquedapornombre(String nombre){
        boolean encontrado=false;
        for (int i =0; i<estanteria.length && !encontrado;i++){
            if (estanteria[i]!=null && estanteria[i].getNombreprod().trim().equalsIgnoreCase(nombre.trim())){ //*
                System.out.println("El producto fue encontrado: " + estanteria[i]);
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("El producto no fue encontrado :(    ");
        }
    }
    
}
