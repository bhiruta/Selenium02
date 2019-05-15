package NopCommerce;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _register = By.linkText("Register");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmpassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private Object clickElementBy;
    private Object enterText;
    private Object selectByIndex;
    private Object emailWithTimeStamp;


    //send Text(_firstName,LoadProp.getProperty("firstName"));
    public void registration() {
        //click on reister button
        clickElementBy(_register);
        //select the male gender option
        clickElementBy(By.id("gender-male"));
        //enter "MyFirstName" in First name field
        enterText(_firstName, loadProp.getproperty("firstname"));
        //enter "My Surname" in Last name field
        enterText(_lastName, loadProp.getproperty("lastname"));
        //select the value "20" for Day field of Date of Birth
        SelectByValue(By.name("DateOfBirthDay"), loadProp.getproperty("DOBDay"));
        //select the value "Feb" for the month field of Date of Birth
        selectByIndex(By.name("DateOfBirthMonth"), 2);
        //select the value "1981" for the year field of Date of Birth
        SelectByValue(By.name("DateOfBirthYear"), loadProp.getproperty("DOBYear"));
        emailWithTimeStamp(_email);
        //enter the value "My Company" in the company field
        enterText(By.id("Company"), loadProp.getproperty("Company Name"));
        //tick the Newsletter check box
        //selectBy(By.id("Newsletter"));
        //enter the value "mypass" in the Password field
        enterText(By.id("ConfirmPassword"), loadProp.getproperty("confirm pasword"));
        //click on register button
        clickElementBy(_registerButton);
    }

    public void screenshotForFailTest() {
        //click on register button
        clickElementBy(_register);
        //select the male gender option
        clickElementBy(By.id("gender-male"));
    }










    private void emailWithTimeStamp(By email) {
    }

    private void selectByIndex(By dateOfBirthMonth, int i) {
    }

    private void SelectByValue(By dateOfBirthDay, String dobDay) {
    }

    private void SelectByValue() {
    }

    private void clickElementBy(By id) {
    }

    private void enterText(By firstName, String firstname) {
    }


}
