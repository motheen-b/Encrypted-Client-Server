package org.encrypted.server;

import java.util.concurrent.*;

public class ThreadHandler {

    private ExecutorService executorService;
    private static ThreadHandler threadHandler = null;

    private ThreadHandler() {
        executorService = Executors.newCachedThreadPool();
    }

    public synchronized static ThreadHandler get() {
        if (threadHandler == null) {
            threadHandler = new ThreadHandler();
        }
        return threadHandler;
    }

    public void execute(final Runnable runnable) {
        executorService.execute(runnable);
    }

    public <T> Future<T> submit(final Callable callable) {
        return executorService.submit(callable);
    }

    public void shutdown() {
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
