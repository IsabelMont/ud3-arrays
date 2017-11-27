package com.IsabelMont;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    int [][]matriz;
    matriz = new int [10][10];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Random r = new Random();
                int aleatorio = r.nextInt(100);
                matriz[i][j]= aleatorio;

            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                System.out.format("%d ",matriz[i][j]);

            }
            System.out.println();

        }
    }
}
