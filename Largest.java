public class Largest{
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56};
        
        // Assume the first element is the largest
        int max = numbers[0];
        
        // Loop through the array to find a larger value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The largest number in the array is: " + max);
    
}
}