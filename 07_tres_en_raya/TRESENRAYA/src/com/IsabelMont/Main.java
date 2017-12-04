package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[3][3];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 9;

            }

        }

        System.out.println("Nombre Jugador 1");
        String respuesta1 = br.readLine();
        System.out.println("Nombre Jugador 2");
        String respuesta2 = br.readLine();
        System.out.println(respuesta1 + " juega con 0 y " + respuesta2 + " juega con 1");
        System.out.println("EMPIEZA " + respuesta1 + " HA JUGAR. BUENA SUERTE");
        int tirada = 0;
        int ganador;
        visualizartablero(tablero);
        int turno = 0;
        do {
            int fila;
            int columna;
            tirada += 1;
            do {
                System.out.println("JUEGA EL JUGADOR 1 ");
                System.out.println("¿En que fila quieres jugar ? 0, 1 ó 2 ");
                fila = Integer.parseInt(br.readLine());

                System.out.println("En que columna quieres jugar? 0 , 1  ó 2 ");
                columna = Integer.parseInt(br.readLine());
                if (tablero[fila][columna] == 0 || tablero[fila][columna] == 1)
                    System.out.println("ESPACIO YA OCUPADO");

            } while (tablero[fila][columna] != 9);
            if (tablero[fila][columna] != 0 && tablero[fila][columna] != 1)
                tablero[fila][columna] = turno;
            visualizartablero(tablero);

            ganador = comprobarganador(tablero);
            if (turno == 0)
                turno = 1;
            else turno = 0;


        } while (tirada < 9 && ganador == -1);

        if (ganador == -1)
            System.out.println("EMPATE");


    }

    public static void visualizartablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%3d", matriz[i][j]);
            }
            System.out.println();
        }

    }

    public static int comprobarganador(int[][] matriz) {
        int ganador = -1;

        //FILAS JUGADOR 1 Y 2
        if (matriz[0][0] == 0 && matriz[0][1] == 0 && matriz[0][2] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }
        if (matriz[1][0] == 0 && matriz[1][1] == 0 && matriz[1][2] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }

        if (matriz[2][0] == 0 && matriz[2][1] == 0 && matriz[2][2] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }
        if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }
        if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }
        if (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }
        // POR COLUMNAS JUGADOR 1
        if (matriz[0][1] == 0 && matriz[1][1] == 0 && matriz[2][1] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }
        if (matriz[0][0] == 0 && matriz[1][0] == 0 && matriz[2][0] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }
        if (matriz[0][2] == 0 && matriz[1][2] == 0 && matriz[2][2] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }
        // COLUMNAS JUGADOR 2
        if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }

        if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }

        if (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }

        // DIAGONALES JUGADOR 1
        if (matriz[0][0] == 0 && matriz[1][1] == 0 && matriz[2][2] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }

        if (matriz[0][2] == 0 && matriz[1][1] == 0 && matriz[2][0] == 0) {
            System.out.println("EL JUGADOR 1 HA GANADO");
            ganador = 0;
        }


        //DIAGONALES JUGADOR 2
        if (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }
        if (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1) {
            System.out.println("EL JUGADOR 2 HA GANADO");
            ganador = 1;
        }

        return ganador;
    }
}
