package ScoreKeeper;

import java.util.*;
import java.lang.*;
import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


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


  public Football(String Team1, String Team2){
    this.Team1Name = Team1;
    this.Team2Name = Team2;
    this.Team1Score = 0;
    this.Team2Score = 0;

  }

  public String Team1AddTouchdown(){
    this.Team1Score += TOUCHDOWN;
    return Integer.toString(this.Team1Score);
  }

  public String Team2AddTouchdown(){
    this.Team2Score += TOUCHDOWN;
    return Integer.toString(this.Team2Score);
  }

  public String Team1AddFG(){
    this.Team1Score += FIELDGOAL;
    return Integer.toString(this.Team1Score);
  }

  public String Team2AddFG() {
  this.Team2Score +=FIELDGOAL;
  return Integer.toString(this.Team2Score);
}

  public String Team1AddSafety(){
    this.Team1Score += SAFETY;
    return Integer.toString(this.Team1Score);
  }

  public String Team2AddSafety() {
    this.Team2Score += SAFETY;
    return Integer.toString(this.Team2Score);
  }

  public String endGame(){
    if(this.Team1Score > this.Team2Score){
      return this.Team1Name;
    }
    else if(this.Team1Score < this.Team2Score){
      return this.Team2Name;
    }
    else {
      return "GAME ENDED IN A TIE, GOING TO OVERTIME";
    }

  }
}
