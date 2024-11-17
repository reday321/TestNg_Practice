package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage {

        @FindBy(tagName = "a")
        public List<WebElement> btnRegister;

        @FindBy(id = "firstName")
        WebElement txtFirstname;

        @FindBy(id = "lastName")
        WebElement txtLastname;

        @FindBy(id = "email")
        WebElement txtEmail;

        @FindBy(id = "password")
        WebElement txtPassword;

        @FindBy(id = "phoneNumber")
        WebElement txtPhoneNumber;

        @FindBy(id = "address")
        WebElement txtAddress;

        @FindBy(css = "[type=radio]")
        List<WebElement> rbGender;

        @FindBy(css = "[type=checkBox]")
        WebElement chkAcceptTerms;

        @FindBy(id = "register")
        WebElement btnSubmitReg;



        // Constructor
        public RegistrationPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        // Method to perform registration
        public void doRegistration(String firstName,
                                   String lastName,
                                   String email,
                                   String password,
                                   String phoneNumber,
                                   String address) {

            txtFirstname.sendKeys(firstName);
            txtLastname.sendKeys(lastName);
            txtEmail.sendKeys(email);
            txtPassword.sendKeys(password);
            txtPhoneNumber.sendKeys(phoneNumber);
            txtAddress.sendKeys(address);
            rbGender.get(0).click();
            chkAcceptTerms.click();
            btnSubmitReg.click();


        }
    }

