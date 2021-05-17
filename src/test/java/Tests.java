import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class Tests {
    @Test
    void shuld() {
        open("https://prorolls.ru/");
        $(byXpath("//div/a[@href='setyi/']")).click();
        $(byXpath("//div/a[@href='set-1.html']")).click();
        $(byXpath("//button[@class='btn btn-red block']")).click();
        $(byXpath("//div[@class='element-counter']//button[@type='button'][normalize-space()='+']")).click();
        $(byXpath("//input[@id='count-184']")).click();
        $("#count-184").shouldHave(value("2"));





//        $(byXpath("//h1")).shouldHave(exactText("Сеты"));

    }

}
