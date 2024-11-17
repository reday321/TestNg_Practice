package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

    @FindBy(id = "email")
    public WebElement textEmail;

    @FindBy(id = "password")
    public WebElement textPassword;

    @FindBy(css = "[type=submit]")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void doLogin(String email, String password) {
        textEmail.sendKeys(email);
        textPassword.sendKeys(password);
        btnLogin.click();
    }


}
