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
    private int tiempo;
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


    // Metodo que calcula los minutos que hay entre que se despierta y se duerme una persona.
    public int calcularHoras(int horaDespierto, int minutoDespierto, int horaDormir, int minutoDormir)
    {
        int intervaloHoras = ((12 + horaDormir) - horaDespierto);
        int intervaloMinutos = minutoDespierto - minutoDormir;
        if(intervaloMinutos < 0)
        {
            int minutos = (-1) * intervaloMinutos;
            tiempo = (intervaloHoras*60) + minutos;
        }
        else if(intervaloMinutos > 0)
        {
            tiempo = (intervaloHoras*60) - intervaloMinutos;
        }
        else
        {
            tiempo = intervaloHoras*60;
        }
        return tiempo;
    }

}