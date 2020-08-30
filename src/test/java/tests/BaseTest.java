package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    @AfterEach
    public void tearDown(){
        Selenide.closeWindow();
    }
}
