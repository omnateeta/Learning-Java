public class MultipleCatch {
    public static void main(String[] args) { // Corrected the parameter type
        try {
            int a = 0;
            int b = 42 / a; // This will throw ArithmeticException because a is zero
            int c[] = {1};
            c[3] = 99; // This will throw ArrayIndexOutOfBoundsException because the array size is 1
        } catch (ArithmeticException e) { // Fixed the spelling of 'ArithmeticException'
            System.out.println("Divided By Zero error: " + e); // Added a space for better readability
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index: " + e); // Added a space for better readability
        } finally {
            System.out.println("All are handled");
        }
    }
}
