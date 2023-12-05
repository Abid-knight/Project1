package Project1;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please insert a number");
        int number= sc.nextInt();

        if (number/1==number && number/number==1) {
            System.out.println("number " + number + " is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
