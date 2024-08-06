package lecture_7;

import java.util.*;

// make a function to multiply 2 numbers and return their product

public class FunctionsThree {

    public static int calculateProduct(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println("Product is " + product);
        
    }
    
}
