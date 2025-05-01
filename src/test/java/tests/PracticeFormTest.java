package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");

        $("[id=userName]").setValue("Ivan Ivanov");
        // Код следует повторить для всех полей на странице
    }

}
