package by.it_academy.homework7.pageobject;

import org.openqa.selenium.By;

public class Header extends BasePage {
    private static final By AVTOBARACHOLKA_DROPDOWN_MENU =
            By.xpath("//*[contains(@class, 'main-navigation__dropdown-column_75')]");
    private static final By HOUSES_AND_APARTMENTS_DROPDOWN_MENU =
            By.xpath("//*[contains(@class, 'main-navigation__dropdown-column_50')]");
    private static final By AVTOBARACHOLKA_SUBCATEGORIES =
            By.xpath("//*[contains(@class, 'main-navigation__dropdown-column_75')]//div[@class='b-main-navigation__" +
                    "dropdown-column']//*[contains(@class, 'main-navigation__dropdown-advert-sign')]");
    private static final By HOUSES_AND_APARTMENTS_SUBCATEGORIES =
            By.xpath("//*[contains(@class, 'main-navigation__dropdown-column_50')]//div[@class='b-main-navigation__" +
                    "dropdown-column']//*[contains(@class, 'main-navigation__dropdown-advert-sign')]");

    public By getAvtobaracholkaSubcategories() {
        return AVTOBARACHOLKA_SUBCATEGORIES;
    }

    public By getHousesAndApartmentsSubcategories() {
        return HOUSES_AND_APARTMENTS_SUBCATEGORIES;
    }

    public By getDropdownMenu(String category) {
        if (category.equals("Автобарахолка")) {
            return AVTOBARACHOLKA_DROPDOWN_MENU;
        } else if (category.equals("Дома и квартиры")) {
            return HOUSES_AND_APARTMENTS_DROPDOWN_MENU;
        } else return null;
    }

}