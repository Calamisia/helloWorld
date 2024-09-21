import java.util.Scanner;

public class one_Numbers {
    public static void main(String[] args) {
        //create scanner and output string
        Scanner reader = new Scanner(System.in);
        String digits = "";
        //take input
        System.out.print("Please input a string: ");
        String input = reader.nextLine();
        //add digits to output string
        for (int i = 0; i < input.length(); i++){
            if (Character.isDigit(input.charAt(i)))
                digits += input.charAt(i);
        }
        //print the output
        System.out.println(digits);
    }
}