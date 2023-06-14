import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char[]ch=str.toCharArray();
        int count=0 ,count1=0 ,count2=0 ,count3=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                count++;
            }else if(ch[i]>='A'&& ch[i]<='Z'|| ch[i]>='a'&&ch[i]<='z'){
                count1++;
            }else if(ch[i]==' '){
                count2++;
            }else {
                count3++;
            }
        }
        System.out.println("0~9= "+count);
        System.out.println("A~Z or a~z= "+count1);
        System.out.println("空白= "+count2);
        System.out.println("else字串= "+count3);
    }
}
/*
題目:輸入String丟給[]ch然後找出該字串有幾個數字,大小寫字母,空白,及其他字元(用for)
把你寫的String丟給[]ch然後[]ch再用for迴圈從第一個值抓下去if迴圈循環,然後以此類推跑到for迴圈完成
看總共找到幾個!(count,count1,count2,count3)
A:
1.A1 *sa4           2.De2*hji1
  0~9= 2              0~9= 2
  A~Z or a~z= 3       A~Z or a~z= 5
  空白= 1              空白= 0
  else字串= 1          else字串= 1
 */
