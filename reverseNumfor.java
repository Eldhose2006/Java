import java.util.Scanner;
public class reverseNumfor {
    public static void main(String[] args){
        int num;
        int rev=0;
        int remainder;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number: ");
       num=sc.nextInt();
       for(;num!=0;num=num/10){
        remainder=num%10;
        rev=rev*10+remainder;
       }
       System.out.println("reversed number is " + rev);
        }
    }
/*Author:Eldhose Abraham Emerson
 * Date:17-7-2025
 */
