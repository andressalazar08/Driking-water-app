/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.apprecordatorio;
//
///**
// *
// * @author camilo_p
// */
//import java.util.ArrayList;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartFrame;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//public class Grafico {
//
//public void generarGrafico(ArrayList<Integer> datos) {
//    // Crear un conjunto de datos para el gráfico de columnas
//    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//    
//    // Agregar los datos al conjunto de datos
//    for (int i = 0; i < datos.size(); i++) {
//        dataset.addValue(datos.get(i), "Agua", "Día " + (i + 1));
//    }
//    
//    // Crear el gráfico de columnas
//    JFreeChart chart = ChartFactory.createBarChart(
//        "Consumo de Agua por Día", // Título del gráfico
//        "Día", // Etiqueta del eje x
//        "Cantidad de Agua (ml)", // Etiqueta del eje y
//        dataset, // Conjunto de datos
//        PlotOrientation.VERTICAL, // Orientación del gráfico
//        true, // Mostrar leyenda
//        true, // Mostrar tooltips
//        false // No usar URLs
//    );
//    
//    // Crear el marco del gráfico y mostrarlo
//    ChartFrame frame = new ChartFrame("Gráfico de Agua", chart);
//    frame.pack();
//    frame.setVisible(true);
//}
//
//    
//}
