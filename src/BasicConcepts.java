import java.util.Arrays;
import javax.swing.JOptionPane;

public class BasicConcepts {
    // 🟢 Level 1: Basic Operations
    public static void main(String[] args) {
        // One Line Comment

        /*
         * Multiline comment
         */

        // Data Types
        int i = 42;
        double d = 3.1415; // 5/2. = 2.5 📝 Exam Warning : Integer Division
        char c = 'A'; // 📝 remember the Ascii codes: 32 -> ' '; 48 -> '0'; 65 ->'A'; 97 -> 'a'
        String s = "Hello, Java!";

        // Casting Examples: Demonstrates both ✅ implicit and 🔄 explicit type casting
        /* ✅ implicit casting (Easy, automatic type conversion) */
        // castIntToDouble();
        // castCharToInt();
        // castCharToString(); // exo: write it
        // castIntToString(); // easy + ""
        // castDoubleToString(); // easy + ""

        /* 🔄 explicit type conversion (Narrowing or function needed) */
        // castIntToChar(); // (char)
        // castDoubleToInt(); // (double)
        // castStringToInt(); // Integer.parseInt
        // castStringToDouble(); // Double.parseDouble

        // 📥 Input and Output Examples 📤: the easiest way to handle input
        // and show an output in Java:
        getInputOutput();

        // 💬 Essential String Methods
        // stringMethodsDemo();
    }

    // ✅ Function to cast int to double
    static void castIntToDouble() {
        int intValue = 42;
        double doubleValue = intValue; // Automatic type conversion (implicit casting)
        System.out.println("int to double: " + doubleValue);
    }

    // 🔄 Function to cast double to int
    static void castDoubleToInt() {
        double doubleValue2 = 3.1415;
        int intValue2 = (int) doubleValue2; // Narrowing cast from double to int (explicit casting)
        System.out.println("double to int: " + intValue2);
    }

    // ✅ Function to cast char to int
    static void castCharToInt() {
        char charValue = 'A';
        int intValue3 = charValue;
        System.out.println("char to int: " + intValue3);
    }

    // 🔄 Function to cast int to char
    static void castIntToChar() {
        int intValue4 = 65;
        char charValue2 = (char) intValue4;
        System.out.println("int to char: " + charValue2);
    }

    // ✅ Function to cast int to String
    static void castIntToString() {
        int intValue6 = 456;
        System.out.println("int to String: " + intValue6);
    }

    // 🔄 Function to cast String to int
    static void castStringToInt() {
        String str1 = "123";
        int intValue5 = Integer.parseInt(str1);
        System.out.println("String to int: " + intValue5);
    }

    // 🔄 Function to cast String to double
    static void castStringToDouble() {
        String str4 = "3.1415";
        double doubleValue4 = Double.parseDouble(str4);
        System.out.println("String to double: " + doubleValue4);
    }

    // ✅ Function to cast double to String
    static void castDoubleToString() {
        double doubleValue3 = 3.1415;
        System.out.println("double to String: " + doubleValue3);
    }

    // 📥 Function for Input/Output
    static void getInputOutput() {
        String input = JOptionPane.showInputDialog("Enter a text");
        System.out.println("You entered: " + input);
    }

    // 💬 Function to demonstrate Essential String Methods
    static void stringMethodsDemo() {
        String sampleString = "Java is fun";
        System.out.println("Length of string: " + sampleString.length());
        System.out.println("Character at index 3: " + sampleString.charAt(3));
        System.out.println("Index of 'is': " + sampleString.indexOf("is"));
        System.out.println("Splitting: " + Arrays.toString(sampleString.split(" ")));
    }
}
