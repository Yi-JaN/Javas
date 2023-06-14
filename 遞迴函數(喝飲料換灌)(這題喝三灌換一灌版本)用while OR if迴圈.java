import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int drink=0;
        sum(n,drink);
        System.out.println(sum(n,drink));
    }
    public static int sum(int nn,int drinks){
        while (nn>=3){            //不一定要用while ->這邊改成if也可以 ,改成if這行變成 if (nn>=3){ 裡面內容物都一樣
            drinks+=(nn/3)*3;
            nn=(nn/3)+(nn%3);
            return sum(nn,drinks);
        }
        drinks=drinks+nn;
        return drinks;
    }
}
/*
題目: 遞迴函數:飲料換灌(喝三換一)
A:
(1.)  10   (2.) 0   (3.)  2   (4.) 100    (5.) 5
    A:14      A:0       A:2      A:149       A:7
 */
