package NopCommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties Prop;
    static FileInputStream input;
    static String fileName = "TestDataConfig.properties";
    static String fileLocation = "src/test/Resources/TestData/";

    public String getproperty(String key) {
        Prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            Prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Prop.getProperty(key);
    }
}
