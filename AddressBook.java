package AddressBook;
import java.util.Scanner;
public class AddressBook {
	public static final int MAX__LIMIT = 10;
    public static Scanner scanner = new Scanner(System.in);
    AddrBookStore addrBookStore[] = new AddrBookStore[MAX__LIMIT];

    public static void main(String[] args) throws Exception {
       
        int i = 0,ch;
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome All\n");
        while (i < MAX__LIMIT) {
            System.out.println(
                    "Choice: \n1. Add Contact \n2. Display Contacts \n3. Edit Conact \n4. Delete Contact \n5. Exit");
            ch = scanner.nextInt();
            System.out.println("");
            switch (ch) {
                case 1:
                    addressBook.addContacts(i);
                    System.out.println("New one is added.");
                    i++;
                    break;
                case 2:
                    addressBook.displayContacts(i);
                    System.out.println("");
                    break;
                case 3:
                    addressBook.editContacts(i);
                    System.out.println("Contact is edited\n");
                    break;
                case 4:
                    addressBook.deleteContacts(i);
                    System.out.println("Contact is deleted.\n");
                    i--;
                    break;
                default:
                    System.out.println("Exiting outof page");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        } 
    } 

    public void addContacts(int i) {
        System.out.println("FirstName \nLastName \nAdderss \nCity \nState \nZip \nPhoneNumber");
        addrBookStore[i] = new AddrBookStore(scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                scanner.next(), scanner.nextInt(), scanner.nextInt());
    } 

    public void displayContacts(int i) {
        for (int j = 0; j < i; j++) {
            try {
                addrBookStore[j].displayContacts();
            } catch (Exception e) {
                System.out.println("Deleted Contact.");
            } 
        } 
    }

    public void editContacts(int i) {
        String fname, lname, value;
        int option;
        System.out.println("Enter First and last name: \n");
        fname = scanner.next();
        lname = scanner.next();
        System.out.println("Enter between1 to 7 and a new Value: \n");
        option = scanner.nextInt();
        value = scanner.next();
        for (int k = 0; k <= i; k++) {
            try {
                if (addrBookStore[k].firstName.equals(fname) && addrBookStore[k].lastName.equals(lname)) {
                    addrBookStore[k].editContacts(option, value);
                    break;
                } // end if
            } catch (Exception e) {
                continue;
            } // End catch
        } // End for
    }// End editContact

    public void deleteContacts(int i) {
        String fname, lname, value;
        int option;
        System.out.println("Enter First and last name: \n");
        fname = scanner.next();
        lname = scanner.next();
        for (int k = 0; k <= i; k++) {
            try {
                if (addrBookStore[k].firstName.equals(fname) && addrBookStore[k].lastName.equals(lname)) {
                    for (int j = k; j < addrBookStore.length - 1; j++) {
                        addrBookStore[j] = addrBookStore[j + 1];
                    } 
                    break;
                }
            } catch (Exception e) {
                continue;
            }
        } 
    }
}
