package propertytax;

import javax.swing.*;
import java.awt.event.*;

public class TaxProperty {
	public static void main(String[] args)
	  {
	    JFrame frame = new JFrame("Property Tax Calculator");
	    JButton button = new JButton("Click to enter the property's actual value");
	    button.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent ae)
	        {
	            String str = JOptionPane.showInputDialog(null, "Enter the actual value : ", "property's actual value", 1);
	            if(str != null)
	            {
	                String num = str.replaceAll(",","");
	                Float val = 0.0f;
	                if(!str.equals(""))
	                {
	                 val = Float.valueOf(num);
	                }
	                float aValue = 0.6f * val; //assessment value
	                float tax = (aValue * 0.64f)/100 ;

	                JOptionPane.showMessageDialog(null, "Actual value of property : " + val + "\n\nThe assessment value is : " + aValue + "\n\nThe tax is : " + tax , "Your results", 1);
	            }
	            else
	            JOptionPane.showMessageDialog(null, "See you next time!", "Goodbye!", 1);
	        }
	    });

	  JPanel panel = new JPanel();
	  panel.add(button);
	  frame.add(panel);
	  frame.setSize(400, 200);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	  }
}
