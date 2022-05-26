import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Form extends Object{

    private final String firstName = "Amr";
    private final String lastName = "Salah";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public Form(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(){
        this.first_name.sendKeys(firstName);
    }

    public void fillLastName(){
        this.last_name.sendKeys(lastName);
    }

    public void clickSubmitButton(){
        this.submit_button.click();
    }

    public void verifySuccess(){
        this.alertSuccess.isDisplayed();
    }
}