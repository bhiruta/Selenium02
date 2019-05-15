package NopCommerce;

import org.junit.Test;

public class TestSuit extends BaseTest {

    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        HomePage.ClickOnRegisterButton();
        ProductListPage.PriceCurrency();
        ProductListPage.PriceHighToLow();
        //registration page.registration();
        //registration page.registrationConfirmation();
    }
    /*
    @Test
    public void userShouldNavigateCellPhone(){
    //code to perform hovering task
    mouseOverHover(By.xpath("/html/body/div[4]/div[2]/ul[1]/li[2]/a"));

    //click on Cell Phones
    clickElementBy(By.xpath("/html/body/div[4]/div[2]/ul[1]/li[2]/ul/li[2]/a"));

    //compare Actual vs Expected
    getActualText(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[1]/h1"));
    validation("cell phones");
    }
     */
}
