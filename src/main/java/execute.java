import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class execute {

    WebDriver driver;

    @Test
    public void user_is_on_Home_Page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver3.exe");
        driver = new ChromeDriver();
        driver.get("https://www.web.brainxq.com/signin");



        driver.findElement(By.id("mat-input-0")).sendKeys("maazakhan@folio3.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("asdfasdf");
        driver.findElement(By.xpath("/html/body/app-root/div/app-signin/mat-card/form/button/span")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String str=driver.findElement(By.xpath("/html/body/app-root/div/div/mat-toolbar/mat-toolbar-row/p/span")).getText();
        System.out.println("Message:"+str);
        Assert.assertEquals(str,"Welcome,");
    }

}
