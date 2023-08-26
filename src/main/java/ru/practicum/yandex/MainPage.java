package ru.practicum.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    private By accordion0 = By.id("accordion__heading-0");
    private By panel0 = By.id("accordion__panel-0");
    private By accordion1 = By.id("accordion__heading-1");
    private By panel1 = By.id("accordion__panel-1");
    private By accordion2 = By.id("accordion__heading-2");
    private By panel2 = By.id("accordion__panel-2");
    private By accordion3 = By.id("accordion__heading-3");
    private By panel3 = By.id("accordion__panel-3");
    private By accordion4 = By.id("accordion__heading-4");
    private By panel4 = By.id("accordion__panel-4");
    private By accordion5 = By.id("accordion__heading-5");
    private By panel5 = By.id("accordion__panel-5");
    private By accordion6 = By.id("accordion__heading-6");
    private By panel6 = By.id("accordion__panel-6");
    private By accordion7 = By.id("accordion__heading-7");
    private By panel7 = By.id("accordion__panel-7");
    private By orderUp = By.className("Button_Button__ra12g");
    private By orderDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public void clickOnElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public void clickOrderUp() {
        clickOnElement(orderUp);
    }

    public void clickOrderDown() {
        clickOnElement(orderDown);
    }

    public void clickAccordion0() {
        clickOnElement(accordion0);
    }

    public void clickAccordion1() {
        clickOnElement(accordion1);
    }

    public void clickAccordion2() {
        clickOnElement(accordion2);
    }

    public void clickAccordion3() {
        clickOnElement(accordion3);
    }

    public void clickAccordion4() {
        clickOnElement(accordion4);
    }

    public void clickAccordion5() {
        clickOnElement(accordion5);
    }

    public void clickAccordion6() {
        clickOnElement(accordion6);
    }

    public void clickAccordion7() {
        clickOnElement(accordion7);
    }

    public String getTextPanel0() {
        return driver.findElement(panel0).getText();
    }

    public String getTextPanel1() {
        return driver.findElement(panel1).getText();
    }

    public String getTextPanel2() {
        return driver.findElement(panel2).getText();
    }

    public String getTextPanel3() {
        return driver.findElement(panel3).getText();
    }

    public String getTextPanel4() {
        return driver.findElement(panel4).getText();
    }

    public String getTextPanel5() {
        return driver.findElement(panel5).getText();
    }

    public String getTextPanel6() {
        return driver.findElement(panel6).getText();
    }

    public String getTextPanel7() {
        return driver.findElement(panel7).getText();
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
}
