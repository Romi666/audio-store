package com.enigmacamp.audiostore.utils;

import java.sql.Date;

public class utilsDate {
    public Date dateNow() {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        return date;
    }
}
