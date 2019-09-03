package pl.sda.java.basicTutorial;
public class switch1 {
public static void main(String[] args){

// wykonywane raz
//porownuje wartosc z ka�dym casem
//jak kt�ry� pasuje wykonuje block pod nim
//dwie dodatkowe komendy break i default

int day=3;
switch(day){
case 1:
 System.out.println("Poniedzia�ek");
 break;
case 2:
 System.out.println("Wtorek");
 break;
case 3:
 System.out.println("�roda");
 break;
   }
   
// default bedzie wykonywany jak �aden case nie spe�ni warunku

int predkosc=100;

switch(predkosc)  {
case 30:
System.out.println("jed� �esz kurwa szybciej");
break;

 case 90:  /// nie mog� tu zapisa� > < >= itd. ??????? czy musi by� konkretna warto�� ??
  System.out.println ("dobij do st�wki!!");
  break;
 case 120:
  System.out.println ("zwolnij Kurwa!!");
  break;
 default:
  System.out.println ("jedziesz zajebi�cie");
  }

 }
 
}
