import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Form extends Object{

    private final String firstName = "Amr";
    private final String lastName = "Salah";
    private final String jobTitle = "Student";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id="job-title")
    private WebElement job_title;

    @FindBy(id="radio-button-2")
    private WebElement education;

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

    public void fillJobTitle(){
        this.job_title.sendKeys(jobTitle);
    }

    public void chooseCollege(){
        this.education.click();
    }

    public void clickSubmitButton(){
        this.submit_button.click();
    }

    public void verifySuccess(){
        this.alertSuccess.isDisplayed();
    }
}