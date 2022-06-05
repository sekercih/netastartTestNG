package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UseInsiderPage extends BasePage{

    @FindBy(xpath = "//span[.='More']")
    public WebElement moreButton;

    @FindBy(xpath = "//h5[.='Careers']")
    public WebElement careersButton;

    @FindBy(className = "location-info")
    public List<WebElement> locationInfoList;

    @FindBy(xpath = "(//div[@class='position-relative'])[1]")
    public WebElement firstlocationElement;

    @FindBy(xpath = "//div[@class='position-relative']")
    public List<WebElement> firstlocationElementList;

    @FindBy(xpath = "(//div[@class='elementor-carousel-image'])[1]")
    public WebElement firstLifeAtInsiderPhotoWebElement;

    @FindBy(xpath = "(//div[@class='elementor-text-editor elementor-clearfix'])[5]")
    public WebElement lifeAtInsiderText;

    @FindBy(xpath = "//a[.='See all teams']")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "//*[.='Quality Assurance']")
    public WebElement qualityAssurenceWebElementButton;

    @FindBy(linkText = "See all QA jobs")
    public WebElement seeAllQAJobsButton;

    @FindBy(id = "select2-filter-by-location-container")
    public WebElement locationDropdown;

    @FindBy(xpath = "//li[@id='select2-filter-by-location-result-skyb-Istanbul, Turkey']")
    public WebElement istanbulTurkeyOption;

    @FindBy(xpath = "body.page-template.page-template-layouts.page-template-layout-careers-open.page-template-layoutslayout-careers-open-php.page.page-id-13315.page-child.parent-pageid-22610.wp-embed-responsive.career-page.inner-page.elementor-default.elementor-kit-960.elementor-page.elementor-page-13315.scrolled.nav-active:nth-child(2) span.select2-container.select2-container--default.select2-container--open:nth-child(38) > span.select2-dropdown.select2-dropdown--above")
    public WebElement dropdown;

    @FindBy(xpath = "//a[@id='wt-cli-accept-btn']")
    public WebElement acceptCookie;

    @FindBy(id = "icon-close-button-1454703945249")
    public WebElement closeAdvertise;

    @FindBy(xpath = "//b[@role='presentation']")
    public WebElement opendropdown;

    @FindBy(xpath = "//ul[@id='select2-filter-by-location-results']")
    public WebElement dropdowndeneme;

    @FindBy(xpath = "//select[@id='filter-by-location']")
    public WebElement filterByLocation;

    @FindBy(xpath = "//span[@title='Istanbul, Turkey']")
    public WebElement istanbulTurkey;

    @FindBy(id = "filter-by-department")
    public WebElement byDepartment;

    @FindBy(xpath="//span[@title='Quality Assurance']")
    public WebElement qualityAssurancedrop;

    @FindBy(id = "jobs-list")
    public WebElement jobList;

    @FindBy(xpath = "//*[contains(@class,'position-title font-weight-bold')]")
    public List<WebElement> positionList;

    @FindBy(xpath = "(//div[@data-location='istanbul-turkey'])[1]")
    public WebElement firstPosition;

}
