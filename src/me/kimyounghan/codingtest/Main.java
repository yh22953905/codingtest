package me.kimyounghan.codingtest;

import me.kimyounghan.codingtest.programmers.hash.APlayerWhoCouldNotFinish;
import me.kimyounghan.codingtest.programmers.sort.LargestNumber;
import me.kimyounghan.codingtest.programmers.stackandqueue.Top;

public class Main {

    public static void main(String[] args) {

        Top top = new Top();

        int[] answer = top.solution(new int[]{1,5,3,6,7,6,5});

        System.out.println("answer : " + answer);

    }

}
