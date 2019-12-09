package ScoreKeeper;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FinalProject 
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JLabel title = new JLabel( "Score Keeper", SwingConstants.CENTER );
		JButton start = new JButton("Start");
		 
		
		Font f = new Font("OCR A Extended", Font.PLAIN, 50);
		
		title.setFont(f);
		
		 start.addActionListener(new ActionListener()
		 {  
			 public void actionPerformed(ActionEvent e)
			 {  
			     try {
			    	 
					ScoreGUI.run();
					frame.dispose();
					
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }  
			 });  
		
	
		frame.add( title, BorderLayout.CENTER );
		frame.add(start, BorderLayout.SOUTH);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}

}
