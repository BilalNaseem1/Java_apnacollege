# 7. Functions & Methods

syntax of a function:
```java
returnType functionName(type arg1, type arg2) {
    //operations
}
```

- `void` is also a return type - which means no return
- `public static void main` is also a function. `void` is the return type of that function (part of the main function).

### Question
Print a given name in a function
```java
package lecture_7;

import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        printMyName(name);
    }
}
```

## What happens in memory
- In memory functions are stored in form of stack.
- One stack is called stack frame.
- When the main function is made - the first stack made is of the main function. All variables of main function are stored here. This stack calls other stacks. 