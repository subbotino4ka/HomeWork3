import com.sun.org.apache.bcel.internal.classfile.Constant;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    @Test
    public void LoginToMail()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\naska\\IdeaProjects\\HomeWork3\\lib\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String login = "testingjavafirst@i.ua";
        String password = "123qweQWE";

        driver.get("http://www.i.ua/");
        driver.findElement(By.name("login")).sendKeys(login);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/ul/li[1]/span")).getText().equals(login);
        driver.close();
    }
}
