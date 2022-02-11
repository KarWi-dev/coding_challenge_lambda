package gui_lambda;

import javax.swing.*;

public class bt_lambda
{
	public void feedback() 
	{
		JFrame frame2 = new JFrame();
		frame2.setLayout(null);
		frame2.setSize(416, 277);
		
		
		JLabel lb_bg = new JLabel(new ImageIcon("img"));
		lb_bg.setBounds(0, 0, 415, 276);
		
		frame2.add(lb_bg);
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);		
	}
}
