package ScoreKeeper;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScoreGUI 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();

		JButton startbasketball = new JButton("Begin Basketball Game");
		JButton startfootball = new JButton("Begin Football Game");
		JButton endbasketballgame = new JButton("End Basketball Game");
		JButton endfootballgame = new JButton("EndS Football Game");
		
		JButton twopoints = new JButton("Two Pointer");
		JButton freethrow = new JButton("Free Throw");
		JButton threepoints = new JButton("Three Pointer");
		
		JButton touchdown = new JButton("Touchdown");
		JButton extrakick = new JButton("Extra Kick");
		JButton fieldgoal = new JButton("Field Goal");
		
		frame.setLayout(new FlowLayout());

		frame.add(startbasketball);
		frame.add(startfootball);
		
		ActionListener action = new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == startbasketball)
				{
					frame.remove(startfootball);
					frame.add(endbasketballgame);
					frame.add(twopoints);
					frame.add(freethrow);
					frame.add(threepoints);
					
					frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				} 
				else if( e.getSource() == startfootball)
				{
					frame.remove(startbasketball);
					frame.add(endfootballgame);
					frame.add(touchdown);
					frame.add(extrakick);
					frame.add(fieldgoal);
					
					frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			}
		};
		
		startbasketball.addActionListener(action);
		startfootball.addActionListener(action);
					
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
