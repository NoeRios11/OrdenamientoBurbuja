/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad2.ordenamiento;

/**
 *
 * @author RIOS
 */
public class MainOrdenamientoBurbuja {
    public static void main(String[] args) {
        // inicializamos el arreglo
        int[] datosNormal = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // duplicamos el arreglo para que ambos métodos prueben con los mismos valores
        int[] datosMejorados = datosNormal.clone();
        
        // prueba 1
        System.out.println("burbuja normal:");
        System.out.print("original: ");
        imprimirArreglo(datosNormal); // se imprime antes de ordenar

        long inicioNormal = System.nanoTime(); // toma de tiempo de inicio
        OrdenamientoBurbuja.burbujaNormal(datosNormal); // llamada exclusiva a burbuja normal
        long finNormal = System.nanoTime(); // toma de tiempo de fin
        long tiempoNormal = finNormal - inicioNormal; // cálculo de nanosegundos consumidos
        
        System.out.print("ordenado: ");
        imprimirArreglo(datosNormal);
        System.out.println("tiempo normal: " + tiempoNormal + " ns\n");

        // prueba 2 mejorada 
        System.out.println("burbuja mejorada:");
        System.out.print("original: ");
        imprimirArreglo(datosMejorados); // se imprime antes de ordenar
        long inicioMejorado = System.nanoTime(); // toma de tiempo de inicio
        OrdenamientoBurbuja.burbujaMejorada(datosMejorados); // llamada exclusiva a burbuja mejorada
        long finMejorado = System.nanoTime(); // toma de tiempo de fin
        long tiempoMejorado = finMejorado - inicioMejorado; // calculo de nanosegundos consumidos
        
        System.out.print("ordenado: ");
        imprimirArreglo(datosMejorados);
        System.out.println("tiempo mejorado: " + tiempoMejorado + " ns");
    }
    public static void imprimirArreglo(int[] arr) { // funcion simple para que imprime el numero 
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
