package gov.uk.check.visa.steps;

import gov.uk.check.visa.Utility.Utility;
import gov.uk.check.visa.propertyreader.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot,"image/jpg",scenario.getName());
        }
        closeBrowser();
    }
}
