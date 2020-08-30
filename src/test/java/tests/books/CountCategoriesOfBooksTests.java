package tests.books;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;
import steps.BooksSteps;
import steps.MainSteps;
import tests.BaseTest;

import static io.qameta.allure.Allure.parameter;

@Tag("regress")
@Owner("Tikhonov Mikhail")
@Feature("Проверка количества категорий")
public class CountCategoriesOfBooksTests extends BaseTest {

    BaseSteps baseSteps = new BaseSteps();
    MainSteps mainSteps = new MainSteps();
    BooksSteps booksSteps = new BooksSteps();

    @Test
    @DisplayName("Проверка количества категорий на странице книги")
    @Description("Проверка количества категорий на странице книги")
    public void countCategoriesOfBooks() {
        parameter("Категория книги ", "Книги");
        parameter("Количество ", 15);

        baseSteps.goToMainPage();
        mainSteps.chooseCategory();
        booksSteps.countCategories(15);
    }
}
