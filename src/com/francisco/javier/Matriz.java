package com.francisco.javier;

import java.util.Scanner;

public class Matriz {

    int mat1[][];
    int mat2 [] [];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int n=scanner.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int m=scanner.nextInt();

        // creo una matriz de n filas x m columnas
        int mat[][] = new int[n][m];
        int nro;

        for(int i = 0; i < n; i++ )
        {
            for(int j = 0; j < m; j++)
            {
                // genero un numero aleatorio entre 0 y 1000
                nro = (int)(Math.random()*1000);
                // asigno el numero en la matriz
                mat[i][j] = nro;
            }
        }

        for(int i = 0; i < n; i++ )
        {
            for(int j = 0; j < m; j++)
            {
                // imprimo la celda de la matriz
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int[][] llenar(){
        int mat [][] = new int[2][2];

        return mat;
    }
}
