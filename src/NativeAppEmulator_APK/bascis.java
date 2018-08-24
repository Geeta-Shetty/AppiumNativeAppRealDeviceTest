package NativeAppEmulator_APK;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class bascis extends base
{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		
			
		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(40000);
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");       
		//driver.findElementByXPath("//android.widget.TextView[@text='Text']").click();
	 
		/*Different Element locators
		driver.findElement(By.name("Accessibility")).click();   By Name - Failed
		driver.findElement(By.className("android.widget.TextView")).click(); By classname - Passed
	    driver.findElementByXPath("//android.widget.TextView[@text='Accessibility']").click(); By xpath - Passed
	    driver.findElement(By.id("android:id/text1")).click(); By id*/
		
		//Preference
	    driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();	
	    Thread.sleep(20000);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	    driver.findElementById("android:id/checkbox").click();
	   /* driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click(); By xpath index*/

	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'WiFi settings']")).click();
	   // driver.findElementById("android:id/edit").clear();

	    driver.findElementById("android:id/edit").sendKeys("Hi");
	    //driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	    driver.findElementsByClassName("android.widget.Button").get(1).click();//By classname index with findelements
	    
	   
	
	}
	}

	    
	    

	    


	
