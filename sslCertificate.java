package ElevateWings1.SSLCertificate;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.ctc.wstx.shaded.msv_core.datatype.xsd.Proxy;
import com.google.j2objc.annotations.Property;

public class sslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// Add the WebDriver proxy capability.

    //   Property proxy = new Proxy();
    //   proxy.setHttpProxy("myhttpproxy:3337");
	//   options.setCapability("proxy", proxy);

    // Add a ChromeDriver-specific capability.
      options.addExtensions(new File("/path/to/extension.crx"));
      ChromeDriver driver = new ChromeDriver(options);
		
		options.setCapability(null, false);
		
		//downloading a File at designated
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		
		
		//popup blocking 
		 options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		driver.get("https://expired.badssl.com/");
		
	}

}
