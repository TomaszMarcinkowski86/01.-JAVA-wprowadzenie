package pl.sda.java.basicTutorial;

public class JavaBooleans {
public static void main(String[] args){

boolean p=true;
boolean f=false;

System.out.println(p); // wyrzuci true
System.out.println(f); // wyrzuci false

// inne sposoby 
System.out.println("inne sposoby >,<,>=,=<");
int a=9;
int b=2;
System.out.println("x="+a+", "+"y="+b);
System.out.println("Czy " + a +" jest wieksze od "+ b +"??");
System.out.println(a>b);
System.out.println("Czy " + a +" jest mniejsze od "+ b +"??");
System.out.println(a<b);
System.out.println("Czy " + a +" jest rowne "+ b +"??");
System.out.println(a==b);
System.out.println(a=b); //wyrzuci 2 bo a=b czyli a =2
  }
}