package pl.sda.java.basic;

public class Methods {

	public static void main(String[] args) {
		sayHelloWorld(); // wywo�uje metod� poni�ej, potem po jej wykonaniu
		                 //wraca do metody main i przechodzi do nast�pniej linii
		                 // jak nic nie ma program si� ko�czy
		
		sayHelloWorld(); // jak wkleimy wywo�anie kilka razy to kilka razy wykona
		sayHelloWorld();
		
		sayHelloTo("Charlie"); //wywo�anie metody z dodatkowym stringiem w �odku
		sayHelloTo("John");
		
		int x = returnFive();
		System.out.println(x);
		
		int result= square(5); // deklaracja zmiennej int o nazwie resutl
		                       // r�wej metodzie square dla zmiennej typu int x=5
		System.out.println(result);
		
		
	}
	//ta metoda zwraca 5*5 bo powy�ej 
	static int square (int x) {
		return x*x;
	}
	
	//ta metoda zwraca int = 5
	static int returnFive () {
		return 6;
	}
	
	//ta metoda wyrzuca Hell z dowolnym imieniem podczas wywo�ania 
    static void sayHelloTo (String name) {
    	System.out.println("Hello " + name);
    }
    //Ta metoda jest najprostrzym wywo�aniem
	static void sayHelloWorld() {
		System.out.println("Hello world !");
	}
}
