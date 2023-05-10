/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

import java.util.Date; //Importamos la librería Date para definir variables tipo fecha

/**
 *
 * @author camilo_p & andres_s
 */
public class Registro {

    private int id;
    private int cantidad;
    private Date fecha;
    private int userId;

    public Registro(int id, int cantidad, Date fecha, int userId) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.userId = userId;
    }

    // se implementan los setters y getters de
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getDate() {
        return fecha;
    }

    public void setDate(Date fecha) {
        this.fecha = fecha;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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
