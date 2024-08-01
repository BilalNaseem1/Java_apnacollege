package lecture_3;

import java.util.Scanner;

public class Conditions {
    public static void main(String args[]) {
        System.out.println("Please enter your age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
}
}