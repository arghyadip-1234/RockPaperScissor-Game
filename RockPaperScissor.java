package com.ProjectJava.Test;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");
        int computer_choice;
        int computerwon=0;
        int my_choice;
        int me=0;
        int game=1;

        while(game<=5) {
            Random rand = new Random();
            computer_choice= rand.nextInt(2);
            my_choice=sc.nextInt();
            switch(my_choice){
                case 0:
                    System.out.println("i choose Rock");
                    break;
                case 1:
                    System.out.println("i choose Paper");
                    break;
                case 2:
                    System.out.println("i choose Scissor");
                    break;
            }
            switch (computer_choice){
                case 0:
                    System.out.println("computer choose Rock");
                    break;
                case 1:
                    System.out.println("computer choose Paper");
                    break;
                case 2:
                    System.out.println("computer choose Scissor");
                    break;
            }
            if (computer_choice==my_choice){
                System.out.println("match was tie");
            }
            else if (computer_choice==0 && my_choice==1){
                System.out.println("i won");
                me++;
            }
            else if (computer_choice==0 && my_choice==2){
                System.out.println("computer won");
                computerwon++;
            }
            else if (computer_choice==1 && my_choice==0 ){
                System.out.println("computer won");
                computerwon++;
            }
            else if(computer_choice==1 && my_choice==2){
                System.out.println("i won");
                me++;
            }
            else if (computer_choice==2 && my_choice==0){
                System.out.println("i won");
                me++;
            }
            else if (computer_choice==2 && my_choice==1){
                System.out.println("computer won");
                computerwon++;
            }
            if (game==5){
                break;
            }
            game++;
        }
        System.out.println("-------------------------------");
        System.out.println("computer"+" :"+ computerwon);
        System.out.println("me"+" :"+ me);
        System.out.println("-------------------------------");
        if (computerwon>me){
            System.out.println("computer Won the game ");
        }
        else if (computerwon==me){
            System.out.println("match tie");
        }
        else{
            System.out.println("i won the game and computer need more practice!!!");
        }





    }
}
