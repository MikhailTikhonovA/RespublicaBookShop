package tests.authorization;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;
import steps.MainSteps;
import steps.MyAccountSteps;
import steps.SignInSteps;
import tests.BaseTest;

import static common.PrivateData.*;
import static io.qameta.allure.Allure.parameter;

@Tag("regress")
@Owner("Tikhonov Mikhail")
@Feature("Проверка авторизации")
public class RegisteredUserTests extends BaseTest {
    BaseSteps baseSteps = new BaseSteps();
    MainSteps mainSteps = new MainSteps();
    SignInSteps signInSteps = new SignInSteps();
    MyAccountSteps myAccountSteps = new MyAccountSteps();

    @Test
    @DisplayName("Вход при корректном логине и пароле.")
    @Description("Проверка возможности входа для зарегистрированного пользователя.")
    public void validUserDataLogIn() {
        parameter("email ", getValidEmail());
        parameter("password ", getValidPassword());

        baseSteps.goToMainPage();
        mainSteps.clickOnSignInButton();
        signInSteps.enterUserLogin(getValidEmail());
        signInSteps.enterUserPassword(getValidPassword());
        signInSteps.clickLogInButton();
        mainSteps.clickMyAccountButton();
        myAccountSteps.checkUserEmail(getValidEmail());

    }

    @Test
    @DisplayName("Вход при некорректном пароле.")
    @Description("Проверка невозможности входа для зарегистрированного пользователя. Ввод некорректного пароля.")
    public void validLoginInvalidPasswordLogIn() {
        parameter("email ", getValidEmail());
        parameter("password ", getInvalidPassword());

        baseSteps.goToMainPage();
        mainSteps.clickOnSignInButton();
        signInSteps.enterUserLogin(getValidEmail());
        signInSteps.enterUserPassword(getInvalidPassword());
        signInSteps.clickLogInButton();
        signInSteps.checkTextOnRegistrationNotification("Невалидные данные для авторизации");

    }

    @Test
    @DisplayName("Вход при некорректном логине.")
    @Description("Проверка невозможности входа для зарегистрированного пользователя. Ввод некорректного логина.")
    public void invalidLoginValidPasswordLogIn() {
        parameter("email ", getInvalidEmail());
        parameter("password ", getValidPassword());

        baseSteps.goToMainPage();
        mainSteps.clickOnSignInButton();
        signInSteps.enterUserLogin(getInvalidEmail());
        signInSteps.enterUserPassword(getValidPassword());
        signInSteps.clickLogInButton();
        signInSteps.checkTextOnRegistrationNotification("Невалидные данные для авторизации");

    }
}
