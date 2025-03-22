package week3.day2;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Open in cognito window");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache");
	}
	
	
	public static void main(String[] args) {
		Chrome chrome = new Chrome();
		chrome.openIncognito();
		chrome.clearCache();
		
	//***  Inheriting the properties from the Browser which is a super class ****/
		
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		
		
		

	}

}
