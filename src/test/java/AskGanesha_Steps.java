



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AskGanesha_Steps {
	
	public By imgGaneshJee = By.xpath("//img[@src='https://www.askganesha.com/images/logo.png']");
	public By imgLove = By.xpath("//img[@src='https://www.askganesha.com/images-main-new/icon_love.jpg']");
	public By imgLoveAstrology = By.xpath("/html/body/div[2]/div/section/div/div/div/h1/span");
	public static WebDriver ChromeDriver1;
	public static WebDriver ChromeDriver2;

	
	
	
	 @Given("^I see the GaneshJee Image$") 
		public void I_see_the_GaneshJee_Image() {
		 
		 System.out.println("Jai Ganesh Jee");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
			ChromeDriver1= new ChromeDriver();
			ChromeDriver1.manage().window().maximize();
			ChromeDriver1.manage().deleteAllCookies();
			ChromeDriver1.manage().timeouts().pageLoadTimeout(26, TimeUnit.SECONDS);
			ChromeDriver1.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
			ChromeDriver1.get("https://www.askganesha.com");
			
			
			
		}
	
	

	 @When("^I verify various elements on AskGanesha Landing Page$")
	 public void I_verify_various_elements_on_AskGanesha_Landing_Page() {
		 System.out.println("Jai Ganesh Jee");
				
		}
	 
	 @Then("^I confirm that user has reached the home page$")
	 public void I_confirm_that_user_has_reached_the_home_page() {
		 System.out.println("Jai Ganesh Jee");
		 ChromeDriver1.close();
		 
			
		}
	 
	 @Given("^I see the Love Link$") 
		public void I_see_the_Love_Link() {
		System.out.println("Jai Ganesh Jee");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
		 ChromeDriver2= new ChromeDriver();
		 ChromeDriver2.manage().window().maximize();
		 ChromeDriver2.manage().deleteAllCookies();
		 ChromeDriver2.manage().timeouts().pageLoadTimeout(26, TimeUnit.SECONDS);
		 ChromeDriver2.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
		 ChromeDriver2.get("https://www.askganesha.com");
			
		}
	
	 
	 
	 @When("^I click on the Love Link$")
	 public void I_click_on_the_Love_Link() {
		
		 System.out.println("Jai Ganesh Jee");
			
				
		}
	 
	 @Then("^I confirm that the Love page is displayed$")
	 public void I_confirm_that_the_Love_page_is_displayed() {
		
		 System.out.println("Jai Ganesh Jee");
		 ChromeDriver2.close();
		
		}
	 
	 
}
