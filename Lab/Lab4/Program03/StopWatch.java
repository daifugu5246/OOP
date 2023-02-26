package Program03;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;
    private Date date;

    StopWatch(){
        date = new Date();
        startTime = date.getTime();
    }
    public double getStartTime() {
        return startTime;
    }
    public double getEndtime() {
        return endTime;
    }
    public void start(){
        date = new Date();
        startTime = date.getTime();
    }
    public void stop(){
        date = new Date();
        endTime = date.getTime(); 
    }
    public double getElapsedTime(){
        double elapsed = endTime-startTime;
        return elapsed;
    }
}
