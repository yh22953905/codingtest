package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.binarysearch.Budget;

public class Main {

    public static void main(String[] args) {

        Budget budget = new Budget();

        int answer = budget.solution(new int[]{120, 110, 140, 150},485);

        System.out.println("answer : " + answer);

    }

}
