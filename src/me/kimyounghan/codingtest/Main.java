package me.kimyounghan.codingtest;

import me.kimyounghan.codingtest.programmers.sort.LargestNumber;

public class Main {

    public static void main(String[] args) {

        LargestNumber largestNumber = new LargestNumber();

        String answer = largestNumber.solution(new int[]{6, 10, 2});

        System.out.println("answer : " + answer);

    }

}
