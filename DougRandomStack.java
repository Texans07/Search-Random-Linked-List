/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dougrandomstack;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Doug
 */
public class DougRandomStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Start with the empty list
        int choice;
        int ch=0;
        int number;
        RandomStackList llist = new RandomStackList();
        Random random = new Random();
        for (int i = 1; i <= 600; i++) {
            int value = 16 + random.nextInt(100);
            llist.push(value);}
        
        //this line tests to make sure correct amount of integers are generated within stack
          //System.out.println(value);}
 
   do{
       
         String message = "1.Verify Stack Size " + " 2. Check If Integer Is In Stack" ;
         choice = Integer.parseInt(JOptionPane.showInputDialog(message));
        
         switch(choice)
             
             
         {
             case 1 : JOptionPane.showMessageDialog(null, "Size: " + llist.getSize());
                break;
             case 2:
        String message2 = " Enter Integer to look for within this random stack!";
        number = Integer.parseInt(JOptionPane.showInputDialog(message2));
        if (llist.search(llist.head, number))
        {
            JOptionPane.showMessageDialog(null, "Yeah buddy "+ number +" is in this stack");
        }
        else
            JOptionPane.showMessageDialog(null, "Nope, Sorry "+ number +" is not in this stack");
        
        
        
        }ch = JOptionPane.showConfirmDialog(null, "Would you like to quit", "Quit Ramdom Stack?", JOptionPane.YES_NO_OPTION);
         
    }while(ch == JOptionPane.NO_OPTION);
   }
    }
    

