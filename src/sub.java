import java.util.Arrays;
import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        int PS[] = new int[arr.length];
        PS[0]= arr[0];
        //cretae a prefix sum array
        for(int i=1; i< arr.length; i++)
        {
            PS[i]= PS[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(PS));
        int mastersum=0;
        for(int start =0; start <arr.length; start++)
        {
            int sum =0;
            for(int end= start; end <arr.length; end++)
            {
                if(start==0)
                {
                    sum = PS[end];
                }
                else
                sum = PS[end]- PS[start-1];
                System.out.println("sum  "+ sum);
                mastersum += sum;
            }
            System.out.println();
        }
        System.out.println(mastersum);
    }
}
