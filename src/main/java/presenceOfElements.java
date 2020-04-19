import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class presenceOfElements {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://plavnik.by/");
        int a=driver.findElements(By.xpath("//a")).size();
        int b=driver.findElements(By.xpath("//a[text()='Регистрация']")).size();
        int c=driver.findElements(By.xpath("//a[text()='you re fucking bastard']")).size();
        System.out.println("Amount of element -a- "+a);
        System.out.println("Amount of element -a- with text -Регистрация- "+b);
        System.out.println("Amount of element -a- with text -you re fucking bastard- "+c);
        driver.quit();

    }

}
