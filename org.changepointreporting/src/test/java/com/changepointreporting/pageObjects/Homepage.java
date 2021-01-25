//package com.changepointreporting.pageObjects;
//
//import org.changepointreporting.framework.BaseClass;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Homepage extends BaseClass {
//	public class HomePage {
//		
////		private static final String URL = "https://changepointreportinguiint.azurewebsites.net/home";
////		
////		protected final WebDriver driver;
////	    protected final WebDriverWait wait;
//
////	    public HomePage(WebDriver driver) {
////	        super.driver = driver;
////	        PageFactory.initElements(driver, this);
////	        this.wait = new WebDriverWait(driver, 5);
////	    }
//	    
//	    @FindBy(className = "MuiTabs-root")
//	    private WebElement tabBar;	    
//	    public void goTo(String url) {
//	        //super.driver.get(url);
//	    }
//	    
//	    public void verifyHomePageTitle() {
//	       // wait.until(ExpectedConditions.titleContains("Changepoint Reporting"));
//	        tabBar.isDisplayed();
//	        //WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("MuiTabs-root")));
//	    }
//
//	    public void quit() {
//	       // this.driver.quit();
//	    }
//	}
//}
