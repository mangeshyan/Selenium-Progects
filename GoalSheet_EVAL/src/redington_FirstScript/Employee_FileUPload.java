package redington_FirstScript;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employee_FileUPload {

	public static void main(String[] args) throws InterruptedException {

		 {

			   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions co =new ChromeOptions();
				co.setBinary("C:\\Users\\BlueOrbit\\Downloads\\chrome-win64\\chrome.exe");
				
				//System.setProperty("webdriver.gecko.driver", "E:\\Mangesh\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				//WebDriver driver=new FirefoxDriver();
				
			    WebDriver driver = new ChromeDriver(co);
				
				
				driver.manage().window().maximize();
				driver.get("https://www.redington.edbrix.info/hr");
				System.out.println(driver.getTitle());
		       
		        
		        Duration waitTime = Duration.ofSeconds(20); // 10 seconds

				WebDriverWait wait = new WebDriverWait(driver, waitTime);
		       
		        
		        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        element1.click();
		        
		        //driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		        System.out.println("Sign in clicked");	
		        
		        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/hr/manageparameters']")));
		        element2.click();
		        
		        WebElement element3 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon support_icon']")));
		        element3.click();
		        System.out.println("Setting Icon Cliked");
		        
		        WebElement element4 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/hr/settings/employee']//div[@class='flex items-center justify-between']")));
		        element4.click();
		        System.out.println("Employee clicked!");
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@id='required-search']")).sendKeys("41100346");
		        Thread.sleep(2000);
		        

		        System.out.println("Code reached to scrollbar");
		        
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;  
		        js.executeScript("document.querySelector(\".sc-feUZmu.eguvnT\").scrollLeft=1500");
		        
		        System.out.println("Js executed");
		        Thread.sleep(4000);
		        
		        Actions action = new Actions(driver);
		        
		        

		        action.moveToElement(driver.findElement(By.xpath("//i[@class='icon userFile_icon']"))).click().perform();
		        System.out.println("File Input clicked!");
		        Thread.sleep(2000);
		      
		        WebElement element12 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")));
		        element12.click();
		        
		        WebElement element13 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='2023-2024']")));
		        element13.click();
		        
		        /*action.moveToElement(driver.findElement(By.xpath("//input[@id='fileImport']"))).click().perform();
		        System.out.println("File browse!");*/
		        
		        driver.findElement(By.xpath("//input[@id='fileImport']")).sendKeys("E:\\File upload Sel\\Sales Team - 41100005 Allam Ibrahim.xlsx");
		        System.out.println("File ready to import!");
		        	        		        
		        //driver.findElement(By.id("btnSaveTradeDocument")).sendKeys(Keys.ENTER);
		        
		        driver.findElement(By.xpath("//a[@class='bg-[#029046] border border-[#029046] rounded-md text-sm text-white px-4 py-2']")).click();
		        
		       
		        driver.findElement(By.xpath("//button[@aria-label='Yes']")).sendKeys(Keys.ENTER);
		        
		        System.out.println("Confirmation is clicked");
		        
		        
		        
		        
		        
		        
		        
		        /*String newTab = driver.getWindowHandles()
		        		  .stream()
		        		  .filter(handle -> !handle.equals(originalTab))
		        		  .findFirst()
		        		  .get();
		        		driver.switchTo().window(newTab);*/
		        
		        
		       
		        
		        /* String[] filePaths = {"/path/to/file1.txt", "/path/to/file2.txt"};
		        for (String filePath : filePaths) {
		            // Perform file upload using filePath variable */
		        
		 
	
		 
		        
		        
		        
		        
		 
		 }
              	 
	}

}
