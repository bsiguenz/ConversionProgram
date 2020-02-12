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

  public void convertMphToKph (String FAsStr)
  {
      // Convert farenheit to celsius
      float num1;
      num1 = (Float.valueOf(FAsStr).floatValue());
      num1 *= (float)(KM_CONSTANT);
      setKPH(num1);
  }

  public void convertKphToMph (String FAsStr)
  {
      // Convert farenheit to celsius
      float num1;
      num1 = (Float.valueOf(FAsStr).floatValue());
      num1 /= (float)(KM_CONSTANT);
      setMPH(num1);
  }

  public void setFahrenheit(float number){
    this.fahrenheit = number;
  }

  public void printFahrenheit(){
    System.out.println("Fahrenheit = " + nf.format(fahrenheit));
  }

  public void setCelsius(float number){
    this.celsius = number;
  }

  public void printCelsius(){
    System.out.println("Celcius = " + nf.format(celsius));
  }

  public void setInch(float number){
    this.inch = number;
  }

  public void printInch(){
    System.out.println("Inch = " + nf.format(inch));
  }

  public void setCentimeter(float number){
    this.centimeter = number;
  }

  public void printCentimeter(){
    System.out.println("Centimeter = " + nf.format( this.inch));
  }

  public void setFeet(float number){
    this.feet = number;
  }

  public void printFeet(){
    System.out.println("Feet = " + nf.format( this.feet));
  }

  public void setMeter(float number){
    this.meter = number;
  }

  public void printMeter(){
    System.out.println("Meter = " + nf.format( this.meter));
  }

  public void setMile(float number){
    this.mile = number;
  }

  public void printMile(){
    System.out.println("Mile = " + nf.format( this.mile));
  }

  public void setKilometer(float number){
    this.kilometer = number;
  }

  public void printKilometer(){
    System.out.println("Kilometer = " + nf.format( this.kilometer));
  }

  public void setGallon(float number){
    this.gallon = number;
  }

  public void printGallon(){
    System.out.println("Gallon = " + nf.format( this.gallon));
  }

  public void setLiter(float number){
    this.liter = number;
  }

  public void printLiter(){
    System.out.println("Litter = " + nf.format( this.liter));
  }

  public void setOunce(float number){
    this.ounce = number;
  }

  public void printOunce(){
    System.out.println("Ounce = " + nf.format( this.ounce));
  }

  public void setGram(float number){
    this.gram = number;
  }

  public void printGram(){
    System.out.println("Gram = " + nf.format( this.gram));
  }

  public void setPound(float number){
    this.pound = number;
  }

  public void printPound(){
    System.out.println("Pound = " + nf.format( this.pound));
  }

  public void setKilogram(float number){
        this.kilogram = number;
  }

  public void printKilogram(){
        System.out.println("Kilogram = " + nf.format( this.kilogram));
  }

  public void setKPH(float number){
    this.kilometers_per_hour = number;
  }

  public void printKPH(){
      System.out.println("Kilometers per hour = " + nf.format( this.kilometers_per_hour));
  }

  public void setMPH(float number){
      this.miles_per_hour = number;
  }

  public void printMPH(){
      System.out.println("Mile per Hour = " + nf.format( this.miles_per_hour));
  }
}