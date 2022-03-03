import java.util.Scanner;
public class sum {
        public static long subarraySum(int[] A) {
            long sum =0;
            for(int i=0; i<A.length; i++)
            {
                sum+= (A.length-i)*(i+1)*A[i];
            }
            return sum;
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
        long x = subarraySum(a);
        System.out.println(x);

    }
}
