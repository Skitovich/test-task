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
        open("https://yandex.ru/");
    }



    @Test
    public void userCanSearchWithYandexMarket() {


        $(By.linkText("Маркет")).click();
        switchTo().window(1);
        element("#header-search").setValue("ноутбук xiaomi redmibook");
        element("._1XiEJDPVpk").click();
        element(Selectors.byText("Маркет")).should(exist);
        element("._3wPGpzKmmn").shouldHave(text("Ноутбуки"));
        element(".LhMupC0dLR ").click();
        screenshot("C\\Users\\Ruslan\\Downloads\\aqa-code-aqa4\\aqa-code-aqa4\\web");



    }

    @Test
    public void userCanSearchWithYandexMarketByXPath() {


        element(By.xpath("//div[@class='services-new__list']/a[5]/div[@class='services-new__icon']")).click();
        switchTo().window(1);
        element(By.xpath("//input[@id='header-search']")).setValue("ноутбук xiaomi redmibook");
        element(By.xpath("//button[@class='_1XiEJDPVpk']")).click();
        element(Selectors.byText("Покупки на Маркете")).should(exist);
        element(By.xpath("//h1[@class='_3wPGpzKmmn']")).shouldHave(text("Ноутбуки"));
        element(By.xpath("//div[@class='LhMupC0dLR _8oEFsr-0y5']")).click();
        screenshot("C\\Users\\Ruslan\\Downloads\\aqa-code-aqa4\\aqa-code-aqa4\\web");
    }

}
