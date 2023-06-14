import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   //補充: 我也可以先在這邊下for迴圈取arr[]=scn.nextInt(); 取new int[n]值的正整數
        Scanner scn=new Scanner(System.in);    //     之後再丟到下面的void函數裡
        int n=scn.nextInt();
        int []arr=new int[n];
        sum(arr,n);
    }
    public static void sum(int []arr,int x){
        Scanner scn1=new Scanner(System.in);
        int all=0;
        for(int i=0;i<x;i++){
            arr[i]=scn1.nextInt();
        }
        Arrays.sort(arr);
       for(int j=arr.length-1;j>=0;j--){   //把我取到的x值用for迴圈反向拉值1個1個取,然後進去先把該值平方完列印,列印同時由大至小排序!
           for(int k=2;k<=2;k++){                //然後再繼續返回大for迴圈繼續拉下一個j位於的單arr值,以此類推
               all=(int)Math.pow(arr[j],k);
               System.out.print(all+" ");
           }
       }
       System.out.println();
    }
}
/*
補充:如果要列印時全部"由小到大"印出來,那sort(arr);完接下來在用for迴圈,做正向排序,例:->for(int j=0;j<arr.length;j++);
題目: 陣列平方(由大至小排序版本(void))
A:
 (1.) 4                 (2.) 6
   3 9 5 4                  10 8 7 11 6 2
 A:81 25 16 9             A:121 100 64 49 36 4
 */
