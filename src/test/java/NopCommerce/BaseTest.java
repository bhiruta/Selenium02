package NopCommerce;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;

public class BaseTest extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();
    private Object FileUtils;
    private String LongTimeStamp;

    @BeforeMethod//run before every method
    public void openBrowser(){
        browserSelector.SetUpBrowser();
        //Asking Driver to get the URL.
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod//run after every method// ITestResult result
    public void closeBrowser(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            try {
                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(ts, new File("Screenshot\\" + result.getName() + LongTimeStamp() + ".png"));
                System.out.println("Screenshot taken");
            }catch (Exception e){

            }
            driver.quit();
        }
    }



}
