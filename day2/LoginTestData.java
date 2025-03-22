package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Please enter username!!!");
	}

	public void enterPassword() {
		System.out.println("Please enter password!!!");
	}
	public static void main(String[] args) {
		
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterUsername();
		loginTestData.enterPassword();
		
	//*** Accessing the methods from super class TestData ***//
		
		loginTestData.enterCredentials();
		loginTestData.navigateToHomePage();
		
	}

}
