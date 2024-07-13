public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        // Using a temporary variable to swap
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

