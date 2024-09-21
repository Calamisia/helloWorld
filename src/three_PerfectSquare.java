import java.util.Scanner;

public class three_PerfectSquare {
    public static void main(String[] args) {
        //create scanner
        Scanner reader = new Scanner(System.in);
        //take input
        double input = reader.nextInt();
        //find the sqrt of the input, return -1 if not perfect.
        int orig = (int)Math.sqrt(input);
        if (orig*orig != input)
            System.out.println(-1);
        else {
            //find the next biggest number thats a perfect square
            int next = orig + 1;
            //print the output
            System.out.print((int) Math.pow(next, 2));
        }
    }
}
