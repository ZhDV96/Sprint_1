import ru.yandex.praktikum.OrderPage;
import ru.yandex.praktikum.ResultOrderPage;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.startsWith;
import static com.codeborne.selenide.Selenide.*;

public class TestOrderData2EdgeTopButton {

    // открывается страница и создаётся экземпляр класса страницы
    OrderPage orderPage = page(OrderPage.class);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "edge";
        open("https://qa-scooter.praktikum-services.ru/");
        orderPage.clickCookieButton();
    }

    //тест на возможность оформления заказа в сервисе через браузер MS Edge со вторым набором данных
    @Test
    public void testOrderData2 () {
        //первая часть теста, где проверяется возможность заполнения полей формы заказа
        orderPage.orderTwo("Елена", "Рекурсивная", "ул. Интегральная, д.17, стр.1", "+76666666666", "Сокольники");
        orderPage.orderNextTwo("Уточните номер подъезда перед приходом курьера");
        //вторая часть теста, где проверяется наличие id заказа и возможность перехода на страницу трекинга заказа
        ResultOrderPage pageResult = page(ResultOrderPage.class);
        String actualText = pageResult.getTextResultOrder();
        String expectedText = "Заказ оформлен";
        MatcherAssert.assertThat(actualText, containsString(expectedText));
        pageResult.pickStatusNextButton();
    }


    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }
}
