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
            Scanner entrada2=new Scanner(System.in);
            boolean salir=false;
            int opcion; //Opcion de la acción
   
            /*
            Parte Login
            */
            
            //Tratamos de generar una base de datos base
            Inventario inventariox=Bdatos();
            
            
            boolean salir1=false;
            while (!salir){
                System.out.println("Escoja una opción");
                System.out.println("1. Login");
                System.out.println("2. Salir");
                try{   
                    opcion=entrada.nextInt();
                    switch(opcion){
                        case 1:
                            
                            
                            int puesto=login();
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
            Parte Menu de opciones:
            
            */
            while (!salir){
                menu1();
                try{
                    System.out.println("Por favor escoja una opción (numero): ");
                    opcion=entrada.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("----------Vender.---------");
                            break;
                        case 2:
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
                                    break;
                                case 3:
                                    break;
                                    
                            }
                    }
                    
                    
                }catch(InputMismatchException e){
                    System.out.println("Debe ingresar un numero...");
                    entrada.next();
                    
                }
                
                
            }
            
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
        
        public static int login(){
            Scanner entrada2=new Scanner(System.in);
            System.out.println("Deme su nombre de usuario -");
            String usuario;
            usuario=entrada2.nextLine();
            System.out.println("Deme su contraseña -");
            String contrasena;
            contrasena=entrada2.nextLine();
            int puesto=0;
            Persona n;
            
            n=new Gerente();
            n.setNombre("Mariano");
            n.setContraseña("gauss3");
            String a=n.getNombre();
            System.out.println(a);
            if (usuario.equals(n.getNombre())){
                System.out.println("Entró ");
                if (usuario.equals(n.getContraseña())){
                    System.out.println("Acceso correcto -");
                    puesto=1;
                    return puesto;
                }else{
                    System.out.println("Contraseña incorrecta ");
                }
            }
            else{ 
                n=new Acomodador();
                n.setNombre("Gustavo");
                n.setContraseña("perlita16");
                if(usuario.equals(n.getNombre())){

                    if (contrasena.equals(n.getContraseña())){
                    System.out.println("Acceso correcto -");
                    puesto=2;
                    return puesto;
                    }else{
                    System.out.println("Contraseña incorrecta ");
                    }


                }else{

                    n=new Trabajador();
                    n.setNombre("Adrian");
                    n.setContraseña("initquerry1");
                    if(usuario.equals(n.getNombre())){

                        if (contrasena.equals(n.getContraseña())){
                            System.out.println("Acceso correcto -");
                            puesto=3;
                            return puesto;
                    }else{
                            System.out.println("Contraseña incorrecta ");
                    }
                    }else{
                    System.out.println("Usuario incorrecto -");
                    }
                }
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
}