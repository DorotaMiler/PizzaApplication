package com.dm.pizza;

import java.util.Date;

public class OrderBuilder {
    private final long id;
    private String summary = "";
    private boolean done = false;
    private Date dueDate;

    public OrderBuilder(long id){

    }

    public OrderBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public OrderBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public OrderBuilder setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Order build(){
        return new Order(id, summary,done,dueDate);
    }
}