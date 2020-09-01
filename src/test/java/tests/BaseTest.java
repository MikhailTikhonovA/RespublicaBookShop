package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {

    @BeforeEach
    public void setUp(){
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }


    @AfterEach
    public void tearDown(){
        Selenide.closeWindow();
    }
}
