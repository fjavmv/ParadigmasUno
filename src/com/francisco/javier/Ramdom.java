package com.francisco.javier;

public class Ramdom {
    public static void main(String[] args) {
        int arr []= new int[10];

        for (int i= 0; i < arr.length; i++){
            int val = (int)(Math.random()*100);
            arr[i] = val;
        }

        for(int j=0; j < arr.length;j++){
            System.out.println(arr[j]);
        }



    }
}
