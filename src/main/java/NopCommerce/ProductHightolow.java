package NopCommerce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductHightolow extends Utils {

    private Object mouseOverHover;

    @Test
    public void priceHighToLow(){
        //code to perform hovering task
        mouseOverHover(By.xpath("/html/body/div[4]/div[2]/ul[1]/li[3]/a"));

        //Click on Cell Phones
        clickElementBy(By.xpath("/html/body/div[4]/div[2]/ul[1]/li[3]/ul/li[2]/a"));

        //Click on Sort Order
        clickElementBy(By.xpath("//*[@id=\"products orderby\"]"));

        //Click High to Low
        selectTextByValue(By.xpath("//*[@id=\"product-orderby\"]"),"ProductHightolow");

        //Get Text of $ value
        ArrayList<Float>PriceList = new ArrayList<Float>();
        ArrayList<Float>SortList = new ArrayList<Float>();

        List<WebElement>activeList = driver.findElements(By.className("actual-price"));
        //List<WebElement>activeList = driver.findElements(By.cssSelector("span.actual-price"));
        for (WebElement element : activeList) {
            String str = element.getText();
            str = str.replaceAll("[^\\d.]", "");
            PriceList.add(Float.valueOf(str));
            SortList.add(Float.valueOf(str));
        }
        System.out.println(PriceList);
        /*Sorting in decreasing(descending)order*/
        Collections.sort(SortList,Collections.reverseOrder());
        //Arrays.sort(PriceList);
        System.out.println(SortList);
        System.out.println(PriceList.equals(SortList));

        }


    }

    private void mouseOverHover(By xpath) {
    }
}
