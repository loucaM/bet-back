package com.bet.app.entity;

import lombok.Data;

@Data
public class Event {

    private String name;
    private String round;
    private String sex;
    private StartList startList;
    private Long date;
}
