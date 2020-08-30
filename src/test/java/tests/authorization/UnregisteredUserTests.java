package tests.authorization;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;
import steps.MainSteps;
import steps.SignInSteps;
import tests.BaseTest;

import static common.PrivateData.*;
import static io.qameta.allure.Allure.parameter;

@Tag("regress")
@Owner("Tikhonov Mikhail")
@Feature("Проверка авторизации")
public class UnregisteredUserTests extends BaseTest {
    BaseSteps baseSteps = new BaseSteps();
    MainSteps mainSteps = new MainSteps();
    SignInSteps signInSteps = new SignInSteps();

    @Test
    @DisplayName("Проверка невозможности входа для незарегистрированного пользователя")
    @Description("Проверка невозможности входа для незарегистрированного пользователя. " +
            "Некореектный ввод email")

    public void invalidEmailDataLogIn() {
        parameter("email ", getInvalidEmail());
        parameter("password ", getInvalidPassword());

        baseSteps.goToMainPage();
        mainSteps.clickOnSignInButton();
        signInSteps.enterUserLogin(getInvalidEmail());
        signInSteps.enterUserPassword(getValidPassword());
        signInSteps.clickLogInButton();
        signInSteps.checkTextOnRegistrationNotification("Невалидные данные для авторизации");
    }

}
