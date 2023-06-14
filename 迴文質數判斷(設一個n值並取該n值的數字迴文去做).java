import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();            //輸入一個正整數
        String str=Integer.toString(n);   //然後把該n值借值進去int->string轉給str,str也拿到一模一樣的值,本體是string(字串)!
        String str2="";                    //輸入一個str2 待會拿來轉str的數字字串迴文用的
        int count=0;                     //最後判斷該值的迴文值是否為質數用的!
        for(int i=str.length();i>0;i--){      //把我拿到一模一樣的值(str)丟進for迴圈,並且以反向操作,取迴文值
            char ch=str.charAt(i-1);          //裡面第一行先設一個char ch,讓他該i值位於的單字串(str)丟進去判斷因為是反向取所以要(i-1)
            str2+=ch;                         //之後往下第二行用str2去+我的ch,+完後底標返回for迴圈繼續取下一個值,以此類推迴圈做法!
        }
        int ok=Integer.parseInt(str2);      //上方for迴圈OK後,把我str2字串丟給下方產生的int ok 並且用Integer.parseInt(str2)
        System.out.println("該值迴文為: "+ok);   //意思是說把該str2(字串)丟進去轉"int"值給ok,讓ok拿到跟str2一模一樣的值,不過本體是int
        int v=1;                           //之後列印該值迴文,然後下方就是做質數判斷,也就是int v=1;這行開始
        while (v<=ok){                    //用while迴圈 (v<=ok) <-意思是先從1開始一直v++到我ok的值,直到超過,而當超過這while就OK了
            if(ok%v==0){                   //ok之後這while迴圈就結束了
                count++;
            }
            v++;
        }
        if(count==2){                  //結束之後取我這該值的迴文數字的count 是否為2 (2的意思就是1跟數字自己本身可以整除)
            System.out.println("該值是否為質數: "+"YES");       //2的話就是YES
        }else {                                            //只要不是count==2 ,一律往這行丟else
            System.out.println("該值是否為質數: "+"NO");      //並且顯示NO!
        }
    }
}
/*
題目: 迴文質數(輸入一個n值,反向取該n值迴文)
A: 1.0      2. 93    3.313   4. 71      5. 61
   A: 0        39      313      17         16
      NO       NO      YES      YES        NO
 */
