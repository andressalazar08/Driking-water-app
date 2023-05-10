/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

/**
 *
 * @author camilo_p
 */
public class Persona {
    private String Nombre;
    private String Sexo;
    private int Edad;
    private int Estatura;
    private int Peso;
    private double cantidad;

    public Persona(String Sexo, int Edad, int Estatura, int Peso) {
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }
    
    public double cantidadAgua(String Sexo, int Estatura, int Peso) {
       if ("H".equals(Sexo))
       {
            cantidad = (Peso * 0.035) + (Estatura * 0.029) - 2.4587;
       } 
       else 
       {
            cantidad = (Peso * 0.031) + (Estatura * 0.025) - 2.4646;
       }      
       return cantidad;
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
    
}
