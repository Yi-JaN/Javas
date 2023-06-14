import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Sttr(str);
    }
    public static void Sttr(String strs){
        char []ch=strs.toCharArray();
        for(int i=ch.length-1;i>=0;i--){        //拿到的字串做反向操作,因為[]ch開頭一定是要0,所以反向操作時要-1,然後補i>0 ->"i>=0"
            if (Character.isUpperCase(ch[i])){    //從最後一個值開始取循環到for迴圈跑完
                ch[i]=Character.toLowerCase(ch[i]);
            }else if(Character.isLowerCase(ch[i])){
                ch[i]=Character.toUpperCase(ch[i]);
            }else {
                ch[i]=ch[i];
            }
            System.out.print(ch[i]);     //在for迴圈底邊用print(ch[i])然後每完成的值往下丟進去print列印(反向開始時取到for迴圈跑完)
        }
        System.out.println();    //最後跑完 上方的print(ch[i])也一個一個值取完,最後在設一個println();在這做"換行字元"
    }
}
/*
題目:(函數)輸入一個str在函數裡丟給[]ch做由後往前取字串列印出來(由後往前取時邊取邊轉大小寫!)
A:(1.)aVcX1*A   (2.)!Bcw #WCa!    (3.)Asia3UniveRtY
    A:a*1xCvA      A:!Acw# WCb!     A:yTrEVINu3AISa
 */
