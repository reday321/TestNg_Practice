package Runner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.RegistrationPage;

import java.time.Duration;

public class RegistrationTestRunner extends Setup {
    @Test
    public void userRegistration() {
        RegistrationPage userReg = new RegistrationPage(driver);

        userReg.btnRegister.get(1).click();
        String firstname = "Test-";
        String lastname = "Red 07";
        String email = "test07@gmail.com";
        String password = "1234";
        String phoneNumber = "123456789";
        String address = "Pabna";

        userReg.doRegistration(firstname, lastname, email, password, phoneNumber, address);

        // To catch the toast:

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast")));
        String successMessageActual= driver.findElement(By.className("Toastify__toast")).getText();
        String successMessageExpected="successfully";
        System.out.println(successMessageActual);
        Assert.assertTrue(successMessageActual.contains(successMessageExpected));

    }
}
