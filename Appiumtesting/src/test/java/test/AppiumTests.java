
package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.WaitOptions;
public class AppiumTests {
	public static AppiumDriver driver1;

	private static final PointOption PonitOption = null;
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		
		
		openCalculator1();
	}
		
		public static void openCalculator1() throws Exception {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
		    cap.setCapability("devicename", "PocoM3");
			cap.setCapability("udid", "fe0212600621");
			cap.setCapability("platformName", "Android");
			cap.setCapability("PlatformVersion", "11");
			cap.setCapability("appPackage", "com.cravrr.ssmpos");
			cap.setCapability("appActivity", "com.cravrr.mpos.ui.splash.SplashActivity");
			cap.setCapability("automationName", "Uiautomator2");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			
			driver1 = new AppiumDriver<MobileElement>(url,cap);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("Shoppers Stop Application Started");
			MobileElement StartBilling = (MobileElement) driver1.findElementByXPath("/hierarchy/android.widget.FrameLayout");
			StartBilling.click();
			MobileElement EmployeeID = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/etStoreCode"));
			EmployeeID.click();
			EmployeeID.sendKeys("7010014");
			driver1.hideKeyboard();
			MobileElement Password = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/etPassword"));
			Password.click();
			Password.sendKeys("11410014");
			driver1.hideKeyboard();
			driver1.findElement(By.id("com.cravrr.ssmpos:id/etPassword")).sendKeys("11410014");
			driver1.hideKeyboard();
			MobileElement Login = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnLogin"));
			Login.click();
			System.out.println("Successfully logged in to the Shoppers Stop MPOS");
			MobileElement Allow = (MobileElement) driver1.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
			Allow.click();
			MobileElement Allows = (MobileElement) driver1.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
			Allows.click();
			MobileElement Allowss = (MobileElement) driver1.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			Allowss.click();
			MobileElement Allowsss = (MobileElement) driver1.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			Allowsss.click();
			MobileElement StartBill = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnStartBilling"));
			StartBill.click();
			MobileElement Cust = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Search_Continue"));
			Cust.click();
			MobileElement NewCust = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
			NewCust.click();
			MobileElement Enrollment = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
			Enrollment.click();
			
			
			MobileElement Title = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Title"));
			Title.click();
			MobileElement sTitle = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));
			sTitle.click();
		
			MobileElement Fname = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Firstname"));
			Fname.click();
			Fname.sendKeys("Abhishek");
			driver1.hideKeyboard();
			System.out.println("First name entered");
			MobileElement Sname = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Lastname"));
			Sname.click();
			driver1.hideKeyboard();
			Sname.sendKeys("Singh");
			System.out.print("Entered the Surname");
			
			driver1.hideKeyboard();
			MobileElement Mobile = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Mobile"));
			Mobile.click();
			Mobile.sendKeys("1234567890");
			driver1.hideKeyboard();
			MobileElement Email = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Email"));
			Email.click();
			Email.sendKeys("abhibsingh@gmail.com");
			driver1.hideKeyboard();
			System.out.println("Email ID Entered");
			MobileElement DOB = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Dob"));
			DOB.click();
			MobileElement DOB1 = (MobileElement) driver1.findElement(By.id("android:id/date_picker_header_year"));
			DOB1.click();
			
			Dimension dimension = driver1.manage().window().getSize();
			int start_x = (int) (dimension.width *0.5);
			int start_y = (int) (dimension.height *0.4);
			
			int end_x = (int) (dimension.width *0.5);
			int end_y = (int) (dimension.height *0.7);
			TouchAction touch =new TouchAction(driver1);
			touch.press(PonitOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x,end_y)).release().perform();
			
			Thread.sleep(3000);
			
			 dimension = driver1.manage().window().getSize();
			 start_x = (int) (dimension.width *0.5);
			 start_y = (int) (dimension.height *0.4);
			
			 end_x = (int) (dimension.width *0.5);
			 end_y = (int) (dimension.height *0.7);
			 touch =new TouchAction(driver1);
			touch.press(PonitOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x,end_y)).release().perform();
			
			Thread.sleep(2000);
			
			
			 dimension = driver1.manage().window().getSize();
			 start_x = (int) (dimension.width *0.5);
			 start_y = (int) (dimension.height *0.4);
			
			 end_x = (int) (dimension.width *0.5);
			 end_y = (int) (dimension.height *0.7);
			 touch =new TouchAction(driver1);
			touch.press(PonitOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x,end_y)).release().perform();
			
			Thread.sleep(2000);
			
			
			MobileElement DOB2 = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[3]"));
			DOB2.click();
			
			MobileElement DOB3 = (MobileElement) driver1.findElement(By.id("android:id/button1"));
			DOB3.click();
			
			System.out.println("DOB entered successfully");
			
			
			 dimension = driver1.manage().window().getSize();
			 start_x = (int) (dimension.width *0.5);
			 start_y = (int) (dimension.height *0.7);
			
			 end_x = (int) (dimension.width *0.5);
			 end_y = (int) (dimension.height *0.4);
			 touch =new TouchAction(driver1);
			touch.press(PonitOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x,end_y)).release().perform();
			
		
			driver1.hideKeyboard();
			
			MobileElement continue1 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/Register_Continue"));
			continue1.click();
		MobileElement barcode = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/et_barcode"));
			barcode.click();
			barcode.sendKeys("1");
			driver1.hideKeyboard();
			MobileElement ok = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tv_barcode_search"));
			ok.click();
		
			
			MobileElement dt = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOption"));
			dt.click();
			System.out.println("1");
			MobileElement dt1 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOption"));
			dt1.click();
			System.out.println("2");
			MobileElement holdcart = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
			holdcart.click();
			MobileElement hamburger1 = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView"));
			hamburger1.click();
			MobileElement storeorder = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOrders"));
			storeorder.click();
			MobileElement openorder  = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOpenOrder"));
			openorder.click();
			MobileElement openorder1  = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOpenOrder"));
			openorder1.click();
			MobileElement threedot  = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
			threedot.click();
			MobileElement summry  = (MobileElement) driver1.findElement(By.id("android:id/title"));
			summry.click();
			MobileElement gotocart  = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btDone"));
			gotocart.click();
			MobileElement proceed = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btProceed"));
			proceed.click();
			MobileElement cont = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnPaymentBilling"));
			cont.click();
			MobileElement Moretender = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnLoadMore"));
			Moretender.click();
			MobileElement Hdfcinn = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.CheckBox"));
			Hdfcinn.click();
		MobileElement apply = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnApply"));
			apply.click();
			MobileElement tendervoid = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView"));
			tendervoid.click();
			MobileElement giftcardsale = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.CheckBox"));
			giftcardsale.click();
			MobileElement apply1 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnApply"));
			apply1.click();
			
			
			
			
			
			MobileElement cont1 = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[12]/android.widget.LinearLayout/android.widget.TextView"));
			cont1.click();
			
			MobileElement emailcheck = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/cbEmail"));
			emailcheck.click();
			
			MobileElement closeorder = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btnOrderClose"));
			closeorder.click();
			
			MobileElement emoji = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/cb_gold_emoji"));
			emoji.click();
			
			
			MobileElement nxt = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btn_next"));
			nxt.click();
			
			MobileElement rate = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/cb_f2_10"));
			rate.click();
			
			MobileElement nxt1 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btn_next2"));
			nxt1.click();
			
			MobileElement done = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btn_okay"));
			done.click();
			System.out.println("Walk in customer registration  done");
			MobileElement menu = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/imgMenu"));
			menu.click();
			MobileElement order = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvOrders"));
			order.click();
			
		
			MobileElement closeorder1 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvCloseOrder"));
			closeorder1.click();
			
			
			MobileElement dot3 = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
			dot3.click();
			
			MobileElement voidorder = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
			voidorder.click();
			
			
			MobileElement managerid = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/etManagerId"));
			managerid.click();
			managerid.sendKeys("7010014");
			
			
			
			MobileElement pass1 = (MobileElement) driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"));
			pass1.click();
			pass1.sendKeys("123456");
			
			
			MobileElement cont2 = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/btContinu"));
			cont2.click();
			
			MobileElement voido = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/tvVoidOrder"));
			voido.click();
			
			MobileElement back = (MobileElement) driver1.findElement(By.id("com.cravrr.ssmpos:id/ivBackr"));
			back.click();
			
			System.out.print("Order voided successfully");
			
		}

		

	}