package com.francisco.javier;

import java.util.Scanner;

public class FechaMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        // el usuario ingresa los los datos de la fecha
        System.out.print("Ingrese Fecha1 (dia, mes y anio): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int year = scanner.nextInt();
        // creo un objeto de la clase Fecha
        Fecha f1=new Fecha(dia,mes,year);
        // el usuario ingresa los los datos de la fecha
        System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        year = scanner.nextInt();

        // creo un objeto de la clase Fecha
        Fecha f2=new Fecha(dia,mes,year);
        System.out.println("Fecha 1 = "+f1);
        System.out.println("Fecha 2 = "+f2);
        if( f1.equals(f2) )
        {
            System.out.println("Son iguales !");
        }
        else
        {
            System.out.println("Son distintas...");
        }
    }

    public static void comparaFecha(){

    }
}
