import java.util.Arrays;

public class Loop {

    // 🟡 Level 2 Topics (functions, loops, exceptions, arrays)
    public static void main(String[] args) {
        // functions

        // 🔁 Loops
        // forLoop();
        // loopThroughArray();
        // forEachLoop(); // fancy, not necessary, but sometimes shorter
        // whileLoop();
        // doWhileLoop(); // forget it, only makes code shorter sometimes
        // breakDemo(); // 🐸 break jumps out of the loops (while, do while, for ... If
        // 🐸 is not a loop)

        // 📊 How to copy Arrays?
        // copyArray();

        // 🔴 Exception Handling
        // exceptionDemo();

    }

    // 🔁 The basic for loop

    public static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }

    // 🔁 Most important array - for loop skill
    public static void loopThroughArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) { // 📝 Exam Warning : arr.length vs s.length() (look for the parenthesis)
            System.out.println("Array element: " + arr[i]);
        }
    }

    // 🔁 A fancy way to loop through an Array (but you can always use the above
    // version)
    public static void forEachLoop() {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int num : arr) {
            System.out.println("Array element: " + num);
        }
    }

    // 🔁 While
    public static void whileLoop() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }
    }

    // 🔁 do While - you can forget about it
    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5); // 📝 Exam Warning : if you use it, don't forget the semicolon
    }

    public static void breakDemo() {
        for (int i = 1; i <= 10; i++) { // 2)🐸 It jumps out of this for loop
            System.out.println("Iteration " + i);

            if (i == 5) {
                System.out.println("Encountered 5, breaking out of loop");
                break; // 1)🐸 Breaks out of the loop when i is equal to 5
            }

            System.out.println("This is outside the if condition");

        }

        System.out.println("Loop finished"); // 3)🐸 And lands here 😃
    }

    // 🔴 Exception Handling
    public static void exceptionDemo() {
        try {
            int result = 5 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // throw new ArithmeticException("The issue is division by zero");
    }

    // 📊 How to copy Arrays?
    public static void copyArray() {
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
