package com.company;

import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {

    }

    public LocalTime getStartTime() {
        return startTime = LocalTime.now();
    }

    public LocalTime getEndTime() {
        return endTime = LocalTime.now();
    }

    public double getElapsedTime() {
        double start = startTime.getNano();
        double end = endTime.getNano();
        return (end - start) / 1000000;
    }
}
