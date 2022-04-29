package com.francisco.javier;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        ifInline();
    }

    public static void ifnormal(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v = scanner.nextInt();
        // obtenemos el resto de dividir v por 2
        int resto = v % 2;
        // para preguntar por igual utilizamos ==
        if( resto == 0 )
        {
            System.out.println(v+" es Par");
        }
        else
        {
            System.out.println(v+" es Impar");
        }
    }

    public static void ifInline(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v=scanner.nextInt();
        // obtenemos el resto de dividir v por 2
        int resto= v % 2;
        // utilizando un if in-line
        String mssg = (resto == 0 ) ? "es Par": "es Impar";
        // muestro resultado
        System.out.println(v+" "+mssg);
    }

    public static void switchEstructura(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana (numero): ");
        int v = scanner.nextInt();
        String dia;
        switch( v )
        {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        System.out.println(dia);
    }
}
