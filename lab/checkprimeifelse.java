import java.util.Scanner;
public class checkprimeifelse{
    public static void main(String[] args){
        int i;
        int number;
        int isPrime = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        number=sc.nextInt();
        if(number<=1){
            isPrime=0;
        }
        else{
        for(i=2;i<=number/2;i++){
            if(number%i==0){
                isPrime=0;
                break;
            }
        }
            }
            if(isPrime==1){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
    }
    /*Author:Eldhose Abraham Emerson
     * Date:17-7-2025
     */
