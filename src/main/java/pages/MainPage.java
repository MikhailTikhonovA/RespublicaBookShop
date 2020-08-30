package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    public SelenideElement signInButton = $x(".//a[@title='Авторизация']");
    public SelenideElement cartButton = $x(".//a[@title='Корзина']");
    public SelenideElement myFavorite = $x(".//a[@title='Избранное']");

    public SelenideElement myAccountButton = $(".nr-avatar");

    public ElementsCollection categories = $$(".nr-header__nav-item.nav-item");

    public SelenideElement books = $x(".//a[@title='Книги']");
}
