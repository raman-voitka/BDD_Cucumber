package by.it_academy.homework7.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport/RunnerCucumberTests",
                "json:target/json-files/RunnerCucumberTests.json",
                "junit:target/junit_cucumber.xml"},
        monochrome = true,
        tags = "@now",
        glue = "by.it_academy.homework7",
        features = "classpath:by/it_academy/homework7/features"
)
public class RunnerCucumberTests extends AbstractTestNGCucumberTests {
}