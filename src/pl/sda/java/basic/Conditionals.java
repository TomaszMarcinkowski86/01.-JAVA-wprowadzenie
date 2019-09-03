package pl.sda.java.basic;

public class Conditionals {
	public static void main(String[] args) {
		
		// Je�eli jakie� wyra�enie jest prawd� 
		//zr�b co�
		
		boolean sayHello = false;
		boolean sayHey =true;
		
		if(sayHello) {
		System.out.println("Hello");
		
		}else if(sayHey) {

		}
		System.out.println("Goodbye");
		
	// mo�emy u�y� <,>,>=,<=,!=,== lub mo�emy u�y� booleans
	
	//if (x=5) przypisanie warto�ci 5 do x
	//if (x==5) sprawdzenie czy x jest r�wny 5 
		
    // mo�emy u�ywa� operator�w AND && lub OR ||
	
	int x=1;{
    
	if(x<10 && x>=3) {
		System.out.println("x mniejszy od 10 i wi�kszy r�wny 3");
	}
	else if(x>10 || x<3 ) {
			System.out.println("x mniejszy od 3 lub wiekszy od 10");
	}
			else {
				System.out.println("x=10");
			}
		}

	}
}

