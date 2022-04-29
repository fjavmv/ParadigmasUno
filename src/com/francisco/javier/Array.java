package com.francisco.javier;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // defino un array de 10 enteros
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int val = scanner1.nextInt();
        int arr[] = new int[val];

        // el scanner para leer por teclado...
        Scanner scanner = new Scanner(System.in);
        // leo el primer valor
        System.out.print("Ingrese un valor (0=>fin): ");
        int v = scanner.nextInt();
        int i=0;

        // mientras v sea distinto de cero AND i sea menor que 10
        while( v!=0 && i< arr.length )
        {
            // asigna v en arr[i] y luego incrementa el valor de i
            arr[i++] = v;
            // leo el siguiente valor
            System.out.print("Ingrese el siguiente valor (0=>fin): ");
            v = scanner.nextInt();
        }

        // recorro el array mostrando su contenido
        for( int j=0; j<i; j++ )
        {
            System.out.println(arr[j]);
        }
    }
}
