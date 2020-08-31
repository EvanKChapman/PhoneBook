package phonebook;

public class EntryBook {
	// First - let's create an array of people - this will store our entries 
	Person[] people = new Person[0];

	// method to add person
	public void addPerson(Person person) {
		Person[] tempArr = new Person[people.length + 1];
		
		for (int i = 0; i < people.length; i++) {
			tempArr[i] = people[i];
		}
		
		tempArr[tempArr.length - 1] = person;
		people = tempArr;
	}
	

	// method to search by first name 
	public Person[] searchByFirstName(String name) {
		
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getFirstName().toLowerCase().equals(name.toLowerCase())) {
				count++;
			}
		}
		Person[] tempArr = new Person[count];
		
		int j = 0;
		for (int i = 0; i < people.length; i++) {
				if(people[i].getFirstName().toLowerCase().equals(name.toLowerCase())) {
					tempArr[j] = people[i];
					j++;
				}
		}
		return tempArr;
	}
	
	public void printAll() {
		for(Person person : people) {
			System.out.println(person.toString());
		}
	}
	
	
	
	// method to search by last name 
	public Person[] searchByLastName(String lastName) {
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				count++;
			}
		}
		Person [] temp = new Person[count];
		int x = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				temp[x] = people[i];
				x++;
			}
		}
		return temp;	
	}
	
	
	
	// method to search by full name 
	public Person[] searchByFullName(String name) {
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getFullName().toLowerCase().equals(name.toLowerCase())) {
				count++;
			}
		}
		Person[] temp = new Person[count];
		int x = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getFullName().toLowerCase().equals(name.toLowerCase())) {
				temp[x] = people[i];
				x++;
			}
		}
		return temp;
	}
	
	// method to search by city 
	public Person[] searchByCity(String city) {
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
				count++;
			}
		}
		Person[] temp = new Person[count];
		int x = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
				temp[x] = people[i];
				x++;
			}
		}
		return temp;
	}
	
	
	// method to search by state 
	public Person[] searchByState(String state) {
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
				count++;
			}
		}
		Person[] temp = new Person[count];
		int x = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
				temp[x] = people[i];
				x++;
			}
		}
		return temp;
	}
	

	// method to search by Phone Number
	
	public Person searchByPhoneNumber(String number) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].getPhoneNumber().equals(number)) {
				people[i].toString();
				return people[i];
			}
		}
		return null;
	}
	
	
	// delete a record for a given phone number 
	
	public void deletePhoneBySearch (Person phoneNumber) {
		Person[] tempArr = new Person[people.length - 1];
		int x = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (phoneNumber != people[i]) {
				tempArr[x] = people[i];
				x++;
			}
		}
		
		people = tempArr;
	}
	
	
	// after we get and set the specific person's number - this must be ran
	// most of our methods will start with creating a temp array and either adding 1 or subtracting one
	// we create a counter and then loop through the people array 
	// if phone number (that we got and set for that specific person) doesn't equal anything in our array
	// our temp array equals people[i] for that specific index 
	// then we add one with our x++
	public void searchByRecordUpdate(Person phoneNumber) {
		Person[] temp = new Person[people.length + 1];
		int x = 0;
		for (int i = 0; i < people.length; i++) {
			if (phoneNumber != people[i]) {
				temp[x] = people[i];
				x++;
			}
		} 
	}
	
	public void sortAlpha()	{
		for (int i = 0; i < people.length; i++) {
			for (int j = i + 1; j < people.length; j++) {
				// swap if method returns positive integer
				if (people[i].getLastName().compareToIgnoreCase(people[j].getLastName()) > 0) {
					Person temp = people[i];
					people[i] = people[j];
					people[j] = temp;
				}
		}
		}
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
	
	// getter/setter methods for our Person array 
	
	
	public Person[] getPeople() {
		return people;
	}
	
	public void setPeople(Person[] people) {
		this.people = people;
	}

}
