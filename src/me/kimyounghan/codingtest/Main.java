package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.fullSearch.Carpet;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet();

        int[] answer = carpet
                .solution(10, 2);
        System.out.println("answer : " + answer);

    }

}
