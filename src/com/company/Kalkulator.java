package com.company;




import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kalkulator {

    private int a;
    private int b;
    private int c;

    public void obliczMiejscaZerowe() {

        pobierzDane();
        double delta = obliczDelte();

        if(delta > 0){
            double[] wynik = wyznaczDwaMiejsca(delta);
            System.out.println("Miejsca zerowe: "+"x1="+wynik[0]+"x2="+wynik[1]);
        }
        if(delta == 0){
            /*
            jedno miejsce zerowe
             */
        }
        if (delta < 0){
            // brak miejsc
        }
    }

    private double[] wyznaczDwaMiejsca(Double delta) {

        double x1 = (b * (-1) - Math.sqrt(delta)) / (2 * a);
        double x2 = (b * (-1) + Math.sqrt(delta)) / (2 * a);

        double[] result = new double[2];
        result[0] = x1;
        result[1] = x2;

        return result;
    }

    private double obliczDelte() {
        return (b * b) - 4 * (a * c);
    }

    private void pobierzDane() {
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
        this.c = scanner.nextInt();
    }

}
