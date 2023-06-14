import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int casee=scn.nextInt();
       String str="";
       switch (casee){
           case 1:
               while (n>=1){
                   str=Integer.toString(n%6)+str;
                   n/=6;
               }
               int leng=str.length();
               for(int i=0;i<8-leng;i++){
                   str="0"+str;
               }
               System.out.println(str);
               break;
           case 2:
               while (n>=1){
                   str=Integer.toOctalString(n%8)+str;
                   n/=8;
               }
               int leng1=str.length();
               for(int j=0;j<8-leng1;j++){
                   str="0"+str;
               }
               System.out.println(str);
               break;
       }
    }
}
/*
題目:用switch-case輸入正整數十進制轉六進制或八進制(同時有兩種選擇看選哪種)
A:
  1000 1       1000  2     10000  1    10000  2
  00004344     00001750    00114144    00023420
 */
