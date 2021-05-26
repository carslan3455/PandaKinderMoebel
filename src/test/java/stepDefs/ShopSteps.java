package stepDefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Locators;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopSteps implements Locators {

    String productName = "";
    String productPrice = "";


    @When("User should be able to Login")
    public void userShouldBeAbleToLogin() {
        $(meinKonto).shouldBe(Condition.appear).click();
        $(meldenUsername).setValue(email);
        $(meldenPassword).setValue(password);
        
        $(anmelden);

        $("html").shouldHave(Condition.text("Hi "+ username));

    }

    @Then("User should be able to navigate to Shop page")
    public void userShouldBeAbleToNavigateToShopPage() {
        $(shopPage).click();
    }

    @Then("User should be able to select random product type and product")
    public void userShouldBeAbleToSelectRandomProductTypeAndProduct() {

        int randomCtgry = randomSayi($$(categoryItem).size());
        $$(categoryItem).get(randomCtgry).click();

        int randomPrdct = randomSayi($$(productImage).size());
        productName = $$(productTitle).get(randomPrdct).getText();
        productPrice = $$(productAmount).get(randomPrdct).getText();

        $$(productImage).get(randomPrdct).hover();
        $$(warenKorb).get(randomPrdct).click();

    }

    @Then("User should be able to  add to cart and check product info")
    public void userShouldBeAbleToAddToCartAndCheckProductInfo() {

        $(cartTitle).shouldBe(Condition.appear).shouldHave(Condition.text(productName));
        $(cartAmount).shouldHave(Condition.text(productPrice));

        $(kasse).click();
    }

    @Then("User should be able go to payment and complete order process")
    public void userShouldBeAbleGoToPaymentAndCompleteOrderProcess() {

        $(stimmen).shouldBe(Condition.appear).click();
        $(buttonSubmit,1).click();
        $(cardId).shouldBe(Condition.appear).setValue("123456123456");
        $(buttonSubmit).click();
        $("html").shouldHave(Condition.text("Geben Sie bitte die ID-Nummer erneut ein."));

    }
}
