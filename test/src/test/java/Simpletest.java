import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Simpletest {

      public static void main(String[] args) throws InterruptedException {

          WebDriver Webdriver = new ChromeDriver();
          Webdriver.manage().window().maximize();
          Webdriver.get("http://www.ozon.ru/");
          WebDriverWait wait = new WebDriverWait(Webdriver, 300,500);
          Webdriver.findElement(By.xpath("//*[@id=\"SearchText\"]")).clear();
          Webdriver.findElement(By.xpath("//*[@id=\"SearchText\"]")).sendKeys("Iphone X");
          Webdriver.findElement(By.xpath("//*[@id=\"PageHeader_ctl08_SearchPanel\"]/div[2]/div/div[4]/div")).click();
          Webdriver.findElement(By.xpath("//*[@id=\"bTilesModeShow\"]/div[1]/div[5]/span[2]/span[2]/a")).click();
          Webdriver.findElement(By.xpath("//*[@id=\"TDphLeft\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div")).click();
          Webdriver.findElement(By.xpath("//*[@id=\"TDphLeft\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div")).click();

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cartPageCheckoutBlock\"]/div/div[7]/div[2]")));
          Webdriver.findElement(By.xpath("//*[@id=\"TDphLeft\"]/div/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div[2]")).click();
          Thread.sleep(2000);
          Webdriver.quit();


      }
    }