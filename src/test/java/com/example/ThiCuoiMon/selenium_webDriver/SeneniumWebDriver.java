package com.example.ThiCuoiMon.selenium_webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeneniumWebDriver {
    private WebDriver webDriver;
    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void Test() throws InterruptedException {
        //open
        webDriver.get("https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob&gad_source=1&gclid=Cj0KCQiAkoe9BhDYARIsAH85cDORe2krBlFPX0WLX2b8-jbIkCWMIKBWK8_gIojxLNRwUvz25GcCcnEaAk54EALw_wcB");

//        webDriver.findElement(By.xpath("//input[@id='input-departure']")).click();

        Thread.sleep(5000);
        webDriver.quit();
    }
}
