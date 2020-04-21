package com.dm.pizza;

import java.util.Date;

public class Order {

    private final long id;
    private String summary = "";
    private boolean done = false;
    private Date dueDate;

    public Order(long id) {
        this.id = id;
    }

    public Order(long id, String summary, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.done = done;
        this.dueDate = dueDate;
    }


    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDueDate(Date dueDate) {
        return new Date(dueDate.getTime());
    }

    public Date setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
    }
}