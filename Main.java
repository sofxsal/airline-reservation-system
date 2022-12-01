import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //create first object
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        //using the get method - first object
        System.out.println("Name: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Seat Number: " + person.getSeatNumber());          

        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }

        
    }
  
  
}
