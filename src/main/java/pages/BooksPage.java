package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class BooksPage {
    public ElementsCollection categories = $$(".category");
}
