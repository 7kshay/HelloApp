/**
 * HelloApp.java - A simple Java application that Displays "Hello, World!" to
 * the console with a Command-Line Argument or Default Message.
 *
 * This is the third step in the HelloApp journey, where we enhance UC2 by
 * adding a default value of "World" when no command-line argument is provided.
 * The application uses a ternary operator to assign the name based on argument
 * availability, making the program more robust and user-friendly.
 *
 * @author 7kshay
 * @version 3.0
 */

/**
 * Key Java Concepts Used:
 * 1. Default Values - Fallback value "World" when no input is given
 * 2. Command-Line Arguments - Accessing user input via args[] parameter
 * 3. Ternary Operator - Concise way to assign values based on a condition
 * 4. Array Length - Checking number of command-line arguments
 * 5. String Concatenation - Using + operator to combine strings
 */

public class HelloApp {
    public static void main(String[] args) {

        // Use ternary operator to assign name based on argument availability
        String name = (args.length > 0) ? args[0] : "World";

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
```

**Output:**
```
java HelloApp Alice  →  Hello, Alice!
java HelloApp       →  Hello, World!