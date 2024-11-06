package libraies;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
    private	ChromeDriver driver;
    
	public  void setup() {
        driver = new ChromeDriver();
       
        driver.manage().window().maximize();

	}

}
