package SS4_class_and_object.exam.stop_watch;

import java.util.Scanner;

public class StopWatchController {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        System.out.println("thời gian bắt đầu: " + stopwatch.start());
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hello world!");
        }
        System.out.println("thời gian dừng: " + stopwatch.stop());
            
        System.out.println("khoảng thời gian: " + stopwatch.getElapsedTime());
    }
}
