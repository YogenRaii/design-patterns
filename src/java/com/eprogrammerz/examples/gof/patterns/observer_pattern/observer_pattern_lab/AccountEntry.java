package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_lab;

import java.util.Date;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class AccountEntry {
    private Date date;

    public AccountEntry(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString();
    }
}
