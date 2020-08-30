package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

    public SelenideElement userName = $(".rb-profile-user__name");
    public SelenideElement userEmail = $(".rb-profile-user__email");

}
