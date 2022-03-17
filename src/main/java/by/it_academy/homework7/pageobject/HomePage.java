package by.it_academy.homework7.pageobject;

import by.it_academy.homework7.driver.DriverManager;

public class HomePage extends BasePage {
    private static final String ONLINER_URL = "https://www.onliner.by/";

    public void openOnlinerWebsite() {
        DriverManager.getDriver().get(ONLINER_URL);
    }

}