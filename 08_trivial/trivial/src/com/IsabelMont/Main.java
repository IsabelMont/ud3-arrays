package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] pregunta = new String[3];
        String [] respuesta = new String[3];

        pregunta [0] =  "¿DE QUE COLOR ES EL AGUA?";
        pregunta [1]= "¿IZARO TIENE O NO TIENE NEURONAS?";
        pregunta [2]= "¿CUANTAS PATAS TIENE UN CERDO ?";
        respuesta [0]= "INCOLORA";
        respuesta [1]= "NO, NUNCA LAS HA TENIDO";
        respuesta [2]= "CUATRO";

        String opcion;
        int correcto= 0;
        int incorrecto = 0;
        do {
            Random r = new Random ();
            int aleatorio = r.nextInt(2);
            System.out.println("Pregunta o terminar");
            opcion = br.readLine();
           if (opcion.charAt(0) == 'p')
           {
               System.out.println(pregunta [aleatorio]);

               String cosa = br.readLine();

               System.out.println(respuesta[aleatorio]);

               System.out.println("¿Has acertado la pregunta ? Responde con si o no ");

               String acierto = br.readLine();

               if (acierto.charAt(0)=='s')
                   correcto+=1 ;
               else incorrecto += 1;

           }

        }while (!opcion.equalsIgnoreCase("terminar"));

        System.out.println("Has tenido "+correcto+" respuestas correctas y "+incorrecto+" respuestas erroneas");


        }
}
