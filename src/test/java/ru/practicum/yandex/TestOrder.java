package ru.practicum.yandex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestOrder {
    private final String userName;
    private final String userSurname;
    private final String address;
    private final String station;
    private final String phone;
    private final String date;
    private final String rent;

    public TestOrder(String userName, String userSurname, String address, String station, String phone, String date, String rent) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.address = address;
        this.station = station;
        this.phone = phone;
        this.date = date;
        this.rent = rent;

    }

    @Parameterized.Parameters
    public static Object[][] getNames() {
        //Сгенерируй тестовые данные (нам нужно название городов и результат поиска)
        return new Object[][]{
                {"Петя", "Петян", "Кирова 7", "Сокольники", "+7777777777", "15.07.2023", "двое суток"},
                {"Анжела", "Петян", "Титова 8", "Черкизовская", "+7777778899", "25.07.2023", "сутки"}
        };
    }

    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
    }

    @Test
    public void TestClickOrderUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.clickOrderUp();
        orderPage.fillUserName(userName);
        orderPage.fillUserSurname(userSurname);
        orderPage.fillAddress(address);
        orderPage.fillStation(station);
        orderPage.fillPhone(phone);
        orderPage.clickButtonNext();
        orderPage.choseRent(date);
        orderPage.choseDuration(rent);
        orderPage.clickColor();
        orderPage.clickOrder();
        orderPage.clickAccept();

        assertTrue(orderPage.successOrderIsDisplayed());
    }

    @Test
    public void TestClickOrderDown() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.clickOrderDown();
        orderPage.fillUserName(userName);
        orderPage.fillUserSurname(userSurname);
        orderPage.fillAddress(address);
        orderPage.fillStation(station);
        orderPage.fillPhone(phone);
        orderPage.clickButtonNext();
        orderPage.choseRent(date);
        orderPage.choseDuration(rent);
        orderPage.clickColor();
        orderPage.clickOrder();
        orderPage.clickAccept();

        assertTrue(orderPage.successOrderIsDisplayed());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
