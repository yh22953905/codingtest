package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.stackandqueue.StockPrice;

public class Main {

    public static void main(String[] args) {

        StockPrice developFuntion = new StockPrice();

        int[] answer = developFuntion.solution(new int[]{1, 2, 3, 2, 3});

        System.out.println("answer : " + answer);

    }

}
