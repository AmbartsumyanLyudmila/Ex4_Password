package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пароль");
        String n = scan.nextLine();
        System.out.println("Мой пароль: " + n);
        String p="qwerty123";
        if (n.equals(p)){
            System.out.println("Пароли равны");
        } else {
            System.out.println("Пароли разные");
        }
    }
}
