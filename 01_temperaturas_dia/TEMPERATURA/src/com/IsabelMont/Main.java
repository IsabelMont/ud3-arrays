package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.MIN_VALUE;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] asterisco;
        double total = 0;
        double maximo = MIN_VALUE;
        double minimo = MAX_VALUE;
        double media = 0;
        int i;
        double[] temperatura;
        temperatura = new double[24];
        for (i = 0; i < temperatura.length; i++) {
            System.out.println("¿Qué temperatura hace?");
            temperatura[i] = Double.parseDouble(br.readLine());
            if (temperatura[i] > maximo)
                maximo = temperatura[i];
            if (temperatura[i] < minimo)
                minimo = temperatura[i];

            total = total + temperatura[i];
        }


        for (i = 0; i < temperatura.length; i++) {


            System.out.print(i + " ");


            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }

            System.out.print(temperatura[i] + " ");
            if (temperatura[i] == maximo)
                System.out.print("---->MAXI");
            if (temperatura[i] == minimo)
                System.out.print("----->MIN");


            media = total / 24;
            System.out.println();

        }
        System.out.println("La media es " + media);
    }
}
