package by.cdptr.javabasics.l3_4;

import java.util.Scanner;

public class NatChislo {

    public static void main(String[] args) {

        int number = enterNumber();

        System.out.println(solution(number));

    }

    static int enterNumber() {

        Scanner sc = new Scanner(System.in);

        int a = 0;

        System.out.print("Введите число: ");

        if (sc.hasNextInt()) {

            a = sc.nextInt();

        }

        return a;
    }

    static String solution(int b) {

        String String1 = "";

        while (b != 0){

            int digit = b % 10;

            if (digit % 2 != 0) {

                String1 = "В числе нет четных цифр";

            } else {

                String1 = "В числе есть четная цифра";
                break;

            }

            b = b / 10;

        }

        return String1;
    }

}

