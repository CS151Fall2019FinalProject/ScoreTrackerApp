package ScoreKeeper;

import java.util.*;
import java.lang.*;
import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Basketball {

  public  static final  int THREEPOINTER = 3;
  public  static final int FREETHROW = 1;
  public  static final int TWOPOINTER = 2;

  private Timestamp startTime;
  private Timestamp endTime;
  private int Team1TeamScore;
  private String Team1TeamName;
  private int Team2TeamScore;
  private String Team2TeamName;


  public Basketball(String Team1, String Team2){
    this.Team1TeamName = Team1;
    this.Team2TeamName = Team2;
    this.Team1TeamScore = 0;
    this.Team2TeamScore = 0;
    this.startTime = new Timestamp(System.currentTimeMillis());

  }

  public void Team1AddThree(){
    this.Team1TeamScore += THREEPOINTER;
  }

  public void Team2AddThree(){
    this.Team2TeamScore += THREEPOINTER;
  }

  public void Team1AddFT(){
    this.Team1TeamScore += FREETHROW;
  }

  public void Team2AddFT() {
  this.Team2TeamName +=FREETHROW;
}

  public void Team1AddTwo(){
    this.Team1TeamScore += TWOPOINTER;
  }

  public void Team2AddTwo() {
    this.Team2TeamScore += TWOPOINTER;
  }

  public String endGame(){
    this.endGame = new Timestamp(System.currentTimeMillis());
    if(this.Team1TeamScore > this.Team2TeamScore){
      return this.Team1TeamName;
    }
    else if(this.Team1TeamScore < this.Team2TeamScore){
      return this.Team2TeamName;
    }
    else {
      return "GAME ENDED IN A TIE, GOING TO OVERTIME";
    }

  }
}
