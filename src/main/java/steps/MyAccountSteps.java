package steps;

import io.qameta.allure.Step;
import pages.MyAccountPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;

public class MyAccountSteps {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Step("Проверить имя пользователя")
    public void checkUserName(String name) {
        myAccountPage.userName.shouldHave(text(name));
    }

    @Step("Проверить email пользователя")
    public void checkUserEmail(String email) {
        myAccountPage.userEmail.shouldHave(exactText(email));
    }
}
