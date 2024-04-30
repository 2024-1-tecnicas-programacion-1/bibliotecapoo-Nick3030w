package com.mycompany.bibliotecapoo;
import java.util.LinkedList;

public class Biblioteca {

    private LinkedList<Libro> libros;
/**
 * 
 * Complejidad temporal: O(1) Tiempo constante
 */
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }
/**
 * metodo que registra un libro
 * Complejidad temporal: O(1) Tiempo constante
 * @param libroNuevo
 */
    public void registrarLibro(Libro libroNuevo) {
        libros.add(libroNuevo);
        
    }
/**
 * metodo que busca un libro
 * Complejidad temporal: O(1) Tiempo constante
     * @param palabraBusqueda
 */
    public void buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroLeido = libros.get(i);

            
            if (libroLeido.getTitulo().equals(palabraBusqueda) || libroLeido.getAutor().equals(palabraBusqueda) || libroLeido.getGenero().equals(palabraBusqueda)) {
                System.out.println(libroLeido.mostrarInfo());

            }
            
        }
    }
/**
 * metodo que muestra un libro
 * Complejidad temporal: O(1) Tiempo constante
 */
    public void mostrarLibros() {
        for (Libro libro : libros) {
            
            System.out.println(libro.mostrarInfo());
        }
    }
/**
 * metodo que muestra un libro no leido, o los libros no leidos
 * Complejidad temporal: O(1) Tiempo constante
 */
    public void mostrarLibrosNoLeidos() {

        boolean libNoLeidos = false;

        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                if (!libNoLeidos) {
                    System.out.println("Libros no leídos en la biblioteca:");
                    libNoLeidos = true;
                }
                
                System.out.println(libro.mostrarInfo());
                
            }
        }
    }
    /**
     * metodo que marca el libro no leido
     * Complejidad temporal: O(1) Tiempo constante
     * @param tituloLibro 
     */
    public void marcarLibroNoLeido(String tituloLibro) {
    for (Libro libro : libros) {
        
        if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
            libro.marcarLeido(); // Llama al método marcarNoLeido() en la clase Libro
            return; // Sal del método después de marcar el libro
        }
    }
}
}