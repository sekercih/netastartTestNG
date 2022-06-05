package utilities;

import org.testng.annotations.Test;

public class UseinsiderReusableMethods {
    @Test
    public static void accessMainPage() {
        Driver.getDriver().get(ConfigReader.getProperty("useInsiderUrl"));
    }
}
