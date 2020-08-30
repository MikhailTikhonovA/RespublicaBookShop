package steps;

import io.qameta.allure.Step;
import pages.BooksPage;

import static com.codeborne.selenide.CollectionCondition.size;

public class BooksSteps {
    BooksPage booksPage = new BooksPage();

    @Step("Проверить количество категорий на странице")
    public void countCategories(Integer num) {
        booksPage.categories.shouldHave(size(num));
    }
}
