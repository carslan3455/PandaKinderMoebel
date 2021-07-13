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

        int linkSayisi = 0;
        List<SelenideElement> links = $$(By.cssSelector("a"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLink(url);
            linkSayisi++;

        }
        System.out.println("linkSayisi = " + linkSayisi);
    }

    @Then("All image on the Website should be able be verified")
    public void allImageOnTheWebsiteShouldBeAbleBeVerified() {
        ElementsCollection productArr = $$("html");
        productArr.forEach(e -> System.out.println(e.find("img").getAttribute("src")));
    }
}
