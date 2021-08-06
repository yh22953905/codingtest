package me.kimyounghan.codingtest.programmers.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class RotatingCamera {

	public int solution(int[][] routes) {
		int answer = 0;

		// 진입 지점 (routes[i][1])의 오름차순으로 정렬
		Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));

		// 탐색, 각 경로의 진출 지점에 카메라 설치
		// 이전 경로의 카메라에 찍히면 카메라를 설치하지 않음, 찍히지 않으면 카메라를 설치
		int camera = -30001;

		for (int[] route : routes) {
			if (camera < route[0]) {
				camera = route[1];
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		RotatingCamera camera = new RotatingCamera();
		int solution = camera.solution(new int[][] {{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}});

		System.out.println("answer : " + solution);
	}
}
