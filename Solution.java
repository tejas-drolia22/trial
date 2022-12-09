package dp;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long ar[] = new long[n];
        for(int i = 0;i<ar.length;i++)
        {
            ar[i] = sc.nextLong();
        }
        
        long min = Integer.MAX_VALUE;
        for(long i:ar)
        {
            long temp = t%i;
            if(temp==0)
            min = Math.min(min, 0);
            min = Math.min(min, i-temp);
        }
        System.out.println(min);
        

    }

}