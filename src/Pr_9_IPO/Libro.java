/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pr_9_IPO;

/**
 *
 * @author mamechapa
 */
public class Libro {
    private String nombre;
    private String autor;
    private String genero;
    private String año;
    private String rutaImagen;
    private boolean tieneImagen;

    public Libro(String nombre, String autor, String genero, String año, String rutaImagen) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.año = año;
        this.rutaImagen = rutaImagen;
        this.tieneImagen = true;
    }

    public Libro() {
        this.nombre = " ";
        this.autor = " ";
        this.genero = " ";
        this.año = " ";
        this.tieneImagen = false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getAño() {
        return año;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
        this.tieneImagen = true;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public boolean isTieneImagen() {
        return tieneImagen;
    }
    
    
}
