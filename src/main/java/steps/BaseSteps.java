package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static common.PagesUrls.MAIN_PAGE;

public class BaseSteps {

    @Step("Перейти на стрницу respublica.ru")
    public void goToMainPage(){
        Selenide.open(MAIN_PAGE);
    }

}
