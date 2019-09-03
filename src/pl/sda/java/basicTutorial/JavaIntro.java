package pl.sda.java.basicTutorial;

public class JavaIntro  {
  public static void main(String[] args) {
    System.out.println("Hello World"); //Wyrzuca na ekran
	/*komentarz
	wieloliniowy*/
	
	/*definicja zmiennej typu String 
	(jako jedyna zmienna String piszemy wielką literą - jak napiszemy małą wyrzuca błąd)
	hehe okazało się że są typy prymitywne i Obiektowe
	*/
	
	String Name = "Tomek";
	//wyrzucenie zmiennej na ekran
	System.out.println(Name);
	System.out.println(" ");
	System.out.println("ZMIENNE");
	System.out.println(" ");
	//definicja zmiennej typu int - numer bez przypisania wartości
	int MyNumber;
	//przypiasanie wartości po definicji
	MyNumber = 1000;
	//wyrzucenie zmiennej na ekran
	System.out.println(MyNumber);
	
	//Definicja różnego typu zmiennych
	
	int MyNum=10;
	float MyFloatNum =5.99f; // zauważyłem że musi być koniecznie literka f - nie wiem po co
	System.out.println(MyFloatNum); // wyrzuci liczbę rzeczywistą bez f
	double MyDouble = 2.99; //liczba rzeczywista
	char MyLetterOrSign='r'; //Zwróć uwagę na apostrof nie cudzysłów
	boolean MyBool = true; // tak nie
	String MyString = "Cześć "; //string dowolny znak
	
	//zmienne powinny być małą literą - dowiedziałem się później zostawiłem bo duż działa więc czemu ma być mała??
	
	//Kombinacja do wyrzucenia na ekran 
	// Na razie bez spacji - tylko w Stringu bo ją wrzuciłem w cudzysłów
	System.out.println(MyNum + MyFloatNum + MyString + MyLetterOrSign + MyBool + MyDouble);
	
	//Inna Kombinacja do wyrzucenia na ekran 
	System.out.println(MyString + "Tomek");
	
	// Dla cyfr "+ - / * " to operacje matematyczne
	int a=3;
	int b=2;
	double c=12.2;
	float d=12.2f;
	System.out.println(a+b + " wynik dodawania");
	System.out.println(a-b + " wynik odejmowania");
	System.out.println(c*b + " wynik mnożenia przez liczbę rzeczywistą");
	System.out.println(c-d + " wynik odejmowania (zmienna rzeczywista - zmienna float");
	// po wyniku ostatniego widać że to float to jakieś przybliżenie 
	
	//Dlekalaracja wielu zmiennych tego samego typu
	
	int w=1, r=2, t=3; //deklaracja z przecinkiem nie średnikiem. średnik tylko na końcu.
	System.out.println(w + r+t);
	
	/*Każda zmienna musi mieć unikatową nazwę - tzw identyfikator (litera cyfra podkreślnik dolar)
	Może zaczynać się literą, podkreślnikiem i dolarem,
	Jest czyły na wielkość liter (y i Y to nie to samo)
	!!!!!!piszą że musi być mała litera a u mnie z dużą działa !!!!!!!!!!!*/
	
	
	//Sprawdzenie czy jak zmienną nazwę zacznę cyfrą będzie bład 
	
	/* int 2a=1;
	System.out.println(_a); 
	jest błąd !!!*/
	
	
	//Sprawdzenie czy jak zmienną nazwę zacznę dolarem i podkreślnikiem będzie bład 
	
	String _a="podkreslnik ";
	String $b=" dolar";
	System.out.println(_a + $b); 
	
	//!!!!!!!!!!!!! wszystkie typy !!!!!!!!!!!!!!!
	//!!!!!!!!!!!PRYMITYWNE!!!!!!!!!
	/* byte 
	   short
	   int
	   long
	   float
	   double
	   boolean
	   char
	!!!!!!!!!!!!!!!!!!!!!!! Nie Prymitywne - duża litera
	   String 
	   Array
	   Classes */ 
	   System.out.println(" ");
	   System.out.println("TYPY");
	   System.out.println(" ");
	byte byteNum=100; // może zawierać od -128 do 127  - bu zaoszczędzić miejsce
	short shortNum = -32000; //  może zawierać od -32768 do 32764 
	int intNum=-100000; // może zawierać od -21474483648 do 2147483647 - najczęściej używany
	long longNum = 15000000000000L; // -9223372036854775808 to 9223372036854775808 kończy się literą L
	float floNum=5.54f;	/*fractional numbers from 1.7 e minus308(znak munusa powodował błąd czemu ??)
                     	 to 1.7 e + 038 .
						6 lub 7 miejsc po przecinku
	                    */ 
	double dubNum=19.99d; /*fractional numbers from 3.4e minus308 (znak munusa powodował błąd czemu??)
	                     to 3.4e+038.
						 kończy się literą d u mnie wyżej bez d i działa
						 15 miejsc po przecinku
						 */

	
	//różnica między long , float i double ??? liczba miejsc po przecinku czy co bo oba są rzeczywiste chyba.??
	
	
	// możemy wrzócić e pomnożyć razy 10 do potęgi
	float f1=35e3f; 
	System.out.println(f1 +" - 35*10^3");
	double d1=123e-4d;
	System.out.println(d1 + " - 123*10^(-4)");
	
// !!!!!!!!!!!!!!Operacje!!!!!!!!!!!!!!
   System.out.println(" ");
   System.out.println("OPERACJE");
   System.out.println(" ");
	int ww=7;
	int yy=6;
	System.out.println( "x= " + ww);
	System.out.println( "y= " + yy);
	System.out.println(ww+yy+" x+y");
	System.out.println(ww-yy+" x-y");
	System.out.println(ww*yy+" x*y");
	System.out.println(ww/yy+" x/y reszta zostaje ale pokazuje to co całkowite  ");
	System.out.println(ww%yy+" reszta z dzielenia");
	ww++;
	System.out.println(ww + " ww++ wzrost o 1");
	--ww;
	System.out.println(ww + " --ww mniej o 1 od tego co wyzej");
//////////////////////////////////////
   System.out.println(" ");
   System.out.println("OPERACJE INNY ZAPIS");
   System.out.println(" ");
	int x = 5;
	int y = 10;
	int z = 2;
	System.out.println("x="+ x +" y="+y + " z=" + z +", 3" );
    x+= 3;
    System.out.println(x +" x+= 3");
    x-= 3;
    System.out.println(x +" x-= 3");
	 x*= 3;
    System.out.println(x +" x*= 3");
	 x/= 3;
    System.out.println(x +" x/= 3"); 
	x%= 3;
    System.out.println(x +" x%= 3 reszta z 5/3");
	z&= 3;
    System.out.println(z +" z&= 3 nie wiem na razie");
	x|= 3;
    System.out.println(x +" x|= 3 nie wiem na razie");
	y^= 3;
    System.out.println(y +" y^= 3 potegownie");
	
	// !!!!!!!!!!!!!!OperaTORY logiczne!!!!!!!!!!!!!!
   System.out.println(" ");
   System.out.println("OPERATORY LOGICZNE");
   System.out.println(" ");
   
   int logic = 5;
    System.out.println(logic > 3 && logic < 10);
	System.out.println(" bo 5 wieksze od 3 i 3 mniejsze od 10 AND");
	   System.out.println(" ");
	System.out.println(logic > 3 || logic < 4);
	System.out.println(" bo 5 wieksze od 3 wystarczy jeden warunek spelnic przy OR");
	   System.out.println(" ");
	System.out.println(!(logic > 3 && logic < 10));
	System.out.println(" falsz bo ! (NOT) zaprzeczenie jest użyte przed wynikiem");
	
	// !!!!!!!!!!!!!!STRINGI!!!!!!!!!!!!!!
   System.out.println(" ");
   System.out.println("STRINGI");
   System.out.println(" ");
   
   String txt = "AbcDEFGHIJKLmnoPQRSTuvwXYZ";
int len = txt.length();
System.out.println( "txt = "+txt );
System.out.println("The length of the txt string is: " + len);
System.out.println(txt.toUpperCase());   // duże litery
System.out.println(txt.toLowerCase());   // małe litery
System.out.println( "txt = "+txt );
System.out.println( "ktora w kolejnosci jest litera 'n'?" );
System.out.println(txt.indexOf("n")); //liczymy od 0 nie od 1

//laczenie stringów w ciągi
String name="Tomek ";
String surname="Marcinkowski";
System.out.println( name + surname ); // 1-sza metoda
System.out.println( name.concat(surname) ); // 2-ga metoda

String aa="10";
int bb=10;
String cc=aa+bb;
System.out.println( cc + " zmienna cc = int + string, zmienna typu String");

  }
}