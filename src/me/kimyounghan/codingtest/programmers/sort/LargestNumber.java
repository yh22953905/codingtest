package me.kimyounghan.codingtest.programmers.sort;

import java.util.Arrays;
import java.util.Comparator;


public class LargestNumber {

    /**
     * Programmers > 정렬 > 가장 큰 수
     *
     * 문제 설명
     *    0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
     *
     *    예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
     *
     *    0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한 사항
     *    numbers의 길이는 1 이상 100,000 이하입니다.
     *    numbers의 원소는 0 이상 1,000 이하입니다.
     *    정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
     *
     * 입출력 예
     *    numbers	            return
     *    [6, 10, 2]	        6210
     *    [3, 30, 34, 5, 9]	    9534330
     *
     * ------------------------------------------------------------------------------------
     * 풀이 출처 : https://developerdk.tistory.com/24
     *
     * @param numbers
     * @return
     */

    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        String[] strNumbers = new String[numbers.length];

        // 첫째 자리가 큰 순서대로 정렬해주기 위해 int -> String으로 변환한다.
        for (int i = 0 ; i < strNumbers.length ; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 문자열 compareTo 특성을 활용하여 정렬
        // 예를 들어 s1 = 10, s2 = 6일 경우, s2 + s1 = "610", s1 + s2 = "106"이므로
        // (s2+s1).compareTo(s1+s2) = 5 (양수)가 나오게 되고 6이 10보다 먼저 오게 된다.
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        // 정렬된 배열의 첫 번째 값이 "0"이면 "0"으로만 구성된 배열이므로 "0"을 리턴한다.
        if (strNumbers[0].equals("0")) return "0";

        for (String strNumber : strNumbers) {
            answer.append(strNumber);
        }

        return answer.toString();
    }

}