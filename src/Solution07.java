import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int product=1;
        for(int i=1;i<=10;i++){
            product=n*i;
            System.out.println(n+" x "+i+" = "+product );
        }
        bufferedReader.close();
    }
}
