package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[9][9];

        tablero[0][0] = 9;
        tablero[0][1] = 3;
        tablero[1][0] = 6;
        tablero[0][5] = 7;
        tablero[1][3] = 1;
        tablero[1][4] = 9;
        tablero[1][5] = 5;
        tablero[2][1] = 9;
        tablero[2][2] = 8;
        tablero[2][7] = 6;
        tablero[3][0] = 8;
        tablero[3][4] = 6;
        tablero[3][8] = 3;
        tablero[4][0] = 4;
        tablero[4][3] = 8;
        tablero[4][5] = 3;
        tablero[4][8] = 1;
        tablero[5][0] = 7;
        tablero[5][4] = 2;
        tablero[5][8] = 6;
        tablero[6][1] = 6;
        tablero[6][6] = 2;
        tablero[6][7] = 8;
        tablero[7][3] = 4;
        tablero[7][4] = 1;
        tablero[7][5] = 9;
        tablero[7][8] = 5;
        tablero[8][4] = 8;
        tablero[8][7] = 7;
        tablero[8][8] = 9;

        System.out.println("EMPECEMOS EL JUEGO");
        int resfila;
        int rescolum;
        String respuesta;

        do {
            VisualizarTablero(tablero);
            System.out.println("Quieres jugar o quieres finalizar");
            respuesta = br.readLine();
            if (respuesta.charAt(0) == 'j') {
                System.out.println("¿En que fila quieres colocar tu número?");
                resfila = Integer.parseInt(br.readLine());
                System.out.println("¿En que columna quieres colocar el número?");
                rescolum = Integer.parseInt(br.readLine());
                if (ComprobarHueco(tablero, resfila, rescolum)) {

                    System.out.println("¿Que número quieres colocar");
                    int numres = Integer.parseInt(br.readLine());

                    tablero[resfila][rescolum] = numres;
                } else System.out.println("Espacio ya ocupado");
            } else System.out.println("Has decidido finalizar");


        } while (respuesta.charAt(0) == 'j' && Comprobarceros(tablero) == true);


    }

    public static void VisualizarTablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%2d|", matriz[i][j]);

            }
            System.out.println();

        }
    }

    public static boolean ComprobarHueco(int[][] matriz, int columna, int fila) {


        if (matriz[fila][columna] == 0)
            return true;
        else return false;
    }

    public static boolean Comprobarceros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}


