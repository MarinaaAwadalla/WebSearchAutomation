
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchEngine extends Base {
    public void searchAndClickFirstResult(String query) {
        WebDriver driver = getDriver();

        // Open Google homepage
        driver.get("https://www.google.com");

        // Find the search input field and enter the query
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.RETURN);

        // Wait for the search results to load and find the first link
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.r > a")));

        // Click on the first link
        firstLink.click();
    }
}

