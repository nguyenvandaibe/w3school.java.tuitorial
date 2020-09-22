import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  
  	public static void main(String[] args) {
    	LocalDate date = LocalDate.now(); // Create a date object
    	System.out.println(date); // Display the current date

    	LocalTime currentTime = LocalTime.now();
    	System.out.println(currentTime);

    	LocalDateTime currentDateTime = LocalDateTime.now();
    	System.out.println(currentDateTime);

	 	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    	String formattedDate = currentDateTime.format(formater);
    	System.out.println("After formatting: " + formattedDate);
  	}
}