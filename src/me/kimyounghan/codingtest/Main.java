package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.programmers.hash.BestAlbum;

public class Main {

    public static void main(String[] args) {

        BestAlbum bestAlbum = new BestAlbum();

        int[] answer = bestAlbum
                .solution(new String[]{"classic", "pop", "classic", "rock", "rock", "classic", "pop", "pop", "pop"}, new int[]{2,2,2,2,2,2,2,2,2});

        System.out.println("answer : " + answer);

    }

}
