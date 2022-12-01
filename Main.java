import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //create first object
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        
        //create a copy of the first object
        Person twin = new Person(person);

        //updating the values using set method - first object
        person.setSeatNumber(10);

        //updating the values using set method - a copy of first object
        twin.setName("Jad Slim");
        twin.setSeatNumber(3);

        //using the get method - first object
        System.out.println("Name: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Seat Number: " + person.getSeatNumber());     
        
        //using the get method - copy of first object
        System.out.println("\n" + "Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat Number: " + twin.getSeatNumber() + "\n");
    }
  
  
}
