/**
 * Bryan Siguenza, Hieu Duong, Marco E. Ornelas
 * SWE 437-001
 * Assignment 2 : Convert
 * Last Date Modified: 2/4/2020
 *
 * Purpose: Output a menu for measurement conversion
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class ConvertMenu
{
  //constant variables for easy editing of values
  final int zero = 0;
  final int one = 1;
  final int two = 2;
  final int three = 3;
  final int four = 4;
  final int five = 5;
  final int six = 6;
  final int seven = 7;
  final int eight = 8;
  final int nine = 9;
  final int ten = 10;
  final int eleven = 11;
  final int twelve = 12;
  final int thirteen = 13;
  final int fourteen = 14;
  final int fifteen = 15;
  final int sixteen = 16;
  final int exit = 99;
  
  /**
   * main
   *
   * the purpose of this method is to initiate the program
   *
   * @param args      serves no purpose here
   */
  public static void main(String[] args) throws InterruptedException
  {
    ConvertMenu runClass = new ConvertMenu(); // instance of ConvertMenu
    runClass.driver();
  }
  
  /**
   * driver
   *
   * the purpose of this method is to loop through the menus and exit the program when the user enters the
   * corresponding value
   */
  public void driver() throws InterruptedException
  {
    int userMenuChoice = -1; // -1 is to detect any errors
    String userNumber = "none";
    Conversion cv = new Conversion();
    float result = -1;
    
    // main loop to display options and get user input
    do
    {
      mainMenu(); // prints the main menu
      userMenuChoice = inputInteger("Enter choice: "); // gets user's choice
      
      // print error if user did not enter a correct choice
      if (userMenuChoice < zero || (userMenuChoice > sixteen && userMenuChoice != exit))
      {
        System.out.println("You entered: " + userMenuChoice + " which is not a valid choice");
        System.out.println("Please choose again");
      }
      else
      {
        switch (userMenuChoice)
        {
          case zero:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Fahrenheit: ");
            result = cv.convertF2C(userNumber);
            cv.setFahrenheit(result);
            cv.printFahrenheit();
            break;
          case one:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Celsius: ");
            result = cv.convertC2F(userNumber);
            cv.setCelsius(result);
            cv.printCelsius();
            //System.out.println("Fahrenheit = " + nf.format(result));
            break;
          case two:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Inch: ");
            result = cv.convertIn2Cm(userNumber);
            cv.setInch(result);
            cv.printInch();
            //System.out.print("Centimeter = " + nf.format(result));
            break;
          case three:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Centimeter: ");
            result = cv.convertCm2In(userNumber);
            cv.setCentimeter(result);
            cv.printCentimeter();
            //System.out.println("Inch = " + nf.format(result));
            break;
          case four:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Feet: ");
            result = cv.convertF2M(userNumber);
            cv.setFeet(result);
            cv.printFeet();
            //System.out.println("Meter = " + nf.format(result));
            break;
          case five:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Meter: ");
            result = cv.convertM2F(userNumber);
            cv.setMeter(result);
            cv.printMeter();
            //System.out.println("Feet = " + nf.format(result));
            break;
          case six:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Mile: ");
            result = cv.convertM2K(userNumber);
            cv.setMile(result);
            cv.printMile();
            //System.out.println("Kilometer = " + nf.format(result));
            break;
          case seven:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Kilometer: ");
            result = cv.convertK2M(userNumber);
            cv.setKilometer(result);
            cv.printKilometer();
            //System.out.println("Mile = " + nf.format(result));
            break;
          case eight:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Gallon: ");
            result = cv.convertG2L(userNumber);
            cv.setGallon(result);
            cv.printGallon();
            //System.out.println("Liter = " + nf.format(result));
            break;
          case nine:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Liter: ");
            result = cv.convertL2G(userNumber);
            cv.setLiter(result);
            cv.printLiter();
            //System.out.println("Gallon = " + nf.format(result));
            break;
          case ten:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Ounce: ");
            result = cv.convertOz2G(userNumber);
            cv.setOunce(result);
            cv.printOunce();
            //System.out.println("Gram = " + nf.format(result));
            break;
          case eleven:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Gram: ");
            result = cv.convertG2Oz(userNumber);
            cv.setGram(result);
            cv.printGram();
            //System.out.println("Ounce = " + nf.format(result));
            break;
          case twelve:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Pound: ");
            result = cv.convertLb2K(userNumber);
            cv.setPound(result);
            cv.printPound();
            //System.out.println("Kilogram = " + nf.format(result));
            break;
          case thirteen:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Kilogram: ");
            result = cv.convertK2Lb(userNumber);
            cv.setKilogram(result);
            cv.printKilogram();
            //System.out.println("Kilogram = " + nf.format(result));
            break;
          case fourteen:
            userNumber = numberInStringFormat("Enter Miles per Hour: ");
            cv.convertMphToKph(userNumber);
            cv.printKPH();
            break;
          case fifteen:
            userNumber = numberInStringFormat("Enter Kilometers per Hour: ");
            cv.convertKphToMph(userNumber);
            cv.printMPH();
            break;
          case sixteen:
            cv.chooseDecimal();
            break;
          case exit: // allows the user to terminate the program
            System.out.println("Thank you for using this program. Good bye!");
            break;
          default:
            System.out.println("Error in driver switch");
            break;

        }
      }
      sleep(1000); // wait 1 second to display menu again and allow user to see the result/output
    } while (userMenuChoice != exit);
  }
  
  /**
   * mainMenu
   *
   * the purpose of this method is to display the only valid options to the user
   */
  public void mainMenu()
  {
    System.out.println("\n********************************************************************");
    System.out.println("*                Menu Choice               * Valid User Input Choices*");
    System.out.println("**********************************************************************");
    System.out.println("*    Convert From Fahrenheit to Celsius    *            0            *");
    System.out.println("*    Convert From Celsius to Fahrenheit    *            1            *");
    System.out.println("*    Convert From Inch to Centimeter       *            2            *");
    System.out.println("*    Convert From Centimeter to Inch       *            3            *");
    System.out.println("*    Convert From Feet to Meter            *            4            *");
    System.out.println("*    Convert From Meter to Feet            *            5            *");
    System.out.println("*    Convert From Mile to Kilometer        *            6            *");
    System.out.println("*    Convert From Kilometer to Mile        *            7            *");
    System.out.println("*    Convert From Gallon to Liter          *            8            *");
    System.out.println("*    Convert From Liter to Gallon          *            9            *");
    System.out.println("*    Convert From Ounce to Gram            *            10           *");
    System.out.println("*    Convert From Gram to Ounce            *            11           *");
    System.out.println("*    Convert From Pound to Kilogram        *            12           *");
    System.out.println("*    Convert From Kilogram to Pound        *            13           *");
    System.out.println("*    Convert From MPH to KPH               *            14           *");
    System.out.println("*    Convert From KPH to MPH               *            15           *");
    System.out.println("*    Set the decimal point accuracy        *            16           *");
    System.out.println("*           Quit Program                   *            99           *");
    System.out.println("**********************************************************************\n");
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
  
  /**
   * numberInStringFormat
   *
   * the purpose of this method is to get a number and return it as a string
   *
   * @param message  message to display
   * @return  number as a string
   */
  public static String numberInStringFormat(String message)
  {
    Scanner input = new Scanner(System.in);
    
    String inputStr = "none";
    
    // prompt user to enter the number to convert
    System.out.print(message + " ");
    inputStr = input.nextLine();
    
    // return input string
    return inputStr;
  }
}