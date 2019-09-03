package pl.sda.java.basicTutorial;

public class JavaMath{
public static void main(String[]args){


//cosinus
System.out.println("cos(1) to "+Math.cos(1));
//Arccosinus
System.out.println("Acos(1) to "+Math.acos(1));
//cosinus hiperboliczny
System.out.println("cosh(1) to "+Math.cosh(1));

//sinus
System.out.println("sin(1) to "+Math.sin(1));
//Arcsinus
System.out.println("Asin(1) to "+Math.asin(1));
//sinus hiperboliczny
System.out.println("sinh(1) to "+Math.sinh(1));

//tangens
System.out.println("tan(1) to "+Math.tan(1));
//arctangens
System.out.println("Atan(1) to "+Math.atan(1));
//tangens hipeboliczny
System.out.println("tanh(1) to "+Math.tanh(1));

//Metoda do znajdywania najwiekszej wrato�ci x,y
String txt1= "Math.max(x,y) - Najwi�ksza warto�� z (5,20) to: ";
System.out.println(txt1+Math.max(5,20));
//Metoda do znajdywania najmniejszej warto�ci x,y
String txt2= "Math.min(x,y) - Najmniejsza warto�� z (5,20) to: ";
System.out.println(txt2+Math.min(5,20)  );

//Pierwiastek kwadratowy
int a=9;
System.out.println("Math.sqrt(x) - Pierwiastek kwadratowy z (9) = "+Math.sqrt(a));
//Pierwiastek trzeciego stopnia
int b=27;
String txt3="Math.cbrt(x) - Pierwiastek trzeciego stopnia z (" + b+ ") to: ";
System.out.println(txt3+Math.cbrt(b));

//Warto�� bezwzgledna
int wb=-123;
String txt4="Math.abs(x) - Warto�� bezwzgl�dna z: ";
System.out.println(txt4+wb+" to "+Math.abs(wb));
//zwaraca znak 1 lub -1 w zale�no�ci od tego czy x dodatni czy ujemny
int ls=-12;
String stxt4="Math.signum(x) - zwraca 1 lub -1 w zale�no�ci czy ujemny czy dodatni x: ";
System.out.println(stxt4+ls+" to "+Math.signum(ls));
//Copysign
String txt5="Math.copySign(x,y) - zwraca x ze znakiem y ";
int x1=2;
int y1=-5;
System.out.println("x = " +x1);
System.out.println("y = " +y1);
System.out.println(txt5+Math.copySign(x1,y1));


// liczba losowa od 0(w�acznie) do 1(wy��cznie)
System.out.println("Math.random() - losowa liczba od 0 do 1 to " +Math.random());

//Zaokraglenie w gore (Math.ceil)
String ceil="Math.ceil(x) - Zaokraglenie w gore ";
double lc=4.6;
System.out.println(ceil +lc+ " to "+ Math.ceil(lc));
//Zaokraglenie w dol (Math.floor)
String floor="Math.floor(x) - Zaokraglenie w dol ";
System.out.println(floor +lc+ " to "+ Math.floor(lc));
//Zaokraglenie do najblizszej calkowitej (w dol lub gore)
String round="Math.round(x) - Zaokraglenie do najblizszej calkowitej ";
System.out.println(round +lc+ " to "+ Math.round(lc));
//Zaokraglenie liczby rzeczywistej 'x' przedstawiona jako l. rzeczywista
double rint=43.88;
System.out.println("Math.rint(x) - najblizsza calkowita liczba, liczby: "+rint+" to " +Math.rint(rint));

//exp(x) liczba Eulera Nepera - podstawa logarytmu naturalnego
int x2=10;
String expTxt="Math.exp(x) - liczba Eulera, e^x gdzie x to: ";
System.out.println("x= " +x2);
System.out.println(expTxt+ x2+ " jest rowne "+Math.exp(x2));
//exp(x) liczba Eulera Nepera - podstawa logarytmu naturalnego e^x-1
String expm1Txt="Math.expm1(x) - liczba Eulera, (e^x)-1 gdzie x to: ";
System.out.println(expm1Txt+ x2+ " jest rowne "+Math.expm1(x2));

//getExponent(x) zwraca niepodzielny wyk�adnik z "x"
int x3=15;
String getExp="Math.getExponent(x) zwraca niepodzielny wyk�adnik z 'x'= ";
System.out.println("x= " +x3);
System.out.println(getExp+ x3+ " jest rowne "+Math.getExponent(x3));

//sqrt(x^2+y^2)
String txt6="Math.hypot(x,y) zwraca sqrt(x^2+y^2)= ";
int h1=2;
int h2=5;
System.out.println("x = " +h1);
System.out.println("y = " +h2);
System.out.println(txt6+Math.hypot(h1,h2));

//Logarytmy
int lg=10;
System.out.println("x = " +lg);
System.out.println("Math.log(x) - logarytm naturalny: "+Math.log(lg));
System.out.println("Math.log10(x) - logarytm o podstawie 10: "+Math.log10(lg));
//System.out.println("logarytm naturalny sumy 'x' i 1: "+Math.log1(lg));

//Konwersja katow 
double kat=90;
String deg=" stopni ";
String rad=" radiany ";
double kat2=Math.toRadians(kat);
System.out.println(kat+deg+" to "+Math.toRadians(kat)+rad);
System.out.println(kat2+rad+" to "+Math.toDegrees(kat2)+deg);

/////nie wiem co to zwraca////
System.out.println(Math.ulp(kat));

  }
}