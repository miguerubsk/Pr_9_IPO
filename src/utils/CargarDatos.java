/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Pr_9_IPO.Libro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author mamechapa
 */
public class CargarDatos {

    private Vector<Libro> datos;

    public CargarDatos(String fichero) throws FileNotFoundException, IOException {
        this.datos = new Vector<>();
        File archivo = new File(fichero);
        Scanner scn = new Scanner(archivo);
        while (scn.hasNext()) {
            String linea = scn.nextLine();
            String[] split = linea.split(";");
            String[] aux = new String[5];
            for (String string : aux) {
                string = " ";
            }
            for (int i = 0; i < split.length; i++) {
                aux[i] = split[i];
            }
            Libro nuevoLibro = new Libro(aux[0], aux[1], aux[2], aux[3], aux[4]);
            datos.add(nuevoLibro);
        }
    }

    public Vector<Libro> getDatos() {
        return datos;
    }
    
    

}
