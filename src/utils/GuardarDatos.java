/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Pr_9_IPO.Libro;
import Pr_9_IPO.Libro;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/**
 *
 * @author mamechapa
 */
public class GuardarDatos {

    private FileWriter fichero = null;
    private PrintWriter pw = null;

    public GuardarDatos(Vector<Libro> libros, String nombreArchivo) {
        try {
            File file = new File(nombreArchivo + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
            fichero = new FileWriter(nombreArchivo + ".txt");
            pw = new PrintWriter(fichero);

            for (Libro libro : libros) {
                pw.write(libro.getNombre() + ";" + libro.getAutor() + ";" + libro.getGenero() + ";" + libro.getAño() +  ";" + libro.getRutaImagen() + ";\n");
            }
            fichero.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }

    }

}
