package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.heap.DiskController;
import me.kimyounghan.codingtest.programmers.heap.MoreSpicy;

public class Main {

    public static void main(String[] args) {

        DiskController diskController = new DiskController();
        int solution = diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});

        System.out.println("answer : " + solution);

    }

}
