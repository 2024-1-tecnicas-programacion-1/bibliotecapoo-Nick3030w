package com.mycompany.bibliotecaPOO;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacion;
    private boolean leido;
    /**
     * Contructor de la clase
     * complejidad temporal: 0(1) complejidad constante
     * @param titulo
     * @param autor
     * @param genero
     * @param anoPublicacion
     * @param leido 
     */
    public Libro(String titulo, String autor, String genero, int anoPublicacion, Boolean leido){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = leido;
    }
    /**
     * metodo que muestra la informacion del libro
     * complejidad temporal: 0(1) complejidad constante
     * @return 
     */
    public String mostrarInfo(){
        return "Titulo: " +titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", género: " + genero;
    }
    /**
     * metodo que marca el libro como leido
     * complejidad temporal: 0(1) complejidad constante 
     */
    public void marcarLeido(){
        this.leido=true;
    }
    /**
     * metodo que me dice si el libro es antiguo
     * complejidad temporal: 0(1) complejidad constante
     * @param anoPublicacion
     * @return 
     */
    public boolean esAntiguo(int anoPublicacion){
        if(anoPublicacion<1974){
            return true;
        }
    return false;
    }
    /**
     *Metodo que retorna si el libro esta leido
     * complejidad temporarl: 0(1) complejidad constante
     * @return 
     */

    public boolean isLeido() {
        return leido;
    }
    
    
    
    
    }

