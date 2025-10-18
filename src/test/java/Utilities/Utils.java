package Utilities;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import static Utilities.DriverManager.driver;


public class Utils {
    private static final String LOCATORS_FOLDER = "src/test/resources/Locators";

    public static WebElement getElement(String locatorName) throws IOException {
        WebElement element = driver.findElement(By.xpath(getLocators(locatorName)));

        return element;
    }

    public static List<WebElement> getElements(String locatorName) throws IOException {
        List<WebElement> ListOfElements = driver.findElements(By.xpath(getLocators(locatorName)));

        return ListOfElements;
    }

    public static String getLocators(String locatorsName) throws IOException {
        File folders = new File(LOCATORS_FOLDER);
        File[] files = folders.listFiles((dir, name) -> name.endsWith(".properties"));

        if (files == null) {
            throw new RuntimeException("Locator folder not found:" + LOCATORS_FOLDER);

        }
        for (File file : files) {
            try (FileInputStream fis = new FileInputStream(file)) {
                Properties properties = new Properties();
                properties.load(fis);

                if (properties.containsKey(locatorsName)) {
                    return properties.getProperty(String.valueOf(locatorsName));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public static String takeScreenshot() {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/screenshots/" + "ScreenShot" + "_" + timestamp + ".png";

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File dest = new File(path);
            FileUtils.copyFile(src, dest);

            // 🔹 Attach screenshot to Allure
            Allure.addAttachment("Screenshot - " + timestamp, new FileInputStream(dest));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}
