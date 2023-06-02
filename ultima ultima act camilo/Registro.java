/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author camilo_p & andres_s
 */
public class Registro {


     public void exportarArraylist(ArrayList<String> listaDatos, String rutaArchivo)
    { 
        try 
        {
            // Crear nuevo archivo para guardar Arraylist
            FileWriter archivo = new FileWriter(rutaArchivo);
            // Crea abjeto de la clase  BufferedWriter para preparar escritura en el archivo
            BufferedWriter bufferEscritura = new BufferedWriter(archivo);
            // Recorre Array de datos a escribir para llevarlo al nuevo archivo
            for (String dato : listaDatos) 
            {
                bufferEscritura.write(dato);
                bufferEscritura.newLine();
            }
            // Cerrar Buffer
            bufferEscritura.close();
            archivo.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<String> importarArraylist(String rutaArchivo) 
    {
        try
        {
            // Objeto clase Filereader clae que se utiliza para recibir caracteres
            FileReader archivo = new FileReader(rutaArchivo);
            // Objeto de la clase BufferedReader usado para leer texto de un flujo de entrada.
            BufferedReader bufferLectura = new BufferedReader(archivo);
            // Crea Arraylist para recibir los datos importados 
            ArrayList<String> listaImportada = new ArrayList<>();
            String linea;
            // Mientras haya nueva linea para leer traer a listaimportada
            while ((linea = bufferLectura.readLine()) != null) {
                listaImportada.add(linea);
            }
            // Cierra buffer temporal de lectura
            bufferLectura.close();
            // Cierra archivo que se esta leyendo 
            archivo.close();
            return listaImportada;
        }
        //
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
}
