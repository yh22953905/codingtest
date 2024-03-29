package me.kimyounghan.codingtest.programmers.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LifeBoat {

	/**
	 * Programmers > 탐욕법 > 구명보트
	 *
	 * 문제 설명
	 * 무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
	 * 예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
	 * 구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
	 * 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
	 *
	 * 제한사항
	 * 무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다.
	 * 각 사람의 몸무게는 40kg 이상 240kg 이하입니다.
	 * 구명보트의 무게 제한은 40kg 이상 240kg 이하입니다.
	 * 구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는 경우는 없습니다.
	 *
	 * 입출력 예
	 * people	limit	return
	 * [70, 50, 80, 50]	100	3
	 * [70, 80, 50]	100	3
	 *
	 * ------------------------------------------------------------------------------------
	 *
	 * @param people, limit
	 * @return
	 */

	public int solution(int[] people, int limit) {
		AtomicInteger answer = new AtomicInteger();

		// 사람들의 몸무게별 맵
		Map<Integer, Integer> peopleMap = new HashMap<>();

		for (int i = 0; i < people.length; i++) {
			Integer weight = Integer.valueOf(people[i]);
			if (peopleMap.containsKey(weight)) {
				peopleMap.put(weight, peopleMap.get(weight) + 1);
			} else {
				peopleMap.put(weight, 1);
			}
		}

		// 사람의 몸무게가 70이면, 먼저 나머지 사람들 중 몸무게 30인 사람을 찾고 1씩 감소시키며 찾음.
		for (Map.Entry<Integer, Integer> entry : peopleMap.entrySet()) {
			Integer weight = entry.getKey();
			int otherWeight = limit - weight;
			while (entry.getValue() > 0) {
				if (peopleMap.containsKey(otherWeight)) {
					peopleMap.put(weight, peopleMap.get(weight) - 1);
					peopleMap.put(otherWeight, peopleMap.get(otherWeight) - 1);

					answer.getAndIncrement();
				} else {
					otherWeight--;
				}

				if (otherWeight == 0) {
					answer.getAndIncrement();
					entry.setValue(entry.getValue() - 1);
				}
			}
		}

		return answer.get();
	}

	public int solution2(int[] people, int limit) {
		int answer = 0;
		int min = 0;

		// 배열 정렬
		Arrays.sort(people);

		// 최대 몸무게와 최소 몸무게를 더했을 때 limit 를 넘는다면 다음 최대 몸무게로
		// 즉, 위의 합이 limit 를 넘는 최대 몸무게를 가진 사람은 혼자 태움 (네 번째 제한사항으로 인해 가능)
		// 합이 limit 를 넘지 않는 몸무게를 가진 사람들은 같이 태움
		for (int max = people.length - 1; min <= max; max--) {
			if (people[min] + people[max] <= limit) min++;
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		LifeBoat lifeBoat = new LifeBoat();
		int solution = lifeBoat.solution2(new int[] {70, 50, 80, 50}, 100);

		System.out.println("answer : " + solution);
	}

}
