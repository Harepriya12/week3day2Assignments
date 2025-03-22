package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection{
	
	//In abstract class -- can have both implement the unimplemented methods in abstract class
	// - no need to implement the unimplemented methods in interface 
	//- need to add abstract keyword explicitly in unimplemented method 
	// unimplemented method -- if there is no abstract keyword, it shows error in the method declaration

	// called as partial abstraction --cannot create object for an abstract class - same as interface
	
	public abstract void executeQuery(); 
	
}
 