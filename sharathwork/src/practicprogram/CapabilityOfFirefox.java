package practicprogram;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CapabilityOfFirefox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
DesiredCapabilities cap=new DesiredCapabilities().firefox();
cap.setPlatform(Platform.WINDOWS);
URL url=new URL("http://localhost:4444/wd/hub");
WebDriver we=new RemoteWebDriver(url,cap);
we.get("htttp://google.com");
System.out.println(we.getTitle());
	}

}
