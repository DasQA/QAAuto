import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        //Search "Backpack"
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("backpack");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

        //Select Backpack
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0, 500)");
        driver.findElement(By.cssSelector(".item:nth-child(2) .product-image-photo")).click();

        //Select Woman Navigation
        driver.findElement(By.cssSelector(".base")).click();
        driver.findElement(By.id("ui-id-4")).click();


       {
            WebElement element = driver.findElement(By.cssSelector(".nav-2 > .level-top > span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

            driver.findElement(By.cssSelector("#ui-id-9 > span:nth-child(2)")).click();

        {
            WebElement element = driver.findElement(By.cssSelector("#narrow-by-list"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".filter-options-item")).click();

        //Select Top>Category
        {
            WebElement element = driver.findElement(By.cssSelector(".filter-options-content"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".filter-options-item")).click();

        //Gear Navigation
        driver.findElement(By.cssSelector(".base")).click();
        driver.findElement(By.id("ui-id-6")).click();

        //Select Product to AddToCart
        driver.findElement(By.cssSelector(".product-item:nth-child(2)")).click();

        {
            WebElement element = driver.findElement(By.linkText("My Cart"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        //QTY Option
        driver.findElement(By.id("qty")).click();

        //AddToCart Button
        driver.findElement(By.id("product-addtocart-button")).click();

        {
            WebElement element = driver.findElement(By.id("product-addtocart-button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = driver.findElement(By.id("product-addtocart-button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
            Thread thread;
            Thread.sleep(2000);
        }

        //MyCart Details
        driver.findElement(By.cssSelector(".showcart")).click();

    }
}