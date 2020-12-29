/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import productos.*;
import empleados.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class elmain {
        public static void main(String[] args) {
            Productos p;
            Scanner entrada = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            boolean salir=false;
            int opcion; //Opcion de la acción
            int puesto=0;
            Inventario inventariox=new Inventario(10);
            /*
            Clasificacion de puestos
            0--Sin puesto
            1--Gerente
                Puede añadir productos, vender, acomodar y poner musica
            2--Vendedor
                Puede añadir productos, vender y poner musica
            3--Acomodador
                Puede acomodar y poner musica
            */
            inventariox=Bdatos();
            
            boolean salir1=false;
            while (!salir1){ //mientras salir sea false, se repetirá el menú una y otra vez
                System.out.println("Escoja una opción");
                System.out.println("1. Login");
                System.out.println("2. Salir");
                try{   
                    opcion=entrada.nextInt();
                    switch(opcion){
                        case 1:
                            puesto=login();
                            System.out.println(puesto);
                            if (puesto!=0){
                                salir1=true;
                            }
                            break;
                        case 2:
                            salir1=true;
                    }
                }catch(InputMismatchException e){
                    System.out.println("Debe ingresar un numero...");
                    entrada.next();
                }
            }
            
            /*
            Parte Menu de opciones
            */
            if (puesto!=0){
                clearScreen();
                while (!salir){
                    menu1();
                    try{
                        System.out.println("Por favor escoja una opción (numero): ");
                        opcion=entrada.nextInt();
                        switch(opcion){
                            case 1:
                                if (puesto==3){
                                    System.out.println("Lo lamento, no cuenta con los permisos necesarios para vender ");
                                    break;
                                }
                                System.out.println("----------Vender.---------");
                                break;
                            case 2:
                                if (puesto==2){
                                    System.out.println("Lo lamento, no cuenta con los permisos para acomodar productos ");
                                    break;
                                }
                                System.out.println("---------Acomodar----------");
                                break;
                            case 3:
                                System.out.println("-------Poner musica---------");
                            case 4:
                                opcion=entrada.nextInt();
                                switch (opcion){
                                    case 1:
                                        anadirdicmusic(inventariox);
                                        break;
                                    case 2:
                                        anadirdirvideo(inventariox);
                                        break;
                                    case 3:
                                        break;
                                        
                                }
                            case 5:
                            System.out.println("Deme el nombre del disco");
                            String nombre;
                            nombre=entrada2.nextLine();
                            inventariox.busquedapornombre(nombre);
                        } 
                    }catch(InputMismatchException e){
                        System.out.println("Debe ingresar un numero...");
                        entrada.next();
                    }
                }}
            
        }
        public static void clearScreen() {  
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }  
        
        public static String aleatorio(){
            int number;
            String finalNumber = "";
            number = (int)(10000 * Math.random());
            finalNumber = "" + number;
            for(int i = finalNumber.length(); i < 4; i++){
                finalNumber = "0" + finalNumber;
            }

            return finalNumber;
        }
        
        public static void menu1(){
                System.out.println("Menu gerencial");
                System.out.println("1. Vender");
                System.out.println("2. Acomodar");
                System.out.println("3. Poner musica");
                System.out.println("4. Añadir producto");
                System.out.println("5. Buscar ");
        }
        
        public static void menuanadir(){
            System.out.println("------------------Añadir producto----------------");
            System.out.println("1.  Añadir disco de musica");
            System.out.println("2.  Añadir disco de video");
            System.out.println("3.  Añadir audifonos");
            System.out.println("Escoja una opcion -- (numero)");
        }

    /**
     *
     * @param inventariox
     */
        public static void anadirdicmusic(Inventario inventariox){
            discomusica a;
            Scanner entrada = new Scanner(System.in);
            a=new discomusica();
            System.out.println("Deme el nombre del disco: ");
            String lector;
            lector=entrada.nextLine();
            a.setNombreprod(lector);
            String codigo=elmain.aleatorio();
            a.setCodigo(codigo);
            System.out.println(a);
            System.out.println("Deme el artista del disco ..");
            lector=entrada.nextLine();
            
            // Aqui poner los demás (deme el nombre) etc
            a.setArtista(lector);
            inventariox.anadirproduc(a);
                                    
        }

    /**
     *
     * @param inventariox
     */
    public static void anadirdirvideo(Inventario inventariox){
            Productos a;
            Scanner entrada = new Scanner(System.in);
            a=new discomusica();
            System.out.println("Deme el nombre del disco: ");
            String lector;
            lector=entrada.nextLine();
            a.setNombreprod(lector);
            String codigo=elmain.aleatorio();
            a.setCodigo(codigo);
            System.out.println(a);
            inventariox.anadirproduc(a);
                                    
        }
    public static void anadiraudif(Inventario inventariox){
            audifonos a;
            Scanner entrada = new Scanner(System.in);
            a=new audifonos();
            System.out.println("Deme el nombre del disco: ");
            String lector;
                                    
        }
        
        
        public static int login(){
            int puesto=0;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Deme su nombre de usuario ");
            String nombre=entrada.nextLine();
            System.out.println("Deme su contraseña ");
            String contrasena=entrada.nextLine();
            
            //Esta será una demo de como funcionaría el login solo con tres usuarios predefinidos.
            Persona a,b,c;
            a=new Gerente();
            a.setNombre("Raul");
            a.setContraseña("lola");
            
            b=new Acomodador();
            b.setNombre("Rodirgo Molina");
            b.setContraseña("picara1234");
            
            c=new Trabajador();
            c.setNombre("Jose Diaz");
            c.setContraseña("fortnite4ever");
            
            if (nombre.equals(a.getNombre())){
                System.out.println("Entró");
                if(contrasena.equals(a.getContraseña())){
                    puesto=1;
                    return puesto;
                }
            }else if(nombre.equals(b.getNombre())){
                if (contrasena.equals(b.getContraseña())){
                    puesto=3;
                    return puesto;
                }
            }else if(nombre.equals(c.getNombre())){
                if (contrasena.equals(c.getContraseña())){
                    puesto=2;
                    return puesto;
                }
            }else{
                System.out.println("Usuario inexistente ");
                
            }
            
            if (puesto!=0){
                System.out.println("Login exitoso ");
            }
        return puesto;
        }
        
      public static Inventario Bdatos(){
          Productos p;
          Inventario inventariox=new Inventario();
          String aleat=aleatorio();
          p=new discomusica("Disco de musica","Arctic Monkeys",18,"One Point Perspective","tranquility base hotel & casino ",aleat,450);
          inventariox.anadirproduc(p);
          
          return inventariox;
      }
      
      public static void vender(Inventario inventariox){
        
        Scanner entrada = new Scanner(System.in);
        boolean salir=false;
        int opcion=0;
        Productos a;
        ticket ticket=new ticket(10);
        while(!salir){
        try{
            System.out.println("Elija una opción: ");
            System.out.println("1. Agregar producto a la cesta ");
            System.out.println("2. Listar recibo ");
            System.out.println("3. Imprimir recibo ");

            opcion=entrada.nextInt();
            switch(opcion){
                    case 1:
                        System.out.println("Ingrese el producto--");
                        System.out.println("1.  Por nombre \n 2.    Por codigo \n Digite el numero de la opcion: ");
                        int bandera=entrada.nextInt();
                        if (bandera==1){
                           String nombre=entrada.nextLine();
                           if(!inventariox.busquedapornombre(nombre)){ //busca si el producto se encuentra añadido al inventario 
                               ticket.anadirproduc(inventariox.regresarconnom(nombre));
                           }
                        }else if(bandera==2){
                            String codigo=entrada.nextLine();
                            if (!inventariox.busquedaporcodigo(codigo)){
                               ticket.anadirproduc(inventariox.regresarconcod(codigo));
                            }
                        }
                       break;
                    case 2:
                        System.out.println("Lista en pantalla ");
                        ticket.lista_cont_pant();
                        break;
                    case 3:
                        ticket.imprimirticket();
                        salir=true;
                        break;
                }
            
            
        }catch(InputMismatchException e){
            System.out.println("Debe ingresar un numero...");
            entrada.next();
        }
      }   
      }
}