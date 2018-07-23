package ar.com.osde.patologias.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ABM_Intranet {
	
	protected WebDriver driver;
	
	public ABM_Intranet (String ipNodo) {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		try {
			driver = new RemoteWebDriver(new URL(ipNodo), capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Ocurrio un error al inicializar driver en nodo - " + e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@CacheLookup
	@FindBy(name = "imgIndice")	    
	private WebElement bIndice;
	
	@FindBy(xpath = "//img[@src='http://test.intranet.osde/IV3/images/osde_binario_on.gif']")	    
	private WebElement bOsdeBinario;
	
	@FindBy(xpath = "//html/body/table/tbody/tr[1]/td[1]/tr/td[@text='Comercial']")
	private WebElement opcionComercial;
	
	@FindBy(xpath = "//html/body/div[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[@text='Menu']")	    
	private WebElement mMenu;
	
	@FindBy(xpath = "//table[@class='formulario']")	    
	private WebElement bBotonera;

	@FindBy(xpath = "//table[@class='datos']")	    
	private WebElement rDatos;
	
	
	
	

}
