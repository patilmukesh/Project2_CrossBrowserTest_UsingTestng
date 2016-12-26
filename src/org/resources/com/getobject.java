package org.resources.com;

import org.openqa.selenium.By;

public class getobject
{
	public By getemailobj()
	{
		return By.xpath(".//*[@id='email']");
	}
	public By getpassobj()
	{
		return By.xpath(".//*[@id='pass']");
	}
	public By getbtnobj()
	{
		return By.xpath(".//*[@id='u_0_l']");
	}
}
