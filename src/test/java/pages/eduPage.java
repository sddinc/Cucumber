package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class eduPage {

    public eduPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='user-pass']")
    public  WebElement userPass;

    @FindBy(xpath = "//button[@id='login_btn']")
    public  WebElement buttonLogin;

}
