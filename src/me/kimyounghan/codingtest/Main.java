package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.stackandqueue.DevelopFuntion;

public class Main {

    public static void main(String[] args) {

        DevelopFuntion developFuntion = new DevelopFuntion();

        int[] answer = developFuntion.solution(new int[]{80, 90, 0}, new int[]{1, 3, 30});

        System.out.println("answer : " + answer);

    }

}
