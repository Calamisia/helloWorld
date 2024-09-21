import java.util.Scanner;

public class five_Fibonacci {

    public static void main(String[] args) {
        //get the input
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        //the output is the value of the fibonacci method
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        //a recursive method, if the value is 0 or 1, return that
        if (n == 0 || n == 1) {
            return n;
        }
        //if not, call the method again with the two precedicing numbers in the fibonacci sequence
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}