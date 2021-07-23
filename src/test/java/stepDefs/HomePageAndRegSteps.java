package stepDefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.*;
import pages.Locators;

import static com.codeborne.selenide.Selenide.*;

public class HomePageAndRegSteps implements Locators {
    @Given("User navigate to Pandakindermoebel home page")
    public void userNavigateToPandakindermoebelHomePage() {
        Configuration.startMaximized =true;
        open(url);

        $(akzeptiere).shouldBe(Condition.appear).click();

    }

    @When("User enter to Mein Konto and create a new Account")
    public void userEnterToMeinKontoAndCreateANewAccount() {

        $(meinKonto).click();
        $(registrieren).shouldBe(Condition.appear).click();
        $(regUsername).setValue(username);
        $(regEmail).setValue(email);
        $(regPassword).setValue(password);
        $(regNewButton).click();

    }


    @Then("User enter his personal info")
    public void userEnterHisPersonalInfo() {

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

    @Then("User record with the same Username")
    public void userRecordWithTheSameUsername() {

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
