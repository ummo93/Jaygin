package com.github.ummo93.framework.service.data;

import lombok.Data;


@Data
public class EventLoopTask {
    private static long task_id_counter = 0;
    private Runnable callback;
    private double startTime_sec;
    private double delay_sec;
    private long id;

    public EventLoopTask(Runnable callback, double startTime_sec, double delay_sec) {
        task_id_counter++;
        this.callback = callback;
        this.startTime_sec = startTime_sec;
        this.delay_sec = delay_sec;
        this.id = task_id_counter;
    }
}
