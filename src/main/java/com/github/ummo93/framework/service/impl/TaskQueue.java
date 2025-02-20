package com.github.ummo93.framework.service.impl;

import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.framework.service.data.EventLoopTask;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

import com.raylib.Raylib;

public class TaskQueue extends TaskQueueService {
    private final Queue<EventLoopTask> queue = new ArrayDeque<>();

    public long enqueue(Runnable task) {
        return enqueue(task, 0);
    }

    public long enqueue(Runnable task, double delay_sec) {
        var elt = new EventLoopTask(task, Raylib.GetTime(), delay_sec);
        queue.add(elt);
        return elt.getId();
    }

    public void cancel(long taskId) {
        for (EventLoopTask eventLoopTask : queue) {
            if (eventLoopTask.getId() != taskId) continue;
            queue.remove(eventLoopTask);
            break;
        }
    }

    public void dequeSuitable() {
        var now = Raylib.GetTime();
        Iterator<EventLoopTask> iter = queue.iterator();
        while(iter.hasNext()){
            var it = iter.next();
            var endTime = it.getStartTime_sec() + it.getDelay_sec();
            if (endTime < now) {
                it.getCallback().run();
                iter.remove();
            }
        }
    }
}
