package org.umbrella.selenium.webAutoTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.umberella.Utils.BaseUtils;

public class AmazonTest extends BaseUtils {
	
	
	
	@BeforeTest
	public void initialized test
	
	
	@Test
	public void validatePurchaseFlow() {
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
	}

}
