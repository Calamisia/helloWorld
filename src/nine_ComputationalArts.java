import java.util.Scanner;

public class nine_ComputationalArts {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        //for loop to swap lines
        for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print("*");
                    for (int k = 0; k < 2*(n-1)-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int k = 0; k < 2*(n-1)-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else if (i == n-1){
                    //print preceding spaces
                    for (int k = 0; k < i; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                    //print after spaces
                    for (int k = 0; k < 2*(n-1)-1; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                }
                else {
                    //print preceding spaces
                    for (int k = 0; k < i; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                    //print after spaces
                    for (int k = 0; k < 2*(n-1-i)-1; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                    //print preceding spaces
                    for (int k = 0; k < 2*(i)-1; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                    //print after spaces
                    for (int k = 0; k < 2*(n-1-i)-1; k++) {
                        System.out.print(" ");
                    }
                    //print *
                    System.out.print("*");
                }

            //go to the next line
            System.out.println("\t");
        }
    }
}

/*
print the line # of spaces, then *, then n-line# counter spaces, then star, then n-line% spaces, then *
last line has a special case where it only prints * twice
 */