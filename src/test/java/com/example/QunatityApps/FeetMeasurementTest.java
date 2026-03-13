package com.example.QunatityApps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeetMeasurementTest {

    
    @Test
    void testEquality_SameValue() {
    	FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);
    	FeetMeasurement.Feet f2 = new FeetMeasurement.Feet(1.0);

        assertTrue(f1.equals(f2), "1.0 ft should equal 1.0 ft");
    }

    
    @Test
    void testEquality_DifferentValue() {
    	FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);
    	FeetMeasurement.Feet f2 = new FeetMeasurement.Feet(2.0);

        assertFalse(f1.equals(f2), "1.0 ft should not equal 2.0 ft");
    }

    
    @Test
    void testEquality_NullComparison() {
    	FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);

        assertFalse(f1.equals(null), "Value should not equal null");
    }

  
    @Test
    void testEquality_SameReference() {
    	FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);

        assertTrue(f1.equals(f1), "Object should equal itself");
    }


    @Test
    void testEquality_NonNumericInput() {
    	FeetMeasurement.Feet f1 = new FeetMeasurement.Feet(1.0);
        String other = "abc";

        assertFalse(f1.equals(other), "Feet object should not equal non-numeric type");
    }
}