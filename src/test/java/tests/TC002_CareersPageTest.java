package tests;

import org.testng.annotations.Test;
import pages.UseInsiderPage;
import utilities.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TC002_CareersPageTest extends TestBaseRapor {
//Select “More” menu in navigation bar, select “Careers” and check Career page, its
//Locations, Teams and Life at Insider blocks are opened or not
    UseInsiderPage useInsiderPage=new UseInsiderPage();

    @Test
    public void verifyCareerPage(){
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "HomeButton Testi");
        UseinsiderReusableMethods.accessMainPage();
        extentTest.info("Anasayfaya gidildi");
         useInsiderPage.moreButton.click();
        extentTest.info("more Button tiklandi");
         useInsiderPage.careersButton.click();
        extentTest.info("careers Button tiklandi");
         String expectedCareerPageTitle="Insider Careers";
         String actualCareerPageTitle=Driver.getDriver().getTitle();
         assertEquals(actualCareerPageTitle,expectedCareerPageTitle,"Career Page sayfasi acilmadi");

         assertTrue(useInsiderPage.firstlocationElement.isDisplayed(),"Location blok not opened");
        extentTest.pass("Location blogun acik oldugu goruldu");
        assertTrue(useInsiderPage.lifeAtInsiderText.isDisplayed(),"Life at insider block not opened");
        extentTest.pass("Life at insider blogun acik oldugu goruldu");
    }






}
