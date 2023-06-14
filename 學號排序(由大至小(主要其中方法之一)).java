import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);                 //把取好的arr全部的值丟給sort做遞增排序!
       for(int j=arr.length-1;j>=0;j--){   //此for迴圈反向取值,代表我每拉一個數都是由大至小排序,開頭值一定為0,所以要"j>=0"!
           System.out.println(arr[j]);     //一邊放一邊排序(由大至小)因為做到這邊已經接觸sort了,所以要遞增排序!
       }
    }
}
/*
題目: 學號排序(由大至小)
A: (1.) 4                                            (2.) 3
       105031120 103118481 107021177 108092124          101021160 99874911 105118779
     A:108092124                                      A:105118779
       107021177                                        101021160
       105031120                                        99874911
       103118481
 */
