package classwork;
import java.util.Scanner;
public class abc{
    public static void main(String[] args){
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        System.out.println("Welcome to the number guessing game!");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter a number: ");
            usernumber=sc.nextInt();
            if(usernumber==mynumber){
                System.out.println("woohoo! your guess is correct!");
            }
            else if(usernumber>mynumber){
                System.out.println("your guess is large, try again");
            }
            else{
                    System.out.println("your number is small, try again");
                }
            

        }while(usernumber!=mynumber);
    }
}