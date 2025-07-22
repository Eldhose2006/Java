import java.util.Scanner;

public class factWhile{
    public static void main(String[] args){
        int fact=1;
        int num;
        int i=1;
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of the given number is " + fact);
    }
}
/*Author:Eldhose Abraham Emerson
 * Date:17-7-2025
 */