package pl.sda.java.basic;

public class Array {

	public static void main(String[] args) {
		
		int x; // jedno pude�ko w pami�ci z jedn� wartos�i� zmiennej typu int
		
		int[] myArray; // deklaracja szyku typu int
		
		myArray = new int[] {1,2,3,4,5}; // inny spos�b inicjalizacji szyku tu w klamerkach warto�ci
		
		// myArray. - szyk jest obiektem i jak kropk� po nazwie postawimy pojawi� si� metody opisuj�ce obiekt
		//myArray = new int[4000]; //inicjalizacja szyku zdolnego do przechowywania 4000 zmiennych int
		
		
		/* x=5;
		
		myArray[0] = x;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		//myArray[4] = 5; // jak dodamy tu 5 element to b��d bedzie bo w deklaracji new int[4]; jest 4
		//System.out.println(myArray[0]); wywo�anie konkretnej warto�ci z szyku  
		
		*/
		 
		 
		/*for (int counter=0; counter<4000; counter++) {
			myArray[counter] = counter;
		}
		
		*/
		
		/*  for (int  i= 0;  i < myArray.length; i++) {  // p�tla for i=0 to to �e od pierwszego elementu zacznie
			                                      // i<myArray.length i mniejsze od d�ugo�ci 
			                                      // i bedzie wykonywane na wsyzstkich elementach szyku
		}
			System.out.println(myArray[i]); */
			
		for (int number : myArray) { //inna p�tla for inny spos�b wywo�ania szyku
			System.out.println(number);
		}
		
		
		}
	}

