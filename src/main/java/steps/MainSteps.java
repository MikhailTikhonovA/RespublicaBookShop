package steps;


import io.qameta.allure.Step;
import pages.MainPage;

import static com.codeborne.selenide.CollectionCondition.size;

public class MainSteps {
    MainPage mainPage = new MainPage();

    @Step("Нажать на кнопку Авторизоваться")
    public void clickOnSignInButton() {
        mainPage.signInButton.click();
    }

    @Step("Нажать на кнопку Мой аккаунт")
    public void clickMyAccountButton() {
        mainPage.myAccountButton.click();
    }

    @Step("Выбрать пункт Книги основного меню")
    public void chooseCategory() {
        mainPage.books.click();
    }

    @Step("Проверить количество пунктов основного меню")
    public void countCategories(int num){
        mainPage.categories.shouldHave(size(num));
    }

}

