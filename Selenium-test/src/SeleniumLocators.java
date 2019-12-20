
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mujtaba.mehdi\\Desktop\\POM\\CarPal-master\\carpal\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriverWait wait = new WebDriverWait(driver,60);

       
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        //id click
        driver.findElement(By.id("txtUsername")).click();
        
        //id sendkeys
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        
        //name
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");;
        
        //class
        driver.findElement(By.className("button")).click();
        
        
        
        //Explicit/Dynamic wait
        WebElement adminlink;
        adminlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Welcome")));
        adminlink.click();
        
        //partial link text
        driver.findElement(By.partialLinkText("Welcome")).click();
        
       long TimeOut = 60;
		//implicit wait
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);				

        //Hardcoded wait
        Thread.sleep(5000);
        
        // get the actual value of the title
        String actualTitle = driver.getTitle();
        
        String  expectedTitle = "OrangeHRM";
        
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       

        
        //close Chrome
        driver.close();

	}

}
