/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad2.ordenamiento;

/**
 *
 * @author RIOS
 */
public class OrdenamientoBurbuja {
    
   
    public static void burbujaNormal(int[] arr) {
        int n = arr.length; // el areglo en una variable , tambien podriamos utilzar el arreglo direcatmente en la estructura for
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {// aqui la posicion de j incia en 0 , y n es el arreglo se le resta -1 poorque inicio en 0, y nuevamente se le resta - 1 por el recorrido que hara 
                if (arr[j] > arr[j + 1]) { // hace la comparacion si el valor de la posicion 0 es mayor al de la poscion 1 por eso le suma +1
                    // intercambio de valores mediante variable auxiliar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void burbujaMejorada(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false; // esta es la variable que esta en false desde el comienzo si se hace un intercambio cambia 

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    huboIntercambio = true; // cambia la variable si almenos hay un cambio 
                }
                
                 // si en esta pasada no se movió ningún elemento, el arreglo ya está ordenado
                 if (!huboIntercambio) {
                     break; // rompe el ciclo externo antes de tiempo
                 }
            }
        }
    }  
}
