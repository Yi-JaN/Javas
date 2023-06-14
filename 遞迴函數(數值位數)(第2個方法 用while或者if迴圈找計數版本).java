import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        ofdigits(n,count);
        System.out.print(ofdigits(n,count));
        System.out.println();
    }
    public static long ofdigits(int x,int counts){
        while (x>=1){
            counts++;
            x=x/10;
            return ofdigits(x,counts);
        }
        return counts ;
    }
}
/*
題目:遞迴函數:數值函數(第2個方法 用while迴圈版本)
A:
(1.)  220      4395    100678
      3        4       6

 說明:說明詳請請去模三資料夾裡的 遞迴函數 數值函數(用str字串轉成int值找計數).java檔
 其實你下面遞迴函數的while (x>=1){ 這部份也可以改成 if (x>=1){
                                              count++;
                                              x=x/10;
                                              return ofdigits(x,counts);
                                             }else {
                                              return counts ;
                                             }
 */

