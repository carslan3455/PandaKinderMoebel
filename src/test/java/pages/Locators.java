package pages;

import org.openqa.selenium.By;

import java.util.Random;

public interface Locators {

    String url = "https://pandakindermoebel.ch/";
    String username = "Test User15555";
    String email = "testuser15555@techno.com";
    String password = "Testuser.123";
    String vornameValue = "Test";
    String nachnameValue = "User";
    String strasseValue = "Korbackerweg";
    String appertmentValue = "19";
    String postZahlValue = "5502";
    String ortValue = "Hunzenschwil";
    String telefonValue = "178234278";



    By akzeptiere = By.xpath("//button[@data-cf-action='accept']");
    By homePage = By.xpath("(//li[contains(@id,'menu-item')] /a/span)[18]");
    By shopPage = By.xpath("(//li[contains(@id,'menu-item')] /a/span)[19]");
    By blogPage = By.xpath("(//li[contains(@id,'menu-item')] /a/span)[32]");
    By markenPage = By.xpath("(//li[contains(@id,'menu-item')] /a/span)[33]");
    By showroomPage = By.xpath("(//li[contains(@id,'menu-item')] /a/span)[34]");
    By socialIcons = By.cssSelector("div.topbar-right.cell.shrink ul.social-icons>li");  // todo $$
    By repeatReg = By.cssSelector("a#bb-show-register-button");
    By abmelden = By.xpath("(//a[text()='Abmelden'])[2]");


    // Registrieren
    By meinKonto = By.xpath("(//span[text()='Mein Konto'])[2]");
    By registrieren = By.cssSelector("a#bb-show-register-button");
    By regUsername = By.cssSelector("input#reg_username");
    By regEmail = By.cssSelector("input#reg_email");
    By regPassword = By.cssSelector("input#reg_password");
    By regNewButton = By.cssSelector("button[name='register']");
    By adressen = By.xpath("//a[contains(text(),'Adressen')]");
    By edit = By.cssSelector("a.edit");

    // Anmelden
    By meldenUsername = By.cssSelector("input#username");
    By meldenPassword= By.cssSelector("input#password");

    By vorname = By.xpath("(//input[@class='input-text '])[1]");
    By nachname = By.xpath("(//input[@class='input-text '])[2]");
    By strasse = By.xpath("(//input[@class='input-text '])[4]");
    By appartment= By.xpath("(//input[@class='input-text '])[5]");
    By postZahl = By.xpath("(//input[@class='input-text '])[6]");
    By ortStadt = By.xpath("(//input[@class='input-text '])[7]");
    By telefon = By.xpath("(//input[@class='input-text '])[8]");
    By anmelden = By.cssSelector("button[value='Anmelden']");
    By buttonSubmit = By.cssSelector("button[type='submit']");


    // Shop
    By categoryItem = By.cssSelector("li.category_item");  // todo $$
    By productImage = By.cssSelector("div.product-image");  // todo $$
    By productTitle = By.cssSelector("h3.product-title");  // todo $$
    By productAmount = By.cssSelector("span.price");  // todo $$
    By warenKorb = By.cssSelector("div.footer-section-inner");  // todo $$
    By bestellen = By.cssSelector("button.button.alt");


    // WarenKorb

    By cartTitle = By.cssSelector("div.mini-cart-title");
    By cartAmount = By.cssSelector("div.mini-cart-content span.amount");
    By kasse = By.xpath("//a[contains(@class,'checkout')]");


    // Kasse

    By stimmen = By.xpath("//label[contains(@class,'checkbox')]");
    By postCard = By.cssSelector("button[onclick='classic()']");
    By cardId = By.cssSelector("input#cardId");



    // success mesaj Adresse erfolgreich geändert.

    // ul.dropdown.menu > li[role='menuitem']



    default int randomSayi(int sayi) {

        // return  (int) (Math.random()*(sayi-1));

        Random index = new Random();

        return index.nextInt(sayi - 1);
    }
}
