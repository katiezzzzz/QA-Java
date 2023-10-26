package com.qa.timepieces;

import com.qa.Alarmable;

public class Clock implements Alarmable {

    @Override
    public String turnAlarmOn() {
        return "Clock alarm has been turned on";
    }

    @Override
    public String turnAlarmOff() {
        return "Clock alarm has been turned off";
    }
}
