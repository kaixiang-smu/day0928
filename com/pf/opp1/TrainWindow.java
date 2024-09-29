package com.pf.opp1;

public class TrainWindow {

    private String name; // 窗口名
    // 假设有火车票初始1000张
    // 定义成static，被所有窗口共享！
    private static int ticket = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    // 售票
    public void sellTicket(){
        ticket--;
    }

    public TrainWindow(String name) {
        this.name = name;
    }
}
