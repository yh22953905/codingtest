package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.heap.MoreSpicy;

public class Main {

    public static void main(String[] args) {

        MoreSpicy moreSpicy = new MoreSpicy();
        int solution = moreSpicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);

        System.out.println("answer : " + solution);

    }

}
