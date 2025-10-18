package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

import static Utilities.Utils.*;

public class Dashboard {
    @Then("user should validate this side bar {string}")
    public static void userShouldValidateThisSideBar(String side_barItem) throws IOException, InterruptedException {
        Thread.sleep(2000);
        List<WebElement> expectedItem = getElements("side_bar");
        String[] str = side_barItem.split(",");
        for (int i = 0; i < expectedItem.size(); i++) {
            String s = expectedItem.get(i).getText().trim();
            System.out.println("Expected element : "+s + " -> Actual Element :"+str[i]);
            Assert.assertEquals(true, s.equals(str[i].trim()));
        }
        takeScreenshot();
    }

    @Then("user click on Catalog")
    public static void UserClickOnCatalog() throws IOException, InterruptedException {
        Thread.sleep(2000);
        getElement("catalog").click();
        takeScreenshot();

    }

    @And("user should validate drop down field {string}")
    public static void userShouldValidateDropDownField(String DropDownField) throws IOException {
        List<WebElement> Epected_list = getElements("catalog_categories_dropDwon");
        String[] str2 = DropDownField.split(",");
        for (int i = 0; i < Epected_list.size(); i++) {
            String value = Epected_list.get(i).getText().trim();
            Assert.assertEquals(true, value.equals(str2[i].trim()));
        }
        takeScreenshot();
    }

    @Then("user click on Attributes button")
    public static void userClickOnAttributesButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        getElement("Attribute").click();
    }

    @And("user should validate drop down field{string}")
    public static void userShouldValidateDropdownField(String Attributes_dropdown) throws IOException, InterruptedException {
        Thread.sleep(2000);
        List<WebElement> att_Expected_list = getElements("Attribute_dropdown");
        String[] str3 = Attributes_dropdown.split(",");
        for (int i = 0; i < att_Expected_list.size(); i++) {
            String att_web_split = att_Expected_list.get(i).getText().trim();
            Assert.assertEquals(true, att_web_split.equals(str3[i].trim()));
            takeScreenshot();
        }
    }

    @Then("user click on sales")
    public static void userClickOnSales() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("sales").click();
    }

    @And("user should validate sales drop down field{string}")
    public static void userShouldValidateSalesDropDownField(String sales_dropdown) throws InterruptedException, IOException {
        Thread.sleep(2000);
        List<WebElement> Sales_Expected_list = getElements("Sales_dropdown");
        String[] str4 = sales_dropdown.split(",");
        for (int i = 0; i < Sales_Expected_list.size(); i++) {
            String sales_web_split = Sales_Expected_list.get(i).getText().trim();
            Assert.assertEquals(true, sales_web_split.equals(str4[i].trim()));
            takeScreenshot();
        }
    }

    @Then("user click on customers")
    public static void userClickOnCustomers() throws InterruptedException, IOException {
        Thread.sleep(5000);
        getElement("customesrs").click();
    }

    @And("user should validate customers drop down field{string}")
    public static void userShouldValidateCustomersDropDown(String customers_dropdown) throws IOException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> customers_Expected_list = getElements("customers-dropdown");
        String[] str5 = customers_dropdown.split(",");
        for (int i = 0; i < customers_Expected_list.size(); i++) {
            String customes_web_Expected = customers_Expected_list.get(i).getText().trim();
            System.out.println("Expected value : "+str5[i] + " -> Actual value : "+customes_web_Expected);
            Assert.assertEquals(true, customes_web_Expected.equals(str5[i].trim()));
            takeScreenshot();

        }

    }

    @Then("user click on promotions")
    public static void userClickOnPromotions() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("promotions").click();
        takeScreenshot();
    }

    @And("user should validate promotion drop down{string}")
    public static void userShouldValidatePromotionDropDown(String promotion_dropdown) throws IOException, InterruptedException {
        Thread.sleep(2000);
        List<WebElement> Promotion_web_Expected = getElements("promotion_dropdown");
        String[] str6 = promotion_dropdown.split(",");
        for (int i = 0; i > Promotion_web_Expected.size(); i++) {
            String promotoin_value = Promotion_web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, promotoin_value.equals(str6[i].trim()));
            takeScreenshot();
        }
    }

    @Then("user click on content management")
    public static void userClickOnManagement() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("content_management").click();

    }

    @And("user should validate content management dropdown{string}")
    public static void userShouldValidateContentManagementDropdown(String content_dropdown) throws InterruptedException, IOException {
        Thread.sleep(2000);
        List<WebElement> Content_web_Expected = getElements("content_dropdown");
        String[] str7 = content_dropdown.split(",");
        for (int i = 0; i < Content_web_Expected.size(); i++) {
            String content_value = Content_web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, content_value.equals(str7[i].trim()));
            takeScreenshot();
        }
    }

    @Then("user click on configuration")
    public static void userClickOnConfiguration() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("configuration_1").click();
    }

    @And("user should validate  configuration Dropdown{string}")
    public static void userShouldValidateConfiguration(String Configuration_dropdown) throws InterruptedException, IOException {
        Thread.sleep(2000);
        List<WebElement> configuration_web_Expected = getElements("configuration_dropdown");
        String[] str8 = Configuration_dropdown.split(",");
        for (int i = 0; i < configuration_web_Expected.size(); i++) {
            String configuration_value = configuration_web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, configuration_value.equals(str8[i].trim()));
        }
        takeScreenshot();
    }

    @Then("user click on System")
    public static void userClickOnSystem() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("System_1");
    }

    @And("user should validate  system Dropdown{string}")
    public static void userShouldValidateSystemDropdown(String system_dropdown) throws IOException, InterruptedException {
        Thread.sleep(2000);
        List<WebElement> System_Web_Expected = getElements("System_dropdown");
        String[] str9 = system_dropdown.split(",");
        for (int i = 0; i < System_Web_Expected.size(); i++) {
            String System_value = System_Web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, system_dropdown.equals(str9[i].trim()));
        }
        takeScreenshot();
    }

    @Then("user click on Reports")
    public static void userClickOnReports() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("Reports").click();
    }

    @And("user should validate Repors Dropdown{string}")
    public static void userShouldValidateReportsDropdown(String Report_dropdown) throws IOException, InterruptedException {
        Thread.sleep(2000);
        List<WebElement> Reports_Web_Expected = getElements("Reports_dropdown");
        String[] str10 = Report_dropdown.split(",");
        for (int i = 0; i < Reports_Web_Expected.size(); i++) {
            String reports_value = Reports_Web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, reports_value.equals(str10[i].trim()));
        }
        takeScreenshot();
    }

    @Then("user click on Help")
    public static void userClickOnHelp() throws InterruptedException, IOException {
        Thread.sleep(2000);
        getElement("Help").click();
    }

    @And("user should validate Help Dropdown{string}")
    public static void userShouldValidateHelpDropdown(String Help_dropdown) throws InterruptedException, IOException {
        Thread.sleep(2000);
        List<WebElement> Help_Web_Expected = getElements("Help_dropdown");
        String[] str11 = Help_dropdown.split(",");
        for (int i = 0; i < Help_Web_Expected.size(); i++) {
            String help_value = Help_Web_Expected.get(i).getText().trim();
            Assert.assertEquals(true, help_value.equals(str11[i].trim()));
        }
        takeScreenshot();
    }


}