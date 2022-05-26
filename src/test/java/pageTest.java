import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class pageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeEach
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Configurations.chromeDriverLocation);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm(){
        driver.get(Configurations.URL);
        Form webForm = new Form(driver);
        webForm.fillFirstName();
        webForm.fillLastName();
        webForm.fillJobTitle();
        webForm.chooseCollege();
        webForm.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webForm.verifySuccess();
    }

    @AfterAll
    public static void clear(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}