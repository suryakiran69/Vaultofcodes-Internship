package Valuteofcodes;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        try {return a / b; }   //Exception occurs here 
        catch(ArithmeticException e){
            System.out.println("Enter the corretc value of b ");
            return -1;
        }
    }
    
}
