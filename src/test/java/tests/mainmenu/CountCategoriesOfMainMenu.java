package tests.mainmenu;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;
import steps.BooksSteps;
import steps.MainSteps;

import static io.qameta.allure.Allure.parameter;

@Tag("regress")
@Owner("Tikhonov Mikhail")
@Feature("Проверка количества категорий")
public class CountCategoriesOfMainMenu {
    BaseSteps baseSteps = new BaseSteps();
    MainSteps mainSteps = new MainSteps();
    BooksSteps booksSteps = new BooksSteps();

    @Test
    @DisplayName("Проверка количества категорий на главной странице")
    @Description("Проверка количества категорий на главной странице")
    public void countCategoriesOfMainMenu() {
        int count = 10;
        parameter("Количество ", count);

        baseSteps.goToMainPage();
        mainSteps.countCategories(count);
    }
}
