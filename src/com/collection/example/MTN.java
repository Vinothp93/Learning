package com.collection.example;

import java.util.ArrayList;
import java.util.List;

public class MTN{
    private List<String> mtn;

    @Override
    public String toString() {
        return "com.collection.example.MTN{" +
                "mtn=" + mtn +
                '}';
    }

    public MTN() {
       mtn = new ArrayList<>();
       mtn.add("10000");
       mtn.add("20000");
       mtn.add("30000");
       mtn.add("400000");
    }
}