import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@ExtendWith({ScreenShooterExtension.class})

public class YandexMarketTest {


    @BeforeAll
    static void setUp() {

        Configuration.startMaximized = true;
        Configuration.screenshots = true;

    }


    @Test
    public void userCanSearchWithYandexMarket() {

        open("https://yandex.ru/");
        $(By.linkText("Маркет")).click();
        switchTo().window(1);
        element("[id='header-search']").setValue("ноутбук xiaomi redmibook");
        element("._1XiEJDPVpk").click();
        element(Selectors.byText("Покупки на Маркете")).should(exist);
        element("._3wPGpzKmmn").shouldHave(text("Ноутбуки"));
        element(".LhMupC0dLR ").click();
//        screenshot("C\\Users\\Ruslan\\Downloads\\aqa-code-aqa4\\aqa-code-aqa4\\web");

    }

//    @Test
//    public void userCanSearchWithYandexMarketXPath() {
//
//        open("https://yandex.ru/");
//        $(By.linkText("Маркет")).click();
//        switchTo().window(1);
//        element("[id='header-search']").setValue("ноутбук xiaomi redmibook");
//        element("._1XiEJDPVpk").click();
//        element(Selectors.byText("Покупки на Маркете")).should(exist);
//        element("._3wPGpzKmmn").shouldHave(text("Ноутбуки"));
//        element(".LhMupC0dLR ").click();
////        screenshot("C\\Users\\Ruslan\\Downloads\\aqa-code-aqa4\\aqa-code-aqa4\\web");

//    }

}
