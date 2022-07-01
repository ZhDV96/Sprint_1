import ru.yandex.praktikum.QuestionsAndAnswersBlock;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.codeborne.selenide.Configuration;
import org.hamcrest.MatcherAssert;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.is;

public class TestQuestionsFireFox {

    // открывается страница и создаётся экземпляр класса страницы
    QuestionsAndAnswersBlock questionsAndAnswers = page(QuestionsAndAnswersBlock.class);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "firefox";
        open("https://qa-scooter.praktikum-services.ru/");
        questionsAndAnswers.clickCookieButton();
    }

    @Test
    public void testQuestions () {
        //перменные с ожидаемым текстом
        String expectedZero = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String expectedOne = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String expectedTwo = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String expectedThree = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String expectedFour = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String expectedFive = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String expectedSix = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String expectedSeven = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

        //скролл до первого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonFirst();
        questionsAndAnswers.waitingForTextOne();
        String actualZero = questionsAndAnswers.getTextFirstAnswer();
        MatcherAssert.assertThat(actualZero, is(expectedZero));

        //скролл до второго меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonSecond();
        questionsAndAnswers.waitingForTextTwo();
        String actualOne = questionsAndAnswers.getTextSecondAnswer();
        MatcherAssert.assertThat(actualOne, is(expectedOne));

        //скролл до третьего меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonThird();
        questionsAndAnswers.waitingForTextThree();
        String actualTwo = questionsAndAnswers.getTextThirdAnswer();
        MatcherAssert.assertThat(actualTwo, is(expectedTwo));

        //скролл до четвертого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonFourth();
        questionsAndAnswers.waitingForTextFour();
        String actualThree = questionsAndAnswers.getTextFourthAnswer();
        MatcherAssert.assertThat(actualThree, is(expectedThree));

        //скролл до пятого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonFifth();
        questionsAndAnswers.waitingForTextFive();
        String actualFour = questionsAndAnswers.getTextFifthAnswer();
        MatcherAssert.assertThat(actualFour, is(expectedFour));

        //скролл до шестого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonSixth();
        questionsAndAnswers.waitingForTextSix();
        String actualFive = questionsAndAnswers.getTextSixthAnswer();
        MatcherAssert.assertThat(actualFive, is(expectedFive));

        //скролл до седьмого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonSeventh();
        questionsAndAnswers.waitingForTextSeven();
        String actualSix = questionsAndAnswers.getTextSeventhAnswer();
        MatcherAssert.assertThat(actualSix, is(expectedSix));

        //скролл до восьмого меню с выпадающим текстом, сравнение ожидаемого и фактического текста
        questionsAndAnswers.clickAccordionButtonEighth();
        questionsAndAnswers.waitingForTextEight();
        String actualSeven = questionsAndAnswers.getTextEighthAnswer();
        MatcherAssert.assertThat(actualSeven, is(expectedSeven));


    }

    @After
    public void teardown() {
        // Закрыть браузер
        closeWindow();
    }

}
