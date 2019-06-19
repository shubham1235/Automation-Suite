package org.umbrella.selenium.webAutoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.umberella.Utils.BaseUtils;

public class AmazonPage extends BaseUtils {
	
	
	@FindBy(id = "nav-logo")
	public WebElement AmazonLogo;
	
	
	public WebElement shippingContinueButton;
	
	public AmazonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void waitforWebsiteloading()
	{
		WaitFor_visibilityOfElements(AmazonLogo);
	}
	

}
