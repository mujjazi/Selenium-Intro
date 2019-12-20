import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
	
		//Here we are just pointing the directory in which web driver is located
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mujtaba.mehdi\\Desktop\\POM\\CarPal-master\\carpal\\src\\test\\resources\\Drivers\\chromedriver.exe");		
		
		//Can anyone explain what are we doing here?
		WebDriver driver = new ChromeDriver();
				
		//A Demo website for practising automation    	
		String baseUrl = "http://newtours.demoaut.com/index.php";
		
		//Defining wait variable with a driver instance and timeout as arguments
		WebDriverWait wait = new WebDriverWait(driver,60);

		       
		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);

		//name click
		//driver.findElement(By.name("userName")).click();
		        
		//name sendkeys username
		driver.findElement(By.name("userName")).sendKeys("testworkshop");
		        
		//name sendkeys password
		driver.findElement(By.name("password")).sendKeys("test@123");
		        
		//name login click
		driver.findElement(By.name("login")).click();
		        
		//name dropdown click
		//driver.findElement(By.name("airline")).click();
		        
		//Explicit/Dynamic wait
		//WebElement airline;
		//airline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("airline")));
		
		Select dropdown = new Select(driver.findElement(By.name("airline")));
		dropdown.selectByVisibleText("Blue Skies Airlines");

		//continue button by name click 
		driver.findElement(By.name("findFlights")).click();
		
		//continue button by name click 
		driver.findElement(By.name("reserveFlights")).click();		

		//enter first name click
		driver.findElement(By.name("passFirst0")).sendKeys("Robot");
		
		//enter last name click
		driver.findElement(By.name("passLast0")).sendKeys("No Last name");

		//enter last name click
		driver.findElement(By.name("creditnumber")).sendKeys("41111111111111");
		
		//complete registration click
		driver.findElement(By.name("buyFlights")).click();
		
		
		//Hardcoded wait
		Thread.sleep(3000);
		        
		// get the actual value of the title on the current page
		String actualTitle = driver.getTitle();
		
		//Page title on confirmation page
		String  expectedTitle = "Flight Confirmation: Mercury Tours";
		        
		
		//Assertion of our Test Case
			if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		    } 
			else {
		            System.out.println("Test Failed");
		    }
		       

		        
			//close Chrome
			//There is a problem here with this closing method, Can anyone identify?
			driver.close();
		
		
	}

}
