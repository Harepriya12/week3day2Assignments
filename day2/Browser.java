package week3.day2;

public class Browser {
	
	public void openURL() {
		System.out.println("Open the URL");
		
	}

	public void closeBrowser() {
		System.out.println("Close the browser");
		
	}
	
	public void navigateBack() {
		System.out.println("navigate back");
	}
	
	public static void main(String[] args) {
		
		/*Edge edge = new Edge();
		edge.clearCookies();
		edge.takeSnap();
		
		Chrome chrome = new Chrome();
		
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.openIncognito();
		chrome.clearCache();
		*/
		
		String browserName = "Chrome";
		int browserVersion = 134;
		
		System.out.println(browserName);
		System.out.println(browserVersion);
		
	}

}
