import java.util.Arrays;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    
    //creating constructor
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    //copy constructor
    public Person (Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    // get method
    public String getName() {
        return this.name;
    }
    
    // set method
    public void setName(String name) {
        this.name = name;
    }

    // get method
    public String getNationality() {
        return this.nationality;
    }
    // set method
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // get method
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    // set method
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // get method
    public int getSeatNumber() {
        return this.seatNumber;
    }

    // set method
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // get method
    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    // set method
    public void setPassport() {
        passport = new String[] {name, nationality, dateOfBirth};
    }

    

    //create function
    public boolean applyPassport() {

        // random number is between 0 - 1
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    public void chooseSeat() {
        // random number is between 1 - 11
        seatNumber = (int) (Math.random() * 11 + 1);
        
    }





}
