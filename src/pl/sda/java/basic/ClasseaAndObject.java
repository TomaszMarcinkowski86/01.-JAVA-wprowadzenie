package pl.sda.java.basic;
public class ClasseaAndObject {
   public static void main(String[] args) {
	   
	   

	Person Tom =new Person("Tom");

	Tom.setAge(20);
	
	Person Bob =new Person("Bob");

	Bob.setAge(30);
	
	Tom.sayHelloTo(Bob);
	Bob.sayHelloTo(Tom);
	
	System.out.println(Tom.getName() + " is " + Tom.getAge() + " years old" );
	System.out.println(Bob.getName() + " is " + Bob.getAge() + " years old" );
	
}
}
