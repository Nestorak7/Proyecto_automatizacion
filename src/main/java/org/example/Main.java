package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com/");
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.id("MX"));
        link.click();
        Thread.sleep(2000);
        driver.findElement(By.id("cb1-edit")).sendKeys("playstation 5");
        //driver.findElement(By.id("cb1-edit")).sendKeys("playstation 5", Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
        driver.findElement(By.xpath("//a[contains(@class, 'ui-search-link') and .//span[text()='Nuevo']]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[aria-label='Más relevantes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li[data-key='price_desc']")).click();
        Thread.sleep(2000);
        List<WebElement> ListaPlay5 = driver.findElements(By.cssSelector("li.ui-search-layout__item"));

        for (int i = 0; i < 5; i++) {
            WebElement play5 = ListaPlay5.get(i);
            String nombre = play5.findElement(By.cssSelector(".poly-component__title")).getText();
            String precio = play5.findElement(By.cssSelector(".andes-money-amount__fraction")).getText();
            System.out.println("  Nombre: " + nombre);
            System.out.println("  Precio: $" + precio);
            System.out.println("-----------------------------");
        }

        driver.quit();


    }
}
