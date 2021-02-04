
package Calculator2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main_Class {
    
     
   public static void main(String[] args){
       
            
    Calculator_Structure frame = new Calculator_Structure();
    
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(550,200,292,400);
    frame.setResizable(false);
    frame.setTitle("Simple calculator");
    
    
    Matrix_Multiplication frame2 = new Matrix_Multiplication ();
    
    frame2.setVisible(false);
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setBounds(550,100,307,600);
    frame2.setResizable(false);
    frame2.setTitle("Matrix_multiply");
   
    
}
   }
