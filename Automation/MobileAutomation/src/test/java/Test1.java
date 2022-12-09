import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1
{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_4");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.makemytrip");
        caps.setCapability(AndroidMobileCapabilityType.APP_WAIT_PACKAGE,"com.makemytrip");
        caps.setCapability(MobileCapabilityType.APP,"/Users/mmt9435/Downloads/makemytrip.apk");
        caps.setCapability("appActivity","com.mmt.travel.app.home.ui.SplashActivity");
        caps.setCapability(MobileCapabilityType.FULL_RESET,false); // New fresh app is downloaded & installed from the path if true
        caps.setCapability(MobileCapabilityType.NO_RESET,false);    // Session wil not be reset if true.

        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4725/wd/hub"),caps);
        (driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        Thread.sleep(3000);
        (driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        Thread.sleep(3000);
        (driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        Thread.sleep(3000);
        (driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.ImageView")).click();
    }
}
