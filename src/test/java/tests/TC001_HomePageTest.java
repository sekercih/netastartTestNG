package tests;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseRapor;
import utilities.UseinsiderReusableMethods;

import static org.testng.Assert.assertEquals;

public class TC001_HomePageTest extends TestBaseRapor {

    @Test
    public void accessHomePage(){
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "HomeButton Testi");
        UseinsiderReusableMethods.accessMainPage();
        extentTest.info("Anasayfaya gidildi");
        String actualMainPageTitle="Insider personalization engine for seamless customer experiences";
        String expectedMainPageTitle=Driver.getDriver().getTitle();
        assertEquals(actualMainPageTitle,expectedMainPageTitle,"Anasayfaya ulasilamiyor");
        extentTest.pass("ana sayfaya gidildigi dogrulandi");
    }

}
