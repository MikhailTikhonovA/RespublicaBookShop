package steps;

import io.qameta.allure.Step;
import pages.SignInPage;

import static com.codeborne.selenide.Condition.text;

public class SignInSteps {
    SignInPage signInPage = new SignInPage();

    @Step("Ввести Login")
    public void enterUserLogin(String login) {
        signInPage.emailField.setValue(login);
    }

    @Step("Ввести Password")
    public void enterUserPassword(String password) {
        signInPage.passwordField.setValue(password);
    }

    @Step("Нажать кнопку Войти")
    public void clickLogInButton() {
        signInPage.logInButton.click();
    }

    @Step("Проверить текст сообщения о неверных email/password")
    public void checkTextOnRegistrationNotification(String text) {
        signInPage.textInvalidUserData.shouldHave(text(text));
    }


}
