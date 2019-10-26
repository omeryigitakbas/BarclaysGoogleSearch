package StepDefinitions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BarclaysSearchSteps {
	
	WebDriver driver;
	
	@Given("^I have chrome browser opened$")
	public void open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@When("^I go to https://www.google.com/$")
	public void go_to_google(){
		
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
		
	}
	
	@And("^I type Barclays into search bar$")
	public void type_barclays_into_search_bar() {
		
		//locate search input field
		WebElement searchinputfield = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
						
		searchinputfield.click();
		//As Barclays employee
		//  I want to search for Barclays keyword on google search
		searchinputfield.sendKeys("Barclays");
		
		
		
	}
	@And("^I hit search$")
	public void click_search(){
		
		// Since after sending the keywords to input field suggestions list is blocking the search button, from user experience i decide to click on another element
		WebElement GoogleImage = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		GoogleImage.click();
		WebElement googlesearchbutton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
		googlesearchbutton.click();
		
	}
	
	@Then("^https://www.barclays.co.uk/ is first url on search results page$")
	public void compare_first_url_on_search_results_page() {
		WebElement firsturl = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite"));
		String urlname = firsturl.getText();
				
				if(urlname.contains("barclays.co.uk")) 
				{
					System.out.println("Summary: As Barclays employee when we search 'Barclays' on google, the first url path is=' "+urlname+" ' Test Case succeed!");					
					driver.quit();
					Assert.assertEquals("https://www.barclays.co.uk", urlname);
					
				}else
				{
					System.out.println("Summary: As Barclays employee when we search 'Barclays' on google, the first url path is=' "+urlname+" ' Test Case Failed!");
					driver.quit();
					Assert.fail();
				}
		// I observed that if the domain is set to another region like 'Germany', first url on search result is appear to be https://www.barclays.de
		// The below code is written in case domain language is different then default - based on user experience
		//	else
		//{
		//System.out.println("When we search Barclays on google; https://www.barclays.co.uk is not the first url. The next step will try to change preferred language");
		// If the domain language settings is not set to English
		//}
		//WebElement changelanguage = driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]"));
		//String textlanguage = changelanguage.getText();
		 
		//if(textlanguage.contains("Change to English")
		//	{
		// 	System.out.println("Changing google language settings to English");
		// 	changelanguage.click();
		// 	Assert.assertEquals("https://www.barclays.co.uk", urlname);
		//  driver.close();
		//  driver.quit();
		//	}	
		// 	else 
		//	{
		//	System.out.println("Changing google language settings to English option is not appearing on the page");
		//	Assert.fail();
		//	driver.close();
		//	driver.quit();
		 }
		
		
		
		
	}
	
