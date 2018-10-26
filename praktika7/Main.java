package com.company;
import java.lang.String;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int play(String[] f, String[] s){
        int i = 0;
        int cardNumbF = 5;
        int cardNumbS = 5;
        Queue < Integer > first = new LinkedList < Integer > ();
        Queue < Integer > second = new LinkedList < Integer > ();
        for (int k = 0; k < 5; k++){
            first.add( Integer.parseInt(f[k]) );
            second.add( Integer.parseInt(s[k]) );
        }
        while (i <= 106) {
            i++;
            System.out.println(first);
            System.out.println(second);
            System.out.println("------------------------------");
            int fCard = first.poll();
            int sCard = second.poll();
            if (fCard == 0 && sCard == 9){
                first.add(fCard);
                first.add(sCard);
                cardNumbF++;
                cardNumbS--;
            }
            else if (fCard == 9 && sCard == 0){
                second.add(fCard);
                second.add(sCard);
                cardNumbF--;
                cardNumbS++;
            }
            else if ( fCard > sCard ) {
                first.add(fCard);
                first.add(sCard);
                cardNumbF++;
                cardNumbS--;
            }
            else if ( sCard > fCard ) {
                second.add(fCard);
                second.add(sCard);
                cardNumbF--;
                cardNumbS++;
            }
            if (cardNumbF == 0){
                System.out.println("Игрок №1 "+ i);
                return 0;
            }
            else if (cardNumbS == 0){
                System.out.println("Игрок №2 "+ i);
                return 0;
            }
        }
        System.out.println("БОТВА");
        return -1;
    }
    public static void main(String[] args) {
        String[] f = new String[5];
        f[0] = "6"; f[1] = "2"; f[2] = "3"; f[3] = "9"; f[4]= "1";
        String[] s = new String[5];
        s[0] = "4"; s[1] = "7"; s[2] = "0"; s[3] = "8"; s[4]= "5";
        play (f, s);
    }
}