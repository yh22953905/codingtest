package me.kimyounghan.codingtest.baekjoon.dfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs {

    /**
     * 백준 알고리즘 > 깊이 우선 탐색 > DFS와 BFS
     *
     * 문제
     * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
     * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
     * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
     *
     * 입력
     * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
     * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
     * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
     *
     * 출력
     * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다.
     * V부터 방문된 점을 순서대로 출력하면 된다.
     */

    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 정점의 개수
        int M = scan.nextInt(); // 간선의 개수
        int V = scan.nextInt(); // 탐색을 시작할 정점 번호

        // 인접행렬 생성
        arr = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    private static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if (V == arr.length) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[V][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int V) {
        Queue<Integer> que = new LinkedList<>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && !visited[i]) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}