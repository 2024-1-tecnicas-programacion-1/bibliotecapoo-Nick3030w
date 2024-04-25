package com.mycompany.bibliotecapoo;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<String> libros;
    Scanner lector = new Scanner(System.in);
    
    
    public void registrarLibro(){
        libros.add(Libro);
    }
    
    public String buscarLibro(){
        String palabraBusqueda = lector.next();
        return libros.get(palabraBusqueda);
    }
    
    void mostrarLibros(){
        for(int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i));
        }
    }
    void mostrarLibrosNoLeidos(){
        if(Libro.marcarLeido = false){
            
        }
    }

}