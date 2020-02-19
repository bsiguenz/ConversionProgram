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
     *
     * Observability: output from cv.convertF2C
     * Controllability: input into cv.convertF2C. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertF2C() {
        assertEquals(cv.convertF2C("32"), 0.00);
    }

    /**
     * Test method to test the conversion:
     * From Celsius to Fahrenheit
     *
     * Observability: output from cv.convertC2F
     * Controllability: input into cv.convertC2F. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertC2F() {
        assertEquals(cv.convertC2F("0"), 32);
    }

    /**
     * Test method to test the conversion:
     * From Inch to Centimeter
     *
     * Observability: output from cv.convertIn2Cm. data in result and roundOff
     * Controllability: input into cv.convertIn2Cm. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertIn2Cm() {
        double result = cv.convertIn2Cm("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 2.54);
    }

    /**
     * Test method to test the conversion:
     * From Centimeter to Inch
     *
     * Observability: output from cv.convertCm2In. data in result and roundOff
     * Controllability: input into cv.convertCm2In. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertCm2In() {
        double result = cv.convertCm2In("2.54");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1);
    }

    /**
     * Test method to test the conversion:
     * From Feet to Meter
     *
     * Observability: output from cv.convertF2M. data in result and roundOff
     * Controllability: input into cv.convertF2M. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertF2M() {
        double result = cv.convertF2M("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.3);
    }

    /**
     * Test method to test the conversion:
     * From Meter to Feet
     *
     * Observability: output from cv.convertM2F. data in result and roundOff
     * Controllability: input into cv.convertM2F. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertM2F() {
        double result = cv.convertM2F("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.65);
    }

    /**
     * Test method to test the conversion:
     * From Mile to Kilometer
     *
     * Observability: output from cv.convertM2K. data in result and roundOff
     * Controllability: input into cv.convertM2K. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertM2K() {
        double result = cv.convertM2K("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.61);
    }

    /**
     * Test method to test the conversion:
     * From Kilometer to Mile
     *
     * Observability: output from cv.convertK2M. data in result and roundOff
     * Controllability: input into cv.convertK2M. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertK2M() {
        double result = cv.convertK2M("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.62);
    }

    /**
     * Test method to test the conversion:
     * From Gallon to Liter
     *
     * Observability: output from cv.convertG2L. data in result and roundOff
     * Controllability: input into cv.convertG2L. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertG2L() {
        double result = cv.convertG2L("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 3.79);
    }

    /**
     * Test method to test the conversion:
     * From Liter to Gallon
     *
     * Observability: output from cv.convertL2G. data in result and roundOff
     * Controllability: input into cv.convertL2G. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertL2G() {
        double result = cv.convertL2G("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.26);
    }

    /**
     * Test method to test the conversion:
     * From Ounce to Gram
     *
     * Observability: output from cv.convertOz2G. data in result and roundOff
     * Controllability: input into cv.convertOz2G. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertOz2G() {
        double result = cv.convertOz2G("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 28.35);
    }

    /**
     * Test method to test the conversion:
     * From Gram to Ounce
     *
     * Observability: output from cv.convertG2Oz. data in result and roundOff
     * Controllability: input into cv.convertG2Oz. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertG2Oz() {
        double result = cv.convertG2Oz("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.04);
    }

    /**
     * Test method to test the conversion:
     * From Pound to Kilogram
     *
     * Observability: output from cv.convertLb2K. data in result and roundOff
     * Controllability: input into cv.convertLb2K. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertLb2K() {
        double result = cv.convertLb2K("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.45);
    }

    /**
     * Test method to test the conversion:
     * From Kilogram to Pound
     *
     * Observability: output from cv.convertK2Lb. data in result and roundOff
     * Controllability: input into cv.convertK2Lb. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertK2Lb() {
        double result = cv.convertK2Lb("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 2.21);
    }

    /**
     * Test method to test the conversion:
     * From Mile per hour to Kilometer per hour
     *
     * Observability: output from cv.convertMphToKph. data in result and roundOff
     * Controllability: input into cv.convertMphToKph. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertMphToKph() {
        double result = cv.convertMphToKph("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 1.61);
    }

    /**
     * Test method to test the conversion:
     * From Kilometer per hour to Mile per hour
     *
     * Observability: output from cv.convertKphToMph. data in result and roundOff
     * Controllability: input into cv.convertKphToMph. inputs into assertEquals
     */
    @org.junit.jupiter.api.Test
    void testConvertKphToMph() {
        double result = cv.convertKphToMph("1");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 0.62);
    }
}