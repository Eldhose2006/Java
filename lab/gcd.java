import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        int num1,num2;
        int i=1;
        int gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1=sc.nextInt();
        System.out.println("enter the second number: ");
        num2=sc.nextInt();
        while(i<=num1 && i<=num2){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;
        }
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
    
}
