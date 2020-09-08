package me.kimyounghan.codingtest;

import me.kimyounghan.codingtest.programmers.dfsbfs.TargetNumber;
import me.kimyounghan.codingtest.programmers.hash.APlayerWhoCouldNotFinish;
import me.kimyounghan.codingtest.programmers.sort.LargestNumber;
import me.kimyounghan.codingtest.programmers.stackandqueue.Top;

public class Main {

    public static void main(String[] args) {

        TargetNumber targetNumber = new TargetNumber();

        int answer = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);

        System.out.println("answer : " + answer);

    }

}
