/**
 * Bryan Siguenza, Hieu Duong, Marco E. Ornelas
 * SWE 437-001
 * Assignment 2 : Convert
 * Last Date Modified: 2/4/2020
 *
 * Purpose: Output a menu for measurement conversion
 */

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
  final int seventeen = 17;
  final int eighteen = 18;
  final int nineteen = 19;
  final int twenty= 20;
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
    String formattedNumber = "";
    Conversion cv = new Conversion();
    float result = -1;
    
    // main loop to display options and get user input
    do
    {

      userMenuChoice = mainUI();
      
      // print error if user did not enter a correct choice
      if (userMenuChoice < zero || (userMenuChoice > twenty && userMenuChoice != exit))
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
            formattedNumber = cv.printFormatted(result);
            System.out.println("Celsius = " + formattedNumber);
            break;
          case one:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Celsius: ");
            result = cv.convertC2F(userNumber);

            formattedNumber = cv.printFormatted(result);
            System.out.println("Fahrenheit = " + formattedNumber);
            break;
          case two:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Inch: ");
            result = cv.convertIn2Cm(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Centimeter = " + formattedNumber);
            break;
          case three:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Centimeter: ");
            result = cv.convertCm2In(userNumber);

            formattedNumber = cv.printFormatted(result);
            System.out.println("Inch = " + formattedNumber);
            break;
          case four:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Feet: ");
            result = cv.convertF2M(userNumber);

            formattedNumber = cv.printFormatted(result);
            System.out.println("Meter = " + formattedNumber);
            break;
          case five:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Meter: ");
            result = cv.convertM2F(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Feet = " + formattedNumber);
            break;
          case six:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Mile: ");
            result = cv.convertM2K(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Kilometer = " + formattedNumber);
            break;
          case seven:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Kilometer: ");
            result = cv.convertK2M(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Mile = " + formattedNumber);
            break;
          case eight:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Gallon: ");
            result = cv.convertG2L(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Liter = " + formattedNumber);
            break;
          case nine:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Liter: ");
            result = cv.convertL2G(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Gallon = " + formattedNumber);
            break;
          case ten:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Ounce: ");
            result = cv.convertOz2G(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Gram = " + formattedNumber);
            break;
          case eleven:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Gram: ");
            result = cv.convertG2Oz(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Ounce = " + formattedNumber);
            break;
          case twelve:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Pound: ");
            result = cv.convertLb2K(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Kilogram = " + formattedNumber);
            break;
          case thirteen:
            //chooseDecimal();
            userNumber = numberInStringFormat("Enter Kilogram: ");
            result = cv.convertK2Lb(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Pound = " + formattedNumber);
            break;
          case fourteen:
            userNumber = numberInStringFormat("Enter Miles per Hour: ");
            result = cv.convertMphToKph(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Kilometers per Hour = " + formattedNumber);
            break;
          case fifteen:
            userNumber = numberInStringFormat("Enter Kilometers per Hour: ");
            result = cv.convertKphToMph(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Miles per Hour = " + formattedNumber);
            break;
          case sixteen:
            cv.chooseDecimal();
            break;
          case seventeen:
            userNumber = numberInStringFormat("Enter Milers per Gallon: ");
            result = cv.convertMpG2KpL(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Kilometers per liter = " + formattedNumber);
            break;
          case eighteen:
            userNumber = numberInStringFormat("Enter Kilometers per liter: ");
            result = cv.convertKpL2MpG(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Miles per gallon = " + formattedNumber);
            break;
          case nineteen:
            userNumber = numberInStringFormat("Enter Kelvin: ");
            result = cv.convertKel2Cel(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Celsius = " + formattedNumber);
            break;
          case twenty:
            userNumber = numberInStringFormat("Enter Celsius: ");
            result = cv.convertCel2Kel(userNumber);
            formattedNumber = cv.printFormatted(result);
            System.out.println("Kelvin = " + formattedNumber);
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

  /*
    main user interface deals with reading input from user
    it also calls overloaded method to return value;
   */
  public int mainUI(){
    int userMenuChoice;
    mainMenu(); // prints the main menu
    userMenuChoice = inputInteger("Enter choice: "); // gets user's choice
    return mainUI(userMenuChoice);
  }
  /*
    overload mainUI method to be able to test input
   */
  public int mainUI(int number){
    return number;
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
    System.out.println("*    Convert from MPG to KPL               *            17           *");
    System.out.println("*    Convert from KPL to MGP               *            18           *");
    System.out.println("*    Convert from Kelvin to Celsius        *            19           *");
    System.out.println("*    Convert from Celsius to Kelvin        *            20           *");
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