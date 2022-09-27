import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTask {


    @Test
    public void selenideTask() {

        Configuration.browserSize = "1920x1080";

        open("https://demo.nopcommerce.com/build-your-own-computer");

        $(By.xpath("//select[@id='product_attribute_1']")).sendKeys("2.5");
        $(By.xpath("//select[@id='product_attribute_2']")).sendKeys("8");
        $(By.xpath("//label[@for='product_attribute_3_6']")).click();
        $(By.xpath("//label[@for='product_attribute_4_8']")).click();
        $(By.xpath("//button[@id='add-to-cart-button-1']")).click();
        $(By.xpath("//span[@class='cart-label']")).click();
        $(By.xpath("//td[@class='product']//div[@class='attributes'][contains(text(),'Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [')]"))
                .shouldHave(text("HDD: 320 GB")).shouldHave(text("RAM: 8GB"));
    }
}