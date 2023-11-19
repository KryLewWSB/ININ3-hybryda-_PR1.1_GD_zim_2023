package org.example;

public class Main {
    public static void main(String[] args) {
        int a = -1, b = -11, c = 12;

        double delta = Math.pow(b, 2) - 4 * a * c;  // (b * b) - 4 * a * c
        System.out.println("Delta jest równa = " + delta);

        if(delta < 0){
            System.out.println("Brak miejsc zerowych (delta < 0)");
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("Jedno miejsce zerowe delta = 0!\nx0 = " +x0);
        } else if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta większa od 0!\nx1 = " + x1 +
                               "\nx2 = " + x2);
        }
    }
}