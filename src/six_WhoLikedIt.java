import java.util.Scanner;
public class six_WhoLikedIt {
    public static void main(String[] args) {
        //create scanner and get input
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        //split the string of names into an array of names
        String[] words = input.split("\\s");
        //switch case their lengths
        switch (words.length) {
            case (0) : System.out.println("No one likes this"); break;
            case (1) : System.out.println(words[0] + " likes this"); break;
            case (2) : System.out.println(words[0] + " and " + words[1] + " like this"); break;
            case (3) : System.out.println(words[0] + ", " + words[1] + " and " + words[2] + " like this"); break;
            default : System.out.println(words[0] + ", " + words[1] + " and " + (words.length-2) + " others like this");
         }
    }
}
