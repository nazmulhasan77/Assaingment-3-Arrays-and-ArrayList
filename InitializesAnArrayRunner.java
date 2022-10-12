import java.util.Scanner;
import java.util.Arrays;

public class InitializesAnArrayRunner {
    public static void main(String[] args) {
        final int LENGTH=10;
        int[] arr = new int[LENGTH];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<LENGTH;i++)
        {
            arr[i]=in.nextInt();
        }
        InitializesAnArray ob = new InitializesAnArray(arr,LENGTH);
        ob.evenIndex();
        ob.evenElement();
        ob.reverseArray();
        ob.fastAndLastElement();


    }
}