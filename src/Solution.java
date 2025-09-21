public class Solution {
    // Determines whether the specified number is prime.
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Utility class providing a method to check for prime numbers.
    public static void main() {
        Solution s = new Solution();
        System.out.println(s.isPrime(1));
    }
}