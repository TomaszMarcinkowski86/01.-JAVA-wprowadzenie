package pl.sda.java.basic;
/// nie czaj� r�nic 
//dopyta�

public class ReferenceandValueTyp {
	
	public static void main(String[] args) {
		
		//byte, sorht, int, long,float,double,boolean
		
		int x =5;
		
		addOneTo(x); // we're passing a value type, so wy pass a copy of value of x, which is 5
		
		System.out.println(x);
		
		Person john;
		john = new Person ("John"); // we are creating a new person object, and assigning john to refer it
		john.setAge(20);
		celebrateBirthday(john); //we're passing that reference to a method, so that metod can use that reference to manipulate object
		
		
		
	}

	private static void celebrateBirthday(Person person) {
	
		person.setAge(person.getAge()+1);
	}
     // manipulate a copy of the value passed
	static void addOneTo(int number) {
		
		number = number + 1;
	}
}
