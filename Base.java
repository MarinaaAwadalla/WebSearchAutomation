import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    protected WebDriver driver;

    public Base() {
        // Initialize the WebDriver object (using ChromeDriver)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    protected WebDriver getDriver() {
        // Retrieve and return the initialized WebDriver object
        return driver;
    }
}

