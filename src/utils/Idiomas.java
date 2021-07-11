/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 *
 * @author mamechapa
 */
public class Idiomas {
    
    private Vector<Vector<String>> idiomas;
    private Vector<Vector<ImageIcon>> imagenes;
    private int numIdiomas;

    public Idiomas(String fichero) throws FileNotFoundException, IOException {
        FileReader f = null;
        String linea;

        f = new FileReader(fichero);
        BufferedReader b = new BufferedReader(f);
        
        numIdiomas = Integer.parseInt(b.readLine());
        idiomas = new Vector<>();
        imagenes = new Vector<>();
        for (int i = 0; i < numIdiomas; i++) {
            Vector<String> idioma = new Vector<>();
            idioma.add(b.readLine());
            int numPalabras = Integer.parseInt(b.readLine());
            for (int j = 0; j < numPalabras; j++) {
                idioma.add(b.readLine());
            }
            
            Vector<ImageIcon> imagenesAux = new Vector<>();
            int numImagenes = Integer.parseInt(b.readLine());
            for (int j = 0; j < numImagenes; j++) {
                imagenesAux.add(new ImageIcon(b.readLine()));
            }
            
            idiomas.add(idioma);
            imagenes.add(imagenesAux);
        }
    }

    public Vector<Vector<String>> getIdiomas() {
        return idiomas;
    }
    
    public Vector<String> getIdioma(int cual) {
        return idiomas.get(cual);
    }
    
    public Vector<Vector<ImageIcon>> getImagenes() {
        return imagenes;
    }
    
    public Vector<ImageIcon> getImagenesIdioma(int cual) {
        return imagenes.get(cual);
    }
    
    public int getNumIdiomas() {
        return numIdiomas;
    }

}
