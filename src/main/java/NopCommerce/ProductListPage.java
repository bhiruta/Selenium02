package NopCommerce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends Utils {
    private Object clickElementBY;

    public static void PriceCurrency() {
    }

    @Test
    public void priceCurrency(){
        //code to perform hovering task on Apparels
        Object mouseOverHover;
        mouseOverHover(By.xpath("/html/body/div[4]/div[2]/u[1]/li[3]/a"));
        //Click on clothing
         clickElementBY(By.xpath("/html/body/div[4]/div[2]/u[1]/li[3]/ul/li[2]/a"));
         //click on Currency
          clickElementBY(By.xpath("//*[@id=\"customerCurrency\"]"));
          //click on Euro
        Object selectByText;
        selectByText(By.xpath("//*[@id=\"customberCurrency\"]"),"Euro");
        //click on sort Currency
          clickElementBY(By.xpath("//*[@id=\"customerCurrency\"]"));

        //click on USD
         selectByText(By.xpath("//*[@id=\"customerCurrency\"]"),"US Dollar");
         // Check for $ value
        // Get Text of $ Value
        boolean present = false;
        List<WebElement>activeList = driver.findElements(By.className("actual-price"));
        //List<WebElement>activeList = driver.findElements(By.cssSelector("span.actual-price"));
          for (WebElement element : activeList) {
              String str = element.getText();

              for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
                  if (ch == '$') {
                      present = true;
                      //index = i;
                  }
              }
              if (present == true) {
                  System.out.println("$" + "is present in the array list");
                  //break;
              } else {
                  System.out.println("The $ is not present at the array list");
              }
          }
          }







    private void selectByText(By xpath, String us_dollar) {
    }

    private void clickElementBY(By xpath) {
    }

    private void mouseOverHover(By xpath) {
    }


}
