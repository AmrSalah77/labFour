import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Object {
    protected WebDriver driver;

    public Object(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}