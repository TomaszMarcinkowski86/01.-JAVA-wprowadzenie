package pl.sda.java.basic;

public class Constant {
	
	//final int WIDTH = 800;  // deklaracja sta�ej - sta�e oznaczamy wielkimi literami �eby by�o czytelniejsze
			// final - oznacza �e warto�� nie mo�e si� nigdy zmieni� wi�c mamy sta��
			//jednak gdyby�my tworzyli nowy constant object ka�dy m�g�by mie� inn� kopi� WIDTH wi�c 
	        // nie mia�oby to sensu, dlatego musimy doda� co� jeszcze
			// to co� to static
	//static final int HEIGHT = 600; 
	       // teraz nie wa�ne ile objekt�w constant utworzymy bedzie tylko jeden HEIGHT w pami�ci
	       // jak dodamy public b�dziemy mogli u�y� tego gdziekolwiek w programie
	      // wi�c mo�emy to zdeklarowa� tak:
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Constant.HEIGHT); //wywo�anie klasy i sta�ej
	    System.out.println(WIDTH); //wywo�anie sta�ej bo dzia�amy wewn�trz klasy
		
		
		
	}

}
