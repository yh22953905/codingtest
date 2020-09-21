package me.kimyounghan.codingtest;


import me.kimyounghan.codingtest.codility.kakao.Problem4;
import me.kimyounghan.codingtest.programmers.hash.PhoneBook;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        boolean answer = phoneBook.solution(new String[]{"12","123","1235","567","88"});

        System.out.println("answer : " + answer);

    }

}
