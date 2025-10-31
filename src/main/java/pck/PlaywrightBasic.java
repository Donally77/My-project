/**
 * 
 */
package pck;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * 
 */
public class PlaywrightBasic {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.amazon.com");
        
        Thread.sleep(2000);
        
        String title = page.title();
        System.out.println("page title is:"+ title);
        
        String url = page.url();
        System.out.println("Url is:"+url);
        
        browser.close();
        playwright.close();
        

	}

}
