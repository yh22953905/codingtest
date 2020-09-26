package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.hash.Camouflage;

public class Main {

    public static void main(String[] args) {

        Camouflage developFuntion = new Camouflage();

        int answer = developFuntion
                .solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});

        System.out.println("answer : " + answer);

    }

}
