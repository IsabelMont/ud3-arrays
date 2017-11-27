package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Cuántos alumnos hay en clase?");
        int respuesta = Integer.parseInt(br.readLine());

        String[] lista;
        lista = new String[respuesta];

        for (int i = 0; i < respuesta; i++) {
            System.out.print("NOMBRE Y APELLIDOS DEL ALUMNO " + i + " ");
            lista[i] = br.readLine();
        }
        System.out.println("Dime que alumnos quieres buscar, por que letra empiezan ");
        String respuestados = br.readLine();
        for (int i = 0; i < respuesta; i++) {

            char letra1 = lista[i].charAt(0);
            if (respuestados.charAt(0) == letra1)
                System.out.println(lista[i]);
        }


    }
}
