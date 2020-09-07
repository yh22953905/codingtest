package me.kimyounghan.codingtest.programmers.hash;

import java.util.HashMap;

public class APlayerWhoCouldNotFinish {

    /**
     * Programmers > 해시 > 완주하지 못한 선수
     *
     * 문제 설명
     * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
     *
     * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
     * completion의 길이는 participant의 길이보다 1 작습니다.
     * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
     * 참가자 중에는 동명이인이 있을 수 있습니다.
     *
     * 입출력 예
     * participant	completion	return
     * [leo, kiki, eden]	[eden, kiki]	leo
     * [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
     * [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
     *
     * 입출력 예 설명
     * 예제 #1
     * leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
     *
     * 예제 #2
     * vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
     *
     * 예제 #3
     * mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
     *
     * ------------------------------------------------------------------------------------
     * 풀이 출처 : https://developerdk.tistory.com/24
     *
     * @param participant, completion
     * @return
     */

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            // getOrDefault: Map의 메소드로서 키에 해당하는 값이 있으면 리턴하고, 아니면 두 번째 인자값을 리턴한다
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            // hm: hm에는 참가자 키에 1 이상의 값(동명이인)이 할당되어 있으므로 완주자 키에 해당하는 값에서 1을 뺀 값을 할당한다.
            hm.put(player, hm.get(player) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

}
