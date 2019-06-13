package adachinpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adatoolweb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk30\\eclipse-workspace\\adachin\\dri\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
	dr.get("http://adactin.com/HotelApp/");
	//WebElement newreg=dr.findElement(By.xpath("//a[contains(text(),'New User Register Here')]"));
	//newreg.click();	
	//WebElement newname=dr.findElement(By.id("username"));
	//newname.sendKeys("rajaraghu");
	//WebElement newpass=dr.findElement(By.id("password"));
	//newpass.sendKeys("123456");
	//WebElement conpass=dr.findElement(By.id("re_password"));
	//conpass.sendKeys("123456");
	//WebElement fulname=dr.findElement(By.id("full_name"));	
	//fulname.sendKeys("raj");
	//WebElement email=dr.findElement(By.id("email_add"));	
	//email.sendKeys("raghuv318@gmail.com");
	WebElement user=dr.findElement(By.id("username"));
	user.sendKeys("rajaraghu");
	WebElement pass=dr.findElement(By.id("password"));
	pass.sendKeys("DAR16L");
	WebElement clik=dr.findElement(By.id("login"));
	clik.click();
	WebElement drop=dr.findElement(By.id("location"));
	Select sec=new Select(drop);
	sec.selectByValue("Sydney");
	WebElement hotel=dr.findElement(By.id("hotels"));
	Select sec1=new Select(hotel);
	sec1.selectByValue("Hotel Sunshine");
			WebElement room=dr.findElement(By.id("room_type"));
			Select sec2=new Select(room);
			sec2.selectByValue("Standard");	
			WebElement room_no=dr.findElement(By.id("room_nos"));
			Select sec3=new Select(room_no);
			sec3.selectByValue("4");	
			WebElement checkin=dr.findElement(By.id("datepick_in"));
			checkin.sendKeys("10/05/2019");
			WebElement checkout=dr.findElement(By.id("datepick_out"));
			checkout.sendKeys("15/05/2019");
			WebElement r=dr.findElement(By.id("adult_room"));
			Select sec4=new Select(r);
			sec4.selectByValue("4");	
			WebElement type=dr.findElement(By.id("child_room"));
			Select sec5=new Select(type);
			sec5.selectByValue("2");	
			WebElement sub=dr.findElement(By.id("Submit"));
				sub.click();
				WebElement cli2=dr.findElement(By.id("radiobutton_0"));
				cli2.click();
				WebElement clik1=dr.findElement(By.id("continue"));
				clik1.click();
				WebElement name=dr.findElement(By.id("first_name"));
				name.sendKeys("raghu");
				WebElement lastname=dr.findElement(By.id("last_name"));
				lastname.sendKeys("s");
						WebElement add=dr.findElement(By.id("address"));
				add.sendKeys("122,cst street,xyz");
				WebElement cc=dr.findElement(By.id("cc_num"));
				cc.sendKeys("1234567891234567");
				WebElement ccty=dr.findElement(By.id("cc_type"));
				Select sec6=new Select(ccty);
				sec6.selectByVisibleText("American Express");	
				WebElement ex=dr.findElement(By.id("cc_exp_month"));
				Select sec7=new Select(ex);
				sec7.selectByValue("1");
				WebElement exy=dr.findElement(By.id("cc_exp_year"));
				Select sec8=new Select(exy);
				sec8.selectByValue("2022");
				WebElement cvv=dr.findElement(By.id("cc_cvv"));
				cvv.sendKeys("123");
				WebElement search=dr.findElement(By.id("book_now"));
				search.click();
			    Thread.sleep(8000);
				WebElement printno=dr.findElement(By.id("order_no"));
				String value=printno.getAttribute("value");
				System.out.println("the booking no is:" +" "+value);
	}
}
