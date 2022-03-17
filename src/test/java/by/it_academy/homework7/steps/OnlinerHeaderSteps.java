package by.it_academy.homework7.steps;

import by.it_academy.homework7.pageobject.Header;
import by.it_academy.homework7.pageobject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerHeaderSteps {

    private HomePage onlinerHomePage = new HomePage();
    private Header onlinerHeader = new Header();

    @Given("the user opens Onliner.by website")
    public void User_Opens_OnlinerBy_Website() {
        onlinerHomePage.openOnlinerWebsite();
    }

    @When("the user moves the mouse on the {string}")
    public void User_Moves_The_Mouse_On_The_Some_Category(String categoryLink) {
        onlinerHeader.moveToMainNavigationLink(categoryLink);
    }

    @Then("the dropdown menu {string} is visible")
    public void the_Dropdown_Menu_Is_Visible(String category) {
        WebElement dropdownMenu = onlinerHeader
                .waitForElementVisible(onlinerHeader.getDropdownMenu(category));
        assertThat(dropdownMenu)
                .as("Dropdown Menu of Header Link %s Is Not Visible", category)
                .isNotNull();
    }

    @Then("Avtobaracholka menu has")
    public void Avtobaracholka_Menu_Has_Subcategories(List<String> subcategories) {
        List<String> carBrandsCategories = onlinerHeader
                .getSubcategories(onlinerHeader.getAvtobaracholkaSubcategories());
        assertThat(carBrandsCategories)
                .as("Not All Avtobaracholka's Subcategories Are Displayed")
                .containsAll(subcategories);
    }

    @Then("Houses and Apartments menu has")
    public void Houses_And_Apartments_Menu_Has_Subcategories(List<String> subcategories) {
        List<String> housesAndApartmentsCategories = onlinerHeader
                .getSubcategories(onlinerHeader.getHousesAndApartmentsSubcategories());
        assertThat(housesAndApartmentsCategories)
                .as("Not All House's And Apartment's Subcategories Are Displayed")
                .containsAll(subcategories);
    }
}