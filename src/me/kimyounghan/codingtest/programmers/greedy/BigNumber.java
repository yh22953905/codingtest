package me.kimyounghan.codingtest.programmers.greedy;

public class BigNumber {

    /**
     * Programmers > 탐욕법 > 큰 수 만들기
     *
     * 문제 설명
     * 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
     *
     * 예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
     *
     * 문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
     *
     * 제한 조건
     * number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
     * k는 1 이상 number의 자릿수 미만인 자연수입니다.
     *
     * 입출력 예
     * number	k	return
     * "1924"	2	"94"
     * "1231234"	3	"3234"
     * "4177252841"	4	"775841"
     *
     * ------------------------------------------------------------------------------------
     *
     * @param number, k
     * @return
     */

    public String solution(String number, int k) {
        // number 의 길이 - k = answer 의 길이
        // answer 의 길이만큼 탐색하기 시작 / 1231234 -> 123
        // number 의 순서를 바꿀 수 있다는 조건은 없음
        // 123 -> 3 / 쓸 수 있는 숫자는 3개 남음
        // 남은 숫자들로 반복문 돌리기 시작
        // 1234 반복문 -> 3 1
        // 234 반복문 / 남은 자리를 채워야 하기 때문에 남은 숫자 채워 넣음 -> 3 2 3 4

        StringBuilder answerBuilder = new StringBuilder();

        int index = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int maxNumber = 0;

            for (int j = index; j <= k + i; j++) {
                if (maxNumber < number.charAt(j) - '0') {
                    maxNumber = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            answerBuilder.append(maxNumber);
        }

        return answerBuilder.toString();
    }

}
