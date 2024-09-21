import java.util.Scanner;

public class eight_HowManyIPs {
    public static void main(String[] args) {
        //get the inputs
        Scanner reader = new Scanner(System.in).useDelimiter("\\s");
        String one = reader.next();
        String two = reader.next();
        //split into an array of strings
        String[] oneStringVals = one.split("\\.");
        String[] twoStringVals = two.split("\\.");
        int[] oneVals = new int[4];
        int[] twoVals = new int[4];
        //parse into an array of ints
        for (int i = 0; i < oneStringVals.length; i++) {
            oneVals[i] = Integer.parseInt(oneStringVals[i]);
            twoVals[i] = Integer.parseInt(twoStringVals[i]);
        }
        long difference = 0;
        //start at the last spot
        //sum += their difference
        //sum += their difference * 256
        //sum += their difference * 256^2
        for (int i = oneVals.length-1; i >= 0; i--) {
            difference += (twoVals[i] - oneVals[i])*Math.pow(256,(oneVals.length-1-i));
        }
        //print the output
        System.out.println(difference);
    }
}