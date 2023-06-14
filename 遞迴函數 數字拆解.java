import java.util.Scanner;

public class Main {  //JAVA遞迴由上至下循環

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); //設1個n
        String str="";       //跟一個空的str字串
        System.out.println(answer(n,str)); //丟入名稱answer(n,str1)並且去下方開始遞迴,遞迴到不能再丟下去遞迴為止
    }
    public static String answer(int n,String str){ //這邊因為重點著重於string str 所以遞迴這邊是放String,把answer東西帶來這邊
        if(n==0) {    //第一行這邊 如果n是0進入
            if(str!=""){  //進入後假設剛剛有遞迴,那就str不等於空的字串值,就丟進去並且直接return不下函數名稱str
                return str;  //就直接丟回去,那因為回來沒下函數名稱,所以str回去後不得再丟入遞迴函數裡!
            }else { //str是空的就丟這邊,並且直接n丟進去轉int變string給str然後再+" "
                str=Integer.toString(n)+" ";
                return str;   //OK之後直接return str,一樣這邊沒下函數名稱,所以丟回去,不會再丟進遞迴函數
            }
        }else { //如果n有值丟這
            str=Integer.toString(n%10)+" "+str; //str一次一次n%10取,取值轉string後再" "1格,之後加目前的str之後丟到前面汰舊換新
            n=n/10;               //每一次n%10取完值後,來到下方這取商數,之後再return再下函數名稱,把目前除完的n值跟汰舊換新OK的str字串值
            return answer(n,str); //丟進去,之後返回到上方,那這邊有下函數名稱,所以會再2個值再丟入遞迴函數裡!
        }
    }
}
/*
題目:遞迴函數:數字拆解
EX: n->15 str->""  遞迴前: n=15 str1="" 遞迴後 n=1 str=..toString(n%10)+" "+str -> str="5 "+str -> str=("5 ")
遞迴前 n=1 str1="5 "  遞迴後 n=0 str("5 ")=..toString(n%10)+" "+str("5 ") -> str("5 ")="1 "+str("5 ") ->str=("1 5 ")
遞迴前 n=0 str("1 5 ") 之後 str!="" 直接return str 所以A:"1 5 " 結束!


(1.)0    (2.)15        (3.)128987871
  A:0      A:1 5         A:1 2 8 9 8 7 8 7 1
 */