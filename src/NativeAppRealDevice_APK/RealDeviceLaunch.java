package NativeAppRealDevice_APK;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RealDeviceLaunch extends HybridBase{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities("real");
		Thread.sleep(20000);
		
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
