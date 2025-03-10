package DCpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DC_Login_NewItemAdd {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\alimu\\eclipse-workspace\\DZtesting\\Driver\\chromedriver.exe");

	        // Create an instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();  
	        driver.manage().window().maximize();

	        // Open a web site to test
	        driver.get("https://app.dizicashier.com/login");	
	        Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/div/form/div[1]/div[1]/input")).sendKeys("alimuzzaman.dizicashier@gmail.com");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div/input")).sendKeys("12345");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=\"accordionLeftMenu\"]/li[2]/div[1]/div[1]/span[2]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"collapseServices\"]/div/ul/li[1]/a/div/p")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/a")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//*[@id=\"item-name\"]")).sendKeys("NEW ITEM 1"); //Item Name
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"buyingPrice\"]")).sendKeys("300"); //Buying Price
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"sellingPrice\"]")).sendKeys("500"); //Selling Price
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"initial\"]")).sendKeys("10"); //Initial Stock
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/form/div/div[6]/div[1]/div[1]/div[2]/button")).click(); //Auto Generate Barcode
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/form/div/div[9]/button[1]")).click(); //Save Item
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/a/div/div[2]/div")).click();
	        Thread.sleep(20000);
	        driver.close();
	        
	}

}
