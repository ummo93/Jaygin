package com.github.ummo93.framework.service.impl;

import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.framework.service.data.EventLoopTask;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

import static com.raylib.Jaylib.getTime;

public class TaskQueueImpl extends TaskQueueService {
    private final Queue<EventLoopTask> queue = new ArrayDeque<>();

    public synchronized long enqueue(Runnable task) {
        return enqueue(task, 0);
    }

    public synchronized long enqueue(Runnable task, double delay_sec) {
        var elt = new EventLoopTask(task, getTime(), delay_sec);
        queue.add(elt);
        return elt.getId();
    }

    public synchronized void cancel(long taskId) {
        Iterator<EventLoopTask> iter = queue.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == taskId) {
                iter.remove();
                break;
            }
        }
    }

    public synchronized void dequeSuitable() {
        var now = getTime();
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
