import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

public class NodeTest {
	
	
	private  double c = 0;
	private  double cm = 0;
	private  double m = 0;
	private  double km = 0;
	private  double l = 0;
	private  double g = 0;
	private  double kg = 0;
	
	private static String[] outField = {"C","cm","m","km","L","g","kg"}; 
	
	public static void setInput(String in, String number, WebDriver driver) {
		driver.findElement(By.name(in)).sendKeys(number);
	}
	
	public double getValue(String out, WebDriver driver) {
		return (Double.parseDouble(driver.findElement(By.name(out)).getAttribute("value")));
	}
	
	public void getInput(WebDriver driver) {
		
		driver.findElement(By.name("submit")).click();
		
		c = getValue(outField[0],driver);
		cm = getValue(outField[1], driver);
		m = getValue(outField[2], driver);
		km = getValue(outField[3], driver);
		l = getValue(outField[4], driver);
		g = getValue(outField[5],driver);
		kg = getValue(outField[6], driver);
		
	}
	public void getResults(String[] p) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://cs.gmu.edu:8443/offutt/servlet/conversion");
		driver.findElement(By.name("clear")).click();
		
		setInput("F", p[0], driver);
		setInput("in", p[1],driver);
		setInput("ft", p[2],driver);
		setInput("mi", p[3],driver);
		setInput("gal", p[4],driver);
		setInput("oz", p[5],driver);
		setInput("lb", p[6],driver);
		getInput(driver);
	}
	
	@Test
   public void testPath1()
   {
      conversion c = new conversion();
      try
      {
         String[] inputPara = {"abc","10","10","10","10","10","10"};
         getResults(inputPara);
         c.doPost(null, null);
      }catch (IOException | ServletException | NullPointerException | NoSuchElementException e)
      {
         System.out.println("Expected Test Path 1 fail");
      }
   }
	
	
	@Test
	public void testPath2(){
	String[] inputPara = {"10","10","10","10","10","10","10"};
	getResults(inputPara);
	
	Assert.assertEquals(-12.22, c, .5);
	Assert.assertEquals( 25.4, cm, .5);
	Assert.assertEquals(3.05, m, .5);
	Assert.assertEquals(16.09, km, .5);
	Assert.assertEquals(37.85, l, .5);
	Assert.assertEquals(283.5, g, .5);
	Assert.assertEquals( 4.54, kg, .5);

	}
}

