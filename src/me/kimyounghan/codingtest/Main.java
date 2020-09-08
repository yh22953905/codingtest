package me.kimyounghan.codingtest;

import me.kimyounghan.codingtest.programmers.DynamicProgramming.ExpressedByN;
import me.kimyounghan.codingtest.programmers.dfsbfs.TargetNumber;
import me.kimyounghan.codingtest.programmers.hash.APlayerWhoCouldNotFinish;
import me.kimyounghan.codingtest.programmers.sort.LargestNumber;
import me.kimyounghan.codingtest.programmers.stackandqueue.Top;

public class Main {

    public static void main(String[] args) {

        ExpressedByN expressedByN = new ExpressedByN();

        int answer = expressedByN.solution(5, 12);

        System.out.println("answer : " + answer);

    }

}
