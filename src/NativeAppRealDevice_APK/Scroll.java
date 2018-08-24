package NativeAppRealDevice_APK;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends HybridBase{
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capabilities("real");
		Thread.sleep(20000);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		//size.getWidth();
		
		
	}

}
