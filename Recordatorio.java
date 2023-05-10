/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

import java.time.LocalTime; //Importamos la hora local de la aplicación donde se esté ejecutando
/**
 *
 * @author camilo_p & andres_s
 */
public class Recordatorio {
    private Integer id;
    private Integer intervalo;
    private Date ultimoRecordatorio;
    private LocalTime time;
    private String message;

    public Recordatorio(LocalTime time, String message) {
        this.time = time;
        this.intervalo= ultimoRecordatorio-time;
        this.message = message;
        //como anidar el user id al recordatorio
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void recordar() {
        // Este método imprime en pantalla un mensaje de recordatorio
        //TODO: implementar una notificación
        System.out.println("Recordatorio: " + message);
    }
}