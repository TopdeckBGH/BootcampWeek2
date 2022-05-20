package java.stepDefinitions;

import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.pages.HomePage;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        homePage.checkLogo();
    }

    @When("Arama cubuguna {string} yazilir")
    public void aramaCubugunaAyakkabiYazilir(String product) {
        homePage.setSearchBox(product);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.clickSearchButton();
    }

}
