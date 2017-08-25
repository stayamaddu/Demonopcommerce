package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.BaseFile;

public class StepDefinations extends BaseFile{
	

	@Before
	public void openBrowser(){			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\svmad\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
		driver.quit();

	}
	
	@Given("^As a user I am at \"([^\"]*)\"$")
	public void as_a_user_I_am_at(String url) throws Throwable {
				
		driver.navigate().to(url);
	    
	}
	
	@Given("^As a user I am at home page$")
	public void as_a_user_I_am_at_home_page() throws Throwable {
		
		Assert.assertEquals("nopCommerce demo store",driver.getTitle());
	    
	}

	@Given("^as a user I am at homepage$")
	public void as_a_user_I_am_at_homepage() throws Throwable {
		
		Assert.assertEquals("nopCommerce demo store",driver.getTitle());
		
	   
	}

	@When("^I click on login button I enter into login page#$")
	public void i_click_on_login_button_I_enter_into_login_page() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	   
	}

	@When("^as a user I enter email id and password$")
	public void as_a_user_I_enter_email_id_and_password() throws Throwable {
		
		driver.findElement(By.id("Email")).sendKeys("satya90");
		
		driver.findElement(By.id("Password")).sendKeys("Diamond123");
		
		
	    
	}

	@Then("^as a user click on login button then user can be able to login into the website$")
	public void as_a_user_click_on_login_button_then_user_can_be_able_to_login_into_the_website() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();
	    
		
	}
	
	@When("^As a user I click on login button$")
	public void as_a_user_I_click_on_login_button() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  
	}

	@When("^As a user I enter invalid data into email and password field$")
	public void as_a_user_I_enter_invalid_data_into_email_and_password_field() throws Throwable {
		
         driver.findElement(By.id("Email")).sendKeys("svmaddu@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("satya123");
	   
	}

	@Then("^As a user I click on login button tehn user not be able to login into the website$")
	public void as_a_user_I_click_on_login_button_tehn_user_can_t_enter_into_the_website() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();
	    
	    
	}
	
	@When("^As  auserI click on gift cards link homepage$")
	public void as_auserI_click_on_gift_cards_link_homepage() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[7]/a")).click();
	    
	}

	@When("^As a user I click on (\\d+) pounds virtual gift card$")
	public void as_a_user_I_click_on_pounds_virtual_gift_card(int arg1) throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/a/img")).isDisplayed();
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/a/img")).click();
	    
	}

	@Then("^as a user I click on add to compare list the item should be added to compare list$")
	public void as_a_user_I_click_on_add_to_compare_list_the_item_should_be_added_to_compare_list() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='product-details-form']/div/div[1]/div[2]/div[8]/div[2]/input")).click();
	    
	}
	
	@When("^As a user I click on jewelry link on homepage$")
	public void as_a_user_I_click_on_jewelry_link_on_homepage() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
	    
	}

	@When("^AS a user I click on flower girl bracelet item$")
	public void as_a_user_I_click_on_flower_girl_bracelet_item() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[1]/a/img")).isDisplayed();
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[1]/a/img")).click();
	    
	}

	@When("^As a user I click on whishlist button$")
	public void as_a_user_I_click_on_whishlist_button() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='add-to-wishlist-button-41']")).click();
	   
	}

	@Then("^user can see selcted item in the whishlist$")
	public void user_can_see_selcted_item_in_the_whishlist() throws Throwable {
	    
		driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
	}
	
	@When("^As a user I click on books link on homepage$")
	public void as_a_user_I_click_on_books_link_on_homepage() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
	    
	}

	@When("^As a user I click on currency box$")
	public void as_a_user_I_click_on_currency_box() throws Throwable {
		
		driver.findElement(By.id("customerCurrency")).click();
		driver.findElement(By.xpath("//*[@id='customerCurrency']/option[2]")).click();
	   
	}

	@Then("^As a user I slected euro option I can see all books cost in euros$")
	public void as_a_user_I_slected_euro_option_I_can_see_all_books_cost_in_euros() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='customerCurrency']/option[2]")).click();
	    
	}
	@When("^As a user I open jewelry on homepage$")
	public void as_a_user_I_open_jewelry_on_homepage() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
		
		}

	@When("^As user I click on display per page box$")
	public void as_user_I_click_on_display_per_page_box() throws Throwable {
		
		driver.findElement(By.id("products-pagesize")).click();
	    
	}

	@Then("^I can select required number of items per page$")
	public void i_can_select_required_number_of_items_per_page() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='products-pagesize']/option[1]")).click();
	  
	}
	

	@When("^As a user I click on search box$")
	public void as_a_user_I_click_on_search_box() throws Throwable {
		
		driver.findElement(By.id("small-searchterms")).click();
	    
	}

	@When("^Asa user I enter laptops into the search box$")
	public void asa_user_I_enter_laptops_into_the_search_box() throws Throwable {
		
		driver.findElement(By.id("small-searchterms")).sendKeys("laptops");
	    
	}

	@Then("^I click on search button related items should be displayed$")
	public void i_click_on_search_button_related_items_should_be_displayed() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='small-search-box-form']/input[2]")).click();
	   
	}
	

	@When("^As a user I open books on homepge$")
	public void as_a_user_I_open_books_on_homepge() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
	    
	}

	@When("^As a user I select items range under (\\d+) pounds$")
	public void as_a_user_I_select_items_range_under_pounds(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("^as a user I can see the items range under (\\d+) pounds$")
	public void as_a_user_I_can_see_the_items_range_under_pounds(int arg1) throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[3]/div[1]/span[2]")).click();
	    
	}
	
	@When("^As user I click on electronics link on homepage$")
	public void as_user_I_click_on_electronics_link_on_homepage() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
	    
	}

	@When("^As a user I open cellphones list$")
	public void as_a_user_I_open_cellphones_list() throws Throwable {
	    
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).isDisplayed();
		driver.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
	}

	@When("^As a user I click on sort by box$")
	public void as_a_user_I_click_on_sort_by_box() throws Throwable {
		
		driver.findElement(By.id("products-orderby")).click();
		driver.findElement(By.xpath("//*[@id='products-orderby']/option[2]")).click();
	   
	}

	@Then("^as a user I select a-z order then user can see all items in alphabets order$")
	public void as_a_user_I_select_a_z_order_then_user_can_see_all_items_in_alphabets_order() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='products-orderby']/option[2]")).click();
	   
	}




}
