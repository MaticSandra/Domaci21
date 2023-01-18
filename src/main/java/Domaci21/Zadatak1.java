package Domaci21;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdiver.chrome.driver", "C:\\ITBootCamp\\chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();

        WebElement signUpLogin = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signUpLogin.click();

        Faker faker = new Faker();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        name.sendKeys(faker.name().firstName());
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        emailAddress.sendKeys(faker.internet().emailAddress());

//        emailAddress.submit();

        WebElement signup = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));

        signup.click();

        WebElement mrs = driver.findElement(By.id("id_gender2"));
        mrs.click();
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(faker.internet().password());

        WebElement day = driver.findElement(By.id("days"));
        day.click();

        Select category = new Select(day);
        category.selectByVisibleText("24");

        WebElement month = driver.findElement(By.id("months"));
        month.click();
        Select category1 = new Select(month);
        category1.selectByVisibleText("July");

        WebElement year = driver.findElement(By.id("years"));
        year.click();
        Select category2 = new Select(year);
        category2.selectByVisibleText("1987");

        WebElement checkbox = driver.findElement(By.id("optin"));

        WebElement receiveSpecialOffers = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]/label"));

        checkbox.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        receiveSpecialOffers.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        receiveSpecialOffers.click();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(800,1000);", "");

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Emilly");


        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("Shulltcz");


        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Bolcino");


        WebElement address1 = driver.findElement(By.id("address1"));
        address1.sendKeys("Murazik, Schamber93684 Marta Radialger and Rempel");


        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("Murazik, Schamber93684 Marta Radialger and Rempel");


        WebElement country = driver.findElement(By.id("country"));
        Select category3 = new Select(country);
        category3.selectByVisibleText("India");

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("Punjab");


        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Chandigarh");


        WebElement zipcode = driver.findElement(By.id("zipcode"));
        zipcode.sendKeys("160001");



        WebElement mobileNumber = driver.findElement(By.id("mobile_number"));
        mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());

        WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
        createAccount.click();


        WebElement contin = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        contin.click();

        WebElement deleteAccount = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteAccount.click();

        WebElement contin1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        contin1.click();



















    }
}
