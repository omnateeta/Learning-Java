public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = args.length; // Corrected 'arg' to 'args'
            int b = 42 / a; // This will throw ArithmeticException if a is 0
            System.out.print("a=" + a);
            
            try {
                int[] c = new int[3]; // Corrected array declaration and size
                c[1] = 10; // This is now correct, since c[1] is within bounds
                c[2] = 100; // This is now correct within the bounds as well
            } catch (ArrayIndexOutOfBoundsException e) { // Fixed the exception class name
                System.out.println("Out of Index: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide By Zero: " + e); // Fixed output message format
        } catch (ArrayIndexOutOfBoundsException e) { // This wouldn't be reached in this context
            System.out.println("Caught Out of Index: " + e);
        } catch (Exception e) { // Generic exception handler for any other exceptions
            System.out.println("An error occurred: " + e);
        }
    }
}
