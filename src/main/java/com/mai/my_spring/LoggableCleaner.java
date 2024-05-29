package com.mai.my_spring;

public class LoggableCleaner implements Cleaner {

    @InjectByType
    private CleanerImpl cleaner;

    @Override
    public void clean() {
        System.out.println("clean working");
        cleaner.clean();
        System.out.println("clean finished");
    }
}
