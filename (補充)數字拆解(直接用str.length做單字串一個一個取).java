import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       String str="";
       if (n==0){
           str=Integer.toString(n)+str;
       }
       while (n>=1){
           str=Integer.toString(n%10)+str;
           n/=10;
       }
       for(int i=0;i<str.length();i++){   //把拿到的字串做字串長度1個1個展開然後看幾個單字串值總和起來,當作此for的循環值
           char ch=str.charAt(i);         //把值丟到下面用char ch=str.charAt(i),把你現在的i位於的str的位置值的單字串值取過來,那因為前面
           System.out.print(ch+" ");      //是char所以符合單字串的規則!之後丟給ch 之後再丟到print裡列印,在底標返回取下一個值,以此類推
       }
       System.out.println();
    }
}
/*
題目:(補充)數字拆解(用str.length直接單字串分解)
補充:char ch=str.charAt(i)->這行也可以直接去掉,然後print括號裡直接改成print(str.charAt(i));,直接針對此str值取i位置值的單字串值,然後
    列印,而這兩者差別在於,前者是針對此str值取i位置值的單字串值然後再丟給char ch汰舊換新,後者是直接針對此str值取i位置值的單字串值做列印!

A:(1.) 00   (2.) 10  (3.)010   (4.)0   (5.)139    (6.)128917178           (7.)4396
    A:0       A:1 0    A:1 0     A:0     A:1 3 9    A:1 2 8 9 1 7 1 7 8     A:4 3 9 6
這題也適用用void函數去做!    
 */
