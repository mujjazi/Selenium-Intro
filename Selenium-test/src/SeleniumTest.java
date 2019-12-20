
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class SeleniumTest {

	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mujtaba.mehdi\\Desktop\\POM\\CarPal-master\\carpal\\src\\test\\resources\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	    	
	        String baseUrl = "https://www.google.com/";
	        String expectedTitle = "Google";
	        String actualTitle = "";

	        // launch Chrome and direct it to the Base URL
	        driver.get(baseUrl);
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // get the actual value of the webpage title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Chromedriver
	        driver.close();
	       
	    }
	
}
