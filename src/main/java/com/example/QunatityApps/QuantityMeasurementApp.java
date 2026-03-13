package com.example.QunatityApps;

public class QuantityMeasurementApp {

    public static boolean checkFeetEquality(double v1, double v2) {

        FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(v1);
        FeetMeasurement.Feet f2 = new FeetMeasurement.Feet(v2);

        return f1.equals(f2);
    }

    public static boolean checkInchesEquality(double v1, double v2) {

        InchesMeasurement.Inches i1 = new InchesMeasurement.Inches(v1);
        InchesMeasurement.Inches i2 = new InchesMeasurement.Inches(v2);

        return i1.equals(i2);
    }

    public static void main(String[] args) {

        System.out.println("Feet Equality: " + checkFeetEquality(1.0, 1.0));
        System.out.println("Inches Equality: " + checkInchesEquality(1.0, 1.0));
    }
}