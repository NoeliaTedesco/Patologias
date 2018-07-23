package ar.com.osde.patologias.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import ar.com.osde.patologias.selenium.ABM_Intranet;


public class Test_Capitulos {
	
	private ABM_Intranet driver;
	
	@Parameters({"ipNodo"})
	@BeforeClass
	public void startUp(String ipNodo) throws InterruptedException {
		driver = new ABM_Intranet(ipNodo);
		
		
	}

}
