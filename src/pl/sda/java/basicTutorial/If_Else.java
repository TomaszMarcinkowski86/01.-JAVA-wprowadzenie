
package pl.sda.java.basicTutorial;
public class If_Else {
public static void main (String[]args){

int x=5;
int y=10;

if (x>2 & y<20){
System.out.println("jest dobrze"); // jeżeli warunek spełniony - true
}
else {
System.out.println("jest źle"); // jeżeli warunek nie spełniony - false
}
////zadanie nr 2 

int time=14;


if (time<10){
System.out.println("if - warunk 1 spełniony - Rano!");
}
else if (time<19){
System.out.println("else if - warunek 2 spełniony - Popołudnie!");
}
else {
System.out.println(" esle - zaden warunek niespe�niony - Noc!");
}

// krótki zapis if else w jednej linii

int time2=15;
            //warunek     prawda            fałsz
String wynik=(time2<14)? "przedpołudnie":"popołudnie";
System.out.println(wynik);

  }
}
