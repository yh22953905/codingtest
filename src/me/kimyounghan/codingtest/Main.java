package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.binarysearch.Immigration;
import me.kimyounghan.codingtest.programmers.sort.KthNumber;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        KthNumber kthNumber = new KthNumber();

//        long answer = immigration.solution(6, new int[]{7, 10});

        int[] solution = kthNumber.solution(
                new int[] {1, 5, 2, 6, 3, 7, 4}
                , new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        System.out.println("answer : " + Arrays.stream(solution).asDoubleStream().toString());

    }

}
