import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google homepage
        driver.get("https://www.google.com");

        // Get the search query from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the search query: ");
        String searchQuery = scanner.nextLine();

        // Find the search input field and enter the query
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys(searchQuery);
        searchInput.sendKeys(Keys.RETURN);

        // Find the first search result link and click it
        WebElement firstLink = driver.findElement(By.cssSelector("div.r > a"));
        firstLink.click();

        // Close the browser
        driver.quit();
    }
}
