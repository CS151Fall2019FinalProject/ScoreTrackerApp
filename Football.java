package ScoreKeeper;

import javax.swing.*;
import java.util.*;

public class Football {

  public  static final  int TOUCHDOWN = 7;
  public  static final int FIELDGOAL = 3;
  public static final int SAFETY = 2;


//  private Timestamp startTime;
  //private Timestamp endTime;
  private int Team1Score;
  private String Team1Name;
  private int Team2Score;
  private String Team2Name;
  private Map<String, Integer> team1Scorers;
  private Map<String, Integer> team2Scorers;

  public Football(String Team1, String Team2){
    this.Team1Name = Team1;
    this.Team2Name = Team2;
    this.Team1Score = 0;
    this.Team2Score = 0;
    this.team1Scorers = new HashMap<>();
    this.team2Scorers = new HashMap<>();

  }

  public String Team1AddTouchdown(){
	  String name = JOptionPane.showInputDialog("Enter player who scored touchdown for team 1");
	  if(!team1Scorers.containsKey(name)) {
		  team1Scorers.put(name, 7);
	  }
	  else {
		  int currentCount = team1Scorers.get(name);
		  team1Scorers.put(name, currentCount+=7);
	  }
	  
    this.Team1Score += TOUCHDOWN;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddTouchdown(){
	  String name = JOptionPane.showInputDialog("Enter player/player number who scored touchdown for team 2");
	  if(!team2Scorers.containsKey(name)) {
		  team1Scorers.put(name, 7);
	  }
	  else {
		  int currentCount = team2Scorers.get(name);
		  team2Scorers.put(name, currentCount+=7);
	  }
    this.Team2Score += TOUCHDOWN;
    return "Team 2: " + this.Team2Score;
  }

  public String Team1AddFG(){
	  
	  String name = JOptionPane.showInputDialog("Enter kicker name and number: ");
	  if(!team1Scorers.containsKey(name)) {
		  team1Scorers.put(name, 3);
	  }
	  else {
		  int currentCount = team1Scorers.get(name);
		  team1Scorers.put(name, currentCount+=3);
	  }
    this.Team1Score += FIELDGOAL;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddFG() {
	  
	  String name = JOptionPane.showInputDialog("Enter kicker name and number: ");
	  if(!team1Scorers.containsKey(name)) {
		  team1Scorers.put(name, 3);
	  }
	  else {
		  int currentCount = team2Scorers.get(name);
		  team1Scorers.put(name, currentCount+=3);
	  }
  this.Team2Score +=FIELDGOAL;
  return "Team 2: " + this.Team2Score;
}

  public String Team1AddSafety(){
	  String name = JOptionPane.showInputDialog("Enter player/player number who scored safety");
	  if(!team1Scorers.containsKey(name)) {
		  team1Scorers.put(name, 2);
	  }
	  else {
		  int currentCount = team1Scorers.get(name);
		  team1Scorers.put(name, currentCount+=2);
	  }
    this.Team1Score += SAFETY;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddSafety() {
	  String name = JOptionPane.showInputDialog("Enter player who scored touchdown");
	  if(!team2Scorers.containsKey(name)) {
		  team2Scorers.put(name, 2);
	  }
	  else {
		  int currentCount = team2Scorers.get(name);
		  team2Scorers.put(name, currentCount+=2);
	  }
    this.Team2Score += SAFETY;
    return"Team 2: " + this.Team2Score;
  }
  
  public Map<String, Integer> team1Stats(){
	  return this.team1Scorers;
  }
  
  public Map<String, Integer> team2Stats(){
	  return this.team2Scorers;
  }

  public String endGame(){
    if(this.Team1Score > this.Team2Score)
    {
    	 return this.Team1Name + " Is the Winner!";
    }
    else if(this.Team1Score < this.Team2Score)
    {
    	return this.Team2Name + " Is the Winner!";
    }
    else {
    	
      return "GAME ENDED IN A TIE, GOING TO OVERTIME";
    }

  }
}
