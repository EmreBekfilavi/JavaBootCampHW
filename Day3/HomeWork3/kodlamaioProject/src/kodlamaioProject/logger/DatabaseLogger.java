package kodlamaioProject.logger;

public class DatabaseLogger implements ILogger {

	public void log(String data) {
		
		System.out.println("Logged to Database: " + data);
		
	}
	

}
