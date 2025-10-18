package Runner;

import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@CucumberOptions(
        dryRun = false,
        features = "src/test/resources/FeatureFiles",
        glue = "StepDefinitions",   // ✅ make sure folder name is exactly correct
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true,
        tags = "@Dashboard"
)


public class TestRunner extends AbstractTestNGCucumberTests {



    @BeforeMethod
    public void beforeScenario() throws InterruptedException
    {
        System.out.println("-------------Initializing driver----------------");
        DriverManager.getDriver();
    }

    @AfterMethod
    public void afterScaenario() throws InterruptedException
    {
        System.out.println("-------------Quitting driver----------------");
        DriverManager.quitDriver();
    }


    @BeforeSuite
    public void beforeSuite() throws InterruptedException {
        System.out.println("-------------Starting execution----------------");
       // DriverManager.getDriver();

    }

    @AfterSuite
    public void afterSuite() throws InterruptedException {
//        System.out.println("-------------Quitting driver----------------");
//        DriverManager.quitDriver();
        Thread.sleep(4000);
        try {
            // Run inside CMD with /c so it executes like normal
            ProcessBuilder pb = new ProcessBuilder(
                    "cmd.exe", "/c",
                    "allure generate allure-results --single-file allure-report.html --clean"
            );

            // Merge stdout + stderr
            pb.redirectErrorStream(true);

            // Start the process
            Process process = pb.start();

            // Read output from the command and print in console
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait until command finishes
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("✅ Allure report generated successfully: allure-report.html");
            } else {
                System.out.println("❌ Failed to generate Allure report. Exit code: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
