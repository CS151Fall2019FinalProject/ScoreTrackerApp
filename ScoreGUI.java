package ScoreKeeper;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
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
		JButton endfootballgame = new JButton("End Football Game");
		
		JButton Team1two = new JButton("Team 1 Two Pointer");
		JButton Team1freethrow = new JButton("Team 1 Free Throw");
		JButton Team1three = new JButton("Team 1 Three Pointer");
		
		JButton Team2two = new JButton("Team 2 Two Pointer");
		JButton Team2freethrow = new JButton("Team 2 Free Throw");
		JButton Team2three = new JButton("Team 2 Three Pointer");
		
		JButton Team1touchdown = new JButton("Team 1 Touchdown");
		JButton Team1extrakick = new JButton("Team 1 Safety");
		JButton Team1fieldgoal = new JButton("Team 1 Field Goal");
		
		JButton Team2touchdown = new JButton("Team 2 Touchdown");
		JButton Team2extrakick = new JButton("Team 2 Safety");
		JButton Team2fieldgoal = new JButton("Team 2 Field Goal");
		
		frame.setLayout(new GridLayout(4,1));

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
					
					frame.add(Team1two);
					frame.add(Team1freethrow);
					frame.add(Team1three);
					
					frame.add(Team2two);
					frame.add(Team2freethrow);
					frame.add(Team2three);
					
					JLabel team1score = new JLabel();
					JLabel team2score = new JLabel();
					JLabel finalscore = new JLabel();
					
					Basketball ye = new Basketball("Team1", "Team2");
					
					ActionListener basketballaction = new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							if (e.getSource() == endbasketballgame)
							{	
								finalscore.setText(ye.endGame());
								
							}
							else if(e.getSource() == Team1two)
							{
								team1score.setText(ye.Team1AddTwo());
							}
							else if (e.getSource() == Team1freethrow)
							{
								team1score.setText(ye.Team1AddFT());
							}
							else if(e.getSource() == Team1three)
							{
								team1score.setText(ye.Team1AddThree());
							}
							else if (e.getSource() == Team2two)
							{
								team2score.setText(ye.Team2AddTwo());
							}
							else if(e.getSource() == Team2freethrow)
							{
								team2score.setText(ye.Team2AddFT());
							}
							else if (e.getSource() == Team2three)
							{
								team2score.setText(ye.Team2AddThree());
							}
						}
					};
					
					
					endbasketballgame.addActionListener(basketballaction);
					
					Team1two.addActionListener(basketballaction);
					Team1freethrow.addActionListener(basketballaction);
					Team1three.addActionListener(basketballaction);
					
					Team2two.addActionListener(basketballaction);
					Team2freethrow.addActionListener(basketballaction);
					Team2three.addActionListener(basketballaction);
					
					frame.add(team1score);
					frame.add(team2score);
					frame.add(finalscore);
					frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				} 
			}
		};
		
		ActionListener action2 = new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == startfootball)
				{
					frame.remove(startbasketball);
					frame.add(endfootballgame);
					
					frame.add(Team1touchdown);
					frame.add(Team1extrakick);
					frame.add(Team1fieldgoal);
					
					frame.add(Team2touchdown);
					frame.add(Team2extrakick);
					frame.add(Team2fieldgoal);
					
					JLabel team1score = new JLabel();
					JLabel team2score = new JLabel();
					JLabel finalscore = new JLabel();
					
					Football ye = new Football("Team1", "Team2");
					
					ActionListener footballaction = new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							if (e.getSource() == endfootballgame)
							{	
								finalscore.setText(ye.endGame());
								
							}
							else if(e.getSource() == Team1touchdown)
							{
								team1score.setText(ye.Team1AddTouchdown());
							}
							else if (e.getSource() == Team1extrakick)
							{
								team1score.setText(ye.Team1AddSafety());
							}
							else if(e.getSource() == Team1fieldgoal)
							{
								team1score.setText(ye.Team1AddFG());
							}
							else if (e.getSource() == Team2touchdown)
							{
								team2score.setText(ye.Team2AddTouchdown());
							}
							else if(e.getSource() == Team2extrakick)
							{
								team2score.setText(ye.Team2AddSafety());
							}
							else if (e.getSource() == Team2fieldgoal)
							{
								team2score.setText(ye.Team2AddFG());
							}
						}
					};
					
					
					endfootballgame.addActionListener(footballaction);
					
					Team1touchdown.addActionListener(footballaction);
					Team1extrakick.addActionListener(footballaction);
					Team1fieldgoal.addActionListener(footballaction);
					
					Team2touchdown.addActionListener(footballaction);
					Team2extrakick.addActionListener(footballaction);
					Team2fieldgoal.addActionListener(footballaction);
					
					frame.add(team1score);
					frame.add(team2score);
					frame.add(finalscore);
					frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				} 
			}
		};
		
		//end overall action listener
		startbasketball.addActionListener(action);
		startfootball.addActionListener(action2);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
			

