/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apprecordatorio;

/**
 *
 * @author camilo_p & andres_s
 */
public class Persona {
    private String Nombre;
    private Id Id;
    private String Sexo;
    private int Edad;
    private int Estatura;
    private int Peso;
    private double cantidad;


    public Persona(String Sexo, int Edad, int Estatura, int Peso) {
        this.id=id++; //cada vez que se cree un usuario se le asignará un Id incremental
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
        this.historia = new ArrayList<Integer>(); //se define un array list para guardar el histórico
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

    public double calcularCantidadAgua(String Sexo, int Estatura, int Peso) {
       if ("H".equals(Sexo))
       {
            //TODO: Valores de referencia, revisar unidad de medida
            cantidad = (Peso * 0.035) + (Estatura * 0.029) - 2.4587;
       }
       else
       {
            cantidad = (Peso * 0.031) + (Estatura * 0.025) - 2.4646;
       }
       return cantidad;
    }

    //Método para consultar la historia del usuario
    //Por ahora la historia se guardará en un array
    //Devuelve una lista de números que representan la cantidad de agua consumida por día
    public List<Integer> consultarHistoria(){

        return this.historia; // Devuelve el estado actual del array de historia
    }

    //Método para actualizar la cantidad tomada en el array de historia del usuario
    public void actualizarHistoria(int cantidadTomada){

        this.historia.add(cantidadTomada); // Al ejecutarse el método agrega el nuevo dato en el arrayList
    }


}
