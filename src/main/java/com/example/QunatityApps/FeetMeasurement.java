package com.example.QunatityApps;

import java.util.Scanner;

public class FeetMeasurement {

    static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first value in feet: ");
            double value1 = sc.nextDouble();

            System.out.print("Enter second value in feet: ");
            double value2 = sc.nextDouble();

            Feet f1 = new Feet(value1);
            Feet f2 = new Feet(value2);

            boolean result = f1.equals(f2);

            System.out.println("Equal (" + result + ")");

        } catch (Exception e) {

            System.out.println("Invalid input! Please enter numeric values only.");

        }

        sc.close();
    }
}