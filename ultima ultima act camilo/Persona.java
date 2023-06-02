/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

import java.util.ArrayList;

/**
 *
 * @author camilo_p & andres_s
 */
public class Persona {
    private String Nombre;
    private String Sexo;
    private int Edad;
    private int Estatura;
    private int Peso;
    private double cantidad;
    private ArrayList<Integer> Historial;


    public Persona() {
 
    }
    public Persona(String Nombre, String Sexo, int Edad, int Estatura, int Peso, ArrayList<Integer> Historial) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
        this.Historial = Historial;
    }

    public ArrayList<Integer> getHistorial() {
        return Historial;
    }

    public void setHistorial(ArrayList<Integer> Historial) {
        this.Historial = Historial;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEstatura() {
        return Estatura;
    }

    public void setEstatura(int Estatura) {
        this.Estatura = Estatura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    //Método para calcular la cantidad de agua recomendada a tomar para el usuario

    public double calcularCantidadeAgua(String Sexo, int Estatura, int Peso) {
       if ("H".equals(Sexo))
       {
            //TODO: Valores de referencia, revisar unidad de medida
            cantidad = ((Peso * 0.035) + (Estatura * 0.029) - 2.4587)*500;
       }
       else
       {
            cantidad = ((Peso * 0.031) + (Estatura * 0.025) - 2.4646)*500;
       }
       return cantidad;
    }
    
      
    // Metodo que calcula los minutos que hay entre que se despierta y se duerme una persona.
    public int calcularMinutos(int horaDespierto, int minutoDespierto, int horaDormir, int minutoDormir)         
    {
        int tiempo;
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
    
    /*
    public ArrayList<Integer> arregloHoras(int minutosDespierto) {
            ArrayList<Integer> arregloHoras = new ArrayList<>();
            int unaHora = 1;
            for (int i = 1; i <= minutosDespierto; i++) 
                   {
                       if (i % 60 == 0)        
                        {
                            arregloHoras.add(unaHora);
                        }
                    }
             return arregloHoras;
    }*/
                
//     Metodo para calculo de mililitro a tomar cada hora 
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
