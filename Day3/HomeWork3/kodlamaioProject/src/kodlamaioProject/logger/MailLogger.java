package kodlamaioProject.logger;

public class MailLogger implements ILogger {

	public void log(String data) {
		
		System.out.println("Logged to mail: " + data);
		
	}

}
