package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentcyExchange {

    String from;
    String to;
    int q;



    public CurrentcyExchange(String from, String to, int q) {
        this.from = from;
        this.to = to;
        this.q = q;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}
