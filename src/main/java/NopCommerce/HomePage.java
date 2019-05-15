package NopCommerce;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //@FindBy(xpath = "//a[Contains(.'register')]")
    //Private WebElement _registerButton;

    private By _registerLink = By.linkText("Register");
    private By _computerLink = By.linkText("Computer");
    private By _apparelLink = By.linkText("Apparel");
    private By _digitalDownloadLink = By.linkText("Digital download");

    public static void ClickOnRegisterButton() {
    }

    public void clickOnRegisterButton() {
        clickElementBy(_registerLink);
    }
    public void ClickOnCategoryLinks(String link){
        clickElementBy(By.linkText(link));
    }
    public void SerchForAnyProduct(){

    }

}
