package com.vu.utms.core;

public interface Schedulable {
    void assignSchedule(String schedule);
    String getCurrentSchedule();
}