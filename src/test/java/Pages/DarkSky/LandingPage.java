package Pages.DarkSky;

import Drivers.Web;
import Pages.StepDefinition.BasePage;
import Utils.DateHelper;
import org.openqa.selenium.By;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LandingPage extends BasePage {

By allHoursLocator = By.xpath("//span[@class='hour']");

public boolean findWebElementsFromDarkSky(int interval){


    List<String> hour1 = getTextsFromWebElements(allHoursLocator);

    hour1.removeAll(Arrays.asList("",null));


    int size=hour1.size();

    List<String> hour2 = DateHelper.createArrayFromNowTimeToXTime(interval,size);

boolean d = true;
    for (int i=0; i<size; i++){
       if(!hour1.get(i).equalsIgnoreCase(hour2.get(i))) {
          d=false;
          break;
        }

    }

    return d;
}



}
