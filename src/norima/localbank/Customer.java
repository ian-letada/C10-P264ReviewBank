package norima.localbank;

/**
 * Customer class.
 */
public class Customer {
    private String firstName, lastName, street, city, state, zip;

    /**
     * constructor
     * pre: none
     * post: A Customer object has been created.
     * Customer data has been initialized with parameters.
     */
    public Customer(String fName, String lName, String street, String city, String state, String zip) {
        firstName = fName;
        lastName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * Returns a String that represents the Customer object.
     * pre: none
     * post: A string representing the Customer object has
     * been returned.
     */
    public String toString() {
        String custString;
        custString = firstName + " " + lastName + "\n";
        custString += street + " " + city + " " + state + " " + zip + "\n";
        return (custString);
    }

    public String changeStreet(String newStreet) {
        street = newStreet;
        return street;
    }

    public String changeCity(String newCity) {
        city = newCity;
        return city;
    }

    public String changeState(String newState) {
        state = newState;
        return state;
    }

    public String changeZip(String newZip) {
        zip = newZip;
        return zip;
    }
}