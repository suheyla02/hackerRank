import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        /*INPUT
        42
        3.1415
        Welcome to HackerRank's Java tutorials!
        OUTPUT
        String: Welcome to HackerRank's Java tutorials!
        Double: 3.1415
        Int: 42
         */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine();

        String s =scan.nextLine();


        // Write your code here.
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
