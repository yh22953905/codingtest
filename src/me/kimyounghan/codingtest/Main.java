package me.kimyounghan.codingtest;

import me.kimyounghan.codingtest.programmers.hash.APlayerWhoCouldNotFinish;
import me.kimyounghan.codingtest.programmers.sort.LargestNumber;

public class Main {

    public static void main(String[] args) {

        APlayerWhoCouldNotFinish aPlayerWhoCouldNotFinish = new APlayerWhoCouldNotFinish();

        String answer = aPlayerWhoCouldNotFinish
                .solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});

        System.out.println("answer : " + answer);

    }

}
