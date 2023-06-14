import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Double m=scn.nextDouble(); //輸入一個double值
        int n=scn.nextInt(); //輸入一個n值,做小數點第n位進位
        String str="%."+Integer.toString(n)+"f\n"; //這行下方補充有講解
        System.out.format(str,m); //然後"format"意思是轉換值的意思,是可以拿來做4捨5入,這行意思是針對該m值做小數點第n位進位,然後str就是
    }                             //你的"%.(n)f\n"意思
}
/*
題目:四捨五入到小數點第n位(方法2)
補充:String str="%."+Integer.toString(n)+"f\n"意思->比方說我n輸入2,然後丟到str裡,就變成這樣->"%."+Integer.toString(2)+"f\n",2轉
                                                  成字串後+起來變成->"%.2f\n",所以我的str變成"%.2f\n",如同format("%.2f\n",m);
                                                  裡的"%.2f\n"一樣,所以如果要4捨5入到小數點第n位也可以這樣!

輸入如下:
(1.)3.14152 3    (2.)3.14149 3    (3.)0.78 1   (4.)0.51 0
  A:3.142          A:3.141          A:0.8        A:1
 */
