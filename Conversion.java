import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Bryan Siguenza, Hieu Duong, Marco E. Ornelas
 * SWE 437-001
 * Assignment 2 : Convert
 * Last Date Modified: 2/4/2020
 *
 * Purpose: Teach us how important writing good code is. Also, convert different measurements
 */

public class Conversion
{

  Locale locale = Locale.ENGLISH;
  NumberFormat nf = NumberFormat.getNumberInstance(locale);
  final double KM_CONSTANT = 1.6093440;
  // Temp
  private double fahrenheit;
  private double celsius;
  private double inch;
  //lenght
  private double centimeter;
  private double feet;
  private double meter;
  private double mile;
  private double kilometer;
  //fluid
  private double gallon;
  private double liter;
  private double ounce;
  private double gram;
  private double pound;
  private double kilogram;
  private double miles_per_hour;
  private double kilometers_per_hour;
  //speed


  //default constructor
  Conversion(){
    fahrenheit = 0;
    celsius = 0;
    inch = 0;
    //lenght
    centimeter = 0;
    feet = 0;
    meter = 0;
    mile = 0;
    kilometer = 0;
    //fluid
    gallon = 0;
    liter = 0;
    ounce = 0;
    gram = 0;
    pound = 0;
    kilogram = 0;
    miles_per_hour = 0;
    kilometers_per_hour = 0;
    nf.setMinimumFractionDigits(2);
    nf.setMaximumFractionDigits(2);
  }


  public float roundTo(float num)
  {
    int n;
    n    = Math.round(num * (float)100.0);
    num = (float) (n / (float)100.0);
    return num;
  }


  public int chooseDecimal()
  {
    int dec = -1;
    do
    {
      dec = inputInteger("Specify decimal number (between 0 and 4): ");
    } while (dec < 0 || dec >4 );
    //set decimal format
    nf.setMinimumFractionDigits(dec);
    nf.setMaximumFractionDigits(dec);
    return dec;
  }

  /**
   * inputInteger
   *
   * the purpose of this method is to get an integer from the keyboard and clean the keyboard buffer
   *
   * @param prompt    message for the user
   * @return int      the input from the keyboard
   */
  public static int inputInteger(String prompt)
  {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    @SuppressWarnings("unused")
    String cleanUpStr;	// string to clean up keyboard buffer
    int num;            // number

    num = 0;
    cleanUpStr = "no string yet";

    // prompt to enter integer
    System.out.print(prompt);
    // reads number
    num = input.nextInt();
    // string to clean up keyboard buffer
    cleanUpStr = input.nextLine();

    return(num);
  }

  public float convertF2C (String FAsStr)
  {
    // Convert farenheit to celsius
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf(FAsStr).floatValue());
    num1 = roundTo(num1);
    // Convert
    num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
    num2 = roundTo(num2);
    return (num2);
  }


  public float convertC2F (String CAsStr)
  {
    // Convert celsius to farenheit
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (CAsStr).floatValue ());
    num1 = roundTo(num1);
    // Convert
    num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
    num2 = roundTo(num2);
    return(num2);
  }

  // small distance
  public float convertIn2Cm (String inAsStr)
  {
    // Convert inches to centimeters
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (inAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 2.54);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertCm2In (String cmAsStr)
  {
    // Convert centimeters to inches
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (cmAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 0.3937);
    num2 = roundTo(num2);
    return(num2);
  }

  // medium distance
  public float convertF2M (String ftAsStr)
  {
    // Convert feet to meters
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (ftAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 0.3048);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertM2F (String mAsStr)
  {
    // Convert meters to feet
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (mAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 / 0.6048);
    num2 = roundTo(num2);
    return(num2);
  }

  // large distance
  public float convertM2K (String miAsStr)
  {
    // Convert miles to kilometers
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (miAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 1.609);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertK2M (String kmAsStr)
  {
    // Convert kilometers to miles
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (kmAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 0.6214);
    num2 = roundTo(num2);
    return(num2);
  }


  // volume
  public float convertG2L (String galAsStr)
  {
    // Convert gallons to liters
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (galAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 3.785);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertL2G (String LAsStr)
  {
    // Convert liters to gallons
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (LAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 / 3.785);
    num2 = roundTo(num2);
    return(num2);
  }

  // small weight
  public float convertOz2G (String ozAsStr)
  {  // Convert ounces to grams
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (ozAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 28.35);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertG2Oz (String gAsStr)
  {
    // Convert grams to ounces
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (gAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 / 28.35);
    num2 = roundTo(num2);
    return(num2);
  }
  // medium weight
  public float convertLb2K (String lbAsStr)
  {
    // Convert pounds to kilograms
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (lbAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 0.4536);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertK2Lb (String kgAsStr)
  {
    // Convert kilograms to pounds
    float num1, num2; // temporary variables
    // Round to 2 digits past decimal
    num1 = (Float.valueOf (kgAsStr).floatValue ());
    num1 = roundTo(num1);
    num2 = (float) (num1 * 2.205);
    num2 = roundTo(num2);
    return(num2);
  }

  public float convertMphToKph (String FAsStr)
  {
      // Convert farenheit to celsius
      float num1;
      num1 = (Float.valueOf(FAsStr).floatValue());
      num1 *= (float)(KM_CONSTANT);
      return num1;
  }

  public float convertKphToMph (String FAsStr)
  {
      // Convert farenheit to celsius
      float num1;
      num1 = (Float.valueOf(FAsStr).floatValue());
      num1 /= (float)(KM_CONSTANT);
      return num1;
  }


  public float convertMpG2KpL (String FAsStr)
  {
    // Convert miles per gallon to kilometers per liter
    float num1;
    num1 = (Float.valueOf(FAsStr).floatValue());
    num1 /=  2.352;
    return num1;
  }

  public float convertKpL2MpG (String FAsStr)
  {
    // Convert kilometers per liter to miles per gallon
    float num1;
    num1 = (Float.valueOf(FAsStr).floatValue());
    num1 *=  2.825;
    return num1;
  }

  public float convertKel2Cel (String FAsStr)
  {
    // Convert kilometers per liter to miles per gallon
    float num1;
    num1 = (Float.valueOf(FAsStr).floatValue());
    num1 -=  273.15;
    return num1;
  }

  public float convertCel2Kel (String FAsStr)
  {
    // Convert kilometers per liter to miles per gallon
    float num1;
    num1 = (Float.valueOf(FAsStr).floatValue());
    num1 +=  273.15;
    return num1;
  }

  public String printFormatted (float number)
  {
    return nf.format(number);
  }
}