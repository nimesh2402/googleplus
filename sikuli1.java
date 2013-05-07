import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.SikuliRuntimeException;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.api.*;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;
import org.testng.annotations.Test;

import static org.sikuli.api.API.*;




public class sikuli {

  /**
	 * @param args
	 * @throws MalformedURLException 
	 */
	@Test
	public void sikuli1() throws MalformedURLException {
		// TODO Auto-generated method stub
		 // Open the main page of Google Code in the default web browser
		//WebDriver wd;
		String google,googleplus;
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		WebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//wd=new FirefoxDriver();
		google="https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2";
		googleplus="https://plus.google.com/u/0/?tab=mX";
		wd.navigate().to(google);
	
		wd.manage().window().maximize();
	
		//wd.findElement(By.xpath("")).sendKeys("");
		wd.findElement(By.xpath(".//*[@id='Email']")).sendKeys("terru104@gmail.com");
		wd.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("gattugattu");
		wd.findElement(By.xpath(".//*[@id='signIn']")).click();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(true)//wd.getCurrentUrl().startsWith("https://mail.google.com"))
		{
			wd.navigate().to(googleplus);
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wd.findElement(By.xpath(".//*[@id='contentPane']/div/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]")).click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wd.findElement(By.xpath(".//*[@id='contentPane']/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]")).click();
			wd.findElement(By.xpath(".//*[@id='contentPane']/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]")).sendKeys("Test");
			//wd.findElement(By.xpath(".//*[@id=':26.f']")).sendKeys("Test");
			//wd.findElement(By.xpath(".//*[@id='contentPane']/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]")).sendKeys("Test");
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//wd.findElement(By.xpath(".//*[@id='contentPane']/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[2]")).sendKeys("Test");
			 ScreenRegion s = new DesktopScreenRegion();
             
		        // Specify an image as the target to find on the screen
		        URL imageURL = new URL("http://dl.dropbox.com/u/71926343/sikuli.png");                
		        Target imageTarget = new ImageTarget(imageURL);
		                        
		        // Wait for the target to become visible on the screen for at most 5 seconds
		        // Once the target is visible, it returns a screen region object corresponding
		        // to the region occupied by this target
		        ScreenRegion r = s.wait(imageTarget,5000);
		                        
		        // Display "Hello World" next to the found target for 3 seconds
		        //Canvas canvas = new DesktopCanvas();
		        //canvas.addLabel(r, "Hello World").display(3);
		        
		        // Click the center of the found target
		        Mouse mouse = new DesktopMouse();
		        mouse.click(r.getCenter());
		        mouse.click(r.getCenter());
		        JavascriptExecutor js = null;
		        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        //WebElement element = wd.findElement(By.id(":36.f"));
		       // js.executeScript("document.getElementById(':36.f').disabled = false;");
		        
		        
		        for (int i=1;i<10;i++)
		        {
		        	try
			        {	
		        		wd.findElement(By.xpath("html/body/div[2]/div[3]/div[5]/div/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[2]/text()")).sendKeys("how");
		        		
		        		//wd.findElement(By.xpath("html/body/div[2]/div[3]/div[5]/div/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[2]")).sendKeys("test");
		        		break;
		        }
		        
		        catch (NoSuchElementException e)
		        {
		        		continue;
		        }
		        }
		}
		
        //browse(new URL("http://code.google.com"));
      
        // Create a screen region object that corresponds to the default monitor in full screen 
       

	}

}
