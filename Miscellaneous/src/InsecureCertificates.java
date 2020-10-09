import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InsecureCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//general chrome profile
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//blelongs to local browser
		// we are giving knowledge to our local browser what to accept which we have accepted using DesiredCapabilities class
		
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		
		//you can start your normal test scripts code from here
		//if we provide any url which is having https or ssl certificate browser will now automatically accept it
		
	}

}
