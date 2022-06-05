package tests;

import com.fasterxml.jackson.databind.ext.Java7Support;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.UseInsiderPage;
import utilities.*;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TC03_SearchForQAJobs extends TestBaseRapor {
    UseInsiderPage useInsiderPage=new UseInsiderPage();
    @Test
    public void searchQAJob(){
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "HomeButton Testi");
        UseinsiderReusableMethods.accessMainPage();
        extentTest.info("Anasayfaya gidildi");
        useInsiderPage.acceptCookie.click();
        extentTest.info("cookies kabul edildi");
        useInsiderPage.moreButton.click();
        extentTest.info("more Button tiklandi");
        useInsiderPage.careersButton.click();
        extentTest.info("careers Button tiklandi");
        JSUtils.clickElementByJS(useInsiderPage.seeAllTeamsButton);
        extentTest.info("see all teams Button tiklandi");
        JSUtils.clickElementByJS(useInsiderPage.qualityAssurenceWebElementButton);
        extentTest.info("QA Button tiklandi");
        JSUtils.clickElementByJS(useInsiderPage.seeAllQAJobsButton);
        extentTest.info("seeAllJobs Button tiklandi");

ReusableMethods.waitFor(5);
        Select selectLocation=new Select(useInsiderPage.filterByLocation);
        selectLocation.selectByIndex(11);

    //    assertEquals("Istanbul, Turkey",useInsiderPage.istanbulTurkey.getText(),"istanbul turkey gozukmedi");
    //    assertTrue("istanbul turkey secilmedi",useInsiderPage.istanbulTurkey.isDisplayed());
        ReusableMethods.waitFor(3);

        Select selectDepartment=new Select(useInsiderPage.byDepartment);
        selectDepartment.selectByIndex(16);
        System.out.println("useInsiderPage.qualityAssurancedrop = " + useInsiderPage.qualityAssurancedrop.getText());
    //   assertTrue("assurenceDrop secilmedi",useInsiderPage.qualityAssurancedrop.isDisplayed());
        ReusableMethods.waitFor(10);
        System.out.println("useInsiderPage.joblist = " + useInsiderPage.jobList.getText());
     //   assertTrue(useInsiderPage.availablePositions.isDisplayed());
        ReusableMethods.waitFor(10);
        useInsiderPage.positionList.stream().forEach(t-> System.out.println("liste>>>"+t.getText()));

    /*    List<WebElement> denem=Driver.getDriver().findElements(By.xpath("//span[.='Quality Assurance']"));
        for (int i = 0; i < denem.size(); i++) {
            System.out.println("deneme : "+denem.get(i).getText());
        }
*/
        System.out.println("first position : " + useInsiderPage.firstPosition.getText());
    }
}
