/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apprecordatorio;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author camilo_p
 */
//import java.time.LocalTime;
//import java.util.Scanner;

public class APPrecordatorio {
//    public static void main(String[] args){
//    ArrayList<Integer> datosAgua = new ArrayList<>();
//    datosAgua.add(500); // Día 1
//    datosAgua.add(800); // Día 2
//    datosAgua.add(600); // Día 3
//    datosAgua.add(0); // Día 1
//    datosAgua.add(1000); // Día 2
//    datosAgua.add(2000); // Día 3
//    
//    Grafico objgrafico = new Grafico();
//    objgrafico.generarGrafico(datosAgua);
//    
//    }

public static void main(String[] args) {
        // la hora actual del sistema
        LocalTime horaActual = LocalTime.now();

        // Definir la hora de levantarse y acostarse.
        LocalTime horaLevantarse = LocalTime.of(12, 19); // Por ejemplo, las 8:00 AM
        LocalTime horaAcostarse = LocalTime.of(12, 21); 
        // Obtener el intervalo personalizado en horas, minutos y segundos
        int intervaloHoras = obtenerValorPersonalizado("Ingrese el intervalo de alerta en horas: ");
        int intervaloMinutos = obtenerValorPersonalizado("Ingrese el intervalo de alerta en minutos: ");
        int intervaloSegundos = obtenerValorPersonalizado("Ingrese el intervalo de alerta en segundos: ");

        // Calcular la próxima hora de alerta basada en el intervalo personalizado.
        LocalTime proximaAlerta = horaLevantarse.plusHours(intervaloHoras)
                                                .plusMinutes(intervaloMinutos)
                                                .plusSeconds(intervaloSegundos);

        // Confirmar el intervalo establecido.
        System.out.println("El intervalo de alerta establecido es de: " + intervaloHoras + " horas, " + intervaloMinutos + " minutos y " + intervaloSegundos + " segundos.");
        System.out.println("Esperando hasta la próxima alerta");

        // Esperar hasta que llegue la próxima alerta.
        while (horaActual.isBefore(horaLevantarse)) {
            // Esperar 1 segundo antes de verificar el siguiente intervalo
            try 
            {
                Thread.sleep(3000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            //System.out.println("#");
            // Actualizar la hora actual en cada iteración
            horaActual = LocalTime.now();          
        }

        // Mostrar mensajes de alerta en intervalos personalizados hasta la hora de acostarse
        while (horaActual.isAfter(horaLevantarse) && horaActual.isBefore(horaAcostarse)) 
        {
            System.out.println("Es hora de tomar AGUA");

            proximaAlerta = proximaAlerta.plusHours(intervaloHoras)
                                        .plusMinutes(intervaloMinutos)
                                        .plusSeconds(intervaloSegundos);

            // Esperar hasta que llegue la próxima alerta
            while (horaActual.isBefore(proximaAlerta)) 
            {
                try 
                {
                    Thread.sleep(3000);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                // Actualizar la hora actual en cada iteración
                //System.out.println("$");
                horaActual = LocalTime.now();
            }
        }

        System.out.println("Es hora de acostarse.");
    }

    // Método para obtener un valor personalizado desde la entrada.
    private static int obtenerValorPersonalizado(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    
    
    
//     public static void main(String[] args) {
//        Persona objprueba = new Persona();
//        double cantidadAguaDiaria = objprueba.calcularCantidadeAgua("H", 170, 70); // Cantidad de agua diaria en mililitros
//        int minDespierto = objprueba.calcularMinutos(6, 20, 10, 10);
//        double minutosDespierto = (double) minDespierto; 
//        ArrayList<Integer> arregloHoras = objprueba.arregloHoras(minDespierto);
//        ArrayList<Integer> tomasAgua = objprueba.calcularTomasAgua(cantidadAguaDiaria, minutosDespierto);
//        System.out.println(cantidadAguaDiaria);
//        System.out.println(minDespierto);
//        System.out.println("Intervalos de tomas de agua cada hora:");
//        for (int i = 0; i < tomasAgua.size(); i++) 
//        {
//            System.out.println("Hora " + (i+1) + ": " + tomasAgua.get(i) + " ml");
//        }
//        for (int i = 0; i < arregloHoras.size(); i++) 
//        {
//            System.out.println("Hora " + (i+1) + ": " + arregloHoras.get(i) );
//        }
//    }

}
