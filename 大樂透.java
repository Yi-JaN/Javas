import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn1=new Scanner(System.in);
        Random scn=new Random();
        int v1=scn1.nextInt();                   //用scn1去輸入你要填的6個一般號跟1個特別號,scn跟scn1別搞錯
        int v2=scn1.nextInt();                   //scn是待會要用亂數用的東西
        int v3=scn1.nextInt();                   //scn1才是你自己要填的數字!
        int v4=scn1.nextInt();
        int v5=scn1.nextInt();
        int v6=scn1.nextInt();
        int v7spceial=scn1.nextInt();
        int count=0,countspecial=0;
        System.out.println("你的號碼為: "+v1+","+v2+","+v3+","+v4+","+v5+","+v6+" spceial "+v7spceial);
        System.out.println("本期樂透開獎號碼為: ");
        int n;
        int special;
        for(int i=0;i<6;i++){                          //這個是6個一般號碼循環,所以用for迴圈循環6次列印出6次n的亂數號碼!
            n=scn.nextInt(49)+1;                 //然後一般號對一般號,所以if迴圈只拉當初我設的6個一般號,所以6個一般號再去
            System.out.print(n+" ");                      //對我1個1個出來的亂數號碼對看相不相同!
            if(v1==n||v2==n||v3==n||v4==n||v5==n||v6==n){
                count++;
            }
        }
        System.out.println();
        System.out.println("本期樂透特別號(special): ");          //這邊開始連同下面的for迴圈是找special特別號,特別號只有1個號碼
        for(int i=0;i<1;i++){                                  //特別號只有1個號碼,所以說for迴圈只循環1次即可,那特別號只能
            special=scn.nextInt(49)+1;                   //把你當初選的特別號碼拉進if一起跟出來的亂數做判斷,因為v7spceial是特
            System.out.print("special= "+special);              //別號所以特別號就只能對特別號!
            if(v7spceial==special){
                countspecial++;
            }
        }
        System.out.println();
        System.out.println("Your count= "+count);
        System.out.println("Your special= "+countspecial);
        if(count==6  || count==6 && countspecial==1){        //這邊是你的count跟spaceial中獎兌換相關金額!
            System.out.println("頭獎");
        }else if(count==5 && countspecial==1){
            System.out.println("貳獎");
        }else if(count==5){
            System.out.println("參獎");
        }else if(count==4 && countspecial==1){
            System.out.println("肆獎");
        }else if(count==4){
            System.out.println("伍獎 NT$2000");
        }else if(count==3 &&countspecial==1){
            System.out.println("陸獎 NT$1000");
        }else if(count==2 &&countspecial==1){
            System.out.println("染獎 NT$400");
        }else if(count==3){
            System.out.println("普獎 NT$400");
        }else {
            System.out.println("沒獲得任何獎項!");
        }
    }
}
/*
題目:大樂透
 */

