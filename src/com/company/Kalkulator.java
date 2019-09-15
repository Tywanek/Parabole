package com.company;

import java.util.Scanner;

public class Kalkulator {

    private int a;
    private int b;
    private int c;

    public void obliczMiejscaZerowe() {
        //dgfgbdfbdbfe

        pobierzDane();
        double delta = obliczDelte();

        if (delta > 0) {
            printResult(wyznaczDwaMiejsca(delta), delta);
        }
        if (delta == 0) {
            printResult(wyznaczDwaMiejsca(delta), delta);
        }
        if (delta < 0) {
            printResult(null, delta);
        }
    }

    private void printResult(double[] miejsca, double delta) {

        if (delta > 0) {
            System.out.println("Miejsca zerowe: " + "x1=" + miejsca[0] + "x2=" + miejsca[1]);
        }
        if (delta == 0) {
            System.out.println("Miejsce zerowe: " + "x1=" + miejsca[1]);
        }
        if (delta < 0) {
            System.out.println("Brak miejsc!");
        }
    }

    private double[] wyznaczDwaMiejsca(Double delta) {
        double[] result = new double[2];
        result[0] = (b * (-1) - Math.sqrt(delta)) / (2 * a);
        result[1] = (b * (-1) + Math.sqrt(delta)) / (2 * a);
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
