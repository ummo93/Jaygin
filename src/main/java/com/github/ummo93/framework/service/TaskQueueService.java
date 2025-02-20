package com.github.ummo93.framework.service;


import lombok.Getter;

public abstract class TaskQueueService {
    @Getter
    private static TaskQueueService instance;

    public TaskQueueService() {
        instance = this;
    }

    public abstract long enqueue(Runnable task);
    public abstract long enqueue(Runnable task, double delay_sec);
    public abstract void cancel(long taskId);
    public abstract void dequeSuitable();
}
