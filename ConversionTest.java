/**
 * Bryan Siguenza, Hieu Duong, Marco E. Ornelas
 * SWE 437-001
 * Assignment 4 : Unit Test
 * Last Date Modified: 2/15/2020
 *
 * Purpose: Test all methods in Conversion class
 */


import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    //Initialize the Conversion class
    Conversion cv;

    /**
     * Initialize Conversion class instance
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.cv = new Conversion();
    }

    /**
     * Destroy Conversion class instance
     */
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        this.cv = null;
    }

    /**
     * Test method to test the conversion:
     * From Fahrenheit to Celsius
     */
    @org.junit.jupiter.api.Test
    void convertF2C() {
        assertEquals(cv.convertF2C("32"), 0.00);
    }

    /**
     * Test method to test the conversion:
     * From Celsius to Fahrenheit
     */
    @org.junit.jupiter.api.Test
    void convertC2F() {
        assertEquals(cv.convertC2F("0"), 32);
    }

    /**
     * Test method to test the conversion:
     * From Inch to Centimeter
     */
    @org.junit.jupiter.api.Test
    void convertIn2Cm() {
        double result = cv.convertIn2Cm("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 2.54);
    }

    /**
     * Test method to test the conversion:
     * From Centimeter to Inch
     */
    @org.junit.jupiter.api.Test
    void convertCm2In() {
        double result = cv.convertCm2In("2.54");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1);
    }

    /**
     * Test method to test the conversion:
     * From Feet to Meter
     */
    @org.junit.jupiter.api.Test
    void convertF2M() {
        double result = cv.convertF2M("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.3);
    }

    /**
     * Test method to test the conversion:
     * From Meter to Feet
     */
    @org.junit.jupiter.api.Test
    void convertM2F() {
        double result = cv.convertM2F("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.65);
    }

    /**
     * Test method to test the conversion:
     * From Mile to Kilometer
     */
    @org.junit.jupiter.api.Test
    void convertM2K() {
        double result = cv.convertM2K("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.61);
    }

    /**
     * Test method to test the conversion:
     * From Kilometer to Mile
     */
    @org.junit.jupiter.api.Test
    void convertK2M() {
        double result = cv.convertK2M("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.62);
    }

    /**
     * Test method to test the conversion:
     * From Gallon to Liter
     */
    @org.junit.jupiter.api.Test
    void convertG2L() {
        double result = cv.convertG2L("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 3.79);
    }

    /**
     * Test method to test the conversion:
     * From Liter to Gallon
     */
    @org.junit.jupiter.api.Test
    void convertL2G() {
        double result = cv.convertL2G("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.26);
    }

    /**
     * Test method to test the conversion:
     * From Ounce to Gram
     */
    @org.junit.jupiter.api.Test
    void convertOz2G() {
        double result = cv.convertOz2G("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 28.35);
    }

    /**
     * Test method to test the conversion:
     * From Gram to Ounce
     */
    @org.junit.jupiter.api.Test
    void convertG2Oz() {
        double result = cv.convertG2Oz("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.04);
    }

    /**
     * Test method to test the conversion:
     * From Pound to Kilogram
     */
    @org.junit.jupiter.api.Test
    void convertLb2K() {
        double result = cv.convertLb2K("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.45);
    }

    /**
     * Test method to test the conversion:
     * From Kilogram to Pound
     */
    @org.junit.jupiter.api.Test
    void convertK2Lb() {
        double result = cv.convertK2Lb("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 2.21);
    }

    /**
     * Test method to test the conversion:
     * From Mile per hour to Kilometer per hour
     */
    @org.junit.jupiter.api.Test
    void convertMphToKph() {
        double result = cv.convertMphToKph("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.61);
    }

    /**
     * Test method to test the conversion:
     * From Kilometer per hour to Mile per hour
     */
    @org.junit.jupiter.api.Test
    void convertKphToMph() {
        double result = cv.convertKphToMph("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.62);
    }
}