package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignInPage {

    public SelenideElement emailField = $x(".//input[@type='email']");
    public SelenideElement passwordField = $x(".//input[@type='password']");
    public SelenideElement logInButton = $x(".//button[contains(text(),'Войти')]");

    public SelenideElement registeredButton = $(".//button[contains(text(),'Зарегистрироваться')]");
    public SelenideElement textInvalidUserData = $(".notification");




}
