package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Logs;

public class Landingpage implements Logs{
	
	public static final String url="https://www.amazon.ca/";
	
	public static final By sign_in_link=By.xpath("//*[@id='nav-link-yourAccount']/span[1]");
	public static final By show_options=By.cssSelector("#nav-link-yourAccount > span.nav-line-2 > nav-icon nav-arrow");
	
	public static void Click_login_link(WebDriver driver) {
		driver.findElement(sign_in_link).click();
	}
	
	public static void Click_register_link() {
		
	}
}
