import org.junit.Test;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class EncontrarElementos {
		
		public static void main(String[] args) {
			
			WebDriver driver = new FirefoxDriver();
			//instancia di driver
			driver.get("https://twitter.com/login/");
			//pega url
			driver.manage().window().maximize();
			//pega os campos pelo Xpath e id
			driver.findElement(By.xpath("//div[@class='signin-wrapper']//input[@name='session[username_or_email]']")).sendKeys("seuemail");
			driver.findElement(By.xpath("//div[@class='signin-wrapper']//input[@name='session[password]']")).sendKeys("suasenha");
			driver.findElement(By.xpath("//div[@class='signin-wrapper']//button[@class='submit btn primary-btn']")).click();
			driver.findElement(By.id("tweet-box-home-timeline")).sendKeys("teste legal do Twitter");
			driver.findElement(By.xpath("//div[@class='TweetBoxToolbar']//button[@class='btn primary-btn tweet-action tweet-btn js-tweet-btn']")).click();
			
		}
		//encontrar elementos visíveis
		public static WebElement getVisibleElement(WebDriver driver, String name) {
		    List<WebElement> elements = driver.findElements(By.name(name));
		    for (WebElement element : elements) {
		        if (element.isDisplayed()) {
		            return element;
		        }
		    }
		    return null;
		
		}
	}

	


