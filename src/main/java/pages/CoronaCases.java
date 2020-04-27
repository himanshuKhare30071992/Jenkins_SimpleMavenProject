package pages;


import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaCases 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.covid19india.org/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement confirmedCases = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1"));
		String totalCases = confirmedCases.getText();
		System.out.println("=========Confirmed Corona Positive Cases till today = "+totalCases);
		driver.close();
		
		JOptionPane.showMessageDialog(null, totalCases , "India Confirmed Cases", JOptionPane.INFORMATION_MESSAGE);
	
	}
	

}
