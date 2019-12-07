package ScoreKeeper;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ScoreGUI 
{
	public static void run() throws MalformedURLException
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 700);

		JButton startbasketball = new JButton((Icon) new ImageIcon(new URL("http://iconbug.com/download/size/256/icon/2717/basketball/")));
		JButton startfootball =new JButton((Icon) new ImageIcon(new URL("https://icon-library.net/images/small-football-icon/small-football-icon-5.jpg")));
		
		JButton endbasketballgame = new JButton((Icon) new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR_0DJtq4nmm-1qnaReGU8UMDmwKoNAnZiBc4svXV4HMrDu5Yag")));
		JButton endfootballgame = new JButton((Icon) new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR_0DJtq4nmm-1qnaReGU8UMDmwKoNAnZiBc4svXV4HMrDu5Yag")));
		
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
		
		JLabel team1score = new JLabel("Team 1: ");
		JLabel team2score = new JLabel("Team 2: ");
		
		Font f = new Font("OCR A Extended", Font.PLAIN, 30);
		
		team1score.setFont(f);
		team2score.setFont(f);
		
		
		
		
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
					
					//JLabel team1score = new JLabel("Team 1: ");
					//JLabel team2score = new JLabel("Team 2: ");
					JLabel finalscore = new JLabel();
					
					Basketball ye = new Basketball("Team1", "Team2");
					
					ActionListener basketballaction = new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							if (e.getSource() == endbasketballgame)
							{	
								finalscore.setText(ye.endGame());
								frame.setVisible(false);
								JOptionPane.showMessageDialog(null, finalscore);
								
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
					
					finalscore.setFont(f);
					frame.add(team1score);
					frame.add(team2score);
					frame.add(finalscore);
					
					frame.setSize(900, 600);
					//frame.pack();
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
					
					//JLabel team1score = new JLabel();
					//JLabel team2score = new JLabel();
					JLabel finalscore = new JLabel();
					
					Football ye = new Football("Team1", "Team2");
					
					ActionListener footballaction = new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							if (e.getSource() == endfootballgame)
							{	
								finalscore.setText(ye.endGame());
								frame.setVisible(false);
								JOptionPane.showMessageDialog(null, finalscore);
								
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
					finalscore.setFont(f);
					frame.add(team1score);
					frame.add(team2score);
					frame.add(finalscore);
					frame.setSize(900, 600);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				} 
			}
		};
		
		//end overall action listener
		startbasketball.addActionListener(action);
		startfootball.addActionListener(action2);
		
		//frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) throws MalformedURLException
	{
		run();
	}
}
