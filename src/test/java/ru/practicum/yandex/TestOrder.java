package ru.practicum.yandex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestOrder extends BaseTest {

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

    @Parameterized.Parameters(name = "Заказ самоката. Тестовые данные: {0} {1} {2} {3} {4} {5} {6}")
    public static Object[][] getNames() {
        return new Object[][]{
                {"Петя", "Петян", "Кирова 7", "Сокольники", "+7777777777", "15.07.2023", "двое суток"},
                {"Анжела", "Петян", "Титова 8", "Черкизовская", "+7777778899", "25.07.2023", "сутки"}
        };
    }

    @Test
    public void TestClickOrderUp() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.clickOrderUp();
        orderPage.fillOrder(userName, userSurname, address, station, phone, date, rent);
        orderPage.clickOrder();
        orderPage.clickAccept();

        assertTrue(orderPage.successOrderIsDisplayed());
    }

    @Test
    public void TestClickOrderDown() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.clickOrderDown();
        orderPage.fillOrder(userName, userSurname, address, station, phone, date, rent);
        orderPage.clickOrder();
        orderPage.clickAccept();

        assertTrue(orderPage.successOrderIsDisplayed());
    }
}
