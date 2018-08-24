package NativeAppRealDevice_APK;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {

	//Pass arg to select devices
	public static AndroidDriver<AndroidElement> capabilities(String device)  throws MalformedURLException  {
		
		
	DesiredCapabilities cap=new DesiredCapabilities();
	
	//Set Device name
	if(device.equals("real"))
	
		{cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");}
	else if(device.equals("emulator"))
	{
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_API_23");}
	
	

	
	
	
	//Set path for apk
	File f=new File("src");
	File fs=new File(f, "ApiDemos-debug.apk");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	
	//Send connection to server 
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	return driver;
	//Provide a driver return type for this method
		
		
}
}
