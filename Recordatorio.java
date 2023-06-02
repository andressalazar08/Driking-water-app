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
    private int ID;
    //private Integer id;
    private ArrayList<Integer> intervalosTomas;
    //private Date ultimoRecordatorio;
    private LocalTime time;
    private String message;

    public Recordatorio(int ID, ArrayList<Integer> Intervalos)
    {
        this.intervalosTomas = Intervalos;
        this.ID = ID;
    }
//    public Recordatorio(LocalTime time, String message) {
//        this.time = time;
//        this.intervalo= ultimoRecordatorio-time;
//        this.message = message;
//        //como anidar el user id al recordatorio
//    }

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
    public int calcularMinutos(int horaDespierto, int minutoDespierto, int horaDormir, int minutoDormir)
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

    // Metodo para calculo de mililitro a tomar cada hora
    public ArrayList<Integer> calcularTomasAgua(double cantidadAguaDiaria, double minutosDespierto) {
        ArrayList<Integer> intervalosTomas = new ArrayList<>();
        double tomasHora = java.lang.Math.ceil((cantidadAguaDiaria / minutosDespierto) * 60);
        int tomasPorHora = (int) tomasHora;
        // Agregar las tomas cada hora
        for (int i = 1; i <= minutosDespierto; i++)
        {
            if (i % 60 == 0)
            {
                intervalosTomas.add(tomasPorHora);
            }
        }
        int sumaArray = 0;
        for (Integer numero : intervalosTomas)
        {
            sumaArray += numero;
        }
        int cantidadAgua = (int)cantidadAguaDiaria;
        if(cantidadAgua > sumaArray)
        {
            int Diferencia = cantidadAgua - sumaArray;
            int ultimaUbicacion = intervalosTomas.size() - 1;
            int ultimoElemento = intervalosTomas.get(ultimaUbicacion);
            int nuevoUltimoElemento = Diferencia + ultimoElemento;
            intervalosTomas.set(ultimaUbicacion,nuevoUltimoElemento);

        }

        return intervalosTomas;
    }
}