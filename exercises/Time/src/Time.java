
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time (int hour, int minute, int second){
        setTime(hour, minute, second );
this.hour = hour;
this.minute = minute;
this.second = second; 
    }
    public int getHour(){
            return hour;
        }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour (int hour){
        this.hour= hour;
        
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second= second;
    }

  
    
    
    
}
