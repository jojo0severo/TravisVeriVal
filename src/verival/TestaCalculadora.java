package verival;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
public class TestaCalculadora {

@Test
public void simpleMultiplication() {

    WebDriver browser = new FirefoxDriver();

    browser.get("http://www.math.com/students/calculators/source/basic.htm\n");
    
    browser.findElement(By.name("four")).click();
    browser.findElement(By.name("times")).click();
    browser.findElement(By.name("five")).click();
    browser.findElement(By.name("DoIt")).click();
    String result = browser.findElement(By.name("Input")).getAttribute("value");
    assertEquals(20, Integer.parseInt(result));
    
    browser.close();        
   }
}