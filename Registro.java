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

    public void exportar(){
        //TODO: Implementar método para exportar datos del consumo histórico
    }
}
