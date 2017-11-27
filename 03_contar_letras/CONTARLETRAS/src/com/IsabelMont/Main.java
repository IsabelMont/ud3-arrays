package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("kkk");
        String texto = br.readLine();

        char[] alfabeto;
        alfabeto = new char[26];

        char siguiente = 'a';

        for (int i = 0; i < 26; i++) {
            alfabeto[i] = siguiente;
            //System.out.println(siguiente);
            siguiente++;
        }

        int[] recuento = new int[26];

        contarletras(texto,alfabeto,recuento);

        System.out.println();
    }
    

    public static void contarletras(String texto, char[] alfabeto, int[] recuento) {

        for (int i = 0; i < texto.length(); i++) {

            char letraActual = texto.charAt(i);

            for (int j = 0; j < alfabeto.length ; j++) {
                if (alfabeto[j] == letraActual)
                {
                    recuento[j]++;
                }

            }

        }


    }
}

