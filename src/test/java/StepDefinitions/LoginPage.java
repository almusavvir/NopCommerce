package StepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

import static Utilities.Utils.getElement;
import static Utilities.Utils.takeScreenshot;

public class LoginPage {


    @Then("user should validate login dashboard label {string} text")
    public void userShouldValidateLoginDashboardLabelText(String label) throws InterruptedException, IOException {
      Thread.sleep(2000);
       String webLabel =  getElement("loginLabel").getText().trim();
        System.out.println(webLabel);
        System.out.println(label);

        Assert.assertEquals(true,webLabel.equals(label));
        takeScreenshot();
    }

    @And("user enter email {string} or phone in input box")
    public static void userEnterEmailOrPhoneInInputBox(String email) throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("emailInputbox").click();
        getElement("emailInputbox").clear();
        Thread.sleep(1000);
        getElement("emailInputbox").sendKeys(email);
        takeScreenshot();
        Thread.sleep(1000);
    }


    @And("user enter password {string} in input box")
    public static void userEnterPasswordInInputBox(String password) throws InterruptedException, IOException {
        Thread.sleep(1000);
        getElement("pwdInputbox").clear();
        Thread.sleep(1000);
        getElement("pwdInputbox").sendKeys(password);
        takeScreenshot();

    }
    @And("user click on login button")
    public static void userClickOnLoginButton() throws InterruptedException, IOException {
        Thread.sleep(1000);
        getElement("loginbtn").click();
        takeScreenshot();

    }




    @Then("user should validate dashboard label {string}")
    public static void userShouldValidateDashboardLebel(String DashboardLebel) throws InterruptedException, IOException {
        Thread.sleep(20000);
        String webdashlabel=getElement("dashboard").getText().trim();
        System.out.println(webdashlabel);
        System.out.println(DashboardLebel);
        Assert.assertEquals(true,webdashlabel.equals(DashboardLebel));
        takeScreenshot();
    }
    @Then("user should validate error message {string}")
    public static void userShouldValidateErrorMessage(String Errormsg) throws IOException {
       String Errortext= getElement("wrong_email").getText().trim();
       Assert.assertEquals(true,Errortext.contains(Errormsg));
       takeScreenshot();
    }


    @Then("user should validate numeric error message {string}")
    public static void userShouldNumericValidateEmailInputBoxEarrorMessage(String errormsg) throws IOException, InterruptedException {
        Thread.sleep(2000);
       String errorLabel= getElement("NumericEmail").getText().trim();
       Assert.assertEquals(true,errorLabel.equals(errormsg));
       takeScreenshot();

    }
    @Then("user should validate  email input box errors message{string}")
    public static void userShouldValidateEmailInputBoxErrorMessage(String errormsg) throws InterruptedException, IOException {
        Thread.sleep(5000);
        String WebLabelError=getElement("spacialCharEmail").getText().trim();
        Thread.sleep(2000);
        Assert.assertEquals(true,WebLabelError.equals(errormsg));
    }

    @Then("user should validate wrong password error{string}")
    public static void userShouldValidateWrongPasswordError(String pwdErrorMsg) throws InterruptedException, IOException {
        Thread.sleep(2000);
        String pwdLabel = getElement("wrongPwd").getText().trim();
        Assert.assertEquals(true, pwdLabel.equals(pwdErrorMsg));
        takeScreenshot();
    }
    @Then("user should validate errors message Password  as leave{string}")
    public static void userShouldValidateErrorMessagesPasswordAsLeave(String Leave_password) throws InterruptedException, IOException {
        Thread.sleep(5000);
        String web_Label=getElement("leavepwd").getText().trim();
        System.out.println(web_Label);
        System.out.println("...................");
        System.out.println(Leave_password);
        Assert.assertEquals(true,web_Label.equals(Leave_password));
        takeScreenshot();
    }

    @Then("user click on logout button")
    public static void userClickOnLogoutButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        getElement("logoutBtn").click();
        takeScreenshot();

    }
    @And("user should validate login page label{string}")
    public static void userShouldValidateLoginPageLabel(String loginLabel) throws IOException, InterruptedException {
        Thread.sleep(2000);
        String Web_login_label=getElement("LoginLabel").getText().trim();
        Assert.assertEquals(true,Web_login_label.equals(loginLabel));
        takeScreenshot();


    }







}
