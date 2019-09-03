package pl.sda.java.basic;

public class Scope {
	
	static int x; // deklaracja zmiennej poza metod� dzi�ki czemu mo�emy jej u�y�
	              // w dowolnej metodzie, ka�da metoda ma do niej dost�p
	
	public static void main(String[] args) {
		x =5;  //przypisanie warto�ci do zmiennej x zdefiniowanej powy�ej
		System.out.println(x);
		
		doSomething();
		
	}
	
	static void doSomething() {
		x=10;
		System.out.println(x);
	}
	
	static void doSomethingLocally() {
		//poniewa� y jest zdefiniowany we wn�trz tej metody 
		//�adna inna metoda nie mo�e u�y� y
		
		
		int y = 100;
		
	}

}
