package pl.sda.java.basic;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
public static void main(String[] args) {

  int number = 5;
  
  // create all window
    JFrame window = new JFrame();  // create window variable that holds JFrame objects and we're creating a new JFrame to assign to our variable
    window.setTitle("My window"); // we'ra calling methods on uor JFrae objects to configure it
    window.setSize(800, 600);
    window.setVisible(true);
    
    JLabel label = new JLabel();// label variable holds JLabel objects and we're creating a new JLabel to assign to our variable
    label.setText("My Label"); // we're calling the setText method on our JLabel object to set its text property
    
    window.add(label); // we're calling the add method of our JFreme object to add our label to the window
    
    String s= "hi";
    
}
}
