public class PrimeNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }}
            if (isPrime) {
                System.out.print(num + " ");
            }}
    }
        
    }