package AddressBook;

public class AddrBookStore {
	public String firstName, lastName,  state,address, city;
    public int zip, phoneNumber;

    
    public AddrBookStore(String firstName, String lastName, String address, String city, String state, int zip,
            int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

  
    public void displayContacts() {
        System.out.println("Name: " + firstName + "\t" + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zip);
        System.out.println("Phone Number: " + phoneNumber + "\n");
    }// End displayContact

    public void editContacts(int option, String value) {
        switch (option) {
            case 1:
                firstName = value;
                break;
            case 2:
                lastName = value;
                break;
            case 3:
                address = value;
                break;
            case 4:
                city = value;
                break;
            case 5:
                state = value;
                break;
            case 6:
                zip = Integer.parseInt(value);
                break;
            case 7:
                phoneNumber = Integer.parseInt(value);
                break;
            default:
                break;
        }
    }
}
