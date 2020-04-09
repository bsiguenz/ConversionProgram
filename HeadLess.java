import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLess{
	double c = 0;
	double cm = 0;
	double m = 0;
	
	public static double input(String in, String out, String number) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://cs.gmu.edu:8443/offutt/servlet/conversion");
		driver.findElement(By.name("clear")).click();
		driver.findElement(By.name(in)).sendKeys(number);
		driver.findElement(By.name("submit")).click();
		return (Double.parseDouble(driver.findElement(By.name(out)).getAttribute("value")));

	}
	@Test
	public void a1a2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
	
	@Test
	public void b1a2a3Test(){
		c = input("F","C","-2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-18.889, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
	}
	
	@Test
	public void c1a2a3Test(){
		c = input("F","C","2.5");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.38, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
	}
	@Test
	public void d1a2a3Test(){
		c = input("F","C","-2.5");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-19.1667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
	}
	@Test
	public void e1a2a3Test(){
		c = input("F","C","0");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-17.7778, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
	}
	@Test
	public void f1a2a3Test(){
		c = input("F","C","");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2");
		Assert.assertEquals(0, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
	}

//////////
	@Test
	public void a1b2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "-2");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(-5.08, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
	@Test
	public void a1c2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2.5");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(6.35, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
	@Test
	public void a1d2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "-2.5");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(-6.35, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
	@Test
	public void a1e2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "0");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(0, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
	@Test
	public void a1f2a3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "");
		m = input("ft", "m", "2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(0, cm, .5);
		Assert.assertEquals(.6096, m, .5);
		
	}
//////////
	@Test
	public void a1b2b3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "-2");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(-.6096, m, .5);
		
		
	}
	@Test
	public void a1b2c3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "2.5");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(.762, m, .5);
		
		
	}
	@Test
	public void a1b2d3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "-2.5");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(-.762, m, .5);
		
		
	}
	@Test
	public void a1b2e3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "0");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(0, m, .5);
		
	}
	@Test
	public void a1b2f3Test(){
		c = input("F","C","2");
		cm = input("in", "cm", "2");
		m = input("ft", "m", "");
		Assert.assertEquals(-16.667, c, .5);
		Assert.assertEquals(5.08, cm, .5);
		Assert.assertEquals(0, m, .5);
		
	}
	
}
