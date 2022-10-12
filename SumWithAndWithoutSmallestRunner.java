import java.util.Scanner;
public class SumWithAndWithoutSmallestRunner {
    public static void main(String[] args) {
        int l;
        Scanner in = new Scanner(System.in);
        l=in.nextInt();
        int[] array = new int[l];
        for(int i=0;i<l;i++)
        {
            array[i]=in.nextInt();
        }

        SumWithoutSmalllest ob = new SumWithoutSmalllest(array,l);
        ob.getDifference();
    }
}