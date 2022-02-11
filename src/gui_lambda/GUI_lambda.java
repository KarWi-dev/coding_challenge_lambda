package gui_lambda;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_lambda
{
	public GUI_lambda()
	{
		JFrame frame = new JFrame("gui_lambda");
		frame.setLayout(null);
		frame.setSize(100, 100);
		
		JButton bt_lambda = new JButton("klick");
		bt_lambda.setBounds(20, 20, 50, 25);
		
		bt_lambda.addActionListener((ActionEvent e) -> System.out.println("Button wurde geklickt"));
		
		frame.add(bt_lambda);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // set frame to middle of monitor
		frame.setVisible(true); 
	}
}