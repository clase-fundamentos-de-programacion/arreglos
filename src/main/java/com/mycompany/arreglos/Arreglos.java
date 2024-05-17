package com.mycompany.arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamañoo del arreglo");
        int tamano = lector.nextInt();
        
        // Definición
        int[] numeros;
        // Inicialización (Asignación de memoria)
        numeros = new int[tamano];
        
        for(int i=0;i<numeros.length ;i++){
            System.out.println("Ingrese el valor para la posición " + i);
            numeros[i] = lector.nextInt();
        }
        
        for(int i = 0 ; i < numeros.length; i++){
            System.out.println("números en la posición " + i + " es igual a " + numeros[i]);
        }
    }
}
