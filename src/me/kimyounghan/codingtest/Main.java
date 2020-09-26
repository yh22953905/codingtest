package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.stackandqueue.Printer;

public class Main {

    public static void main(String[] args) {

        Printer developFuntion = new Printer();

        int answer = developFuntion.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);

        System.out.println("answer : " + answer);

    }

}
