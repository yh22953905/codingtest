package me.kimyounghan.codingtest.programmers.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class RotatingCamera {

	public int solution(int[][] routes) {
		int answer = 0;

		// 진입 지점 (routes[i][0])의 오름차순으로 정렬
		Arrays.sort(routes, Comparator.comparingInt(o -> o[0]));

		// 탐색, 각 경로의 진출 지점에 카메라 설치
		// 이전 경로의 카메라에 찍히면 카메라를 설치하지 않음, 찍히지 않으면 카메라를 설치
		Stack<Integer> cameraStack = new Stack<>();
		cameraStack.push(-30001);

		for (int i = 0; i < routes.length; i++) {
			if (cameraStack.peek() > routes[i][0] && cameraStack.peek() < routes[i][1]) {
				cameraStack.push(routes[i][1]);
			} else {
				cameraStack.pop();
				cameraStack.push(routes[i][1]);
			}
		}

		// 설치된 카메라의 개수가 answer
		return cameraStack.size();
	}

	public static void main(String[] args) {
		RotatingCamera camera = new RotatingCamera();
		int solution = camera.solution(new int[][] {{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}});

		System.out.println("answer : " + solution);
	}
}
