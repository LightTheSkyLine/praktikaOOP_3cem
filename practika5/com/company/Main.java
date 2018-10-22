package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);

        System.out.print("Введите целое число:");

        int input = Reader.nextInt();

        input = SummNumberDigits(input);

        System.out.println("Сумма цифр числа:"+input);

        Reader.close();

    }

    public static int SummNumberDigits(int num)

    {

        if (num/10==0)

            return num;

        return num%10+SummNumberDigits(num/10);

    }
    }

