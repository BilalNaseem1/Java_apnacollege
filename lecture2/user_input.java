package lecture2;

import java.util.*;

public class user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in); // making a new object using scanner class (new instance)

        System.out.println("Enter number 1");
        int a = sc.nextInt();
        // System.out.println("You entered " + a);

        System.out.println("Enter number 2");
        int b = sc.nextInt();

        System.out.println("Sum is " + (a + b));

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
