package main.java;
import java.util.Scanner;
public class apples {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many baskets of apples have you picked?: ");
        
        int picked = scan.nextInt();
        
        if(picked < 10){
            double total = picked * 5.0;
            System.out.println("Your total is: $" + total);
        }
        if(picked >= 10 && picked <= 39){
            double total = picked * 4.5;
            System.out.println("Your total is: $" + total);
        }
        if(picked >= 40 && picked <= 59){
            double total = picked * 4.0;
            System.out.println("Your total is: $" + total);
        }
        if(picked >= 60){
            double total = picked * 3.5;
            System.out.println("Your total is: $" + total);
        }

    }
    
}