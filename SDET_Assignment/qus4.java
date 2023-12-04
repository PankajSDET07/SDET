import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAnywhereDemoTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.automationanywhere.com/");

        try {
            // Click on Request Demo button
            WebElement requestDemoButton = driver.findElement(By.xpath("//a[text()='Request Demo']"));
            requestDemoButton.click();

            // Wait for a while to let the page load
            Thread.sleep(2000);

            // Verify that the page is navigated to https://www.automationanywhere.com/request-live-demo
            String expectedURL = "https://www.automationanywhere.com/request-live-demo";
            String actualURL = driver.getCurrentUrl();

            if (actualURL.equals(expectedURL)) {
                System.out.println("Navigation to Request Demo page successful.");
            } else {
                System.out.println("Navigation to Request Demo page failed. Actual URL is: " + actualURL);
            }

            // Verify Label Names for First Name and Last Name
            WebElement firstNameLabel = driver.findElement(By.xpath("//label[text()='First Name']"));
            WebElement lastNameLabel = driver.findElement(By.xpath("//label[text()='Last Name']"));

            if (firstNameLabel.isDisplayed() && lastNameLabel.isDisplayed()) {
                System.out.println("Label Names verification successful.");
            } else {
                System.out.println("Label Names verification failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
