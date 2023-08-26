package ru.practicum.yandex;

import org.openqa.selenium.*;

public class OrderPage {
    private WebDriver driver;
    //Локатор Имя
    private By userName = By.xpath("//input[@placeholder='* Имя']");
    //Локатор Фамилия
    private By userSurname = By.xpath("//input[@placeholder='* Фамилия']");
    //Локатор Адрес
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Локатор Метро
    private By station = By.xpath("//input[@placeholder='* Станция метро']");
    private By stationSelector = By.xpath("//div[@class='select-search__select']//li");
    //Локатор Телефон
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Локатор Далее
    private By buttonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор Когда привезти самокат
    private By date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //Локатор Срок аренды
    private By rent = By.className("Dropdown-placeholder");
    //Локатор Цвет
    private By color = By.xpath("//input[@id='black']");
    //Локатор Заказать
    private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By buttonAccept = By.xpath("//div[@class='Order_Modal__YZ-d3']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By orderSuccess = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");

    private By rentSelect(String text) {
        return By.xpath(String.format("//div[@class='Dropdown-option'][text()='%s']", text));
    }

    public void fillUserName(String name) {
        driver.findElement(userName).sendKeys(name);
    }

    public void fillUserSurname(String surname) {
        driver.findElement(userSurname).sendKeys(surname);
    }

    public void fillAddress(String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    public void fillStation(String stationMetro) {
        driver.findElement(station).sendKeys(stationMetro);
        driver.findElement(stationSelector).click();
    }

    public void fillPhone(String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
    }

    public void clickButtonNext() {
        WebElement element = driver.findElement(buttonNext);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void fillDate(String dateText) {
        driver.findElement(date).sendKeys(dateText);
    }

    public void choseRent(String dateText) {
        driver.findElement(date).sendKeys(dateText);
        driver.findElement(date).sendKeys(Keys.ENTER);
    }

    public void choseDuration(String dateText) {
        driver.findElement(rent).click();
        driver.findElement(rentSelect(dateText)).click();
    }

    public void clickColor() {
        WebElement element = driver.findElement(color);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickOrder() {
        WebElement element = driver.findElement(buttonOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickAccept() {
        WebElement element = driver.findElement(buttonAccept);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public Boolean successOrderIsDisplayed() {
        return driver.findElement(orderSuccess).isDisplayed();
    }

    public void fillOrder(String name,
                          String userSurname,
                          String address,
                          String station,
                          String phone,
                          String date,
                          String rent) {
        fillUserName(name);
        fillUserSurname(userSurname);
        fillAddress(address);
        fillStation(station);
        fillPhone(phone);
        clickButtonNext();
        choseRent(date);
        choseDuration(rent);
        clickColor();
    }

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


}
