package com.example.QunatityApps;
public class InchesMeasurement {
	 public static class Inches {
	       private double value;
	        public Inches(double value) {
	            if (Double.isNaN(value)) {
	                throw new IllegalArgumentException("Value must be numeric");
	            }
	            this.value = value;
	        }

	        public double getValue() {
	            return value;
	        }

	        @Override
	        public boolean equals(Object obj) {

	            if (this == obj)
	                return true;

	            if (obj == null)
	                return false;

	            if (getClass() != obj.getClass())
	                return false;

	            Inches other = (Inches) obj;

	            return Double.compare(this.value, other.value) == 0;
	        }
	    }
	}


