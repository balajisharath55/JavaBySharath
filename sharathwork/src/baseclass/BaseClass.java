package baseclass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import genericlib.CommonUtils;
import genericlib.WebDriverCommonLib;
import objectrepositoryofactitime.Login;
import objectrepositoryofactitime.Logout;
public class BaseClass extends WebDriverCommonLib {
	public CommonUtils com=new CommonUtils();
	public WebDriverCommonLib web=new WebDriverCommonLib();
	@BeforeClass
	public  void configBeforeclass() throws Exception {
		System.out.println("Step1:lanch the Brower");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(com.dataFromPropertyfile().getProperty("url"));
	}
	@BeforeMethod
	public void configBeforeMethod() throws Throwable {
		System.out.println("login ");
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.login(com.dataFromPropertyfile().getProperty("user"), com.dataFromPropertyfile().getProperty("password"));	
	}
	@AfterMethod
	public void cofigAfterMethod() {
		System.out.println("logout");
		Logout logout=PageFactory.initElements(driver, Logout.class);
		logout.logout();				
	}
	
	@AfterClass
	public void configAterClass() {
		System.out.println("close Brower");
	}	
}
