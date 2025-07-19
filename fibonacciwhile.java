import java.util.Scanner;
public class fibonacciwhile {
    public static void main(String[] args){
        int a=0,b=1;
        int i=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:   ");
        int limit=sc.nextInt();
        System.out.println("Fibonacci series: ");
        while(i<=limit){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }

    }
    
}
/*Author:Eldhose Abraham Emerson
 * Date:17-7-2025
 */
