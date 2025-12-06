package day5_filehandling;

public class ConfigReaderTest {

	   public static void main(String[] args) {

	        System.out.println("URL: " + ConfigReader.getProperty("url"));
	        System.out.println("Browser: " + ConfigReader.getProperty("browser"));
	        System.out.println("Username: " + ConfigReader.getProperty("username"));
	        System.out.println("Password: " + ConfigReader.getProperty("password"));
	        System.out.println("Timeout: " + ConfigReader.getProperty("timeout"));
	    }
	}