package com.company;
import java.util.Scanner;
import java.util.Random;
public class guess_number {
    public static  void main (String[] args){
        System.out.println("WELCOME");
        System.out.println("Remember you have only 20 attempts to win the game!");
        System.out.println("best of luck");
        System.out.println(" plz enter the number you guess btw 1 to 100\n");
        int i=0;
        int j =20;
        Random rm = new Random();
        int random_num = rm.nextInt(100);

        while(i<20){
            Scanner n = new Scanner(System.in);
            int num = n.nextInt();

            if(num > random_num){
                System.out.println("plz enter smaller number");
                System.out.println("try again ");
            }

            else if(num < random_num){
                System.out.println("plz enter greater number");
                System.out.println("try again ");
            }
            else {
                System.out.println("congrats ! you won... you guess correct the number");
                System.out.println("THANK YOU!!");
                break;
            }


            j--;
            System.out.print("only "); System.out.print(j); System.out.print(" attempt left\n" );

            i++;
        }


    }
}
