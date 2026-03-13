package com.example.QunatityApps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InchesMeasurementTest {

    @Test
    void testEquality_SameValue() {

        InchesMeasurement.Inches i1 = new InchesMeasurement.Inches(1.0);
        InchesMeasurement.Inches i2 = new InchesMeasurement.Inches(1.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    void testEquality_DifferentValue() {

        InchesMeasurement.Inches i1 = new InchesMeasurement.Inches(1.0);
        InchesMeasurement.Inches i2 = new InchesMeasurement.Inches(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    void testEquality_NullComparison() {

        InchesMeasurement.Inches i1 = new InchesMeasurement.Inches(1.0);

        assertFalse(i1.equals(null));
    }

    @Test
    void testEquality_SameReference() {

        InchesMeasurement.Inches i1 = new InchesMeasurement.Inches(1.0);

        assertTrue(i1.equals(i1));
    }
}