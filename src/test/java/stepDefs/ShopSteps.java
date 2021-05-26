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
        
        $(anmelden,0).shouldBe(Condition.appear).click();

        $("html").shouldHave(Condition.text("Hi "+ username));

    }

    @Then("User navigate to Shop page")
    public void userNavigateToShopPage() {
        $(shopPage).click();
    }

    @Then("User select random product type and product")
    public void userSelectRandomProductTypeAndProduct() {

        int randomCtgry = randomSayi($$(categoryItem).size());
        $$(categoryItem).get(randomCtgry).click();

//        int randomPrdct = randomSayi($$(productImage).size());
        int randomPrdct = 11;
        productName = $$(productTitle).get(randomPrdct).scrollTo().getText();
        productPrice = $$(productAmount).get(randomPrdct).getText();

        System.out.println("productName = " + productName);
        System.out.println("productPrice = " + productPrice);

        $$(productImage).get(randomPrdct).hover();
        $$(warenKorb).get(randomPrdct).click();

    }

    @Then("User add to cart and check product info")
    public void userAddToCartAndCheckProductInfo() {

        $(cartTitle).shouldBe(Condition.appear).shouldHave(Condition.text(productName));
        $(cartAmount).shouldHave(Condition.text(productPrice));

        $(kasse).click();
    }

    @Then("User should be able go to payment and complete order process")
    public void userShouldBeAbleGoToPaymentAndCompleteOrderProcess() {

        $(buttonSubmit).scrollIntoView(false);
        $(stimmen,1).shouldBe(Condition.appear).click();
        $(bestellen).click();
        $("html").shouldHave(Condition.text("E-Payment"));
        $("html").shouldHave(Condition.text("Zahlung ausführen"));
        $(postCard).click();
        $(cardId).shouldBe(Condition.appear).setValue("123456123456");
        $(buttonSubmit).click();
        $("html").shouldHave(Condition.text("Geben Sie bitte die ID-Nummer erneut ein."));

    }
}
