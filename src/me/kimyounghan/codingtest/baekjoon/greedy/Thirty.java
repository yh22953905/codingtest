package me.kimyounghan.codingtest.baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Thirty {

    /**
     * 백준 알고리즘 > 그리디 알고리즘 > 30
     *
     * 문제
     * 어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다.
     * 미르코는 30이란 수를 존경하기 때문에,
     * 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
     *
     * 미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
     *
     * 입력
     * N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
     *
     * 출력
     * 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        // 30의 배수 조건
        // 1. 끝이 0으로 끝난다 (예 : 210)
        // 2. 각 자리의 수를 더하면 3의 배수가 된다 (예 : 210 -> 2 + 1 + 0 = 3)
        // 30의 배수 중 가장 큰 수는 위 조건들을 만족하는 수를 큰 수부터 정렬한 수
        List<Integer> integers = Arrays.stream(str.split(""))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (integers.get(integers.size() - 1) != 0) return "-1";

        Integer sum = integers.stream().reduce(0, Integer::sum);

        if (sum % 3 != 0) return "-1";

        return integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
