# Lecture 3
## Conditional Statements 
1. if, else
2. else if
3. switch
4. break

```java
if (condition) {
    <code>
} else {
    <code>
}
```

## Switch Case
If-else is more flexible and ideal for complex conditions, while switch-case is clearer and more efficient for checking multiple specific values. Use switch-case when dealing with discrete values and if-else for more complex logic or range checks.

- It is used to execute different cases based on equality
- We are testing if expression == expression_1 
```java
switch (expression) {
    case expression_1: statement(s) 
    case expression_2: statement(s) 
    case expression_3: statement(s)
    default: statement(s) 
}
```

Example:

```java
int n = 10;

switch (n) {
    case 1: System.out.println("n is equal to 1)
}
```