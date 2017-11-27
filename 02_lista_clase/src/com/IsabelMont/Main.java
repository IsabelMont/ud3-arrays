package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Cuantos alumnos hay en tu clase ?");
        int alumno = Integer.parseInt(br.readLine());
        String [] numeroalumnos;
        numeroalumnos = new String [alumno];
        for (int i = 0; i < numeroalumnos.length; i++) {
            System.out.println("Dime nombres y apellidos del alumno");
            numeroalumnos[alumno] = br.readLine();

        }
    }
}
