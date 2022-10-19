package kodlamaioProject.logger;

public class SmsLogger implements ILogger {

	public void log(String data) {
		
		System.out.println("Logged to SMS: " + data);
		
	}

}
