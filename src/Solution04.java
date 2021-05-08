import java.util.Scanner;

public class Solution04 {
    private static final Scanner scanner = new Scanner(System.in);


    /*If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird

     */
    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N>=20){
            System.out.println("Not Weird");
        }else if(N>6 || N<20){
            System.out.println("Weird");
        }else if(N>2 || N<=5){
            System.out.println("Not Weird");
        }else {
            System.out.println("Yanlis rakam girdiniz");
        }

        scanner.close();
    }
}
