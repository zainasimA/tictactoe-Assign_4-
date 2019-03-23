/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_assign;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Controller {
    private one a;
    
    Controller()
    {
        
    }
    public void getwinner(String one, String two, String three, String four, String five, String six, String seven, String eight,String nine)
    {
       if((one != "") && (one == two) && (one == three))
       {
           JOptionPane.showMessageDialog(null, "winner is " + one);
           
       }
       
       if((four != "") && (four == five) && (four == six))
       {
           JOptionPane.showMessageDialog(null, "winner is " + four);
           
       }
       
       if((seven != "") && (seven == eight) && (seven == nine))
       {
           JOptionPane.showMessageDialog(null, "winner is " + seven);
       }
       if((one != "") && (one == four) && (one == seven))
       {
           JOptionPane.showMessageDialog(null, "winner is " + one);
       }
       if((two != "") && (two == five) && (two == eight))
       {
           JOptionPane.showMessageDialog(null, "winner is " + two);
           
       }
       if((three != "") && (three == six) && (three == nine))
       {
           JOptionPane.showMessageDialog(null, "winner is " + three);
       }
       if((one != "") && (one == five) && (one == nine))
       {
           JOptionPane.showMessageDialog(null, "winner is " + one);
       }   
       if((three != "") && (three == five) && (three == seven))
       {
           JOptionPane.showMessageDialog(null, "winner is " + three);
           
       }
       else if((one != "") && (two != "") && (three != "") && (four != "") && (five != "") && (six != "") && (seven != "") &&(eight != "") && (nine != ""))
       {
           JOptionPane.showMessageDialog(null, "DRAW");
       }
       
       
    }
    
}
