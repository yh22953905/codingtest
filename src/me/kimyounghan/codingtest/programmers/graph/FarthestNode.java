package me.kimyounghan.codingtest.programmers.graph;

import java.util.ArrayList;

public class FarthestNode {

    /**
     * Programmers > 그래프 > 가장 먼 노드
     *
     * 문제 설명
     * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
     * 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 노드의 개수 n은 2 이상 20,000 이하입니다.
     * 간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
     * vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
     *
     * 입출력 예
     * n	vertex	return
     * 6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
     *
     * 입출력 예 설명
     * 예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드입니다.
     *
     * ------------------------------------------------------------------------------------
     *
     * @param n, edge
     * @return
     */

    public int solution(int n, int[][] edge) {
        ArrayList<Integer>[] path = new ArrayList[n];
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        int answer = 0;
        int[] dist = new int[n];
        dist[0] = 1;
        int max = 0;

        for(int i = 0; i < edge.length; i++) {
            int num1 = edge[i][0] - 1;
            int num2 = edge[i][1] - 1;
            if(path[num1] == null)
                path[num1] = new ArrayList<Integer>();
            if(path[num2] == null)
                path[num2] = new ArrayList<Integer>();
            path[num1].add(num2);
            path[num2].add(num1);
        } // ArrayList[]로 그래프를 구현한다.

        bfs.add(0);
        while(!bfs.isEmpty()) {
            int idx = bfs.get(0);
            bfs.remove(0);
            while(!path[idx].isEmpty()) {
                int num = path[idx].get(0);
                path[idx].remove(0);
                bfs.add(num); // 위에서 ArrayList[]로 구현한 그래프를 bfs로 탐색한다.
                if(dist[num] == 0) {
                    dist[num] = dist[idx] + 1; // 한 노드를 더 갔으니 1을 더해준다.
                    max = dist[num];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(dist[i] == max)
                answer++;
        }

        return answer;
    }

}
