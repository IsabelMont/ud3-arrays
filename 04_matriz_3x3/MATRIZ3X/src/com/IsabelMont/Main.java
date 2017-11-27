package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int [][] matriz;
            matriz = new int[3][3];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                System.out.println("Que numeros quieres mostrar");
                int respuesta = Integer.parseInt(br.readLine()) ;
                matriz [i][j]= respuesta;
            }

        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                System.out.format ("%d  ",matriz[i][j]);


            }
            System.out.println();

        }
        }
    }

