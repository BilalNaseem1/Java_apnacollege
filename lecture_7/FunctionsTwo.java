package lecture_7;

import java.util.Scanner;

// make a function to add 2 numbers and return their sum
public class FunctionsTwo {
    
    public static int add(int a, int b) {
        return a+b;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("Sum is " + sum);
    }
}
