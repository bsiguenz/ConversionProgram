/**
 * Bryan Siguenza, Hieu Duong, Marco E. Ornelas
 * SWE 437-001
 * Assignment 4 : Unit Test
 * Last Date Modified: 3/04/2020
 *
 * Purpose: Test all methods in Conversion class
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTestNew {
    //Initialize the Conversion class
    Conversions cv;

    /**
     * Initialize Conversion class instance
     */

    @BeforeEach
    void setUp() {
        this.cv = new Conversions();
    }

    /**
     * Destroy Conversion class instance
     */

    @AfterEach
    void tearDown() {
        this.cv = null;
    }

    /**
     * Test method to test the conversion:
     * From Miles per gallon to kilometers per gallon
     *
     * Observability: output from cv.convertMpG2KpL
     * Controllability: input into cv.convertMpG2KpL. inputs into assertEquals
     */
    @Test
    void testConvertMpG2KpL() {
        double result = cv.convertMpG2KpL("5");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 2.13);
    }

    /**
     * Test method to test the conversion:
     * From kilometers per liter to miles per gallon
     *
     * Observability: output from cv.convertKpL2MpG
     * Controllability: input into cv.convertKpL2MpG. inputs into assertEquals
     */
    @Test
    void testConvertKpL2MpG() {
        double result = cv.convertKpL2MpG("5");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 14.13);
    }

    /**
     * Test method to test the conversion:
     * From Kelvin to Celsius
     *
     * Observability: output from cv.convertKel2Cel
     * Controllability: input into cv.convertKel2Cel. inputs into assertEquals
     */
    @Test
    void testConvertKel2Cel() {
        double result = cv.convertKel2Cel("10");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, -263.15);
    }

    /**
     * Test method to test the conversion:
     * From Celsius to Kelvin
     *
     * Observability: output from cv.convertCel2Kel
     * Controllability: input into cv.convertCel2Kel. inputs into assertEquals
     */
    @Test
    void testConvertCel2Kel() {
        double result = cv.convertCel2Kel("15");
        //Round to 2 decimals
        double roundOff = Math.round(result * 100.0) / 100.0;
        assertEquals(roundOff, 288.15);
    }
}