package com.pf.opp1;

public class TestTrainWindow {
    public static void main(String[] args) {

        // 窗口1
        TrainWindow w1 = new TrainWindow("窗口1");
        // 售票
        w1.sellTicket();
        w1.sellTicket();
        System.out.println(w1.getName()+"的余票："+w1.getTicket());
        // 窗口2
        TrainWindow w2 = new TrainWindow("窗口2");
        System.out.println(w2.getName()+"的余票："+w2.getTicket());
        // 窗口3
        TrainWindow w3 = new TrainWindow("窗口3");
        System.out.println(w3.getName()+"的余票："+w3.getTicket());
    }
}
