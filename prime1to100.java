import java.util.Scanner;
public class prime1to100 {
    public static void main(String[] args){
        System.out.println("Prime numbers between 1 and 100 are: ");
        for(int num = 2; num <= 100; num++) {
            int isPrime = 1;
            for(int i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if(isPrime==1) {
                System.out.println(num);
            }
        }
    }
}
