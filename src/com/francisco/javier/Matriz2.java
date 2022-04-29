package com.francisco.javier;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Número de filas: ");

        int filas = scanner.nextInt();

        System.out.println("Número de columnas: ");

        int columnas = scanner.nextInt();

        int mat [][] = llenarMatriz(filas,columnas);

        recorreMatriz(mat);
        suma(mat,mat);
    }

    public static int[][] llenarMatriz(int filas, int columnas){
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++){

            for (int j = 0; j < columnas; j++){
                System.out.println("Ingresa el valor para la posición: "+"[ "+i+" ]"+"[ "+j+" ]");
                int val = scanner.nextInt();
                matriz[i][j] = val;
            }
        }
        return matriz;
    }

    public static void recorreMatriz(int matriz[][]){

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void suma(int mat1[][], int mat2[][]){
        int m1F = mat1.length;
        int m1C = mat1[0].length;
        int m2F = mat2.length;
        int m2C = mat2[0].length;

        int sum[][] = new int[m1F][m1C];
        if(m1F == m2F && m1C == m2C){

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
        }else {
            System.out.println("Las matrices deben tener las mismas dimenciones");
        }

    }


}
