public class strong {

    // Function to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is strong
    public static boolean isStrong(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sumOfFactorials += factorial(digit); // Add factorial of the digit to sum
            temp /= 10; // Remove the last digit
        }
        return sumOfFactorials == originalNumber; // Check if sum equals the original number
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers from 1 to 5000 are:");
        for (int i = 1; i <= 500; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
