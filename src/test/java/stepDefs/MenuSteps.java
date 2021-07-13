package stepDefs;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Locators;
import utils.MyMethods;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class MenuSteps extends MyMethods {
    @When("All links on the Website should be able be verified")
    public void allLinksOnTheWebsiteShouldBeAbleBeVerified() {

        List<SelenideElement> links = $$(By.cssSelector("link"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLink(url);

        }

    }

    @Then("All image on the Website should be able be verified")
    public void allImageOnTheWebsiteShouldBeAbleBeVerified() {
        ElementsCollection productArr = $$("html img");
        productArr.forEach(e -> System.out.println(e.getAttribute("src")));

    }
}
