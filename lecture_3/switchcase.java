package lecture_3;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}