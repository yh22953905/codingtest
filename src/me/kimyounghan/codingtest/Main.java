package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.binarysearch.Immigration;

public class Main {

    public static void main(String[] args) {

        Immigration immigration = new Immigration();

        long answer = immigration.solution(6, new int[]{7, 10});

        System.out.println("answer : " + answer);

    }

}
