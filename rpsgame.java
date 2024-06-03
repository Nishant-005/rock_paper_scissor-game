// making a rock paper scissor game

import java.util.*;
public class rpsgame {
    //making main fuction for game
    static int rpsgame(int no){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int unique=rand.nextInt(0,4);
        int val=5;
        if(unique==no){
            val=0;
        }
        else if(unique==2 && no==1){
            val=1;
        }
        else if(unique==3 && no==1){
            val=2;
        }
        else if(unique==3 && no==2){
            val=1;
        }
        else if(unique==1 && no==2){
            val=2; 
        }
        else if(unique==1 && no==3){
            val=1;
        }
        else if(unique==2 && no==3){
            val=2;
        }
        else{
            val=55;
        }
        return val;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome! To Rock Paper & Scissor Game");
        int counter=1;
        while(counter==1){
        System.out.println("Type::\n1.For rock\n2.For scissor\n3.For paper\n");
        int choice=sc.nextInt();
        int val=rpsgame(choice);
        if(val==0){
            System.out.println("Its a draw!!");
        }
        else if(val==1){
            System.out.println("YOu Wins!!");
        }
        else if(val==2){
            System.out.println("You Lose!!");
        }
        else{
            System.out.println("You entered the wrong value");
        }
        System.out.println("Do you want To play again\n1.For YEs\n2.For No");
        int ch=sc.nextInt();
        if(ch==1){
            counter=1;
        }else{
            counter=0;
            System.out.println("Thankyou for playing  the game!!");
        }
        }
    }
}
