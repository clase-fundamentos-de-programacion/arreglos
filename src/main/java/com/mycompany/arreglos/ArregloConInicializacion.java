package com.mycompany.arreglos;

public class ArregloConInicializacion {
    public static void main(String[] args) {
        /** Arreglo con 4 elementos asignados en varias instrucciones **/
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 20;
        numeros[3] = 25;

        System.out.println("El tamaño de numeros es " + numeros.length);
        System.out.println("El primer elemento de numeros es " + numeros[0]);
        System.out.println("El último elemento de numeros es " + numeros[3]);

        /** Arreglo con 14 elementos asignados en una sola instrucción **/
        int[] numeros2 = {10, 15, 20, 25, 1, 3, 5, 10, 20 ,15 ,-8, 450, 1500, 12578};
        
        System.out.println("El tamaño de numeros2 es " + numeros2.length);
        System.out.println("El primer elemento de numeros2 es " + numeros2[0]);
        System.out.println("El último elemento de numeros2 es " + numeros2[13]);
        
        /** La siguiente línea arroja una excepción (por eso la comentamos): **/
        // System.out.println("El último elemento de numeros2 es " + numeros2[14]);

        /** Arreglo de caracteres para crear una palabra **/
        char[] palabra = {'a', 'm', 'a', 'r', 'i', 'l', 'l', 'o'};

        System.out.println("La palabra es: ");
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);
        }
    }
}
