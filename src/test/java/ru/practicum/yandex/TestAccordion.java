package ru.practicum.yandex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestAccordion extends BaseTest {

    @Test
    public void testTextFromOpenAccordion0() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion0();
        String text = mainPage.getTextPanel0();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", text);
    }

    @Test
    public void testTextFromOpenAccordion1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion1();
        String text = mainPage.getTextPanel1();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", text);
    }

    @Test
    public void testTextFromOpenAccordion2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion2();
        String text = mainPage.getTextPanel2();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", text);
    }

    @Test
    public void testTextFromOpenAccordion3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion3();
        String text = mainPage.getTextPanel3();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", text);
    }

    @Test
    public void testTextFromOpenAccordion4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion4();
        String text = mainPage.getTextPanel4();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", text);
    }

    @Test
    public void testTextFromOpenAccordion5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion5();
        String text = mainPage.getTextPanel5();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", text);
    }

    @Test
    public void testTextFromOpenAccordion6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion6();
        String text = mainPage.getTextPanel6();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", text);
    }

    @Test
    public void testTextFromOpenAccordion7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccordion7();
        String text = mainPage.getTextPanel7();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", text);
    }
}
