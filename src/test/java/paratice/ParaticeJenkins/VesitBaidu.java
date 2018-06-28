package paratice.ParaticeJenkins;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class VesitBaidu {
	public WebDriver driver;
	
	@BeforeClass
	public void loadDriver() {
		Browsers browser = new Browsers('c');
		driver = browser.driver;
	}
		
	@Test
	public void baidu(){
		driver.get("https://www.baidu.com/");
	}
}
