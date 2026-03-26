/**
 * HelloApp.java - UC5: Display "Hello" with Multiple Command-Line Arguments
 * using Enhanced For Loop or Default Message.
 *
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For
 * Loop or Default Message - The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * an enhanced for loop. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the
 *   console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author 7kshay
 * @version 5.0
 * @since UC1
 */

// Key Concepts for HelloApp UC5:
// 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
// 2. Array Iteration: Using enhanced for loop to traverse all arguments
// 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
// 4. StringBuilder: Efficiently building a string in a loop without creating multiple
//    immutable string objects
// 5. Default Values: Providing a fallback when no arguments are provided
// 6. String Concatenation: Building the final greeting message

// Sample Code for HelloApp UC5:
// StringBuilder nameBuilder = new StringBuilder();
// boolean first = true;
// for (String name : args) {
//     if (!first) {
//         nameBuilder.append(", ");
//     }
//     nameBuilder.append(name);
//     first = false;
// }

public class HelloApp {
    public static void main(String[] args) {

        // Declare name variable
        String name;

        // Check if command-line arguments are provided
        if (args.length == 0) {
            // Default to "World" if no arguments are provided
            name = "World";
        } else {
            // Use StringBuilder to efficiently build the names string
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Use enhanced for loop to iterate through all arguments
            for (String arg : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                first = false;
            }
            name = nameBuilder.toString();
        }

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
```

**Output:**
```
java HelloApp                    →  Hello, World!
java HelloApp Alice              →  Hello, Alice!
java HelloApp Alice Bob Charlie  →  Hello, Alice, Bob, Charlie!