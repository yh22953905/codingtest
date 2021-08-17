package me.kimyounghan.codingtest.baekjoon.greedy;

import java.util.Scanner;

public class SumOfNumbers {

    /**
     * 백준 알고리즘 > 그리디 알고리즘 > 수들의 합
     *
     * 문제
     * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
     *
     * 입력
     * 첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
     *
     * 출력
     * 첫째 줄에 자연수 N의 최댓값을 출력한다.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        System.out.println(solution(num));
    }

    private static int solution(long num) {
        // 1 부터 N 까지의 합이 S 를 넘어설 때
        // 직전의 수가 N 의 최대값
        long sum = 0;
        int count = 0;

        for(int i=1; ; i++) {
            if(sum > num) break;
            sum += i;
            count ++;
        }

        return count - 1;
    }
}
