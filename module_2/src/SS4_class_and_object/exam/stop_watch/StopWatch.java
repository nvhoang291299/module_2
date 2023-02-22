package SS4_class_and_object.exam.stop_watch;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    public long startTime;
    public long endTime;


    public StopWatch() {}
    public LocalTime start(){
        LocalTime time1 = LocalTime.now();
        long startTime = System.currentTimeMillis();
        this.startTime =  startTime;
        return time1;
    }
    public LocalTime stop(){
        LocalTime time2 = LocalTime.now();
        long endTime = System.currentTimeMillis();
        this.endTime = endTime;
        return time2;
    }
    public long getElapsedTime(){
        long elapsedTime = this.endTime - this.startTime;
        return elapsedTime;
    }
}
