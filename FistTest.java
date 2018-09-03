import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class FistTest {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "emulator-5554");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "7.0");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appPackage", "com.android.chrome");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void openURL() {

        driver.get("http://www.demo.guru99.com/v4");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnLogin")));
        // enter username
        driver.findElement(By.name("uid")).sendKeys("mngr151713");

// enter password
        driver.findElement(By.name("password")).sendKeys("berybAn");

// click on submit button
        driver.findElement(By.name("btnLogin")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Customer")));

        driver.findElement(By.linkText("New Customer")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 10);
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));

        driver.findElement(By.name("name")).sendKeys("tuan");

        driver.findElement(By.name("addr")).sendKeys("Ho Chi Minh city");
        driver.findElement(By.name("city")).sendKeys("Ho Chi Minh city");

        driver.findElement(By.name("state")).sendKeys("on");

        driver.findElement(By.name("pinno")).sendKeys("123456");

        driver.findElement(By.name("telephoneno")).sendKeys("1688893394");

        driver.findElement(By.name("emailid")).sendKeys("iker.tuan@gmail.com");

        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.name("sub")).click();

        WebDriverWait wait6 = new WebDriverWait(driver, 10);
        WebElement element6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Account")));
        driver.findElement(By.linkText("New Account")).click();
        WebDriverWait wait7 = new WebDriverWait(driver, 10);
        WebElement element7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));

        driver.findElement(By.name("cusid")).sendKeys("51182");

// enter password
        driver.findElement(By.name("inideposit")).sendKeys("1000");
        driver.findElement(By.name("button2")).click();

        WebDriverWait wait4 = new WebDriverWait(driver, 10);
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Deposit")));

        driver.findElement(By.linkText("Deposit")).click();
        WebDriverWait wait5 = new WebDriverWait(driver, 10);
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("AccSubmit")));
        driver.findElement(By.name("accountno")).sendKeys("51182");
        driver.findElement(By.name("ammount")).sendKeys("10");
        driver.findElement(By.name("desc")).sendKeys("buy a dog");
        driver.findElement(By.name("AccSubmit")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}