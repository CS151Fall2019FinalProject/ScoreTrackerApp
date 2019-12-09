
import java.sql.Timestamp;



public class Basketball {

  public  static final  int THREEPOINTER = 3;
  public  static final int FREETHROW = 1;
  public  static final int TWOPOINTER = 2;

  private Timestamp startTime;
  private Timestamp endTime;
  private int Team1Score;
  private String Team1Name;
  private int Team2Score;
  private String Team2Name;
  
  
  
  


  public Basketball(String Team1, String Team2){
    this.Team1Name = Team1;
    this.Team2Name = Team2;
    this.Team1Score = 0;
    this.Team2Score = 0;
    this.startTime = new Timestamp(System.currentTimeMillis());

  }

  public String Team1AddThree(){
    this.Team1Score += THREEPOINTER;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddThree(){
    this.Team2Score += THREEPOINTER;
    return "Team 2: " + this.Team2Score;
  }

  public String Team1AddFT(){
    this.Team1Score += FREETHROW;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddFT() {
  this.Team2Score +=FREETHROW;
  return "Team 2: " + this.Team2Score;
}

  public String Team1AddTwo(){
    this.Team1Score += TWOPOINTER;
    return "Team 1: " + this.Team1Score;
  }

  public String Team2AddTwo() {
    this.Team2Score += TWOPOINTER;
    return "Team 2: " + this.Team2Score;
  }

  public String endGame()
  {
    this.endTime = new Timestamp(System.currentTimeMillis());
    if(this.Team1Score > this.Team2Score)
    {
      return this.Team1Name + " Is the Winner!";
    }
    else if(this.Team1Score < this.Team2Score)
    {
      return this.Team2Name + " Is the Winner!";
    }
    else 
    {
      return "GAME ENDED IN A TIE, GOING TO OVERTIME";
    }

  }
}
