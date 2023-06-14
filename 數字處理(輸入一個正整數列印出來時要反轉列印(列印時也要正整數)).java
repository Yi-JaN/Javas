import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();       //先輸入一個n值
        String str=Integer.toString(n);  //再把我n值轉int -> str<-給他
        String str2="";                 //輸入一個str2待會用(要接反轉值的)
        for(int i=str.length();i>0;i--){   //拿到的str反向操作
            char ch=str.charAt(i-1);     //取單i值得單字串先做str.charAt,之後因為是char再轉回"字元"丟給ch
            str2+=ch;                    //ch拿到的值丟給str2去加 ,之後底標返回for迴圈i--, 以此類推"上述動作"!
        }
       int ok=Integer.parseInt(str2);  //for迴圈搞定之後往下來到int ok=Integer.parseInt(str2)<-把反向值str2丟給int ok讓他變正整數
        System.out.println(ok);       //給完後ok取到str轉int值的值,之後來到往下println(ok);,即可呈現
    }
}
/*
Integer.parseInt()<- 意思是Integer的物件包,然後str丟到()裡,用parseInt轉正整數  str->int
題目:數字處理(把輸入的數字反轉列印呈現出來)
要求:輸入是正整數,最後列印輸出呈現也要正整數!
觀念:轉變為正整數,正整數開頭不能為0,如果str2轉給int那假設有反轉值開頭是0,正整數會自動省略開頭是0
A:(1.)1289546  (2.) 3456    (3.) 10
   A: 6459821    A: 6543      A: 1 (把反轉值丟給int,之後輸出不能是01,因為int正整數開頭沒有再為0)
 */
