import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();   //輸入一組字串(身分證)
        char ch=str.charAt(0); //char ch這邊取str 0位置的單字串汰舊換新,0的話就是取str第1個單字串 1就是取第2個單字串 以此類推 注意:char是單字串值
        int sum=0;     //設一個總和為0,這是待會要做第一個單字串位於的代碼值
       if(ch=='A'){  //ch拿到第一個單字串的值之後,把拿到的第一個單字串尋找他的代碼值,用if迴圈去從頭到尾找,找到的話那邊的sum就等於該單字串的
           sum=10;      //代碼值
       }else if(ch=='B'){      //題目的代碼值表格如下:  第一頁
           sum=11;               // 單字串->A   B   C   D   E   F   G   H   J   K   L   M   N   P   Q   R   S   T   U
       }else if(ch=='C'){        // 代碼值->10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28
           sum=12;               //第二頁
       }else if(ch=='D'){        // 單字串->V   X   Y   W   Z   I   O
           sum=13;               // 代碼值->29  30  31  32  33  34  35
       }else if(ch=='E'){
           sum=14;
       }else if(ch=='F'){
           sum=15;
       }else if(ch=='G'){
           sum=16;
       }else if(ch=='H'){
           sum=17;
       }else if(ch=='J'){
           sum=18;
       }else if(ch=='K'){
           sum=19;
       }else if(ch=='L'){
           sum=20;
       }else if(ch=='M'){
           sum=21;
       }else if(ch=='N'){
           sum=22;
       }else if(ch=='P'){
           sum=23;
       }else if(ch=='Q'){
           sum=24;
       }else if(ch=='R'){
           sum=25;
       }else if(ch=='S'){
           sum=26;
       }else if(ch=='T'){
           sum=27;
       }else if(ch=='U'){
           sum=28;
       }else if(ch=='V'){
           sum=29;
       }else if(ch=='X'){
           sum=30;
       }else if(ch=='Y'){
           sum=31;
       }else if(ch=='W'){
           sum=32;
       }else if(ch=='Z'){
           sum=33;
       }else if(ch=='I'){
           sum=34;
       }else if(ch=='O'){
           sum=35;
       }
      int v0=sum/10;   //找到第一個單字串的代碼值把他十位數轉過來給v0
      int v1=sum%10;   //找到第一個單字串的代碼值把他個位數轉過來給v1
      int all=v0+(9*v1);  //all為全部字串的總和值也就是這身分證,那一開始先轉第一個單字串的總和值 第一個單字串總和值-> v0+(9*v1)
      int k=8;     //然後第2個單字串開始待會會從8開始乘第2碼 再來就是 7乘第3碼 6乘第4碼 ,以此類推到1之後  後面的值統一用1去乘
      for (int i=1;i<str.length();i++){  //用for從第二個單字串開始取到str字串結束
          all=all+(k*(str.charAt(i)-'0'));  //先把i值位於的str單字串丟進去轉ASCII碼,然後後面有'0'可以轉正整數0~9 <-只限於字串有0-9轉
          if(k>1){                        //如果單字串是字母的就不行,只能單字串是數字才能用'0' 轉完後*k然後再跟目前的all相加
              k-=1;                  //每相加完畢來到if迴圈 如果k>1 就k減1 如果k已經是1 那就跳過此if然後再底標返回循環
          }
      }
      if(all%10==0 && ch>='A' && ch<='Z'){    //來到這邊就代表我全部字串已經個別算出代碼值,並且全部代碼值都加在all身上了
          System.out.println("CORRECT!!!");   //all%10餘數是0 就是符合,顯示"CORRECT!!!"
      }else if(all%10!=0){                    //all%10餘數不等於0 就丟進去 顯示"WRONG!!!" <-不是
          System.out.println("WRONG!!!");
      }
    }
}
/*
題目: 身分證驗證器(開頭第一個字串用if迴圈)
題目詳請請去 模三題目裡的身分證驗證器去看!
A:
(1.)C123456889    (2.)A123456789   (3.)L163690274
    CORRECT!!!        CORRECT!!!       WRONG!!!
 */
