import javax.swing.*;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

//this project will be the "blueprint" for the marketcap calculator project
//using either jframe or jpanel. 
//since jframe is used for this one, it would be best to use the same for the next project. 

public class CurrencyConvertProject {
	
	public static void converter() {
		
		
		
		//creates a new jframe using jframe make sure to import swing
		JFrame firstFrame = new JFrame("RUPEE TO USD CONVERTER");
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.setPreferredSize(new Dimension(1000, 1000));
		firstFrame.getContentPane().setBackground(Color.BLACK);
		firstFrame.pack();
		firstFrame.setVisible(true);
		firstFrame.setResizable(false);
		
		//creates two labels
		JLabel l1, l2;
		
		//creates two textfields
		//one for rupee and one for the dollar
		JTextField t1, t2;
		
		//create three buttons 
		JButton b1, b2, b3;
		
		//name labels and setting the bounds for labels
		l1 = new JLabel("Rupees:");
		l1.setForeground(Color.white);
		l1.setBounds(20,40,60,30);
		l2 = new JLabel("Dollars:");
		l2.setForeground(Color.white);
		l2.setBounds(170,40,60,30);
		
		//initialize the textfields with zero by default and setting 
		//the bounds for the text fields
		t1 = new JTextField("0");
		t1.setBounds(80,40,60,30);
		t2 = new JTextField("0");
		t2.setBounds(240,40,60,30);
		
		//creating 3 buttons for INR
		//one button for dollar
		//one button to close. 
		//one for setting the bounds
		
		b1 = new JButton("INR");
		b1.setBounds(80,80,60,15);
		b2 = new JButton("USD");
		b2.setBounds(240,80,60,15);
		b3 = new JButton("Exit");
		b3.setForeground(Color.red);
		b3.setBounds(150,150,60,30);
		
		//adding action listener. these are event handlers that will
		//connect to the buttons. (button click)
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//convert to double 
				double d = Double.parseDouble(t1.getText());
				
				//convert rupees to dollars 
				double d1 = (d / 65.25);
				
				//getting the string value of the calculated value
				String str1 = String.valueOf(d1);
				
				//place inside the text box 
				t2.setText(str1);
				
			}
		});
		
		//add action listener for button 2
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//convert to double
				double d2 = Double.parseDouble(t2.getText());
				
				//convert dollars to rupees
				double d3 = (d2 * 65.25);
				
				//get the string value of the calculated value 
				String str2 = String.valueOf(d3);
				
				//place in text box 
				t1.setText(str2);
				
			}
		});
		
		//action listener to close the form 
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstFrame.dispose();
				
			}
		});
		
		firstFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//adding the created objects to the form
		firstFrame.add(l1);
		firstFrame.add(t1);
		firstFrame.add(l2);
		firstFrame.add(t2);
		firstFrame.add(b1);
		firstFrame.add(b2);
		firstFrame.add(b3);
		
		firstFrame.setLayout(null);
		firstFrame.setSize(400,300);
		firstFrame.setVisible(true);
		
		
		
	}
	

	
//Driver code 
	public static void main(String[] args) {
		converter();

	}

}
