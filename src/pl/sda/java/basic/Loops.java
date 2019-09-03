package pl.sda.java.basic;

public class Loops {
 public static void main(String[] args) {
	
	 
	whileLoop();
doWhileLoop();
	   forLoop();
 }
 // dop�ki nie b�dzie 10 wykonuj 0+1+1+1 itd zaczyna od 1 
 static void whileLoop() {
	 System.out.println("P�tla While");
	 int counter =0;
	 while(counter<10) {
		 counter = counter +1;
		 System.out.println(counter);
		 
		 
	 }
	 System.out.println("");
}
 // r�b ... dop�ki 
 // ta p�tla b�dzie wykona si� raz bo counter=10 czyli warunek while<10 osi�gni�ty
 // poniewa� jest do i couter +1 przed while to to ssi� wykona ale warunek while<10 spe�niony to ju� wi�cej razy si� nie wykona
 static void doWhileLoop() {
	 System.out.println("P�tla Do While");
	 int counter =10;
	 do {
	 
		 counter = counter +1;
		 System.out.println(counter);
		
	 }while(counter<10);
	 System.out.println(""); 
	 }
 //ta p�tla wykona si� od 0 do 9
 static void forLoop() {
	 System.out.println("P�tla For");
	 //pocz�tkowa warto�� zmiennej; warunek czy powinnismy dalej p�tle wykonywa�; zwi�kszanie zmiennej o 1
	 for (int counter=0; counter < 10; counter = counter +1) {
		 System.out.println(counter);
	 }
 }
}

