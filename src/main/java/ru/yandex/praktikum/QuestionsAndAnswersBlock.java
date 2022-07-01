package ru.yandex.praktikum;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;

public class QuestionsAndAnswersBlock extends MainPage {
    //локатор 1 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement accordingHeadingFirst;

    //локатор ответа к 1 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement accordingPanelFirst;

    //метод клика по 1 вопросу
    public void clickAccordionButtonFirst() {
        accordingHeadingFirst.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextOne() {
        accordingPanelFirst.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 1 вопросу
    public String getTextFirstAnswer() {
        return accordingPanelFirst.getText();
    }


    //локатор 2 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement accordingHeadingSecond;

    //локатор ответа к 2 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement accordingPanelSecond;

    //метод клика по 2 вопросу
    public void clickAccordionButtonSecond() {
        accordingHeadingSecond.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextTwo() {
        accordingPanelSecond.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 2 вопросу
    public String getTextSecondAnswer() {
        return accordingPanelSecond.getText();
    }


    //локатор 3 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement accordingHeadingThird;

    //локатор ответа к 3 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement accordingPanelThird;

    //метод клика по 3 вопросу
    public void clickAccordionButtonThird() {
        accordingHeadingThird.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextThree() {
        accordingPanelThird.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 3 вопросу
    public String getTextThirdAnswer() {
        return accordingPanelThird.getText();
    }


    //локатор 4 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement accordingHeadingFourth;

    //локатор ответа к 4 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement accordingPanelFourth;

    //метод клика по 4 вопросу
    public void clickAccordionButtonFourth() {
        accordingHeadingFourth.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextFour() {
        accordingPanelFourth.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 4 вопросу
    public String getTextFourthAnswer() {
        return accordingPanelFourth.getText();
    }


    //локатор 5 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement accordingHeadingFifth;

    //локатор ответа к 5 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement accordingPanelFifth;

    //метод клика по 5 вопросу
    public void clickAccordionButtonFifth() {
        accordingHeadingFifth.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextFive() {
        accordingPanelFifth.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 5 вопросу
    public String getTextFifthAnswer() {
        return accordingPanelFifth.getText();
    }


    //локатор 6 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement accordingHeadingSixth;

    //локатор ответа к 6 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement accordingPanelSixth;

    //метод клика по 6 вопросу
    public void clickAccordionButtonSixth() {
        accordingHeadingSixth.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextSix() {
        accordingPanelSixth.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 6 вопросу
    public String getTextSixthAnswer() {
        return accordingPanelSixth.getText();
    }


    //локатор 7 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement accordingHeadingSeventh;

    //локатор ответа к 7 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement accordingPanelSeventh;

    //метод клика по 7 вопросу
    public void clickAccordionButtonSeventh() {
        accordingHeadingSeventh.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextSeven() {
        accordingPanelSeventh.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 7 вопросу
    public String getTextSeventhAnswer() {
        return accordingPanelSeventh.getText();
    }


    //локатор 8 Вопроса
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement accordingHeadingEighth;

    //локатор ответа к 8 Вопросу
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement accordingPanelEighth;

    //метод клика по 8 вопросу
    public void clickAccordionButtonEighth() {
        accordingHeadingEighth.scrollIntoView(true).click();
    }

    //ожидание появления текста ответа на первый вопрос
    public void waitingForTextEight() {
        accordingPanelEighth.shouldBe(Condition.appear, Duration.ofSeconds(8000)).click();
    }

    //метод получения ответа к 8 вопросу
    public String getTextEighthAnswer() {
        return accordingPanelEighth.getText();
    }
}
