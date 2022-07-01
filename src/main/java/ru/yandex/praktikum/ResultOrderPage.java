package ru.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class ResultOrderPage {

    //локатор финального окна заказа
    @FindBy(how = How.XPATH,using = ".//div[contains(@class,'Order_ModalHeader__3FDaJ') and contains(text(),'Заказ оформлен')]")
    private SelenideElement resultOrderPopupWindow;
    //локатор текста с номером заказа
    @FindBy(how = How.XPATH,using = ".//div[@class = 'Order_Text__2broi']")
    private SelenideElement resultOrderId;
    //локатор кнопки просмотра статуса заказа
    @FindBy(how = How.XPATH,using = ".//div[@class = 'Order_NextButton__1_rCA']/button[text() = 'Посмотреть статус']")
    private SelenideElement statusButtonNext;

    //метод получения текста финального окна заказа
    public String getTextResultOrder() {
        return resultOrderPopupWindow.getText();
    }
    //метод клика по кнопке статуса заказа
    public void pickStatusNextButton() {
        statusButtonNext.shouldBe(Condition.appear, Duration.ofSeconds(4000)).click();
    }

}
