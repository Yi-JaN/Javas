import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);   //把arr裡的2 4 3 7丟進去sort
        for (int j:arr){    //j=arr的值,arr把2 4 3 7 這一列丟給j,讓j拿到值一個一個往下丟平方列印在由小到大排序 (此為正向排序)!
            for(int k=2;k<=2;k++){
                sum=(int)Math.pow(j,k);
                System.out.print(sum+" ");
            }
        }
        System.out.println();
    }
}
/*
題目:for each版本的陣列平方(sort由小至大)
A:
4
2 4 3 7
4 9 16 49

 */
