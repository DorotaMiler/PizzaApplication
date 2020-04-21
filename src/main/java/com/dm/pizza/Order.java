package com.dm.pizza;

import java.util.Date;

public class Order {

    private final long id;
    private String summary = "";
    private boolean done = false;
    private Date dueDate;

    Order(long id){
        this.id = id;
    }
}
