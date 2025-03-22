package week3.day2;

public class Edge extends Browser{
	
	public void takeSnap() {
		System.out.println("Take snapshot");	
		}

	public void clearCookies() {
		
		System.out.println("Clear the cookies");	
	}
	public static void main(String[] args) {
		Edge edge = new Edge();
		edge.clearCookies();
		edge.takeSnap();
		
		//***  Inheriting the properties from the Browser which is a super class ****/
		
		edge.closeBrowser();
		edge.navigateBack();
		
		

	}

}
