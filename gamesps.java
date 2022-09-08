package com.company;
import java.util.Random;
import java.util.Scanner;
;
public class gamesps {
    public static void main(String[] args){
        int i =0;
        while(i<=5) {



            System.out.println("value 1-> means stone");
            System.out.println("value 2-> means paper");
            System.out.println("value 3-> means scissor\n");



            System.out.println("your turn\n");
            Scanner sc = new Scanner(System.in);
            int user_choice = sc.nextInt();
            System.out.println("computer's turn\n");
            Random rm = new Random();
            int cmp_choice = rm.nextInt(4);

            int u = user_choice;
            int c = cmp_choice;
            System.out.println("computer choose");
            System.out.println(c);


            switch (c) {
                case 1:
                    switch (u) {
                        case 1:
                            System.out.println("match is tie.....");
                            break;
                        case 2:
                            System.out.println("congrats ! you won the match ");
                            break;
                        case 3:
                            System.out.println("computer won! Gud luck for  next match");
                            break;
                        default :
                            System.out.println("you enter a wrong choice");
                    }
                    break;
                case 2:
                    switch (u) {
                        case 1:
                            System.out.println("computer won! Gud luck for  next match");
                            break;
                        case 2:
                            System.out.println("match is tie..... ");
                            break;
                        case 3:
                            System.out.println("congrats ! you won the match");
                            break;
                        default :
                            System.out.println("you enter a wrong choice");
                    }
                    break;
                case 3:
                    switch (u) {
                        case 1:
                            System.out.println("congrats ! you won the match");
                            break;
                        case 2:
                            System.out.println("computer won! Gud luck for  next match");
                            break;
                        case 3:
                            System.out.println("match is tie..... ");
                            break;
                        default :
                            System.out.println("you enter a wrong choice");
                    }
                    break;
                default:
                    System.out.println("computer enter a wrong choice ");
                    break;
            }
            i++;
        }



    }
}
