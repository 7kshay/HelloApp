/**
 * HelloApp.java - A simple Java application that Displays "Hello, World!" to
 * the console with a Command-Line Argument.
 *
 * This is the second step in the HelloApp journey, where we enhance the basic
 * "Hello, World!" program by accepting a command-line argument to personalize
 * the greeting. The application reads the name from the args[0] parameter and
 * displays "Hello, Name!" to the console. If no argument is provided, it
 * defaults to displaying "Hello, World!".
 *
 * @author 7kshay
 * @version 2.0
 */

/**
 * Key Java Concepts Used:
 * 1. Command-Line Arguments - Parameters passed to the program at execution
 * 2. Array Length - args.length to check number of arguments
 * 3. Array Indexing - args[0] to access first argument
 * 4. String Concatenation - Using + operator to combine strings
 * 5. Conditional Logic - if-else to handle different cases
 */

public class HelloApp {
    public static void main(String[] args) {

        // Check if a command-line argument is provided
        if (args.length > 0) {
            // Use the first argument as the name
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default to "Hello, World!" if no argument is provided
            System.out.println("Hello, World!");
        }
    }
}
```

**Output:**
```
java HelloApp Alice  →  Hello, Alice!
java HelloApp       →  Hello, World!