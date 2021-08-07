package me.kimyounghan.codingtest.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliveringSugar {

    /**
     * 백준 알고리즘 > 그리디 알고리즘 > 설탕 배달
     *
     * 문제
     * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
     * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
     * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
     *
     * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
     * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
     * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
     *
     * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
     *
     * 출력
     * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1. 5*i, 3*j 으로 나눌 수 있는지 확인

        // 2. 나누어 떨어질 때 5가 최대일 경우가 봉지의 최소 개수

        // 3. 나누어 떨어지지 않으면 -1

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int fiveRemainder = n % 5;
        int fiveCount = n / 5;
        int threeRemainder;
        int threeCount;

        if (fiveRemainder == 0) {
            return fiveCount;
        }

        while (fiveCount >= 0) {
            threeRemainder = fiveRemainder % 3;
            threeCount = fiveRemainder / 3;
            if (threeRemainder == 0) {
                return fiveCount + threeCount;
            }

            fiveCount--;
            fiveRemainder += 5;
        }

        return -1;
    }
}
