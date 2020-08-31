package phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static void startMenu() {
		// create our entryBook object 
		// this will be used to call the methods we have in our EntryBook class
		EntryBook entryBook = new EntryBook();
		
		int selection;
		// do all of this, while the selection does not equal 11 (that is our exit from program number)
		do {
			
			Scanner in = new Scanner(System.in);
			Scanner input = new Scanner(System.in);

			System.out.println("Please Make A Selection Below");
			System.out.println("1 - Add New Record");
			System.out.println("2 - Delete Record");
			System.out.println("3 - Find Record By Telephone Number");
			System.out.println("4 - Find Record By First Name");
			System.out.println("5 - Find Record By Last Name");
			System.out.println("6 - Find Record By Full Name");
			System.out.println("7 - Find Record By City");
			System.out.println("8 - Find Record By State");
			System.out.println("9 - Update A Record");
			System.out.println("10 - Show All Records in Ascending Order");
			System.out.println("11 - Exit program");

			// John Doe, 114 Market St, Saint Louis, MO, 63123, 5554449898
			// John Michael West Doe, 568 Pole Ave, Saint Charles, MO, 63133, 3142752000
			selection = in.nextInt();


			switch(selection) {
			case 1:

				// add new entry 
				System.out.println("Add new entries");
				String userInput = input.nextLine();

				String[] split = userInput.split(",");
				String name = split[0].trim();
				String street = split[1].trim();
				String city = split[2].trim();
				String state = split[3].trim();
				String zipCode = split[4].trim();
				String phoneNumber = split[5].trim();

				// split name
				String[] splits = name.split(" ");
				String fName = splits[0].trim();
				String lName = splits[splits.length - 1].trim();
				String mName = "";

				for (int i = 1; i < splits.length-1; i++) {
					mName = mName + splits[i] + " ";
				}
				
				mName = mName.trim();
				Address address = new Address(street, city, state, zipCode);
				// Split up phone number

				String area, prefix, line;

				area = phoneNumber.substring(0, 3);
				prefix = phoneNumber.substring(3, 6);
				line = phoneNumber.substring(6);

				// substring phone number - store in phone1 variable 
				String phone1 = "("+ area +")" + " " + prefix + "-" + line;

				// person
				Person person = new Person(fName, mName, lName, address, phone1);
			
				entryBook.addPerson(person);
				System.out.println(person.toString());	
				
				break;

				// delete a record by phone number
			case 2:
				System.out.println("Want to delete a record? Enter the phone number.");
				String record = input.nextLine();
				Person p1 = entryBook.searchByPhoneNumber(record);
				entryBook.deletePhoneBySearch(p1);

				break;



			case 3:
				// find a record by phone number
				System.out.println("Please enter the number "
						+ "of the person you want to search for in this format: (573) 703-2871.");
				String record2 = input.nextLine();
				Person p2 = entryBook.searchByPhoneNumber(record2);
				System.out.println(p2.toString());

				break;


			case 4:
				// find record by first name
				System.out.println("What is the first name of the record you need to find?");
				String record3 = input.nextLine();
				Person[] p3 = entryBook.searchByFirstName(record3);
				
				for (Person p4 : p3) {
					System.out.println(p4.toString());
				}


				break;



			case 5:
				// find record by last name
				System.out.println("What is the last name of the record you need to find?");
				String record4 = input.nextLine();
				Person[] p4 = entryBook.searchByLastName(record4);
				
				for (Person p5 : p4) {
					System.out.println(p5.toString());
				}


				break;


			case 6: 
				// find record by full name
				System.out.println("What is the full name of the record you need to find?");
				String record5 = input.nextLine();
				Person[] p5 = entryBook.searchByFullName(record5);
				
				for (Person p6 : p5) {
					System.out.println(p6.toString());
				}
				

				break;
				
			case 7:
				// find record by city 
				System.out.println("Searching a record by city? Please enter the city name.");
				String record6 = input.nextLine();
				Person[] p6 = entryBook.searchByCity(record6);
				
				for (Person p7 : p6) {
					System.out.println(p7);
				}
				
				break;
				
			case 8:
				// find record by state 
				System.out.println("Searching a record by state? Please enter the state.");
				String record7 = input.nextLine();
				Person[] p7 = entryBook.searchByState(record7);
				
				for (Person p8 : p7) {
					System.out.println(p8);
				}
				

			case 9: 
				// update a record by number
				System.out.println("What record do you want to update? Enter the number in this format (573) 703-2873.");
				String record8 = input.nextLine();
				Person p8 = entryBook.searchByPhoneNumber(record8);
				// set new phone number 
				System.out.println("What number do you want to change it to? Enter the number in this format (574) 444-4434");
				String record9 = input.nextLine();
				p8.setPhoneNumber(record9);
				entryBook.searchByRecordUpdate(p8);
				
				
				System.out.println("Want to change the street? Please enter it.");
				String record9a = input.nextLine();
				p8.getAddress().setStreet(record9a);
				entryBook.searchByRecordUpdate(p8);
				
				
				System.out.println("Want to change the city as well? Please enter it.");
				String record9b = input.nextLine();
				p8.getAddress().setCity(record9b);
				entryBook.searchByRecordUpdate(p8);
				
				
				System.out.println("Want to change the state as well? Please enter it.");
				String record9c = input.nextLine();
				p8.getAddress().setState(record9c);
				entryBook.searchByRecordUpdate(p8);
				
				System.out.println("Want to change the zipCode as well? Please enter it.");
				String record9d = input.nextLine();
				p8.getAddress().setZipCode(record9d);
				entryBook.searchByRecordUpdate(p8);
				
				System.out.println("Want to change the last name as well? Please enter it.");
				String record9e = input.nextLine();
				p8.setLastName(record9e);
				entryBook.searchByRecordUpdate(p8);
				
				break;

			case 10: 
				// display records alphabetically 
				System.out.println("How many people do we have in our PhoneBook?");
				System.out.println("BOOK SIZE=" +entryBook.getPeople().length);
			
				//entryBook.printAll();
				System.out.println("Sort Alphabetically");
				System.out.println();
				entryBook.sortAlpha();
				
				break;

			default: 
				
				break;	
			}
		} while (selection != 11);

	}
	
	public static void main(String[] args) {
		// call our start menu method
		
		startMenu();
	}
}








