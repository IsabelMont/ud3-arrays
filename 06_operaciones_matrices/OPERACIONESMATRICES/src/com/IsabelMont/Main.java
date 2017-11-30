package com.IsabelMont;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void visualizar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%4d", matriz[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // NUMERO ALEATORIO
        Random r = new Random();


        //DECLARACIÓN DE LAS DOS MATRICES DE 4X4
        int[][] matriz;
        matriz = new int[4][4];

        int[][] matrizdos;
        matrizdos = new int[4][4];

        int[][] matrizresultadosuma;
        matrizresultadosuma = new int[4][4];

        int[][] matrizescalar;
        matrizescalar = new int[4][4];

        int[][] matrizproducto;
        matrizproducto = new int[4][4];

        int[][] matrizT;
        matrizT = new int[4][4];

        // INICIACIÓN DE LAS MATRICES CON NÚMEROS ALEATORIOS

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100);

            }

        }
        for (int i = 0; i < matrizdos.length; i++) {
            for (int j = 0; j < matrizdos[i].length; j++) {
                matrizdos[i][j] = r.nextInt(100);

            }

        }
        String respuesta;
        do {
            System.out.print("Elige que quieres hacer\nA) Sumar \nB) Escalar \nC) Producto \nD) Transpaso\nRespuesta:");
            respuesta = br.readLine();
            respuesta.toUpperCase();
            switch (respuesta) {

                case "A":
                    //SUMA DE MATRICES
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matrizresultadosuma[i][j] = matriz[i][j] + matrizdos[i][j];
                        }
                        visualizar(matrizresultadosuma);
                        break;
                    }
                case "B":
                    //MULTIPLICACION POR UN ESCALAR (POR UN NUMERO TODA LA MATRIZ)
                    visualizar(matriz);
                    System.out.println("¿ Por cual número quieres multiplicar la matriz ?");
                    int respuesta1 = Integer.parseInt(br.readLine());

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matrizescalar[i][j] = matriz[i][j] * respuesta1;
                        }
                    }
                    visualizar(matriz);
                    visualizar(matrizescalar);
                    break;

                case "C":
                    //PRODUCTO DE LAS DOS MATRICES PRINCIPALES
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            for (int k = 0; k < matriz.length; k++) {
                                matrizproducto[i][j] = matriz[i][k] * matrizdos[k][j];

                            }

                        }
                    }
                    visualizar(matrizproducto);
                    break;

                case "D":
                    //matriz transpuesta
                    for (
                            int i = 0;
                            i < matriz.length; i++)

                    {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matrizT[j][i] = matriz[i][j];

                        }

                    }

                    visualizar(matriz);
                    System.out.println();
                    visualizar(matrizT);
                    break;
                default:
                    System.out.println("error");
            }

        }
            while ( respuesta!= "A" && respuesta!= "B" && respuesta!= "C" && respuesta != "D");
        }
    }
