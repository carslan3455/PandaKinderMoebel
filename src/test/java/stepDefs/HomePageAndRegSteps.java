package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.Locators;

import static com.codeborne.selenide.Selenide.*;

public class HomePageAndRegSteps implements Locators {
    @Given("User should be able to navigate to Pandakindermoebel home page")
    public void userShouldBeAbleToNavigateToPandakindermoebelHomePage() {
        Configuration.startMaximized =true;
        open(url);

        $(akzeptiere).shouldBe(Condition.appear).click();

    }

    @When("User should be able to enter to Mein Konto and create a new Account")
    public void userShouldBeAbleToEnterToMeinKontoAndCreateANewAccount() {

        $(meinKonto).click();
        $(registrieren).shouldBe(Condition.appear).click();
        $(regUsername).setValue(username);
        $(regEmail).setValue(email);
        $(regPassword).setValue(password);
        $(regNewButton).click();

    }


    @Then("User should be able to enter his personal info")
    public void userShouldBeAbleToEnterHisPersonalInfo() {

        $(adressen).shouldBe(Condition.appear).click();
        $(edit).shouldBe(Condition.appear).click();
        $(vorname).setValue(vornameValue);
        $(nachname).setValue(nachnameValue);
        $(strasse).setValue(strasseValue);
        $(appartment).setValue(appertmentValue);
        $(postZahl).setValue(appertmentValue);
        $(postZahl).setValue(postZahlValue);
        $(ortStadt).setValue(ortValue);
        $(telefon).setValue(telefonValue);
        $(buttonSubmit).shouldBe(Condition.appear).click();

        $("html").shouldHave(Condition.text("Adresse erfolgreich geändert."));
//        $("html").shouldHave(Condition.text("Hi "+ username));


    }

    @Then("User should not be able to record with the same Username")
    public void userShouldNotBeAbleToRecordWithTheSameUsername() {

        $(abmelden).shouldBe(Condition.appear).click();
        $(repeatReg).shouldBe(Condition.appear).click();
        $(regUsername).setValue(username);
        $(regEmail).setValue(email);
        $(regPassword).setValue(password);
        $(regNewButton).click();

        $("html").shouldHave(Condition.text("Fehler"));

    }

    @Then("User should be able to access the contents of the menuitem")
    public void userShouldBeAbleToAccessTheContentsOfTheMenuitem() {

        $(homePage).click();
        sleep(1000);
        Selenide.back();

        $(shopPage).click();
        sleep(1000);
        Selenide.back();

        $(blogPage).click();
        sleep(1000);
        Selenide.back();

        $(markenPage).click();
        sleep(1000);
        Selenide.back();

        $(showroomPage).click();
        sleep(1000);
        Selenide.back();


    }


}
