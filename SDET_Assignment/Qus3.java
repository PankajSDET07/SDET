import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationAnywhereTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.automationanywhere.com/");

        try {
            // Perform mouse over on Products
            WebElement productsMenu = driver.findElement(By.xpath("//a[text()='Products']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(productsMenu).perform();

            // Click on Process Discovery
            WebElement processDiscoveryLink = driver.findElement(By.xpath("//*[@id="topNavbar"]/div/div/div[2]/ul/li[1]/div/div/div/div/div[3]/ul/li[1]/ul/li[2]/a"));
            processDiscoveryLink.click();

            // Wait for a while to let the page load
            Thread.sleep(2000);

            // Verify the URL after clicking on Process Discovery
            String expectedURL = "https://www.automationanywhere.com/products/process-discovery";
            String actualURL = driver.getCurrentUrl();

            if (actualURL.equals(expectedURL)) {
                System.out.println("Navigation successful. URL is as expected.");
            } else {
                System.out.println("Navigation failed. Actual URL is: " + actualURL);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
